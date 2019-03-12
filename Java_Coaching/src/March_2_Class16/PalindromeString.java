package March_2_Class16;

import java.util.Scanner;

public class PalindromeString {
	public static String original,reverse="";

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any String");
		original = s.nextLine();
		int length = original.length();
		System.out.println(original.length());
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(original.charAt(i));
			reverse = reverse+original.charAt(i);
			System.out.println(reverse);
		}
		
		if(original.equals(reverse))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
	}
	
	
}
