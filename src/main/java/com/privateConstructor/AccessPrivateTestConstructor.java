package com.privateConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AccessPrivateTestConstructor {

	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("com.privateConstructor.Test");
			Constructor con [] = c.getDeclaredConstructors();
			Method[] m = c.getDeclaredMethods();
			con[0].setAccessible(true);
			con[0].newInstance(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
