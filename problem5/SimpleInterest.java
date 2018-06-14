import java.util.Scanner;
class SimpleInterest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Principal:");
double principal=s.nextDouble();
System.out.println("Enter the Rate:");
double Rate=s.nextDouble();
System.out.println("Enter the Time:");
double Time=s.nextDouble();
double si=(principal*Rate*Time)/100;
System.out.println(si);
s.close();
}
}
