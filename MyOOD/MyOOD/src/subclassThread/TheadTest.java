package subclassThread;

public class TheadTest {
	// since static, not object needed to be initialized
	public static void main(String[] args) {
		TheadExample instance = new TheadExample();
		instance.start();
		
		// concurrency?
		while (instance.count != 8) {
			try {
				Thread.sleep(250);
				System.out.println("Nani, nangdai? " + instance.count);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
		
	}

}
