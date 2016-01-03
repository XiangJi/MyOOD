package subclassThread;

/*
 * This extends Thread method can not do multiple inheritance;
 * Also, inheriting the full overhead of the Thread class would be excessive.
 */
public class TheadExample extends Thread{
	// 1. need to override the run() method
	public int count = 0;
	
	public void run() {
		System.out.println("Thread starting.");
		try {
			while (count < 8) {
				Thread.sleep(500);
				System.out.println("In thread, count is " + count);
				count++;
			}
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread terminating");
	}
}
