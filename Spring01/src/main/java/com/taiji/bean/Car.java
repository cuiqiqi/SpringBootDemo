package com.taiji.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 此类以注解的方式为例，使用@Service或@Component等注解，不用在xml中写配置
 * @author Cqq
 *
 */
@Component(value="car")
public class Car {
	
	@Value("奥迪")
	private String name;
	
	@Value("家庭轿车")
	private String type;
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}

}
