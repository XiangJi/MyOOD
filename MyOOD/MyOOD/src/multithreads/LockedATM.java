package multithreads;

import java.util.concurrent.locks.Lock; // interface
import java.util.concurrent.locks.ReentrantLock;

public class LockedATM {
	private Lock lock;
	private int balance = 100000;
	
	public LockedATM() {
		lock = new ReentrantLock();
	}
	
	public int withdraw(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp - value;
			Thread.sleep(100);
			balance = temp;
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		lock.unlock();
		return temp;
	}
	
	public int deposit(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp + value;
			Thread.sleep(300);
			balance = temp;
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
		lock.unlock();
		return temp;
	}
}
