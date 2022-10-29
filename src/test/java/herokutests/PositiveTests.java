package herokutests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class PositiveTests {

	@SuppressWarnings("unused")
	public static void loginTest () {
		
	System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	String url = ("https://en.wikipedia.org/wiki/Main_Page");
	driver.navigate().to(url);
	driver.findElement(By.id("n-help")).click();
	String k = driver.getCurrentUrl();
	System.out.println(k);
	driver.navigate().back();
	String i = driver.getCurrentUrl();
	System.out.println(i);
	driver.navigate().forward();
	String h = driver.getCurrentUrl();
	System.out.println(h); 
	driver.navigate().to(url);
	driver.close();
	
	}
}
		
		



