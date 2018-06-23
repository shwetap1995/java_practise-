import java.util.Scanner;

public class ArrayOfOddNumbers {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int ano[] = new int[5];
		for(int i = 0; i < ano.length ; i++) {
			ano[i] = s.nextInt();
		}
		System.out.println("Odd numbers in array are:");
		for(int i = 0; i < ano.length ; i++) {
			if(ano[i] % 2 != 0)
			System.out.println(ano[i]);			
		}
                s.close();
	}
}


