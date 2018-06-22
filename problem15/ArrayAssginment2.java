import java.util.Scanner;

public class ArrayAssginment2 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int number=s.nextInt();	
		int arraynumbers[] = new int[number];
		System.out.println("Enter the no:");
		for(int i = 0;i < arraynumbers.length;i++) {
			arraynumbers[i]=s.nextInt();
		}
		System.out.println("numbers in array is:");
		for(int i = 0;i < arraynumbers.length;i++) {
			System.out.println(arraynumbers[i]);
		}
		s.close();
	}	
}
