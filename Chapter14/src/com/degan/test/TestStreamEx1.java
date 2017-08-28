package com.degan.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamEx1 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "ccc", "bbb" };
		List<String> strList = Arrays.asList(strArr);
		
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);
		
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
		Stream<String> strStream3 = Arrays.stream(strArr);
		List<String> sortedList = strStream3.sorted().collect(Collectors.toList());
		strList.forEach(System.out::println);
	}
}
