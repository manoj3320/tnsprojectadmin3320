package com.tnssi.day2;

public class staticmember {
	
	// It is a static member
	static int a = 10 ; //static variable
	int b = 20 ; // instance variable
	
	static void display() {
		
		System.out.println(a);// here we can access static variable only
	}
	public static void main(String[] args) {
	
		staticmember.display();
	}
}
