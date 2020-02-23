package Excel;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class ReadData {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		
		Fillo f = new Fillo();  // create an object of fillo class
		Connection con=f.getConnection("C:\\Users\\SINGH\\Documents\\excel1.xlsx");
		String qry="select * from Sheet1";
		Recordset set=con.executeQuery(qry);
		while(set.next())
			
		{
			System.out.println(set.getField("Name"));
			System.out.println(set.getField("id"));
		}
		
		String qry1= "INSERT INTO Sheet1(Name,id) VALUES('Urvashi',12)";
		con.executeUpdate(qry1);
		con.close();
		//we cannot perform update query if file is opened

	}

}
