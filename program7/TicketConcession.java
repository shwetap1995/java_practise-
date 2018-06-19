import java.util.*; 
import java.io.*; 
import java.util.Scanner;

public class TicketConcession  {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
  		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Distance in KM:");
		int distance=sc.nextInt();
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
