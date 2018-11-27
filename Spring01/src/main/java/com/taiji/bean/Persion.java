package com.taiji.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 将Java类当作一个配置类来使用，使用@Configuration注解来生命只是一个配置类
 * @author Cqq
 *
 */
@Configuration
public class Persion {
	
	@Bean(value="haha")
	public String haha() {
		
		System.out.println("我是谁？");
		return "王小明";
		
	}
	
	@Override
	public String toString() {
		return "Persion []";
	}
	
	

}
