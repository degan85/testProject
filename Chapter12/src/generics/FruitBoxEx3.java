package generics;

import java.util.ArrayList;

	class Fruit1						{ public String toString() { return "Fruit"	; }}
	class Apple1 extends Fruit 		{ public String toString() { return "Apple"	; }}
	class Grape1 extends Fruit 		{ public String toString() { return "Grape"	; }}

	public class FruitBoxEx3 {
		
	}
	
	class Juice {
		String name;
		
		Juice(String name) {
			this.name = name + " Juice";
		}
		
		public String toString() {
			return name;
		}
	}
	
	class Juicer {
		static Juice makeJuice(FruitBox<? extends Fruit> box) {
			String tmp = "";
			
			for(Fruit f : box.getList()) {
				tmp += f + " ";
			}
			
			return new Juice(tmp);
		}
	}
	
	class FruitBox<T extends Fruit> extends Box3<T> {
		
	}
	
	class Box3<T> {
		ArrayList<T> list = new ArrayList<>();
		
		void setBox(T item) {
			list.add(item);
		}
		
		T getBox(int i) {
			return list.get(i);
		}
		
		int size() {
			return list.size();
		}
		
		ArrayList<T> getList() {
			return list;
		}
	}