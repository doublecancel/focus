package com.focus.framework.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "focus.swagger")
@Data
public class SwaggerProperties {

    String title;

    String description;

    String version;

    String contact;




}
