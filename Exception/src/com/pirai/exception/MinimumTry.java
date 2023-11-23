package com.pirai.exception;
/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for try catch example need to minimum lines code in try block
 */
public class MinimumTry {
    //creating a main method
	public static void main(String[] args) {
	//data member
		int a=10,b=0,c;
		System.out.println("main Starts");
		
		try {
			System.out.println("try starts");
			c=a/b;  //exception line
			System.out.println("try ends");
		}
		catch(ArithmeticException e) {
			System.out.println("catch starts");
			System.out.println("ArithmeticException is handled");
			System.out.println("catch ends");
		}
		System.out.println("main Ends");

	}

}
