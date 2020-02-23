package Day05;

public class Rectangle {
	
	int length,breadth,area,perimeter;
	
	void acceptData(int n1,int n2)
	{
		length=n1;
		breadth=n2;
	}
	void calArea()
	{
		area=length*breadth;
		System.out.println("Area of rectangle = "+area);
	}
	void calPerimeter() 
	{
		perimeter=2*(length+breadth);
		System.out.println("Perimeter of rectangle = "+perimeter);
	}
	void show()
	
	{
		System.out.println("length of rectangle = "+length);
		System.out.println("breadth of reactangle = "+breadth);
	}

}
