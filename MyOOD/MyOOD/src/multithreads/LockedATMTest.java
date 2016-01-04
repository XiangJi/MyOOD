package multithreads;

public class LockedATMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LockedATM ATM = new LockedATM();
		System.out.println(ATM.deposit(1000));
		System.out.println(ATM.withdraw(50000));
	}

}
