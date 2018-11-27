package com.taiji.bean;

/**
 * xml使用构造器的方式建造bean，people类作为User类中的属性使用,调用people中的方法
 * 不建议使用构造器的方式创建bean，因为在实例化时会造成资源浪费
 * @author Cqq
 */
public class User {
	//people类作为User类中的属性使用,调用people中的方法
	private People people;
	
	private String type;
	
	
public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//无参构造
	public User() {
		
	}
//有参构造
	public User(People people, String name) {
		
		this.people = people;
		this.type = name;
	}

	@Override
	public String toString() {
		return "User [people=" + people + ", name=" + type + "]";
	}

	public void say() {
		System.out.println(people+""+type);
		
	}
	
	

}
