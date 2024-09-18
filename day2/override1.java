package com.tnssi.day2;

// Override with the instance member
class A {
	int a = 10 ;
	static int b = 20 ;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	void display() {
		System.out.println(b);
	}
}
public class override1 {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.display();
	}

}
