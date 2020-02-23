package seleniumEthansTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
        Thread.sleep(5000);
        WebElement ele_search= driver.findElement(By.xpath("//input[@title='Search']"));
        ele_search.sendKeys("testing life cycle");
        List<WebElement> search_list= driver.findElement(By.xpath("//ul[@role='listbox']")).findElements(By.xpath("//li[@role='presentation']"));

        for(int i =0;i <search_list.size(); i++)
        	
        {
        	System.out.println(search_list.get(i).getText());
        	
        	if (search_list.get(i).getText().contains("testing life cycle"))
        	{
        		search_list.get(i).click();
        		break;
        	}
        }
        
        
        
	}

}
