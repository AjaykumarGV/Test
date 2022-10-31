package org.employee;

//methodoverloading

public class EmployeeDatas {

	private void employee() {
		System.out.println("Empty Method");

	}
	private void employee(int age) {
		System.out.println("My age is "+age);

	}
	private void employee(String name) {
		System.out.println("My name is "+name);

	}
	private void employee(int idNo,String email,char Gender) {
		System.out.println("My Id No is "+idNo+"\n"+"My Email Id is "+email+"\n"+"My Gender is "+Gender);	
		}
	private void employee(float salary,long phone) {
		System.out.println("My Salary is "+salary+"\n"+"My phone Number is "+phone);

	}
	private void employee(long phone,float salary) {
		System.out.println("My Phone Number is "+phone+"\n"+"My Salary is "+salary);

	}
	
	
	public static void main(String[] args) {
		
		EmployeeDatas e=new EmployeeDatas();
		
		e.employee();
		e.employee(23);
		e.employee("Ajay");
		e.employee(123456, "ajaykrishnamech@gmail.com", 'M');
		e.employee(54636.567424f, 9524733145l);
		e.employee(9524733145l, 64753.443356f);
	}
	
	
	
}
