package javaex;
public class Test {

	public static void main(String[] args) {
		Super s = new Subclass();
		//s.foo();
	}
}

class Super {
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	  void foo() {
		System.out.println("Subclass");
	}
}