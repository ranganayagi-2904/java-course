package org.bank;
//child
public class IndianBank extends ReserveBank{
	private void amtInIndianBank() {
		System.out.println("amt in indianbank is 10cr");
		
		
	}
	public static void main(String[] args) {
		IndianBank b = new IndianBank();
		b.amtInIndianBank();
		
		
	}

}
