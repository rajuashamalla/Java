package day3;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		stu1.sid=101;
		stu1.sname="tony";
		stu1.grade='A';
		stu1.printData();
		
		Student stu2=new Student();
		stu2.sid=101;
		stu2.sname="leo";
		stu2.grade='B';
		stu2.printData(); //101    tony    A
						  //101    leo     B
		
		
	}

}
