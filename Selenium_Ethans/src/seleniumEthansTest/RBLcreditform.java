package seleniumEthansTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RBLcreditform {

	static String radio_name;
	static int value;
	void Radiobuttonname(String radio_name,int value)
	{
		this.radio_name=radio_name;
		this.value=value;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://apply.rblbank.com/credit-card");
		driver.manage().window().maximize();
		WebElement apply_button=driver.findElement(By.className("apply-now-btn"));
		apply_button.click();
		Thread.sleep(5000);
		
		RBLcreditform r1= new RBLcreditform();
		//r1.Radiobuttonname("Male");
		r1.Radiobuttonname("Female",2);
		//r1.Radiobuttonname("Third Gender");
		
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("Shashi");
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("Singh");
	

		WebElement ele_radio= driver.findElement(By.xpath("//label[text()='"+radio_name+"']//parent::div//input[@value='"+value+"']"));
		ele_radio.click();
		Thread.sleep(5000);
		
		/*WebElement ele_Month=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s1=new Select(ele_Month);
		s1.selectByVisibleText("Nov");
		
		WebElement ele_Year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s2=new Select(ele_Year);
		s2.selectByVisibleText("1979");*/
		//PLEASE CHECK FOR CALENDER AS ITS DIFFERENT
		
		WebElement mobile=driver.findElement(By.id("mobile"));
		mobile.sendKeys("9455380952");
		WebElement emailid=driver.findElement(By.id("emailid"));
		emailid.sendKeys("shashikantsingh706@gmail.com");
		WebElement addressL1=driver.findElement(By.id("addressL1"));	
		addressL1.sendKeys("A12-1303,Megapolis,Sunway");
		WebElement addressL2=driver.findElement(By.id("addressL2"));	
		addressL2.sendKeys("Hinjewadi,Phase 3,Pune,Maharashtra");
		
		WebElement ele_city=driver.findElement(By.xpath("//select[@class='select-city']"));
		Select scity=new Select(ele_city);
		scity.selectByVisibleText("Ambala");
		
		
		/*WebElement ele_pincode=driver.findElement(By.xpath("//select[@name='pincode']"));
		Select spincode=new Select(ele_pincode);
		spincode.selectByVisibleText("133201");
		*/
		//incorrect
		
		
		WebElement ele_emp=driver.findElement(By.xpath("//select[@id='employmentType']"));
		Select emp=new Select(ele_emp);
		emp.selectByVisibleText("Salaried");
		
		
		WebElement employer=driver.findElement(By.id("employer"));
		employer.sendKeys("TCS");
		WebElement grossincome=driver.findElement(By.id("grossincome"));
		grossincome.sendKeys("120000");
		WebElement panCard=driver.findElement(By.id("panCard"));
		panCard.sendKeys("CERWPB2514L");
		Thread.sleep(5000);
		
		

				
	}

}
