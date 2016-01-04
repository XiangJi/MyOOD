package multithreads;

// threads within a given process share the same memory space, this feature has pros and cons.
// Pros, enable threads to share data. Cons, if two threads modify a resource at the same time, conflict.

// synchronized (keyword) and lock(class)

// the synchronized keyword can be used to method and code blocks like synchronized (this) { }
public class Sync extends Thread {
	private String name;
	private MyObject myObj;
	
	public Sync(MyObject obj, String n) {
		name = n;
		myObj = obj;
	}
	
	public void run() {
		myObj.foo(name);
	}
}

class MyObject {
	public synchronized void foo(String name) {
		try {
			System.out.println("Thread " + name + ".foo(): starting");
			Thread.sleep(3000);
			System.out.println("Thread " + name + ".foo(): ending");
		} catch (InterruptedException exc) {
			System.out.println("Thread " + name + ": interrupted.");
		}
	}
}
