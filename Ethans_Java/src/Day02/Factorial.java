package Day02;

public class Factorial {

	public static void main(String[] args) {
		
		int num=4,fact=1;
		
		while(num>=1) // num>0
		{
			fact=num*fact;
			num--;
		
		}

		System.out.println(fact);
	}

}
