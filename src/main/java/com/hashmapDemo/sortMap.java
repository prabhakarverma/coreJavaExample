package com.hashmapDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class sortMap {
	public static void main(String[] args) {
		HashMap<String, Person> people = new HashMap<String, Person>();
		Person jim = new Person("zim", 25);
		Person scott = new Person("Scott", 28);
		Person anna = new Person("Anna", 23);

		people.put(jim.getName(), jim);
		people.put(scott.getName(), scott);
		people.put(anna.getName(), anna);
		
		
	
		List<Person> peopleByAge = new ArrayList<Person>(people.values());
		
		Collections.sort(peopleByAge, new Comparator<Person>() {

	        public int compare(Person o1, Person o2) {
	            return o1.getAge() - o2.getAge();
	        	//return o1.getName().compareTo(o2.getName());
	        }
	    });
	    for (Person p : peopleByAge) {
	        System.out.println(p.getName() + "\t" + p.getAge());
	    }
	}
}
