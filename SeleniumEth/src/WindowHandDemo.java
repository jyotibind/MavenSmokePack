import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandDemo {

	//private static final StringBuffer strParentHandle = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create an account ']")).click();
		
		Set <String> AllWindowHandles = driver.getWindowHandles();
		java.util.Iterator<String> itr = AllWindowHandles.iterator();
		
		String strParentHandle = null;
		while(itr.hasNext())
			
		{
            String sChildhandle = (String)itr.next();
		
		
			if(!sChildhandle.contentEquals(strParentHandle))
			{
				driver.switchTo().window(sChildhandle);
			}
		}
		
        driver.findElement(By.id("firstName")).sendKeys("Jyoti");
		
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(strParentHandle);
		driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		
		
		
	
		

	}

}
