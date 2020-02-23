package Day05;

public class Area {

	void Area(float radius)

	{
		System.out.println("Area of cicle "+ (3.142*radius*radius));
	}
	void Area(int height,float base)

	{	//area = h*b/2

		System.out.println("Area of triangle "+ ((height*base)/2));

	}

	void Area(int length,int breadth)

	{
		System.out.println("Area of rectangle "+ (length*breadth));
	}

	void Area(int side)

	{
		System.out.println("Area of square "+ (side*side));

	}

}
