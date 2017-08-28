package thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx4 {
	public static void main(String[] args) throws Exception {
		Table table = new Table();
		
		new Thread(new Cook1(table), "COOK1").start();
		new Thread(new Customer1(table, "donut"), "CUST1").start();
		new Thread(new Customer1(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Customer1 implements Runnable {

	private Table table;
	private String food;
	
	Customer1(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook1 implements Runnable {
	private Table table;
	
	Cook1(Table table) {
		this.table = table;
	}
	
	public void run() {
		while(true) {
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
					
		}
	}
}

class Table1 {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();
	
	public void add(String dish) {
		lock.lock();
		try{
			String name = Thread.currentThread().getName();
			while(dishes.size() >= MAX_FOOD) {
				System.out.println(name + " is waiting.");
				try{
					forCook.await();
					Thread.sleep(500);
				}catch(InterruptedException e) {}
			}
			dishes.add(dish);
			forCust.signal();
			System.out.println("Dishes : "+dishes.toString());
			
		}finally {
			lock.unlock();
		}
	}

	public void remove(String dishNames) {
		lock.lock();
		String name = Thread.currentThread().getName();
		
		try {
			while(dishes.size() == 0) {
				System.out.println(name+" is waiting.");
				try{
					forCust.await();
					Thread.sleep(500);
				}catch(InterruptedException e) {}
			}
			
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					if(dishNames.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();
						return;
					}
				}
				
				try {
					System.out.println(name + " is waiting.");
					forCust.await();
					Thread.sleep(500);
				}catch(InterruptedException e) {}
			}
		}finally {
			lock.unlock();
		}
	}
	
	public int dishNum() {
		return dishNames.length;
	}
}














