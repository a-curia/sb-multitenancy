package com.dbbyte.multitenancy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.dbbyte.multitenancy.interceptor.MultitenancyInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new MultitenancyInterceptor());
     }
}
