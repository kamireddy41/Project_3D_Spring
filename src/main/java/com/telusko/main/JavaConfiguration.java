package com.telusko.main;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.telusko"})
public class JavaConfiguration 
{
	public JavaConfiguration()
	{
		System.out.println("Java Config bean created");
	}
	
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}
}
