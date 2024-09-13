package org.sample;

import org.base.Emplooyee;

import org.base.Company;


//chid
public class  Master extends Company{
	private void masterId() {
		System.out.println("master id is e21it042");
		
	}
private void masterName() {
	System.out.println(" master name is ranga");
}
public static void main(String[] args) {
	Master a = new Master();
	a.masterId();
	a.masterName();
    a.comName();
    a.compId();
    a.empName();
    a.empId();

}
}
