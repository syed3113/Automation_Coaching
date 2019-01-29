package Jan_26;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter minimum two digit number");
		int num = s.nextInt();
		System.out.println("Enter Number is :- "+num);
		int a= num%10;
		int b = num/10;
		int c= b%10;
		int d= b/10;
		int e = (a*100 ) +(c*10) +d;
		if(num==e)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
		
	}

}
