package day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hash1=new HashMap<Integer,String>();
	hash1.put(1,"Blue");
	hash1.put(2,"Black");
	hash1.put(3,"Pink");
	hash1.put(4,"Purple");
	hash1.put(5,"Blue");
	hash1.put(6,"Purple");
	hash1.put(null, "abc");
	hash1.put(11, null);
	hash1.put(22, null);
	
	System.out.println(hash1);
	
	TreeMap<Integer,String> test1 = new TreeMap<Integer,String>();
	
	test1.put(1,"Blue");
	test1.put(2,"Black");
	test1.put(5,"Blue");
	test1.put(6,"Purple");
    test1.put(3,"Pink");
	test1.put(4,"Purple");
	test1.put(null, "abc");
	test1.put(11, null);
	test1.put(22, null);
	
		
	System.out.println(test1);
	
	  LinkedHashMap<Integer,String> lhash1 = new LinkedHashMap<Integer,String>();
		
      lhash1.put(1,"Blue");
      lhash1.put(2,"Black");
      lhash1.put(5,"Blue");
      lhash1.put(6,"Purple");
      lhash1.put(3,"Pink");
      lhash1.put(4,"Purple");
      lhash1.put(null, "abc");
      lhash1.put(11, null);
      lhash1.put(22, null);
      
   
      System.out.println(lhash1);

	}

}
