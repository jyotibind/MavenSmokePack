package seleniumEthansTest;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
	    Thread.sleep(5000);
		
	    String strParentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Create an account ']")).click();
		
		Set <String> AllWindowHandles = driver.getWindowHandles();
		Iterator itr = AllWindowHandles.iterator();
		
		while(itr.hasNext())
		{
			String sChildhandle = (String)itr.next();
			
			if(!sChildhandle.contentEquals(strParentHandle))
			{
				driver.switchTo().window(sChildhandle);
			}
		}
		
		driver.findElement(By.id("firstName")).sendKeys("Hello");
		
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(strParentHandle);
		driver.findElement(By.xpath("//a[text()='Create an account ']")).click();
		
		//driver.quit();
		
		
		
		

	}

}
