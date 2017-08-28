package thread;

public class ThreadEx12 {
	public static void main(String[] args) {
		ThreadEx12_1 t1 = new ThreadEx12_1();
		ThreadEx12_2 t2 = new ThreadEx12_2();
		
		t1.start();
		t2.start();
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		
		System.out.println("<<main ����>>");
	}
}

class ThreadEx12_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
		System.out.println("<<th1 ����>>");
	}
}


class ThreadEx12_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("|");
		}
		System.out.println("<<th2 ����>>");
	}
}