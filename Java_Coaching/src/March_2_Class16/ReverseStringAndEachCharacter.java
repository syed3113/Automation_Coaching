package March_2_Class16;

public class ReverseStringAndEachCharacter {
	
	//Output:- mahsithA sI emaN yM
	
	public static void main(String[] args) {
		 String reverse="";
		String name="My Name Is Ahtisham";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse + name.charAt(i);
			System.out.println("Reverse:-"+reverse);
		}
		System.out.println("Reverse String:-"+reverse);
		
		
	}

}
