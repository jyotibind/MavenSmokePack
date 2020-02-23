package Day03;

public class SumOfEvenAndOddNum {

	public static void main(String[] args) 
	{
		int i =100,SumOfEven=0, SumOfOdd=0;

		do
		{
			if(i%2==0)
			{
				SumOfEven = SumOfEven + i;

			}
			else
			{
				SumOfOdd = SumOfOdd + i;

			}
			i++;
		}
		while (i <=500);
		System.out.println("Sum Of Even Numbers = "+ SumOfEven);
		System.out.println("Sum Of Odd Numbers = "+ SumOfOdd);





	}

}
