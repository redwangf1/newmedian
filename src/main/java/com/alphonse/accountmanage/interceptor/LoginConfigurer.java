package com.alphonse.accountmanage.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class LoginConfigurer implements WebMvcConfigurer {

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加一个拦截器，连接以/authorize为前缀的url路径
        registry.addInterceptor(new LoginURLInterceptor()).addPathPatterns("/**").excludePathPatterns("/loginPage")
        .excludePathPatterns("/login").excludePathPatterns("/account/**").excludePathPatterns("/css/**").excludePathPatterns("/js/**")
        .excludePathPatterns("/font/**");
		WebMvcConfigurer.super.addInterceptors(registry);

    }

}
