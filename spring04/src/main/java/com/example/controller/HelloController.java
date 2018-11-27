package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/2")
	public String index() {
		log.debug("HelloController Debug Message");
		log.info("HelloController Info Message");
		log.trace("HelloController trace Message");
		log.error("HelloController error Message");
		log.warn("HelloController warn Message");
		return "你好，世界！";
	}
}
