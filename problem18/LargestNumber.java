import java.util.Scanner;

public class LargestNumber {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the 5 numbers");
		int no[] = new int[5];
		for(int i = 0;i < no.length;i++) {
			no[i] = s.nextInt();
		}
		if(no[0] > no[1] && no[0] > no[2] && no[0] > no[3] && no[0] > no[4]) {
			System.out.println(no[0] +" " + "is largest");
		}
		else if(no[1] > no[0] && no[1] > no[2] && no[1] > no[3] && no[1] > no[4]) {
			System.out.println(no[1] +" " + "is largest");
		}
		else if(no[2] > no[0] && no[2] > no[1] && no[2] > no[3] && no[2] > no[4]) {
			System.out.println(no[2] +" " + "is largest");
		}
		else if(no[3] > no[0] && no[3] > no[1] && no[3] > no[2] && no[3] > no[4]) {
			System.out.println(no[3] +" " + "is largest");
		}
		else if(no[4] > no[0] && no[4] > no[1] && no[4] > no[2] && no[4] > no[3]) {
			System.out.println(no[4] +" " + "is largest");
		}
		
		s.close();
	}
}
