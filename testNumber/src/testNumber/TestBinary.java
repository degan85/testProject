package testNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestBinary {
//	public static void main(String[] args) {
//		int N = 1041;
//		String binaryNum = Integer.toBinaryString(N);
//	    System.out.println(binaryNum);
//	    binaryNum = binaryNum.substring(0,(binaryNum.length()-1));
//	    System.out.println(binaryNum);
//	    String[] splitStr = binaryNum.split("1");
//	    int maxZeroCount = 0;
//	    for(int i=0;i<splitStr.length;i++) {
//	    	maxZeroCount = (splitStr[i].length() > maxZeroCount) ? splitStr[i].length() : maxZeroCount;
//	    }
//	    System.out.println("max : "+maxZeroCount);
//	}
	
	public static void main(String[] args) {
		int N = 15;
		String binaryNum = Integer.toBinaryString(N);
	    System.out.println(binaryNum);
	    Pattern p = Pattern.compile("1?(0+)1^?");
	    Matcher m = p.matcher(binaryNum);
	    boolean a = false;
	    int maxZeroCount = 0;
	    while(a=m.find()){
	    	System.out.println("["+m.group(1)+"]");
	    	maxZeroCount = (m.group(1).length() > maxZeroCount) ? m.group(1).length() : maxZeroCount;
	    	System.out.println("return : "+maxZeroCount);
	    }
	    System.out.println(maxZeroCount);
	}
}
