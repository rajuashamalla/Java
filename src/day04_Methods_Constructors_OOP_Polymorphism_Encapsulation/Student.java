package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void PrintStudentData()
	{
		System.out.println(sid+ "      "+sname+"    "+grad);
	}
	
	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	

}
