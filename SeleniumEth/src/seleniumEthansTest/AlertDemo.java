package seleniumEthansTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://ksrtc.in/oprs-web/pkg/tours/loadPlaces.do");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='SrvcSelectBtn']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String strtText = alert.getText();
		System.out.println(strtText);
		alert.accept();  //click on yes, ok button
		//alert.dismiss(); //click on cancel, no button
		//alert.sendKeys("Hello");//to send text to pop up
		
	}

}
