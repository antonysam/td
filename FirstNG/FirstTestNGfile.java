import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGfile {
 WebDriver d;
 
 @BeforeTest
 System.setProperty("webdriver.chrome.driver","F:\\selenium stuffs\\selenium\\chromedriver.exe");
 d = new ChromeDriver();
	
  @Test
  public void f() {
   d.get("http://demo.guru99.com/test/newtours/");
	
	}
}
