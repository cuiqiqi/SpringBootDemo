package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"hello","default","dev"})
public class TwoService implements MessageService{
	
	@Value("${name:崔琪琪}")
	private String name;
	
    @Override
	public String getMessage() {
		return "Hello" + this.name;
		
	}
}
