package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListiteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> a1 = new ArrayList<Integer>();
		//collection.add(object e); is used to add objects in arraylist
		
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add(8);
		a1.add(33);
		a1.add(7);
		
		Iterator <Integer> i = a1.iterator();

		while (i.hasNext())
		{
			
			System.out.println(i.next());
		
		}
		
		ListIterator <Integer> l = a1.listIterator();
		System.out.println("Forward direction");
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		System.out.println("backward direction");
		
		while (l.hasPrevious())
		{
			System.out.println(l.previous());
		}
	}

}
