package firsttestngpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGfile1 {
	WebDriver d;
	@BeforeTest
	public void set() {
	 System.setProperty("webdriver.chrome.driver", "F:\\selenium stuffs\\selenium\\chromedriver.exe");
	
	}
  @Test(priority=1)
  public void demo_site() {
	  d =new ChromeDriver();
	  d.get("http://demo.guru99.com/test/newtours/");
	 //assertTrue(d.getPageSource().contains("offered1"));
     
  }
  @Test(priority=2)
  public void find() {
	 String actual_title   = "Welcome: Mercury Tours";
	 String expected_title = d.getTitle();
	 assertEquals(actual_title, expected_title);
  }
  
  
  @AfterTest
  public void close() {
	  d.close();
  }
  
}
