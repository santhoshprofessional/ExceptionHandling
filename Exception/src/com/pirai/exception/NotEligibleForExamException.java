package com.pirai.exception;

public class NotEligibleForExamException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Sorry! you don't have enough attendace come to next semester";
	}
}
