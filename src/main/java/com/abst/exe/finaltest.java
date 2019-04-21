package com.abst.exe;

public class finaltest extends dummyAbstract implements mytest1,dummytest{

	public static void main(String[] args) {

		finaltest f1 = new finaltest();
		f1.show();
		f1.hide();
		f1.add();
	}

	@Override
	public void add() {
		System.out.println("add...");
		
	}
}
