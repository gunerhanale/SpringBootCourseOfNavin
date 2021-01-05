package com.ebubekir.demo;

public class Alien {

	private int age;
	private Computer com;
	
	public Alien() {
		System.out.println("Alien object created..");
	}

	public void code() {
		System.out.println("Im coding..");
		com.compile();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	
	
	

}
