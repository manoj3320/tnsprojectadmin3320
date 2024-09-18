package com.tnssi.day2;

//Override with the static member

class C {
	  static int a = 10 ; 
	 static int b = 20 ;
	 static void display() {
		System.out.println(a); //--compile time error
		 //System.out.println("b value in class C:"+b);
	}
}
class D extends C {
	static void display() {
		
		System.out.println("b value in class D:"+b);
	}
}
public class override2 {

	public static void main(String[] args) {
		C.display();
		D.display();
		
	}

}
