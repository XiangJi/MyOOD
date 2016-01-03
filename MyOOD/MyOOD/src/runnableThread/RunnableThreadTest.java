package runnableThread;

public class RunnableThreadTest {

	public static void main(String[] args) {
		// Run the runnable thread
		// step 1: create runnable thread object
		RunnableThreadExample instance = new RunnableThreadExample();
		
		// step 2: pass the object as an argument into the Thread constructor
		Thread thread = new Thread(instance);
		thread.start();
		
		while (instance.count != 8) {
			try {
				System.out.println("Kamenashi");
				Thread.sleep(250);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
		
	}
	
	/*
	 * 
	 * Output:
	 * Kamenashi
RunnableThread starting
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Kamenashi
Yamapi
Kamenashi
Kamenashi
RunnableThread terminating
	 */

}
