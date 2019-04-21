package com.test.jdk8;

public class test implements defaultInterface,defaultInterface2 {
	
	public void show() {
		defaultInterface.super.show();
		defaultInterface2.super.show();
	}
	public static void main(String[] args) {
		test t1 = new test();
		t1.show();
		
	}
}
