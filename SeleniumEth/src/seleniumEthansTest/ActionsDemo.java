package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rightstartmath.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		/*
		WebElement ele_cur= driver.findElement(By.xpath("//a[text()='Curriculum']"));
		WebElement right_start= driver.findElement(By.xpath("(//a[text()='The RightStart™ Difference'])[1]"));
		WebElement right_home= driver.findElement(By.xpath("((//a[text()='RightStart™ for Home School'])[2]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(ele_cur).moveToElement(right_start).click(right_home).perform();
		*/
		
		Thread.sleep(5000);
		//act.moveToElement(ele_cur).build().perform();
		
		//we have to use build().perform() after every action
		//build() is used for more than one action
		//if only one action the we can use only perform()
		//Action is interface & Actions is a class
		
		Actions act= new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//input[@value='Search']"));
		act.sendKeys(ele, "abc").perform();
		act.sendKeys("Hello",Keys.TAB);
		
	}

}
