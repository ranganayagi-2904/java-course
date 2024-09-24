package org.VoteTask;


public class VoteTask {private void voter(int age) {
	//20>=18
	if(age>=18) {
		System.out.println("ok");
	}
	else {
		System.out.println("not ok");
		
	}	

}
private void even(int number) {
	if(number %2==0) {
		System.out.println("this is even number");
	}
	else {
		System.out.println("this is odd number");
	}
		
	

}

 public static void main(String[] args) {
	VoteTask a = new VoteTask();
	VoteTask b = new VoteTask();
	a.voter(18);
	b.even(10);
}


}


//output
//ok
//this is odd number

