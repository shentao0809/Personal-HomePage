package com.example.BACKEND.Config;

import com.example.BACKEND.Utils.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: BACKEND
 * @description: SpringMVC配置类
 * @author: wavesen.shen
 * @create: 2019-02-16 14:47
 */
@SpringBootConfiguration
public class SpringMVCConfig implements WebMvcConfigurer {
    @Autowired
    RequestInterceptor requestInterceptor;
    /***
     * 拦截所有请求地址,除了静态资源地址和登录页面地址，RequestInterceptor拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor).addPathPatterns("/**");
    }

    /***
     * 配置跨域请求白名单
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }
}
