package in.ashokit;

public class DieselPayments implements ICAR {

	public DieselPayments() {
		System.out.println("Diesel payments = o-param constructor");
	}
	@Override
	public boolean paybill(double amount) {
		System.out.println("Diesel payments are processing......");
		return false;
	}

}
