import java.util.Scanner;

public class PersonsDetails {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name:");
		String pname = s.next(); 
		System.out.println("Enter your Gender:(m/f)");
		String gender = s.next();
		System.out.println("your marital status:(s/m)");
		String mstatus = s.next();
		if( gender.equals("f") && mstatus.equals("s") ) {
			System.out.println("Miss" + " " + pname);
		}	
		else if( gender.equals("f") && mstatus.equals("m") ) {
			System.out.println("misses" + " " + pname);
		}
		else if( gender.equals("m")) {
			System.out.println("Mr" + " " + pname);
		}
		else {
			System.out.println("Please enter correct choice");
		}
		s.close();
	}
}
