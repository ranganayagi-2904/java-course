package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;





//types of map...........
public class TaskMap {
	public static void main(String[] args) {
		//HashMap
		Map<String,Integer> m1 = new HashMap();
		m1.put("SRN", 10);
		m1.put("MMM", 50);
		m1.put("RRR", 30);
		m1.put("UUU", 20);
		m1.put("NNN", 67);
		m1.put("null", null);
		m1.put("AAA", 89);
		m1.put("TTT", 66);
		System.out.println(m1);
		System.out.println("==========");
		
		//LinkedHashMap
        Map<String,Integer>m2 = new LinkedHashMap();
        m2.put("SRN", 10);
		m2.put("MMM", 50);
		m2.put("RRR", 30);
		m2.put("UUU", 20);
		m2.put("NNN", 67);
		m2.put("null", null);
		m2.put("AAA", 89);
		m2.put("TTT", 66);
		System.out.println(m2);
		System.out.println("==========");
       
		//TreeMap
	    Map<String,Integer>m3 = new TreeMap();
	    m3.put("SRN", 10);
		m3.put("MMM", 50);
		m3.put("RRR", 30);
		m3.put("UUU", 20);
		m3.put("NNN", 67);
		m3.put("null", null);
		m3.put("AAA", 89);
		m3.put("TTT", 66);
		System.out.println(m3);
		System.out.println("==========");
		
		//Hashtable
		Map<String,Integer>m4 = new Hashtable();
		
		m4.put("SRN", 10);
		m4.put("MMM", 50);
		m4.put("RRR", 30);
		m4.put("UUU", 20);
		m4.put("NNN", 67);
//	m4.put("null", null);
		m4.put("AAA", 89);
		m4.put("TTT", 66);
		System.out.println(m4);
		System.out.println("==========");
		
//		//Methods oh map.............
//		
		//LinkedHashMap
        Map<String,Integer>m5 = new LinkedHashMap();
        m5.put("SRN", 10);
		m5.put("MMM", 50);
		m5.put("RRR", 30);
		m5.put("UUU", 20);
		m5.put("NNN", 67);
		m5.put("null", null);
		m5.put("AAA", 89);
		m5.put("TTT", 66);
		
		//Methods of map
		//Put()
	    m5.put("SRN", 10);
	    System.out.println(m5);
	    System.out.println("===========");
	    //Size()
	    int size = m5.size();
	    System.out.println(m5);
	    System.out.println("===========");

	    
	    //containsKey()
	    boolean containsKey = m5.containsKey("RRR");
	    System.out.println(m5);
	    System.out.println("===========");

	    
	    //containsValue()
	    boolean containsValue = m5.containsValue(30);//(collections of String,Array,Set)
	    System.out.println(m5);
	    System.out.println("===========");

	    
	    //remove()
	    m5.remove("UUU");
	    System.out.println(m5);
	    System.out.println("===========");

	    
	    //keySet()
	    Set<String>keySet = m5.keySet();
	    System.out.println(keySet);
	    System.out.println("===========");

	    
	    //Value()
	    Collection<Integer>Values = m5.values();
	    System.out.println(Values);
	    
	    System.out.println("==============");
	    
	    //entrySet()
	    Set<Entry<String,Integer>>entrySet = m5.entrySet();
	    
	    
	    for(Entry<String,Integer> e:entrySet) {
	    	System.out.println(e);
//	    	String Key = e.getKey();//example
//	    	System.out.println(Key);//example
	    	System.out.println(e.getKey());
	    	System.out.println(e.getValue());
	    	
	    	
	    	
	    }
	    
	    	
	    
	    System.out.println("==========");
		
		
       }

}

//output;

//{AAA=89, RRR=30, UUU=20, null=null, TTT=66, MMM=50, SRN=10, NNN=67}
//==========
//{SRN=10, MMM=50, RRR=30, UUU=20, NNN=67, null=null, AAA=89, TTT=66}
//==========
//{AAA=89, MMM=50, NNN=67, RRR=30, SRN=10, TTT=66, UUU=20, null=null}
//==========
//{TTT=66, AAA=89, RRR=30, SRN=10, NNN=67, UUU=20, MMM=50}
//==========
//{SRN=10, MMM=50, RRR=30, UUU=20, NNN=67, null=null, AAA=89, TTT=66}
//{SRN=10, MMM=50, RRR=30, UUU=20, NNN=67, null=null, AAA=89, TTT=66}
//{SRN=10, MMM=50, RRR=30, UUU=20, NNN=67, null=null, AAA=89, TTT=66}
//{SRN=10, MMM=50, RRR=30, UUU=20, NNN=67, null=null, AAA=89, TTT=66}
//{SRN=10, MMM=50, RRR=30, NNN=67, null=null, AAA=89, TTT=66}
//[SRN, MMM, RRR, NNN, null, AAA, TTT]
//[10, 50, 30, 67, null, 89, 66]
//==============
//SRN=10
//SRN
//10
//MMM=50
//MMM
//50
//RRR=30
//RRR
//30
//NNN=67
//NNN
//67
//null=null
//null
//null
//AAA=89
//AAA
//89
//TTT=66
//TTT
//66
//==========






























