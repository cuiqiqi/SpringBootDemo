package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.bean.BeanLife;
import com.example.bean.User;



public class MyTest {
	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Test
	public void Test() {
	  //引入ApplicationContext，默认是从类路径下加载
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  //默认是从项目路径（文件）下加载
		//ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		int i = context.getBeanDefinitionCount();
		System.out.println("bean的个数:" + i);
		String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.print(string + "!!!");
			Object bean = context.getBean(string);
			System.out.println(bean.getClass());
		}
       
        User us = (User) context.getBean("user");
        us.Say();
        
        BeanLife be = (BeanLife) context.getBean("beanlif");
     

	}
}


