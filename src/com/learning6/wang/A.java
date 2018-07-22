package com.learning6.wang;

public class A {

	public void fun1(){
		System.out.println("A--public void fun1()");
	}
	
	public void fun2(){
		this.fun1();
	}
}
