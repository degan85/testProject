package com.degan.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class FileReaderEx1 {
	public static void main(String[] args) {
		
		testFileOutputStream();
		testFileWriter();
	}
	
	@Benchmark
	public static void testFileOutputStream() {
		String fileName = "E:/test.txt";
		int data = 0;
		
		try(FileInputStream fis = new FileInputStream(fileName)) {
			while((data = fis.read()) != -1) {
//				System.out.print((char)data);
			}
//			System.out.println();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Benchmark
	public static void testFileWriter() {
		String fileName = "E:/test.txt";
		int data = 0;
		try(FileReader fr = new FileReader(fileName)) {
			
			while((data = fr.read())!=-1) {
//				System.out.print((char)data);
			}
//			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
