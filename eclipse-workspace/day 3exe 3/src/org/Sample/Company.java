//package org.Sample;
////sameclas
////same method
////diffrent argumnets
//
//public class Company {
//	//"rang"
//		public void empData(String name,int a) {
//			
//			System.out.println("emp name is:"+name+"\n"+"emp age is"+a);
//			
//		}
//		public void age(int age,String n) {
//			System.out.println("emp age is :"+age+"\n"+"emp name is"+n);
//			
//
//		}
//		//main method
//		public static void main(String[] args) {
//			//method call
//			Company a = new Company();
//			a.empData("Rang",18);
//			
//			
//			
//			
//		
//
//	}
//
//}


package org.Sample;
////sameclas
////same method
////diffrent argumnets

public class Company {
//"rang"
	public void empName(String name) {		
		System.out.println("emp name is:"+name);
		this.empName(18);
		
}
	private void empName(int age) {
		System.out.println("emp age is"+age);
	}
	public void age(char a) {
		System.out.println("emp age is :"+a);
		

	}	//main method	
	public static void main(String[] args) {
		//method call	
	Company a = new Company();
		
		a.empName("Uk");
		
		
}
}







