package sender;

public class SendFactory {
	// this is simple factory, but it will violate the open close principle
	
	// Solution, also create a interface for factory
	public static Sender produceMail() {
		return new MailSender();
	}
	public static Sender produceSms() {
		return new SmsSender();
	}
}
