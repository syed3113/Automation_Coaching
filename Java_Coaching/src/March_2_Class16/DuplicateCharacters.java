package March_2_Class16;

public class DuplicateCharacters {
	
	public static void main(String args[])
	{
		String str = "syedahtishamali";
		char[] input = str.toCharArray();
		int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(input[i]==input[j])
				 {
					 System.out.println(input[j]);
					 count++;
					 break;
				 }
			 }
			 
		 }
		 System.out.println(count);
		
	}

}
