package com.pirai.exception;

import java.util.Scanner;
/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for example of custum unchecked exception and throw keyword
 */
public class CustumUnChecked {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your attendance");
		int attendance =scanner.nextInt();
		if(attendance>=75) {
			System.out.println("you are eligible for attend exam");
			System.out.println("collect your hall ticket");
		}
		else {
			try {
				throw new NotEligibleForExamException();//create and throw the NotEligibleForExamException
			}
			catch(NotEligibleForExamException e) {
				System.out.println(e.getMessage());//catch the NotEligibleForExamException
			}

		}
		
	}

}
