package Jan_26_Class6;

// List Prime Number between 5 and 50

public class PrimeNumberBetween {
	
	
	public static void main(String[] args) {
		
		for(int number=5;number<=50;number++) {
			int check=0;
			int half = number/2;
			for(int i=2;i<=half;i++)
			{
				if(number%i==0)
				{
					//System.out.println("Not a prime number");
					check=1;
					break;
				}
				
			}
			if(check==0) {
				
				System.out.println("Prime Number:- "+number);
			}
			
		}
	}
}
