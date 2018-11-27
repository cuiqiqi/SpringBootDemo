package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@ConfigurationProperties(prefix="user")



public class User {
	
	private String name;
	private Integer age;
	private String gender;
	
	public void Say() {
		System.out.println("哈哈哈哈哈");
		
	}

}
