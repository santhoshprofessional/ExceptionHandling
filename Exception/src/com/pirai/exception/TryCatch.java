package com.pirai.exception;
/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for try catch example
 */
public class TryCatch {
    //creating a main method
	public static void main(String[] args) {
	//data member
		int a=10,b=0,c;
		System.out.println("main Starts");
		//creating try catch block
		try {
			c=a/b;  //exception line
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is handled");
		}
		System.out.println("main Ends");

	}

}
