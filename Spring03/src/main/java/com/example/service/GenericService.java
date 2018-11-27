package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("Generic")
public class GenericService implements MessageService{

	@Value("${hello:Hello}")
	private String name;
	
	@Value("${name:Wrold}")
	private String hello;
	
	@Override
	public String getMessage() {
		return this.hello + " " + this.name;
		
	}
	
	
	
}
