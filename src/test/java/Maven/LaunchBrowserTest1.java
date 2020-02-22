package Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jyoti");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bind");
		

	}

}