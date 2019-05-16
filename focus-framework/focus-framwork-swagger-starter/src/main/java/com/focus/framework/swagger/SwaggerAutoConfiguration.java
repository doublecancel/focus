package com.focus.framework.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties(SwaggerProperties.class)
@ConditionalOnProperty(name="focus.swagger2.enable", havingValue = "true", matchIfMissing = true)
@EnableSwagger2
public class SwaggerAutoConfiguration {


    @Autowired
    private SwaggerProperties properties;

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(properties.getTitle())
                .description(properties.getDescription())
                .termsOfServiceUrl("http://cloud.test.com/")
                .contact(new Contact("cloud", "", ""))
                .version(properties.getVersion())
                .build();
    }

    @Bean
    public Docket consoleDocker(){
        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(parameters())
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    private List<Parameter> parameters() {
        List<Parameter> pars = new ArrayList<Parameter>();
        ParameterBuilder languagePar = new ParameterBuilder();
        languagePar.name("Accept-Language").description("语言").modelRef(new ModelRef("string")).parameterType("header").required(false).
                defaultValue("zh-CN,zh").build();
        //Authorization
        languagePar.name("Authorization").description("token 以Bearer 开头").modelRef(new ModelRef("string")).parameterType("header")
                .required(false). defaultValue("").build();

        ParameterBuilder pagePar = new ParameterBuilder();
        pagePar.name("page").description("当前页(需分页的接口使用)").modelRef(new ModelRef("string")).parameterType("header").required(false)
                .defaultValue("1").build();
        ParameterBuilder limitPar = new ParameterBuilder();
        limitPar.name("pageSize").description("当前页条数(需分页的接口使用)").modelRef(new ModelRef("string")).parameterType("header").required(false)
                .defaultValue("10").build();

        ParameterBuilder cityPar = new ParameterBuilder();
        limitPar.name("cityId").description("城市id").modelRef(new ModelRef("int")).parameterType("header").required(false)
                .defaultValue("0").build();

        pars.add(languagePar.build());
        pars.add(pagePar.build());
        pars.add(limitPar.build());
        return pars;
    }




}
