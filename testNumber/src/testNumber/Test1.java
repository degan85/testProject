package testNumber;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
//		short sMin = (short) (-1 * Math.pow(2, 15));
//		short sMinMinusOne = (short) (sMin -1);
//		short sMax = (short) (Math.pow(2, 15)-1);
//		short sMaxPlusOne = (short) (sMax + 1);
//		System.out.println(sMin);
//		System.out.println(sMinMinusOne);
//		System.out.println(sMax);
//		System.out.println(sMaxPlusOne);
//		
//		byte b = -2;
//		String i = Integer.toBinaryString(b);
//		
//		System.out.printf("int i = %s, byte b = %d",i,b);

//		float f = 1f;
//		for(int i=1;i<=127;i++){
//			f=f*2;
//			System.out.println("2^"+i+" : "+f);
//		}
//		System.out.println(f*2);
		
//		double d = 1d;
//		for(int i=1;i<=149;i++){
//			d=d/2;
//			System.out.println("2^-"
//					+ ""
//					+ ""+i+" : "+d);
//		
//		int a = 1000000;
//		int b = 1000000;
//		
//		long aMultiB1 = a*b;
//		long aMultiB2 = (long) a * b;
//		
//		System.out.println(aMultiB1);
//		System.out.println(aMultiB2);
		
		
//		float f = 0.1f;
//		float f2 = 0.111f;
//		float f3 = 0.222f;
//		float f4 = 0.333f
//				;
//		double d = 0.1;
//		System.out.printf("f2+f3==%.23e + %.23e == %.23e : %b%n",f2,f3,f4,f2+f3==f4);
//		System.out.printf("float %.23e = double %.23e : %b%n",f,d,f==d);
		
//		

//		String[] arryStr = {"a","c","c","5"};
//		char[] arryChar = {'a','b','c'};
//		for(String tmp : arryStr){
//			System.out.println(tmp);
//		}
		
//		System.out.println(arryChar);
//		multiArry();
		
//		TV tv1 = new TV();
//		TV tv2 = new TV();
//		
//		tv1 = tv2;
//		tv2.channel = 7;
//		
//		System.out.printf("tv1의 채널은 %d입니다.%n",tv1.channel);
//		System.out.printf("tv2의 채널은 %d입니다.%n",tv2.channel);
		
		TV[] arry = new TV[2];
		arry[0] = new TV1();
		arry[1] = new TV2();
		
		System.out.println(arry[0].channel);
		
		TV[] arryTV = new TV[2];
		arryTV[0] = new TV();
		arryTV[1] = new TV();
		
		System.out.println(arryTV[1].channel);
	}
	
	public static void multiArry(){
		int[][] m1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		int[][] m2 = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		int row = m1.length;
		int col = m2[0].length;
		int m2Row = m2.length;
		
		int[][] m3 = new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				for(int k=0;k<m2Row;k++)
				m3[i][j] += m1[i][k]*m2[k][j];
				
			}
		}
		for(int k=0;k<row;k++){
			System.out.println(Arrays.toString(m3[k]));
		}	
	}
}	
	
class TV{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
class TV1 extends TV{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
class TV2 extends TV{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

	
	

	
	
	
