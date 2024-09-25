package org.Task;
import java.util.ArrayList;
import java.util.List;

public class Task {
	public static void main(String[] args) {
		List q = new ArrayList();
		q.add(10);
		q.add(true);
		q.add('m');
		q.add(null);
		q.add("appa");
		q.add(29.345f);
		q.add(02);
		
		System.out.println(q);
		System.out.println("==========");
		
		for(int i=0;i<q.size();i++);
		System.out.println(q.get(1));
		
	}

}
