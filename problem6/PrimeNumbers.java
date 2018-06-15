import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
	int InputNumber=s.nextInt();	
		if(InputNumber%2==0){
                System.out.println("Number is not prime");	
                break;	
	       }
		else if(InputNumber==2){
			System.out.println("Number is a prime");
              		break;

       		}
		else{	
			for(int i=2;i<InputNumber;i++){
				if(InputNumber%i==0){
					System.out.println("Number is not prime");
              				break;
				}
					
                                {
                                        System.out.println("number is a prime");
				}
			}

s.close();
	}
}

		
		
		
		

