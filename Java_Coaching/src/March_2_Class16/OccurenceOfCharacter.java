package March_2_Class16;

public class OccurenceOfCharacter {
	// Occurence of a in syed ahtisham ali
	public static void main(String[] args) {
		String str = "Syed ahtisham Ali";
		int len = str.length();
		int find =0;
		for(int i=0;i<len;i++)
		{
			char str1 = str.charAt(i);
			
			
			if(str1=='a')
			{
				find++;
			}
		}
		System.out.println("Occurence of a:-"+find);
	}

}
