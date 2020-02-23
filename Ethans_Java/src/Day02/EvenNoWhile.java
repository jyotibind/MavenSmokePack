package Day02;

public class EvenNoWhile {

	public static void main(String[] args) {
		
		int a=100;
		System.out.println("Even numbers between 100 to 1500");
		while(a<=1500)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a++;
		}

	}

}
