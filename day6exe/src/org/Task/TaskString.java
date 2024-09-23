package org.Task;
public class TaskString {
	public static void main(String[] args) {
		
		String name = "RanganayagiSekar";
		//method
		//Length
		int length = name.length();
		System.out.println(length);
		
		//ChartAt
		char c = name.charAt(6);
		System.out.println(c);
		
		//indexOf
		int indexOf = name.indexOf('a');
		System.out.println(indexOf);
		
		//lastIndex
		int b=name.lastIndexOf('a');
		System.out.println(b);
		
		//startendWith
		boolean e = name.startsWith("ranga");
		System.out.println(e);
		
		//endWith
		boolean end = name.endsWith("ar");
		System.out.println(end);
		
		 //equal
		String p = "RANGA";
		String q = "ranga";
		
		boolean equals = p.equals(q);
		System.out.println(equals);
		
		//equalIgnoreCase
		boolean equalsIgnoreCase = p.equalsIgnoreCase(q);
		System.out.println(equalsIgnoreCase);
		
		String replace = p.replace("Ranga", "Dharani");
		System.out.println( replace);
		
		String replaceAll =p.replaceAll("Ranga","Dharani");
		System.out.println(replaceAll);
		
		//String
		String substring = name.substring(3);
		System.out.println(substring);
		
		//
		
		String substring2 = name.substring(3,3);
		System.out.println(substring2);
		
		int compareTo = p.compareTo(q);
		System.out.println(compareTo);
		
				
		
		
	}


}
