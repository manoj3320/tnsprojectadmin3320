package com.tnssi.day2;

public class instancemember {

		// It is a instance member 
		int a = 10 ; // instance variable
		static int b = 20 ; // static variable
		
		void display(){
			
			System.out.println(a); // here we can access both static and instance variables
			System.out.println(b);
			
		}
		public static void main(String[] args) {
			
			instancemember i1 = new instancemember();
			i1.display();
	}

}
