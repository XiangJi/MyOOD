package runnableThread;

// method 1: implementing the runnable interface
public class RunnableThreadExample implements Runnable{
	public int count = 0;
	
	public void run() {
		System.out.println("RunnableThread starting");
		try {
			while (count < 8) {
				System.out.println("Yamapi");
				Thread.sleep(500); // the unit is millisecond
				count++;
			}
		} catch (InterruptedException exc) {
			System.out.println("RunnableThread interrupted");
		}
		System.out.println("RunnableThread terminating");
	}
}
