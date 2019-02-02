package Jan_26_Class6;

import java.util.Scanner;

// Checking number is prime or not
public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Please Enter Any Number");
		int p = s.nextInt();
		System.out.println("Entered Number is:- "+p);
		if(p==0||p==1)
		{
			System.out.println("Number is not prime number");
		}
		else {
			
			if(p%2==0) {
				
				System.out.println("Number is not prime number");
			}
			else {
				
				for(int i =3;i<p;i++) {
					
					if(p%i==0)
					{
						System.out.println("Number is not prime number");
						break;
						
					}
				
					else {
						System.out.println("Number is prime number");
					break;
				}
				}
			}
		}
		
		
		
		
		
	}

}
