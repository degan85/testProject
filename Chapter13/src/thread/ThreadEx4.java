package thread;

public class ThreadEx4 {
	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
		
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		long end1 = System.currentTimeMillis();

		System.out.println("�ҿ�ð�1: "+(end1-start1));
		
		long start2 = System.currentTimeMillis();
		
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		long end2 = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð�2: "+(end1-start1));
	}
}
