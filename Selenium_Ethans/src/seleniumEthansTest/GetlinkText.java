package seleniumEthansTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetlinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.goibibo.com/");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@id='authiframe']"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("8054923629");
		
		driver.switchTo().defaultContent();
		
		
	}

}
