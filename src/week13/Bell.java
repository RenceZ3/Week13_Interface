package week13;

import java.io.IOException;
import java.util.Scanner;


interface clients {
	public void message();
}


public class Bell implements clients {
	public static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) {
		Bell bell1 = new Bell();
		bell1.message();

		
		
	}

	@Override
	public void message() {
		
		String unitTime = "seconds";
		System.out.print("Enter Message: ");
		String message = scn.nextLine();
		long startTime = System.currentTimeMillis();
		System.out.println("Waiting for representative to respond.....");

		try {
			System.in.read();
			long finishTime = System.currentTimeMillis();
			long waitingTime = (finishTime - startTime) / 1000;
			if(waitingTime >= 60) {
				waitingTime /= 60; 
				unitTime = "minute/s";
			}
			System.out.printf("\nThe customer is waiting for %d %s\n",waitingTime, unitTime);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("\nThank you for waiting, I'm Joe, I'm the customer representative. How may I help you today?");
		}
		
		
		
		
		
	}

}
