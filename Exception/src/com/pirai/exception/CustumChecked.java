package com.pirai.exception;

import java.util.Scanner;
/* @author  santhosh
 * @version 23-11-2023
 * @code    Java Program for example of custum checked exception and throws,throw keyword
 */
public class CustumChecked {
	public static void eligible(int age) throws NotEligibleForVottingException {
		if(age>=18) {
			System.out.println("you are eligible for voting");
		}
		else {
			throw new NotEligibleForVottingException();//create and throw the NotEligibleForVottingException
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age");
		int age =scanner.nextInt();
		
		try {
			eligible(age);
		}
		catch(NotEligibleForVottingException e) {
			System.out.println(e.getMessage());//catch the NotEligibleForVottingException
		}

	}

}
