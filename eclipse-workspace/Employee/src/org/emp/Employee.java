package org.emp;


public class Employee {
	private void empId() {
		System.out.println("e21it042");
	}
	private void empDob() {
		System.out.println("29.05.2004");
		
	}
	private void empName() {
		System.out.println("ranga");
	}
	private void empPhone() {
		System.out.println("2345690");
		
	}
	private void empEmail() {
		System.out.println("ranganayagi2904@gmail.com");
	}
	private void empAddress() {
		System.out.println("erode");
		
	}
	public static void main(String[] args) {
		Employee a = new Employee() ;
		a.empId();
		a.empDob();
		a.empName();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}

}
