package thread;

public class InfinitThread extends Thread {
	int value = Integer.MIN_VALUE;
	private boolean flag = true;
	public void run() {
		while(flag) {
			value++;
			if(value == Integer.MAX_VALUE) {
				value = Integer.MIN_VALUE;
				System.out.println("MAX_VALUE reached !!!");
			}
		}
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
