package day12;
import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> a1 = new ArrayList<String>();
		//collection.add(object e); is used to add objects in arraylist
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Red");
		a1.add("White");
		a1.addAll(a1);
		
		System.out.println(a1);
		System.out.println(a1.indexOf("Red"));
		System.out.println(a1.lastIndexOf("Red"));
		System.out.println(a1.subList(1, 3));
		
		System.out.println(a1.contains("Red"));
		
		a1.remove("Red");
		System.out.println(a1);
		
		/*
		 * a1.removeAll(a1);
		 * System.out.println(a1);
		 */
		
		System.out.println(a1.size());
		
		System.out.println(a1.isEmpty());
		
		/*
		a1.clear();
		System.out.println(a1);
		*/
		
		System.out.println(a1.get(3));
		
		//System.out.println(a1.indexOf("White"));
		
		a1.set(1, "Black");
		System.out.println(a1);
		
		//System.out.println(a1.lastIndexOf("Red"));

	}

}
