package com.degan.test;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;


@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class testLambdaLMH {
//	static testLambdaLMH test; 

	public static void main(String[] args) throws RunnerException {
//		test = new testLambdaLMH();
		
		
		Options opt = new OptionsBuilder()
                .include(testLambdaLMH.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
        
//		testBiPredicate();
//		testEquals();
	}
	@Benchmark
	public static void testBiPredicate() {
		for(int i=0;i<100000;i++){
			BiPredicate<String,String> f = String::equals;
			f.test("aa", "aa");
		}
	}
	
	@Benchmark
	public static void testEquals() {
		for(int i=0;i<100000;i++){
			"aa".equals("aa");
		}
	}
}
