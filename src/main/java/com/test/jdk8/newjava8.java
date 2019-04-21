package com.test.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class newjava8 {

	public static void main(String[] args) {
		Random rand = new Random();
		rand.ints().limit(3).forEach(System.out::println);

		List<String> list = Arrays.asList("abc","ab","","efg","gf","","ijk");
		//int count = (int) list.stream().filter(list->list.isEmpty()).count();
		
	}

}
