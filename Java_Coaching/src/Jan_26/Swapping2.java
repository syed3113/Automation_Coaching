package Jan_26;

import java.util.Scanner;

//SWAPPING OF TWO NUMBERS WITHOUTUSING THIRD VARIABLE
public class Swapping2 {
	
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Value of a");
		a= s.nextInt();
		System.out.println("Value of a:- "+a);
		System.out.println("Please Enter Value of b");
		b=s.nextInt();
		System.out.println("Value of b:- "+b);
		a=a+b;
		b=a-b;
		System.out.println("Swapped Value of b is:- "+b);
		a=a-b;
		System.out.println("Swapped Value of a is:- "+a);
		
		
	}
	

}
