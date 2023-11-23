package com.pirai.exception;
import java.util.Scanner;

/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for throw keyword
 */
public class ThrowExample {

	public static void main(String[] args) {
		//creating a scanner class object
				Scanner scanner = new Scanner(System.in);
				String str="welcome";
				System.out.println("main starts");
				System.out.println("enter index");
				int index = scanner.nextInt();
				if(index<=0 && index>str.length()-1) {
					System.out.println(str.charAt(index));
				}
				else {
					//creating a try block
					try {
						throw new StringIndexOutOfBoundsException("don't go below or beyond the index");
					}
					catch(StringIndexOutOfBoundsException e) {
						System.out.println(e.getMessage());
					}
				}
				
		System.out.println("main ends");

	}

}
