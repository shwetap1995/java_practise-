import java.util.Scanner;

public class ConcatName {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first name:");
		String fname = s.next();
		System.out.println("enter the last name:");
		String lname = s.next();	
		System.out.println(fname + " "  + lname);
	}
}
