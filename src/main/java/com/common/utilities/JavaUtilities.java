package com.common.utilities;

import java.util.Arrays;
import java.util.List;

public class JavaUtilities {

	public static void main(String[] args){
		JavaUtilities javaUtilities = new JavaUtilities();
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
		javaUtilities.printArray(myList);
	}

	public void printArray(List<String> myList){
			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
	}
}
