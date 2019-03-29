package March_2_Class16;

public class ReverseString {
	// Output:- Ahtisham is Name My
	public static void main(String[] args) {
		 
		String name ="My Name is Ahtisham";
		String reverse=" ";
		String[] temp = name.split(" ");
		System.out.println("Length:-"+temp.length);
		for(int i =temp.length-1; i>=0;i--)
		{
			System.out.println("I:-"+i);
			System.out.println("Temp:-"+temp[i]);
			reverse = reverse+temp[i]+" ";
			System.out.println("Reverse:-"+reverse);
		}
		System.out.println("Output:-"+reverse);
	}

}
