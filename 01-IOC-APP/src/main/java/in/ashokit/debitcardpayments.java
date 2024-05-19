package in.ashokit;

public class debitcardpayments implements Ipayments{
	
	public debitcardpayments() {
		System.out.println("debitcardpayments::Constructor ");
		
	}
	
	@Override
	public boolean paybill(double amount) {
		System.out.println("Debitcard payment is processing");
		return true;
	}
	
	

}
