package story02;

import java.util.ArrayList;
import java.util.HashMap;

public class DummyData {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");
		sb.append("bbb");
		sb.insert(3, "333");
		sb.toString();
		
		StringBuffer sbf = new StringBuffer(sb);
		System.out.println(sbf);
	}
	HashMap<String, String> map;
	ArrayList<String> list;
	
	
	public DummyData(HashMap<String, String> map, ArrayList<String> list) {
		this.map = map;
		this.list = list;
	}
}