package day07;

public class ChildSuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c1=new Child();
		c1.takeData("Ram", "Sarvesh", "Bind", 56, "Bcom");
		c1.acceptData("Juhi", 20, "btech");
		System.out.println("Firstname"+"\t"+"Middlename"+"\t"+"Lastname"+"\t"+"Age"+"\t"+"Qualification");
		c1.display();
		

	}

}
