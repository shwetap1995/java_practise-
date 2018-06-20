import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the radius");
		int radius = s.nextInt();
		double aoc = 3.14 * radius * radius;
		System.out.println("Area of circle is:" + aoc);
		s.close();
		}
}
