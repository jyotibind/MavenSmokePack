package day0901;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Result r1=new Result();
		r1.accept(1, "Juhi", 19);
		r1.acceptmarks(70f, 85f, 90f);
		//r1.acceptspmarks(90);
		r1.show();
		r1.totalmarks();
		r1.percentage();
		r1.grade();
		

	}

}
