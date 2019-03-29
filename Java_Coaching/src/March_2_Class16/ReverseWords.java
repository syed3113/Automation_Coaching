package March_2_Class16;

public class ReverseWords {
	
	//Output:- ym eman si mahsithA
	
/*	public static void main(String[] args) {
		
		
		String name ="My Name is Ahtisham";
		String reverse=" ";
		String reversename=" ";
		String reversename1=" ";
		String[] temp = name.split(" ");
		 for(int i=0;i<temp.length;i++)
		 {
			 reverse =temp[i];
			 System.out.println("Reverse:-"+reverse);
			 for(int j=reverse.length()-1;j>0;j--)
			 {
				 System.out.println("J:-"+j);
				 reversename= reversename +reverse.charAt(j);
				 System.out.println("Reversename:-"+reversename);
			 }
			 reversename1 = reversename1+reversename;
		 }
		
		System.out.println(reversename1);
		
	}

}*/





	public static void main(String[] args) {
	     String name="My Name is Ahtisham"  ;
	     String[] word=name.split(" ");
	     String reversename=" ";
	     int i,j;
	     for(i=0;i<word.length;i++){
	      String str=word[i];
	      String revstr=" "   ;
	      for(j=str.length()-1;j>=0;j--){
	         char chr=str.charAt(j) ;
	         revstr=revstr+chr;
	      }
	      reversename =reversename + revstr ;
	    }
	    System.out.println(reversename);
	}
}
 