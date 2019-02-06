package Jan_26_Class6;
/*
      *
     **
    ***
   ****
  *****
 */





public class Loop5 {
	
	
	public static void main(String[] args) {
		
		int r =5;
		
		for(int i=1;i<=r;i++) {
			
			for(int j =i;j<=r-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
