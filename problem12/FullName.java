import java.util.Scanner;
public class FullName{
   public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("fname mname lname");
String str = s.next(); 
       String pstr = new String(str);
       String array1[]= str.split(" ");
       for (String temp: array1){
          System.out.println(temp);
       }
}
}
