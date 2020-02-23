package seleniumEthansTest;
import java.util.*;
import java.awt.List;
import java.io.IOException;	
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenAllLinks {
	

	public static int getResponseCode(String strUrl) throws IOException
	
	{
		URL url = new URL(strUrl);
		
		HttpURLConnection con= (HttpURLConnection)url.openConnection();
		con.setConnectTimeout(5000);
		con.connect();
		int resCode = con.getResponseCode();
		return resCode;
		
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);		
		
		List <WebElement> allLinks= driver.findElements(By.tagName("a"));
		
	     for (int i=0;i<allLinks.size();i++)
				
			{
				String strHref_Url=allLinks.get(i).getAttribute("href");
				int statusCode = FindBrokenAllLinks.getResponseCode(strHref_Url);
				System.out.println("Link name : "+ allLinks.get(i).getText()+ " & Status Code : " + statusCode + " & URL : "+ strHref_Url);
			}
		
			
		

	}

}
