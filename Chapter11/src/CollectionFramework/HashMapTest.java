package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		int total = 0;
		

		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("�̸� : "+e.getKey()+", ���� : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
	}
}
