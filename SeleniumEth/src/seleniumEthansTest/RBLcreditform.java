package seleniumEthansTest;

import java.util.List;

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
		
		/*WebElement eleMonth=driver.findElement(By.xpath("//select[@data-handler='selectMonth']")); or
		WebElement eleMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select smonth=new Select(eleMonth);
		smonth.selectByVisibleText("Apr");
		
		WebElement eleYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select syear=new Select(eleYear);
		syear.selectByVisibleText("1967");
		
		//WebElement ele_Date=driver.findElement(By.xpath("//td[@class='ui-state-default'][12]"));
		/*Select s3=new Select(ele_Date);
		s3.selectByVisibleText("1979");*/
		
		/*List  <WebElement> 	Sel_date= driver.findElements(By.xpath("//table[@class='ui=datepicker-calender']//td"));
		
		for (int i=0;i <Sel_date.size();i++)
		{
			String Date = Sel_date.get(i).getText();
			if(Date.equalsIgnoreCase("11"))
			{
				Sel_date.get(i).click();
				break;
			}
		}
		*/
		
		WebElement mobile=driver.findElement(By.id("mobile"));
		mobile.sendKeys("8054923629");
		WebElement emailid=driver.findElement(By.id("emailid"));
		emailid.sendKeys("shashikantsingh706@gmail.com");
		WebElement addressL1=driver.findElement(By.id("addressL1"));	
		addressL1.sendKeys("A12-1303,Megapolis,Sunway");
		WebElement addressL2=driver.findElement(By.id("addressL2"));	
		addressL2.sendKeys("Hinjewadi,Phase 3,Pune,Maharashtra");
		
		WebElement ele_city=driver.findElement(By.xpath("//select[@id='cities']"));
		Select scity=new Select(ele_city);
		scity.selectByVisibleText("Ambala");
		
		Thread.sleep(5000);
		
		WebElement ele_pincode=driver.findElement(By.xpath("//select[@id='pincode']"));
		Select spincode=new Select(ele_pincode);
		spincode.selectByVisibleText("133201");
	
		
		
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
