package com.our.chat.config.interceptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 页面请求拦截配置类
 * 
 * @author lvjie
 *
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	/**
	 * 拦截器 拦截所有.do请求
	 * 
	 * @param registry
	 */
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/**/**.do");
		super.addInterceptors(registry);
	}

	/**
	 * 配置静态访问资源
	 * 
	 * @param registry
	 */
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/resources/",
				"classpath:/META-INF/resources/", "classpath:/META-INF/resources/webjars/");
		super.addResourceHandlers(registry);
	}
	
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter mjmc = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		DeserializationConfig dc = objectMapper.getDeserializationConfig();
		// 设置反序列化日期格式、忽略不存在get、set的属性
		objectMapper.setConfig(dc.with(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
		objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
					throws IOException, JsonProcessingException {
				jsonGenerator.writeString("");
			}
		});
		mjmc.setObjectMapper(objectMapper);
		// 设置中文编码格式
		List<MediaType> list = new ArrayList<MediaType>();
		list.add(MediaType.APPLICATION_JSON_UTF8);
		mjmc.setSupportedMediaTypes(list);
		converters.add(mjmc);
	}
}
