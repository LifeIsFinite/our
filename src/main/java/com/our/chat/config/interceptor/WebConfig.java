package com.our.chat.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	/**
     * 拦截器
     * @param registry
     */
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new InterceptorConfig())
				.addPathPatterns("/**/**.do")
				.excludePathPatterns("/login.do");
		super.addInterceptors(registry);
	}
	
	/**
     * 配置静态访问资源
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
        	.addResourceLocations(
        			"classpath:/resources/",
        			"classpath:/META-INF/resources/",
        			"classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }
}
