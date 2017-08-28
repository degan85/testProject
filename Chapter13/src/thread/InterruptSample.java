package thread;

public class InterruptSample {
	public static void main(String[] args) {
		InfinitThread infinit = new InfinitThread();
		infinit.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		System.out.println("isInterrupted = "+infinit.isInterrupted());
		infinit.interrupt();
		System.out.println("isInterrupted = "+infinit.isInterrupted());
		infinit.setFlag(false);
	}
}
