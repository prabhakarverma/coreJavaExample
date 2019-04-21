package com.immutable;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		CustomImmutable customImmutable = CustomImmutable.createNewInstance("pra", "pra@gmail", new Date());
		customImmutable.getDob().setDate(30);
		System.out.println(customImmutable.getEmail() +" : "+ customImmutable.getName() +" : "+customImmutable.getDob());
		
	}

}
