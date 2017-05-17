package com.zhang.springmvc.config;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class Config {
	private Log log = LogFactory.getLog(Config.class);
	
	
	//@Configuration注解配合@Bean简单声明一个bean
	@Bean
	public MultipartResolver multipartResolver() throws IOException{
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(104857600);
		multipartResolver.setMaxInMemorySize(4096);
		log.info("是否加载了CommonsMultipartResolver");
		return multipartResolver;
	}

}
