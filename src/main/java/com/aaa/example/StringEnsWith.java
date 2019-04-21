package com.aaa.example;

public class StringEnsWith {

	public static void main(String[] args) {
		String ss = "carl_tyler@gapps-dev.colpal.com";
		
		System.out.println(ss.indexOf("@colpal.com"));
		
		System.out.println(ss.endsWith("@colpal.com"));
		System.out.println(ss.endsWith("@gapps-dev.colpal.com"));

	}

}
