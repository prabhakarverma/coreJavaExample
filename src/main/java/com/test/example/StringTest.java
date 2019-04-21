package com.test.example;

public class StringTest extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = s1+"XYZ";
		String s4 = "ABCXYZ";
		System.out.println(s3 == s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		

	}

}
