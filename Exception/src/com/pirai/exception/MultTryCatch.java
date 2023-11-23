package com.pirai.exception;

import java.util.Scanner;

/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for multiple try catch block
 */
public class MultTryCatch {

	public static void main(String[] args) {
		//creating a scanner class object
		Scanner scanner = new Scanner(System.in);
		String str="welcome";
		int a=10,b=0;
		System.out.println("main starts");
	
		//creating a try catch block
		try {
			System.out.println(a/b);  //exception line
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}
		
		System.out.println("enter index");
		int num = scanner.nextInt();
		//creating a another try block
		try {
			System.out.println(str.charAt(num));   //exception line
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		System.out.println("main ends");
	}

}
