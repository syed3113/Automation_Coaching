package Jan_26;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int r;
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter minimum two digit number");
		int num = s.nextInt();
		System.out.println("Enter Number is :- "+num);
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum = (sum*10) +r;
			num=num/10;
			
		}
		System.out.println(sum);
		System.out.println(temp);
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
		
		/*
		 * class PalindromeExample{ public static void main(String args[]){ int
		 * r,sum=0,temp; int n=454;//It is the number variable to be checked for
		 * palindrome
		 * 
		 * temp=n; while(n>0){ r=n%10; //getting remainder sum=(sum*10)+r; n=n/10; }
		 * if(temp==sum) System.out.println("palindrome number "); else
		 * System.out.println("not palindrome"); } }
		 */
		
	}

}
