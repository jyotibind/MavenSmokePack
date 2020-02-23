package Day04;

public class FirstLargestElementOfArray {

	public static void main(String[] args) {

		int x[] = {10,53,90,1200,1500,3,46};
		int max=0;
		for (int i=0;i<x.length;i++)
		{
			if (max < x[i])
				max = x[i];

		}
		System.out.println(max);

	}

}
