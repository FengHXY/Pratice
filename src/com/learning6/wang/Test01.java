package com.learning6.wang;

public class Test01 {

	public static void main(String[] args) {
		fun(new B());
		fun(new C());

	}
	
	public static void fun(A a){
		a.fun1();
		
		if(a instanceof B){
			B b = (B) a;
			b.fun3();
		}
		
		if(a instanceof C){
			C c = (C) a;
			c.fun5();
		}
	}
	
	

}
