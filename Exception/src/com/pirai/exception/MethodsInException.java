package com.pirai.exception;
/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for two methods in exception that is printStackTrace method and getMessege method example
 */
public class MethodsInException {
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
			System.out.println("Working in printStackTrace method");
			System.out.println("---------------------------------");
			e.printStackTrace();
			System.out.println("Working in getMessege method");
			System.out.println("---------------------------------");
			System.out.println(e.getMessage());
		}
		System.out.println("main Ends");

	}

}
