package SeleniumWebProject.SeleniumWebProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.RunTest;

/**
 * Hello world!
 *
 */
public class LoginPage 
{
	 private String DEFAULT_URL = "https://us-emily-test.azurewebsites.net/";
	  private WebDriver driver;
	  private WebElement element;

	  public LoginPage() {
	//    this.driver = RunTest.driver;
	  }

 public void openURL() {
	 System.out.println("Login button click");
 	driver.get(DEFAULT_URL);
 	 System.out.println(driver.getTitle());
 }
}
