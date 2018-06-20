import java.util.Scanner;

public class SimpleInterestCalc {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principal:");
		double principal=s.nextDouble();
		System.out.println("Enter the Rate:");
		double rate=s.nextDouble();
		System.out.println("Enter the Time:");
		double time=s.nextDouble();
		double si=(principal * rate * time)/100;
		System.out.println(si);
		s.close();
	}
}
