package week13;

abstract class employees {
	public abstract void pay(int payment);
	public abstract void details(String name, String address);
}


public class AVP extends employees{

	public static void main(String[] args) {
		AVP emp1 = new AVP();
		emp1.pay(5664);
		emp1.details("John Doe", "North York");
	}

	@Override
	public void pay(int payment) {
		System.out.println("The salary is: " + payment);
		
	}

	@Override
	public void details(String name, String address) {
		System.out.println("Name: " + name);
		System.out.println("Address: "+ address);
		
	}

}
