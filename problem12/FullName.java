/*
Take User's full name in following format,
"firstname middlename lastname" and print it in following format
First Name:
Middle Name:
Surname: 
*/

import java.util.Scanner;

public class FullName {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str[] = new String[3];
		System.out.println("Format : firstname-middlename-lastname");
		str[0] = s.next();
		str[1] = s.next();
		str[2] = s.next();
        for (String str[]: Str.split(" ", 3)) {
         System.out.println(str[0]);
      }
		
		s.close();
		
	}
}

