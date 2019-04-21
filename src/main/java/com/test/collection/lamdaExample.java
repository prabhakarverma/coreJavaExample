package com.test.collection;

public class lamdaExample {
	int x = 100;
	public void m2() {
		int y = 10;
		lemdaInterface i = ()->{
			
			System.out.println("value of x is : "+x);
			System.out.println("value of y is : "+y);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		lamdaExample example = new lamdaExample();
		example.m2();
	}

}
