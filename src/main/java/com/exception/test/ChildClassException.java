package com.exception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;

class Parent{
	
	public void test() {
		System.out.println("parent test");
	}
	
}
public class ChildClassException extends Parent{
	
	public void test() {
		System.out.println("child test");
		try {
			
		}catch(CancellationException e) {
			
		}catch(CompletionException e) {
			
		}catch(RuntimeException e) {
			
		}catch(Exception e) {
			
		}
		
	}	

}
