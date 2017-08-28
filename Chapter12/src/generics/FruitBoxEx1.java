package generics;

import java.util.ArrayList;

class Fruit implements Eatable	{ public String toString() { return "Fruit"	; }}
class Apple extends Fruit 		{ public String toString() { return "Apple"	; }}
class Grape extends Fruit 		{ public String toString() { return "Grape"	; }}
class Toy 					{ public String toString() { return "Toy"	; }}
interface Eatable {}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box1<Fruit> fruitBox = new Box1<Fruit>();
		Box1<Apple> appleBox = new Box1<Apple>();
//		Box1<Toy> toyBox = new Box1<>();
		fruitBox.add(new Apple());
	}
}

class Box1<T extends Fruit & Eatable> {
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
