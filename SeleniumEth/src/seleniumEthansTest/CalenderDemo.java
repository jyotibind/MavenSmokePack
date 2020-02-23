package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		//below is not a valid method
		//****
		/*
		WebElement ele_from= driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		ele_from.sendKeys("Shivaji Nagar, Pune");
		
		WebElement ele_dest= driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		ele_dest.sendKeys("Mumbai Airport");
		*/
		//****
		
		WebElement ele_from= driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		ele_from.sendKeys("Pune");
		Thread.sleep(5000);
		
		String source= "Swargate, Pune";
		String dest= "Vijay Nagar, Indore";
		
		driver.findElement(By.xpath("//li[text()='"+source+"']")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Indore");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[text()='"+dest+"']")).click();
		
		//WebElement ele_Month=driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]"));
		
		while(true)
		{
		
			String String_date = "11";
			WebElement ele_Month=driver.findElement(By.xpath("(//td[@class='monthTitle'])[2]"));
			if(ele_Month.getText().contentEquals("Nov 2020"))
			{
				//driver.findElement(By.xpath("(//td[text()='11'])[2]")).click();
				//hardcode the date to be selected\
			
				driver.findElement(By.xpath("(//td[text()='"+String_date+"'])[2]")).click();
				
				//parametrised date
				break;
			}
			else
			{
				driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
				
			}
		
		}
		
		
	}

}
