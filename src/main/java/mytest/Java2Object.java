package mytest;

public class Java2Object extends Exception {
	static int a=1;
	Java2Object(String s){  
		  super(s);
		 } 
	Java2Object(){
		a++;
		if(a>2) {
			try {
				throw new Java2Object("Not create object");
			} catch (Java2Object e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Java2Object {

		Java2Object j1 = new Java2Object();
		Java2Object j2 = new Java2Object();
		
		
	}

}
