package com.test.collection;

public interface JDK9Interface {
	
	/*private String pra1() {
        return "Hello pra1";
    }
	private String pra2() {
        return "Hello pra2";
    }
	private String pra3() {
        return "Hello pra3";
    }
	private String pra4() {
        return "Hello pra4";
    }*/
	default String pra5() {
        return "Hello pra5";
    }
	
	default String pra6() {
        return "Hello pra5";
    }
	
	
}
