package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareList2 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList(20000);
		LinkedList ll = new LinkedList();
	
		add(al);
		add(ll);
		
		System.out.println("=====데이터 접근 시간=====");
		System.out.println("LinkedList : "+access(ll));
		System.out.println("ArrayList : "+access(al));
		
	}
	
	public static void add(List list) {
		for(int i=0;i<100000;i++) list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
