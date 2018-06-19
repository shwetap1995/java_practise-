  import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
	int inputNumber = s.nextInt();
	boolean isPrime = false;
	if(inputNumber ==  2) {
		System.out.println("Number is Prime");
	}	
	else if(inputNumber % 2 == 0){
                System.out.println("Number is not prime");

	} else{	
	    for(int i=2;i<inputNumber;i++){
		if(inputNumber % i == 0){
			isPrime = false;
              		break;
		}
	    if(isPrime) {
                System.out.println("number is a prime");
		} else  {
	
                System.out.println("number is not prime");
		}
	s.close();
	}
	}	
}
}
		
		
		
		

