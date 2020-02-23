package seleniumEthansTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile= ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(srcFile, new File("E:\\selenium files\\screen.jpg"));
	}

}
