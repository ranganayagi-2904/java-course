package org.bank;
//child

public class SBI extends ReserveBank {
	public void amtInSBI() {
		System.out.println("amt to  sbi is 5cr");

	}
	public static void main(String[] args) {
		SBI a = new SBI();
		a.amtInSBI();
	
	}
		
	

}
