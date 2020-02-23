package Day05;

public class Circle

{
	float area;
	int radius;
	
	float acceptData(int r1) //float is data-type 
	
	{
		area=3.142f*radius*radius;
		return area;  //return data-type should be same as the data-type of method,data-type of area is float
	}

}

