package mytest;
import java.util.HashMap;
public class NewTest {
		static void sort() {

		String str ="java";
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("given string: "+str+"\nreverse string : "+rev);
	}

	public static void main(String[] args) {
		sort();
		String s1 = "hello pra";
		s1.replace(s1, "verma");
		System.out.println("replace same string pool: "+s1);
		int arr[] = {2,2,3,3,4,2,2};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			 if(map.containsKey(arr[i])){
		          map.put(arr[i], map.get(arr[i])+1 );
		         }else{
		          map.put(arr[i], 1);
		         }
	    }

		System.out.println("Count duplicate element: "+map);
	}

}
