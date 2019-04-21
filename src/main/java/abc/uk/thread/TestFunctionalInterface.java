package abc.uk.thread;

@FunctionalInterface
public interface TestFunctionalInterface {
	
	
	void show();
	
	default void aa() {}
	//public void aa1() {}
	
	
	static void test() {}
	static void test2() {}
	static void test3() {}
	static void test4() {}

}
