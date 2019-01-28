package Jan_26;

import java.util.Scanner;

              // SWAPPING OF TWO NUMBERS USING THIRD VARIABLE

public class Swapping1 {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Value Of a");
		int a= s.nextInt();
		System.out.println("Entered Value of a is:- "+a);
		System.out.println("Please Enter Value Of b");
		int b = s.nextInt();
		System.out.println("Entered Value of b is:- "+b);
		
		int c = a+b;
		b=c-b;
		a=c-a;
		System.out.println("Swapped Value of a is:- "+a);
		System.out.println("Swapped Value of b is:- "+b);
	}
	

}
