package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	static String radio_name;
	void Radiobuttonname(String radio_name)
	{
		this.radio_name=radio_name;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RadioButton r1= new RadioButton();
		r1.Radiobuttonname("Male");
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		String stitle = driver.getTitle();  // getTitle() will get the Title of facebook page "https://www.facebook.com/"
		System.out.println(stitle);
		
		if(stitle.contentEquals("Facebook – log in or sign up"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println(driver.getCurrentUrl());
		WebElement ele_radio= driver.findElement(By.xpath("//label[text()='"+radio_name+"']//parent::span//input"));   //here we are parametrizing varname which we are passing by using +radio_name+ 
		ele_radio.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

	// String strxpath = "Male";
	// pass strpath in Webelement
	//WebElement ele_radio= driver.findElement(By.xpath("//label[text()='"+strpath+"']//parent::span//input"));
	
	
}
