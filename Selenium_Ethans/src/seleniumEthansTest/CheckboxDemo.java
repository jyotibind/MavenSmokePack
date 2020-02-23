package seleniumEthansTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1100)");
		Thread.sleep(10000);
		
		//js.executeScript("document.querySelector(\"#cp_id_fbcbd-1 > div.cp-modal.cp-modal-window-size > div > div.cp-overlay-close.cp-image-close.cp-inside-close.cp-adjacent-right > img\").click()");
		WebElement ele_cross= driver.findElement(By.xpath("//img[@alt='close-link']"));
		
		if(ele_cross.isDisplayed()) {
			//ele_cross.click();
			Thread.sleep(5000);
			js.executeScript("document.querySelector('#cp_id_fbcbd-1 > div.cp-modal.cp-modal-window-size > div > div.cp-overlay-close.cp-image-close.cp-inside-close.cp-adjacent-right > img').click()");
		}
		
		
		List <WebElement> elecheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i=0;i<elecheckbox.size();i++)
		{
			WebElement elecheck = elecheckbox.get(i);
			elecheck.click();
		}
		
		Thread.sleep(5000);

	}

}
