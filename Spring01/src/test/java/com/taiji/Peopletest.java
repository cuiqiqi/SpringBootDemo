package com.taiji;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.taiji.bean.Car;
import com.taiji.bean.People;
import com.taiji.bean.User;
import com.taiji.bean.Persion;

public class Peopletest {
	
	@Autowired
	private ApplicationContext context;
	
	//1.基于xml的属性setter方法注入，以People类为例
	@Test
	public void PeopleTest() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		People aa = (People) context.getBean("people");
		aa.Isay();
	}
	
	//2.基于xml的构造器方法注入，以User类为例，其中还调用了People类中的方法
	@Test
	public void UserTest() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		User user =(User) context.getBean("user");
	    user.say();
	}
	
	//基于注解的方式创建bean,以Car类为例
	@Test
	public void carTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car.toString());
	}
	
	//基于java类的方式 
	@Test 
	public void persionTest() {
		
	AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Persion.class);
	String st= (String)acac.getBean("haha");
	System.out.println(st.toString());
	
	}
	
	
	
	

	
	


	
	
}
