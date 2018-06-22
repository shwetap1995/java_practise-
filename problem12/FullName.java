import java.util.Scanner;

public class FullName {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		int number=s.nextInt();	
		String arraystring[] = new String[number];
		System.out.println("firstname middlename lastname:");
		for(int i = 0;i < arraystring.length;i++) {
			arraystring[i]=s.next();
		}
		for(int i = 0;i < arraystring.length;i++) {
			System.out.println(arraystring[i]);
		}
		s.close();
	}	
}
