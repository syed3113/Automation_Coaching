package Jan_26_Class6;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.println("Please Enter Number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			sum = a+b;
			System.out.println(a + "");
			a=b;
			
			b=sum;
		}
		
	}

}
