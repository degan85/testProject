package exercise;

import java.util.regex.Pattern;

public class Chapter3 {
	public static void main(String[] args) {
		Chapter3 ch3 = new Chapter3();
		ch3.ch3_10();
	}
	
	private void ch3_1() {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1+x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
	}
	
	private void ch3_2() {
		int numberOfApples = 123;
		int sizeOfBucket = 10;
		boolean hasRemainder = (numberOfApples % sizeOfBucket) == 0 ? false : true;
		int numOfBucket = 0;
		if(hasRemainder){
			numOfBucket = (numberOfApples / sizeOfBucket) + 1;
		}else{
			numOfBucket = (numberOfApples / sizeOfBucket);
		}
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}
	
	private void ch3_3() {
		int num = 10;
		String result = num > 0 ? "양수" : ((num < 0) ? "음수" : "0");
		System.out.println(result);
	}
	
	private void ch3_4() {
		int num = 456;
		int result = (num / 100) * 100;
		System.out.println(result);
	}
	private void ch3_5() {
		int num = 333;
		String result = (num / 10) + "1";
		System.out.println(result);
	}
	
	private void ch3_6() {
		int num = 24;
		int closeValue = (num/10+1)*10;
		System.out.println(closeValue-num);
	}
	
	private void ch3_7() {
		int fahrenheit = 100;
		float celcius = (int)(( 5 / 9f * (fahrenheit - 32)) * 100 + 0.5f)/100f ;
		System.out.println(celcius);
	}
	
	private void ch3_9() {
		char ch = '$';
		boolean b = false;

		boolean isBigAp   = 'A' <= ch && 'Z' >= ch;
		boolean isSmallAp = 'a' <= ch && 'z' >= ch;
		boolean isNumber  = '0' <= ch && '9' >= ch;
		if( isBigAp || isSmallAp || isNumber){
			b= true;
		}
		System.out.println(b);
	}
	
	private void ch3_9_2() {
		String ch = "#";
		boolean b = false;
		if(Pattern.matches("[a-zA-Z0-9]", ch)){
			b = true;
		}
		System.out.println(b);
	}
	
	private void ch3_10() {
		char ch = 'A';
		final boolean isBigAp   = 'A' <= ch && 'Z' >= ch;
		char lowerCase = (isBigAp) ? (char)(ch+32) : ch;
		
		System.out.println(lowerCase);
	}
	
	
	
	
}
