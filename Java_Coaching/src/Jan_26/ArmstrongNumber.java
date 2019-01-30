package Jan_26;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int n,temp;
		int c=0;
		System.out.println("Please enter any number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		temp=num;
		while(num>0) {
			 n = num%10;
			 c = n*n*n +c;
			 num=num/10;
			
			
		}
		if(temp==c) {
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
		
	}

}
