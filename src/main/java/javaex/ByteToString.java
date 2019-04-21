package javaex;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToString {
	
	public static String getTitleName(String s) 
	{
	    String str = null;
		try {
			str = new String(s.getBytes(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
	    return str;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		String ss = "\\xF0\\x9F\\x9B\\x84";
		//String utfStr = new String(ss.getBytes(), "UTF-8");
		
		String s11 = null;
			//System.out.println(new String(s1.getBytes(), "UTF-8"));
			
			String str = "PANKAJ";
			byte[] byteArr = str.getBytes();
			// print the byte[] elements
			
			/*String s1 = new String("pankaj");
			String s2 = new String("PANKAJ");
			StringBuffer sb;
			StringBuilder sbb;
			System.out.println(s1 = s2);*/
			
			/*String s1 = "Cat";
			String s2 = "Cat";
			String s3 = new String("Cat");
			        
			System.out.println(s1==s2);
			System.out.println(s1==s3);*/
			
			String s1=new String("hello");  
			String s2="hello fgf fgfg fg fg ";  
			String s3=s1.intern(); 
			System.out.println(s2.intern());
			System.out.println(s1==s2); 
			System.out.println(s2==s3);
			
	}

}
