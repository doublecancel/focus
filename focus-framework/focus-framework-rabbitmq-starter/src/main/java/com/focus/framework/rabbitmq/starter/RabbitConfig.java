package com.focus.framework.rabbitmq.starter;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建交换机和声明类型转换器
 */
@Configuration
public class RabbitConfig {



    @Value("${spring.rabbitmq.direct.exchange}")
    private String directExchangeName;


    @Value("${spring.rabbitmq.topic.exchange}")
    private String topicExchangeName;

    @Value("${spring.rabbitmq.fanout.exchange}")
    private String fanoutExchangeName;

    @Value("${spring.rabbitmq.concurrent.count}")
    private Integer concurrentCount;


    @Value("${spring.rabbitmq.prefetch.count}")
    private Integer prefetchCount;


    @Bean
    public MessageConverter messageConverter() {
        return new ContentTypeDelegatingMessageConverter(new Jackson2JsonMessageConverter());
    }

//    @Bean
//    public Binding binding(){
//        return BindingBuilder.bind(GlobalDeadLetter()).to(directExchange()).with(DEAD_LETTER);
//    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(directExchangeName);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(topicExchangeName);
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(fanoutExchangeName);
    }

//    @Bean
//    public Queue GlobalDeadLetter(){
//        return QueueBuilder.durable(DEAD_LETTER).build();
//    }

    /**
     * 并发处理器，需要并发操作的listener设置 containerFactory 为该类
     * @param configurer
     * @param connectionFactory
     * @return
     */
    @Bean("concurrentContainerFactory")
    public SimpleRabbitListenerContainerFactory concurrentContainerFactory(SimpleRabbitListenerContainerFactoryConfigurer configurer, ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setPrefetchCount(concurrentCount);
        factory.setConcurrentConsumers(prefetchCount);
        configurer.configure(factory, connectionFactory);
        return factory;
    }


    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory factory){
        RabbitAdmin admin = new RabbitAdmin(factory);
        return admin;
    }

}
