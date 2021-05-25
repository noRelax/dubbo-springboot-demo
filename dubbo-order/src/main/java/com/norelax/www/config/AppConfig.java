package com.norelax.www.config;

import com.norealx.www.base.config.BaseConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BaseConfig.class)
public class AppConfig {

}