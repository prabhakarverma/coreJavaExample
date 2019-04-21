package com.privateConstructor;

public class Test {

	private Test() {
		System.out.println("private constructor test...");
		show(); 
	}
	
	private void show() {
		System.out.println("private methods show...");
	}

}
