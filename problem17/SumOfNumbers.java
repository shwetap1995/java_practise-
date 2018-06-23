import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String args[]) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int no[] = new int[5];
		for(int i = 0; i < no.length;i++) {
			no[i] = s.nextInt();
		}
		System.out.println("Sum of these numbers:");
		for(int i = 0;i < no.length;i++) {
			sum = sum + no[i];
		}
	System.out.println(sum);
	s.close();
	}
}
