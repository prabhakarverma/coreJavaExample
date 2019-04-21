package mytest;

import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		
		Object o = new String("Java");
		String bs = (String)o;
		
		System.out.println("".equals(""));
		
		Long a = null;
		String b1 = null;String b2 = null;
		StringBuffer br=new StringBuffer("java");
		System.out.println(a);
		String s1="java";
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(b1==b2);
		System.out.println(s1.equals(null));
		
		System.out.println(s1.compareTo(br.toString()));
		
		
		

	}

}
