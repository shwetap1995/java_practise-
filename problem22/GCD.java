import java.util.Scanner;

public class GCD {
	int n1,n2 = 0; 
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int number1 = n1;
		int number2 = n2;
		while(n1 != n2) {
			if(n1 > n2) {
				n1 = n1 - n2;
			}
			else if(n2 > n1) {
				n2 = n2 - n1;
			}
		}
	       int gcd = n1;
	       System.out.println(gcd);	
		int lcm = number1 * number2 /gcd;
		System.out.println(lcm);
        }
}
