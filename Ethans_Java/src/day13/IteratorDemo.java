package day13;
import java.util.*;

public class IteratorDemo {

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
			
			if (i.next()>15)
			{
				i.remove();
				
			}
			/*or we can store it in variable e.g num here
			 * 
			 * Integer num=i.next();
			if(num>15)
			{
				i.remove();
			}
			*/
			
		}
		System.out.println(a1);
		
		
	}

}
