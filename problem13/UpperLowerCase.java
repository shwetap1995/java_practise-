import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String str = s.next();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		s.close();
	}
}


