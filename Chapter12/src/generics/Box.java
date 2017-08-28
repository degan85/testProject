package generics;

public class Box<T> {
	T item;
	
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		b.setItem("sdf");
	}

	void setItem(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
}

