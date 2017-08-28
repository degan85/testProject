package testNumber;

import java.util.Arrays;

public class Chapter9_1 {
	public static void main(String[] arg) {
//		Point original = new Point(3,7);
//		Point copy = original.clone();
//		System.out.println(original);
//		System.out.println(copy);
		
int[] arr = {1,2,3,4,5};
		
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}

class Point implements Cloneable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x : "+x+" y : "+y;
	}
	
	public Point clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Point)obj;
	}
	
}
//
//class CloneEx2 {
//	public static void main(String[] args) {
//		
//	}
//}