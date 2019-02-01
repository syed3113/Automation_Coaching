package Jan_5;

public class Student {

	int age,roll_no;
	 public void display1()
	 {
		 System.out.println("Welcome All");
	 }
	 public void display2()
	 {
		 System.out.println("Welcome All Of You");
	 }
	 
	 public static void main(String[] args) {
		 
		 Student deepak = new Student();
		 deepak.age =21;
		 deepak.roll_no =43;
		 System.out.println("Deepak Age:-"+deepak.age);
		 System.out.println("Deepak Roll_No:-"+deepak.roll_no);
		 deepak.display1();
		 Student deep = new Student();
		 deep.age=31;
		 deep.roll_no=32;
		 System.out.println("Deep Age:-"+deep.age);
		 System.out.println("Deep Roll No:-"+deep.roll_no);
		 deep.display2();
	}
}
