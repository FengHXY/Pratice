package com.learning6.wang;

public class Student extends Person {

	private float math;
	private float english;
	
	public Student() {
		super();
	}
	
	public Student(String name, String addr) {
		super(name, addr);
	}

	public Student(String name, String addr, char sex, int age, float math, float english) {
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}

	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	
	@Override
	public void print(){
		System.out.println("信息如下");
	}
}
