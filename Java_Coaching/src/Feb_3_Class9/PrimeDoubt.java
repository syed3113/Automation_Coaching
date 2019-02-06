package Feb_3_Class9;
import java.util.Scanner;

public class PrimeDoubt {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		 int half =num/2;
		 int check =0;
		 
		 for(int i=2;i<=half;i++)
		 {
			 if(num%i==0) {
				 
				 System.out.println("Number is not prime");
				 check=1;
				 break;
			 }
			 
		 }
		 if(check==0)
		 {
			 System.out.println("Prime Number");
		 }
	}

}
