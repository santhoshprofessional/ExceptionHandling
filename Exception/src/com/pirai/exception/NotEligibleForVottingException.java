package com.pirai.exception;

public class NotEligibleForVottingException extends Exception {
	@Override
	public String getMessage() {
		return "wait till you are 18...";
	}
	
}
