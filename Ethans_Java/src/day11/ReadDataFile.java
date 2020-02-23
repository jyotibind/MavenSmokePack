package day11;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		
		try 
		{
			fr=new FileReader("Demo.txt"); // give path of file you want to read
			int i;
			while((i=fr.read())!=-1)
			{
				char ch=(char)i;
				System.out.println(ch);
			}
			
		}
		catch(IOException e) // IOException belongs to java.io package not java.lang package
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fr.close();
			}
			
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}

