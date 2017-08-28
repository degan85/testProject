package com.degan.test;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

//@FunctionalInterface
interface MyFunction {
	void run();
}


public class testLambda {
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");
		MyFunction f1_1 = () -> System.out.println("f1_1.run()");
		
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f1_1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()") );
		
		Predicate<String> isEmptyStr = s -> s.length()==0;
		String b = "dd";
		
		if(isEmptyStr.test(b)) {
			System.out.println("This is an empty String");
		}else{
			System.out.println("no!!");
		}
		
		BiPredicate<String,String> f = String::equals;
		System.out.println(f.test("aa", "aa"));
	}
}

