package week13;

import java.util.Scanner;

/**
 * Clarence Juanata
 * 4537982
 */

interface customer {
	public void credentials(String username, String password);
	public void numberOfEmployees(int count);
	public void ifscCode();
	String manager = "John Doe";
}


public class Bank implements customer{
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Bank b1 = new Bank();
		
		b1.ifscCode();
		
		b1.credentials("Luke", "Password123");
	}

	@Override
	public void credentials(String username, String password) {
		System.out.println("Username: " + username);
		
		String encrypt = "";
		for(int i=0; i<=password.length(); i++) {
			encrypt += "*";
		}
		
		System.out.println("Password: " + encrypt);
		
	}

	@Override
	public void numberOfEmployees(int count) {
		System.out.println("\nThe number of employees: " + count);
		
	}
	
	@Override
	public void ifscCode() {
		System.out.println("Enter IFSC Code: ");
		String ifsc = scn.next();
		
		switch(ifsc) {
			case "SCBLSDF": 
				System.out.println("RBC");
				break;
			case "LSWQESD":
				System.out.println("Scotiabank");
				break;
			case "TASDWQEW":
				System.out.println("TD");
				break;
			default: 
				System.out.println("IFSC CODE DONT EXIST!");
		}
	}

}
