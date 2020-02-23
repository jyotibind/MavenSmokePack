package seleniumEthansTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rightstartmath.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\'#text-3 > div > div > a:nth-child(1)\').setAttribute('style','background:yellow')");

		Thread.sleep(5000);
		js.executeScript("document.querySelector('#text-14 > div > div > p > a').scrollIntoView()");

	}

}
