import java.util.Scanner;

public class StringLength {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to find the length of the string:");
		String str = s.next();
                int len = str.length();
		System.out.println(len);
		s.close();
	}

}

