package in.ashokit;

public class petrolpayments implements ICAR {

	public petrolpayments() {
	System.out.println("petrol payment = o-param constuctor ");
	}
	
	@Override
	public boolean paybill(double amount) {
		System.out.println("petrol Payments processing.....");
		return true;
	}

}
