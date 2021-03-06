package com.degan.test;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
public class DtaOutputStreamEx3 {
	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
                .include(DtaOutputStreamEx3.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .threads(4)
                .forks(1)
                .build();

        new Runner(opt).run();
//		usedSubStream();
//		usedBuffer();
//		usedStream();
		
	}
	@Benchmark
	public static void usedSubStream(){
		int[] score = {100, 90, 95, 85, 50};
		
		try(FileOutputStream fos = new FileOutputStream("E:/score.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {

			for(int i = 0; i<score.length; i++) {
				dos.writeInt(score[i]);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Benchmark
	public static void usedBuffer() {
		int[] score = {100, 90, 95, 85, 50};
		try(FileOutputStream fos = new FileOutputStream("E:/score2.dat");
				BufferedOutputStream obs = new BufferedOutputStream(fos,5)){
				
			for(int i = 0; i<score.length; i++) {
				obs.write(score[i]);
			}
				
			}catch(Exception e) { 
				e.printStackTrace();
			}
	}
	
	@Benchmark
	public static void usedStream(){
		int[] score = {100, 90, 95, 85, 50};
		try(FileOutputStream fos = new FileOutputStream("E:/score3.dat")) {

			for(int i = 0; i<score.length; i++) {
				fos.write(score[i]);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
}
