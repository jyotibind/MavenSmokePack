package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement ele_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel = new Select(ele_day);
		sel.selectByValue("15");
		
		WebElement ele_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1 = new Select(ele_month);
		sel1.selectByVisibleText("Nov");
		

		WebElement ele_year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2 = new Select(ele_year);
		sel2.selectByValue("1992");

		//selectByVisibleText is recommended to use
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
