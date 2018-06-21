import java.util.Scanner;

public class PersonsDetails {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name:");
		String pname = s.next(); 
		System.out.println("Enter your age:");
		int age = s.nextInt();
		System.out.println("your marital status:");
		String mstatus = s.next();	
		System.out.println("Mr/Ms " + pname + " " + "is" + " " + age + " " + "years old and Marital status is" + " " + mstatus );
		s.close();
	}
}
