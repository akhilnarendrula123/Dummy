package com.cg.studentjoining.Exception;

public class MyException extends Exception {

	public MyException() {
		System.out.println("invalid details");
		
	}
	public  MyException(String message) {
		super(message);
	}
}
