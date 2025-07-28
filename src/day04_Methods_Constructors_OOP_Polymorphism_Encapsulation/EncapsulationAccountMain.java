package day04_Methods_Constructors_OOP_Polymorphism_Encapsulation;

public class EncapsulationAccountMain {

	public static void main(String[] args) {

		EncapsulationAccount acc=new EncapsulationAccount();
		
		acc.setAccno(101);
		acc.setAmount(55000);
		acc.setName("IronMan");
		
		
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
		
	}

}
