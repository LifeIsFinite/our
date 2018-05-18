package com.our.chat.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 页面请求拦截配置类
 * @author lvjie
 *
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	/**
     * 拦截器
     * 	拦截所有.do请求
     * @param registry
     */
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new InterceptorConfig())
				.addPathPatterns("/**/**.do");
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
