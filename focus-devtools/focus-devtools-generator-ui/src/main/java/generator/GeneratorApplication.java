package generator;

import com.focus.framework.mybatis.config.EnableMybatisType;
import com.focus.framework.mybatis.config.MybatisType;
import generator.properties.DevtoolsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author LIQIU
 * @date 2018-3-13
 **/
@SpringBootApplication
@EnableConfigurationProperties(DevtoolsProperties.class)
@EnableMybatisType(MybatisType.PLUS)
public class GeneratorApplication {

    public static void main(String[] args){
        SpringApplication.run(GeneratorApplication.class,args);
    }
}
