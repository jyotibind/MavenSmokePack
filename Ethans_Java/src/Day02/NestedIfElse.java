package Day02;

public class NestedIfElse {

	public static void main(String[] args) {

		int a=50,b=80,c=10;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" a is greater");
			}
			else
			{
				System.out.println(c+" c is greater");
			}
		}
		else
		{
			if(b>c) 
			{
				System.out.println(b+" b is greater");
				
			}
				
			else
			{
				System.out.println(c+" c is greater");
			}
		}

	}

}
