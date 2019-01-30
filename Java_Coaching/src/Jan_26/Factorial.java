package Jan_26;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int fac=1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number ");
		int num = s.nextInt();
		
		for(int i=2;i<=num;i++) {
			
			fac = fac*i;
		}
		
		System.out.println("Factorial of "+num+ "is" +fac);
		
	}

}
