package day12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		HashSet<String> hash1=new HashSet<String>();
			hash1.add("Blue");
		hash1.add("Black");
		hash1.add("Pink");
		hash1.add("Purple");
		hash1.add("Blue");
		hash1.add("Purple");
		hash1.add(null);
		
		System.out.println(hash1);
		
		*/
		
		//it will throw null pointer exception as we cannot sort according to null
		
		/*
		TreeSet<String> test1 = new TreeSet<String>();
		
		test1.add("Blue");
		test1.add("Black");
		test1.add("Pink");
		test1.add("Purple");
		test1.add("Blue");
		test1.add("Purple");
		test1.add(null);
		
		System.out.println(test1);
		
		*/
		
		//it will not give any complie time error but it will only accept unique values not duplicate during runtime
		
        LinkedHashSet<String> lhash1 = new LinkedHashSet<String>();
		
        lhash1.add("Blue");
        lhash1.add("Black");
        lhash1.add("Pink");
        lhash1.add("Purple");
        lhash1.add("Blue");
        lhash1.add("Purple");
        lhash1.add(null);
		
		System.out.println(lhash1);
		
	

	}

}
