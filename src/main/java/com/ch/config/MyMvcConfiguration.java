package com.ch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author chenk
 * @date 2022/2/26 16:58
 * @description
 */
@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {
    // 设置配置 首页 welcome页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        // 注册页面
        registry.addViewController("/reg").setViewName("register");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/templates/index.html").setViewName("index");
    }



}
