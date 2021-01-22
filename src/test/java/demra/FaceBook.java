package demra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {
	WebDriver clas;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmat\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver clas=new ChromeDriver();
	clas.get("https://www.facebook.com/");
	
	}

}