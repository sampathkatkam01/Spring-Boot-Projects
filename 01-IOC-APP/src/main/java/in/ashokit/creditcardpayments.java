package in.ashokit;

public class creditcardpayments implements Ipayments {
	
	public creditcardpayments() {
		System.out.println("creditcard :: constructor");
	}
	@Override
	public boolean paybill(double amount) {
		System.out.println("Credit card payment is processing....");
		return true;
	}

}
