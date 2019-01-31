package Jan_26;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		System.out.println("Please enter any number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Table Of "+num);
		for(int i=1;i<=10;i++) {
			
			System.out.println(num +"*" + i+"=" +num * i);
		}
	}
	
}
