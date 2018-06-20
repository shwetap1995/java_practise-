import java.util.*; 
import java.io.*; 
import java.util.Scanner;

public class TicketConcession  {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = 0, distance = 0;
		try {
			age = s.nextInt();
		} catch(java.util.InputMismatchException e) {
			System.out.println("Enter valid digit for age.");
			throw e;
		}
		System.out.println("Enter the Distance in KM:");
		try {
			distance = s.nextInt();
		} catch(java.util.InputMismatchException e) {
			System.out.println("Enter valid digit for distance.");
                        throw e;
		}
		double ticketprice=distance * 2.5;
		if(age < 3){
			System.out.println("no charges for childrens..happy journey....");
		}
		else if(age > 3 && age < 8){
			System.out.println("Ticket price is:" + ticketprice/2);
		}
		else if(age > 60){
			System.out.println("Ticket price is:" + ticketprice/2);
		}
		else{
			System.out.println("Ticket price is:" + ticketprice);
		}
	}
}
