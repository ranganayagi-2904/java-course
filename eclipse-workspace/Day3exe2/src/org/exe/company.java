package org.exe;
//same calss
//same method
//deffrent arguments

public class company {
	
	//method
	public void empName(String name) {
		
		System.out.println("emp name is:"+name );
		
	}
	public void age(int age) {
		System.out.println("emp age is :"+age);
		

	}
	//main method
	public static void main(String[] args) {
		//method call
		company a = new company();
		a.empName("rang");
		a.age(18);
		
		
	}

}
