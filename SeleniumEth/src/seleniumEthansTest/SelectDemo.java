package seleniumEthansTest;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement ele_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel = new Select(ele_month);
		//sel.selectByIndex(8);
		//sel.selectByValue("2");
		//sel.selectByVisibleText("Nov");
		
		List <WebElement> allItems= sel.getOptions();
		ListIterator<WebElement> ele= allItems.listIterator();
		
		while(ele.hasNext())
			
		{
			WebElement eleItem= ele.next();
			System.out.println(eleItem.getText());
			  
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		

	}

}
