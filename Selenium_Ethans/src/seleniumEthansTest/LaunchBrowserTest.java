package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {
	
	//***public WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//"webdriver.chrome.driver" -- driver will be launched
		//Here I am setting the system properties of chrome driver and specifying the path to it.
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		//***  driver= new ChromeDriver();
		//Webdriver is an interface and ChromeDriver is a class
		//Creating a object to instantiate the browser driver
		WebDriver driver= new ChromeDriver(); // if you are not aware of object at runtime then we can use this
		
		//Navigating through a particular website
		//get is a method which is used to launch URL on driver
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("Hello");
		 	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jyoti");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jyotibind09@gmail.com");
	}
	

}
