package org.Task;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;



public class Task {public static void main(String[] args) {
	//using Hashset()---->Random order

	Set s = new HashSet();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(67);
	s.add(34);
	s.add(12);
	s.add(02);
	s.add(100);
	s.add(99);
	

	
	System.out.println(s);
	System.out.println("==========");
	
	//contains
	boolean d = s.contains(67);
	System.out.println(d);
	
	//using size
	int f = s.size();
	System.out.println(f);
	
	System.out.println("=========");
	for(Object e:s) {
		System.out.println(e);
	}
	
	
	
	
	//LinkedHashSet
	Set a = new LinkedHashSet();
	
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(67);
	a.add(34);
	a.add(12);
	a.add(02);
	s.add(100);
	s.add(99);
	 System.out.println(a);
	 System.out.println("=============");
	 
	 //TreeSet
	 Set b = new TreeSet();
	 

	 b.add(10);
		b.add(20);
		b.add(30);
		b.add(67);
		b.add(34);
		b.add(12);
		b.add(02);
		b.add(100);
		b.add(99);
		
		System.out.println(b);
		System.out.println("==============");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
