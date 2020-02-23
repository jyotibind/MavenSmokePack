package seleniumEthansTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		
		/*
		driver.findElement(By.xpath("//input[@id='photo']")).click();
		// this will give you org.openqa.selenium.InvalidArgumentException: invalid argument because its Attribute type is File
		//which is not available to click it has to be used with sendKeys
		 * 
		 */
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		List <WebElement> ele = wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//img[@class='lazyloading']"), 1));
		wait.until(ExpectedConditions.elementToBeClickable(ele.get(0))); // as the list has only one element so work till it gets 0
		ele.get(0).click(); // Element not intractable exception will occur when element is present in DOM but not accessible hence used above
		
		JavascriptExecutor js = ( JavascriptExecutor ) driver;
		js.executeScript("document.querySelector('#photo').click()");
		
		Robot robot = new Robot();
		robot.setAutoDelay(2000);  //its similar to Thread.sleep()
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\SINGH\\Documents\\pexels-photo-1108099.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	

	}

}
