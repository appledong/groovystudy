package com.dong.groovy.javabean;

public class PersonByJava {

	private String name;
	private int age;
	
	private final String personid = "10010";

	public PersonByJava(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getPersonid() {
		return personid;
	}

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

}
