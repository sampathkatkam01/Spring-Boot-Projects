package in.ashokit;

public class RestaurantService {

	private Ipayments payment;
	
	
	public RestaurantService() {
		System.out.println("RestaurantService::O- param-constructer");
	}
	
	public RestaurantService(Ipayments payment) {
		System.out.println("RestaurantService : parm Constructor ");
		this.payment = payment;
	}
	public void setPayment(Ipayments payment) {
		System.out.println("setter method callaed ........");
		this.payment=payment;
	}

	public void processpayments(double amount) {

		boolean status = payment.paybill(amount);

		if (status) {
			System.out.println("payment is sucessfull");

		} else {
			System.out.println("payment failed");
		}
	}

}
