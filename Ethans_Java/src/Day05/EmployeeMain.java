package Day05;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.acceptData(1, "Juhi", 23, 20000);
		
		e1.display1();
		System.out.println(" ");
		Employee e2=new Employee();
		e2.acceptData(2, "Nidhi", 24, 23000);
		
		e2.display2();
		System.out.println(" ");
        if(e1.sal>e2.sal)
        {
        	System.out.println("Salary of Juhi is high "+e1.sal);
        }
        else
        {
        	System.out.println("Salary of Nidhi id high "+e2.sal);
        }

	}

}
