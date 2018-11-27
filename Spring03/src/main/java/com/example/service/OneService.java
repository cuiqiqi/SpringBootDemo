package com.example.service;

import java.nio.channels.ScatteringByteChannel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("one")
public class OneService implements MessageService{

	@Value("${name:One1}")
	private String name;
	
	public String getMessage() {
		return "One2"+this.name;
		
	}

}
