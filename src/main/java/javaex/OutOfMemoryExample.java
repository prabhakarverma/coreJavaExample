package javaex;
import java.util.ArrayList;

public class OutOfMemoryExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(1024*1024*200);
	}

}
