package com.taiji.bean;



/**
 * xml使用属性的setter方法注入的方式创建bean，创建peopl类，
 * 
 * @author Cqq
 *
 */
public class People {
	
	private String name = "小明";

	private int age = 24;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//无参构造
	public People() {
		
	}
	//有参构造
	public People(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	public void Isay() {
		System.out.println("我的名字："+name);
		System.out.println("我今年"+age+"岁了···");
	}

	
}
