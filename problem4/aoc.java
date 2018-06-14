import java.util.Scanner;
class aoc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
int radius=s.nextInt();
double arc=3.14* radius * radius;
System.out.println("Area of circle is:" + arc);
s.close();
}
}
