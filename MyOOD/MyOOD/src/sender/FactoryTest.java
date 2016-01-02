package sender;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use multiple factory method
		
		//SendFactory factory = new SendFactory();
		// improved method, use static, no object create
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}

}
