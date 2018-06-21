import java.util.Scanner;

public class PersonsDetails {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name:");
		String pname = s.next(); 
		System.out.println("Enter your Gender:");
		String gender = s.next();
		System.out.println("your marital status:");
		String mstatus = s.next();
		if( gender == "female" || gender =="F"||gender =="FEMALE"||gender 
            =="Female"||gender =="f")
{
		System.out.println("Enter your Gender:");
}		
		s.close();
	}
}
