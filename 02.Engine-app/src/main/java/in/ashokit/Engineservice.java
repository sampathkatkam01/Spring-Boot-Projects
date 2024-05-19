package in.ashokit;

public class Engineservice {

	private ICAR car;

	public Engineservice() {

		System.out.println("Engine Service : 0-parm constructor");
	}
	
	public Engineservice(ICAR car) {
		System.out.println("Engine service : parm-constructor");
		this.car=car;
	}
	
	public void setcar(ICAR car) {
		System.out.println("setter method called.....");
		this.car = car;
	}
	
	public void processpayment(double amount) {
		
		boolean status=car.paybill(amount);
		if(status) {
			System.out.println("payment successfull...");
		}else {
			System.out.println("payment declined");
		}
		
		
	}
	
	
	
	

}
