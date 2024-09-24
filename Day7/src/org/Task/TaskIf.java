package org.Task;

public class TaskIf { 

	private void voter(int age) {
		//20>=18
		if(age>=18) {
			System.out.println("ok");
		}
		else {
			System.out.println("not ok");
			
		}

		
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		TaskIf a = new TaskIf();
		a.voter(18);
	}

}

//output
//ok