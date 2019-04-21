package com.test.collection;

public interface jdkExampleInterface {
	
	default  int areaofSqure1(int n) {
		
		return n*n;
	}
	int areaofSqure(int n); 
	
	public static void main(String arr) {
		
		System.out.println("Hello");
		//System.out.println(jdkExampleInterface.areaofSqure(10));
		
	}

}
