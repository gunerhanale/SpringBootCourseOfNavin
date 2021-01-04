package com.ebubekir.demo;

public class Alien {

	private int age;
	
	public Alien() {
		System.out.println("Alien object created..");
	}

	public void code() {
		System.out.println("Im coding..");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}

}
