import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
	int num=s.nextInt();	
		if(num%2!=0){
			for(int i=2;i<=num;i++){
	  			if(num%i==0){
					System.out.println("number is a prime");
				     		
				} 
			}	
		}
		else {
			System.out.println("number is not a prime");
     		}	
	s.close();
	}
}

		
		
		
		

