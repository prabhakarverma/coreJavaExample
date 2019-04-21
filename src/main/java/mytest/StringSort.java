package mytest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class StringSort {
	
@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	sort();
	String s1 = "a";
	WeakHashMap<String,String> mp = new WeakHashMap<>();
	mp.put(s1, "hello");
	mp.put(new String("a"), "pra");
	//System.out.println(mp);
	IdentityHashMap<String,String> m = new IdentityHashMap<>();
	m.put(s1, "hello");
	m.put(new String("a"), "pra");
	m.put(new StringBuffer("a").toString(), "pra1");
	//System.out.println(m);
	
}
static void sort() {

		String[] sa = new String[] { "X", "a", "Z", "B", "c", "b", "A", "z", "C", "x" };
		Set<String> set = new HashSet<>();
	
		System.out.println("Before sorting: " + Arrays.asList(sa));
		Arrays.sort(sa, new AlphabeticComparator());
	
		List<String> al3 = new ArrayList<String>();
		al3 = Arrays.asList(sa);
	
		for (int i = 0; i < al3.size() - 1; i++) {
			for (int j = i + 1; j < al3.size(); j++) {
				if (al3.get(i).equalsIgnoreCase(al3.get(j))) {
					set.add(al3.get(i));
					System.out.println("sel: " + set);
				}
			}
		}
		System.out.println("Before sorting:: " + set);
	}
} 

class AlphabeticComparator implements Comparator {
  public int compare(Object o1, Object o2) {
    String s1 = (String) o1;
    String s2 = (String) o2;
    return s1.toLowerCase().compareTo(s2.toLowerCase());
  }
}