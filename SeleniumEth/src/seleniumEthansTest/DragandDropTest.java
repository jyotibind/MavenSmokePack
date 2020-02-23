package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement i_frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(i_frame);
		
		WebElement ele_drag= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement ele_drop= driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(ele_drag,ele_drop).perform();
		
		//act.contextClick(ele_drop).perform();
		
		
		
	}

}
