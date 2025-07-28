package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu=new Student();
		
	/*	//1)using object reference variables
		stu.sid=101;
		stu.sname="Hulk";
		stu.grad='A';
	*/
		
		// using method
	//	stu.setStudentData(101,"Hulk",'A'); 
	//stu.PrintStudentData(); //101      Hulk    A
		
		
		//3) using constructor
		Student stu=new Student(101,"Hulk", 'A');
		stu.PrintStudentData();
		
		
		

	}

}
