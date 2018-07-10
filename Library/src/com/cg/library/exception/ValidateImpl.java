package com.cg.library.exception;

public class ValidateImpl extends Exception {
	public ValidateImpl() {

	}

	public ValidateImpl(String message) {
		System.out.println(message);
	}
}
