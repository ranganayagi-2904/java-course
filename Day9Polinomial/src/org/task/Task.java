package org.task;

public class Task {
	public static void main(String[] args) {
		String s = "RANG";
		String a = "";
		for(int i = s.length()-1;i>=0;i--) {
		//System.out.println(s.charAt(i));
			a = a+s.charAt(i);

			
		}
		System.out.println(a);
		if(s.equals(a)) {
			System.out.println("pali");
		}
		else {
			System.out.println("nonpoli");
		}
	}
	

}
