package seleniumEthansTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetAllLinksName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(5000);
		
		List <WebElement> eleLinks = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<eleLinks.size();i++)
		{
		 WebElement elelink = eleLinks.get(i);
		 String strLinkName = elelink.getText();
		 System.out.println(strLinkName);
		}

	}

}
