package seleniumEthansTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		//driver.get("https://ksrtc.in/oprs-web/pkg/tours/loadPlaces.do");
		//driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		URL url= new URL("https://www.facebook.com/");
		
		HttpURLConnection con= (HttpURLConnection)url.openConnection();
		con.setConnectTimeout(5000);
		con.connect();
		int resCode = con.getResponseCode();
		System.out.println(resCode); // 200 res code			
		
		//ele.getAttirbute("name") -- retrieve the value of attribute
		
}


}
