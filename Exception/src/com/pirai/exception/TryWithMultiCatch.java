package com.pirai.exception;

import java.util.Scanner;

/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for try with multiple catch block
 */
public class TryWithMultiCatch {

	public static void main(String[] args) {
		//creating a scanner class object
		Scanner scanner = new Scanner(System.in);
		String str="welcome";
		int a=10,b=0;
		System.out.println("main starts");
		System.out.println("enter index");
		int num = scanner.nextInt();
		//creating a try block
		try {
			System.out.println(str.charAt(num));
			System.out.println(a/b);  //unreachable line
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		System.out.println("main ends");
	}

}
