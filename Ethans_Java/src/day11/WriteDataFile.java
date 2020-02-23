package day11;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw = null;
		
		try 
		{
			fw=new FileWriter("Demo.txt");
			fw.write("welcome to file handling");
			
		}
		catch(IOException e) // IOException belongs to java.io package not java.lang package
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fw.close();
			}
			
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}

}
