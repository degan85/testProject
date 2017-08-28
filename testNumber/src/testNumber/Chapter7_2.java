package testNumber;

public class Chapter7_2 {
	public static void main(String[] args) {
//		A a = new A();
//		a.methodB(new B());

//		Controller con = new Controller();
//		con.method(new BizImpl_1());
//		con.method(new BizImpl_2());
		
		Biz biz = new InstanceManager().getInstance();
		biz.method();
	}
}

//class A {
//	public void methodB(B b) {
//		b.methodB();
//	}
//}
//
//class B {
//	public void methodB() {
//		System.out.println("B method");
//	}
//}
//
//class C {
//	public void methodC() {
//		System.out.println("C method");
//	}
//}

interface Biz {
	public abstract void method();
}

class Controller {
	public void method(Biz i){
		i.method();
	}
}

class BizImpl_1 implements Biz {
	public void method() {
		System.out.println("method BizImpl_1");
	}
}

class BizImpl_2 implements Biz {
	public void method() {
		System.out.println("method BizImpl_2");
	}
}

class InstanceManager {
	public Biz getInstance() {
		return new BizImpl_1();
	}
}









