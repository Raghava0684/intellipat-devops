package com.sushant.exception;

public class Pgm1 {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int x;
		x=99;
		System.out.println(x);
		
		try {
			int y=x/0;
			System.out.println(x);
		}
		catch(ArithmeticException e){
			System.out.println("In catch block");
		}
		
		

	}

}
