package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Hi Hello");
  }
  
  @Test
  public void LoginTest() {

	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ciitstudent.com");
  }
}
