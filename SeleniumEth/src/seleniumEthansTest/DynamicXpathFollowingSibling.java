package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathFollowingSibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(5000);
		
		String Building="Clock Tower Hotel";
		
		String Rank = driver.findElement(By.xpath("//th[text()='"+Building+"']//following-sibling::td[5]")).getText();
		
		//Following will give you all the values following elements(tag) but following sibling will give you element on the same level
		
		System.out.println("Rank:: "+Rank);
		

	}

}
