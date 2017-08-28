package com.degan.test.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.openjdk.jmh.annotations.Benchmark;

public class CompareTimerJMH {

	@Benchmark
	public void makeObjectWithSize() {
		HashMap<String, String> map = new HashMap<String, String>(10);
		ArrayList<String> list = new ArrayList<String>(10);
	}
}
