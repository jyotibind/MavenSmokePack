package day0801;


public class Test {
	
	Shape createShape(int choice)
	{
	if(choice==1)
	{
		Circle c=new Circle();
		return c;	
	}
	else if(choice==2)	
	{
		Rectangle r=new Rectangle();
		return r;		
	}
	else if(choice==3)	
	{
		Square s=new Square();
		return s;
	}
	else
	{
		Shape s1=new Shape();
		return s1;
	}
	
	}
}