package com.our.chat.config.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new InterceptorConfig())
				.addPathPatterns("/**")
				.excludePathPatterns("/login");
		super.addInterceptors(registry);
	}
}
