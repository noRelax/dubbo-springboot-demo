package com.norealx.www.base.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wusong
 * @create 2021-05-24 11:37
 **/
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.norealx.www.base")
public class BaseConfig {
}
