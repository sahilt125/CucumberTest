package StepDefinitions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumWebProject.SeleniumWebProject.LoginPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import junit.framework.Assert;

public class EmilyLoginSteps {
	DesiredCapabilities caps = new DesiredCapabilities();
	public static String accessKey = "zZZm2KgsngiYx89sDyHV";
	  public static String userName = "davidmcadams1";
	  public static String URL="";
	  private String DEFAULT_URL = "https://us-emily-test.azurewebsites.net/";
	WebDriver driver;

	/*   @Given("^User is on Emily Website on device \"([^\"]*)\" with OS version \"{[^\"]*)\"$")
	    public void user_is_on_Emily_App(String Device,String OSVersion) throws Throwable {
	  
		   caps.setCapability("browser", "Firefox");
		 caps.setCapability("device", Device);
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", OSVersion);
		    caps.setCapability("browserstack.local", "false");
		    caps.setCapability("browserstack.debug", true);
		    caps.setCapability("browserstack.console", "errors");
		    caps.setCapability("browserstack.networkLogs", true);
		   URL = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
		   driver = new RemoteWebDriver(new URL(URL), caps);
	    }*/
	
	@Given("^User is on Emily Website on device \"([^\"]*)\" with OS version \"([^\"]*)\"$")
	public void user_is_on_Emily_Website_on_device_with_OS_version(String Device, String OSVersion) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Opening browser");
	   caps.setCapability("browser", "Firefox");
		 caps.setCapability("device", Device);
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", OSVersion);
		    caps.setCapability("browserstack.local", "false");
		    caps.setCapability("browserstack.debug", true);
		    caps.setCapability("browserstack.console", "errors");
		    caps.setCapability("browserstack.networkLogs", true);
		   URL = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
		   driver = new RemoteWebDriver(new URL(URL), caps);
		   //driver.quit();
	}
	
	    @When("^User clicks on Sign in button$")
	    public void user_clicks_on_Sign_in_button() throws Throwable {
	    	 System.out.println("Login button click");
	    	 	driver.get(DEFAULT_URL);
	    	 	 System.out.println(driver.getTitle());
	    	 //	 driver.quit();
	    }
	    
	    @When("^User enters Username \\\"([^\\\"]*)\\\"$")
	    public void user_enters_username(String UserName){
	  
	    }
	    
	    @When("^User enters Password \\\"([^\\\"]*)\\\"$")
	    public void user_enters_password(String Password){
	    	System.out.println("Enter password");
	    	
	    }

	    @When("^User clicks on Login button$")
	    public void user_clicks_onSignIn() throws Throwable {
	    	System.out.println("Click Login button");
	 
	    }

	    
	    @Then("^User is successfully logged in$")
	    public void user_is_displayed_login_screen() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("Successfull Login!!");
	        driver.quit();
	    }
	    
	    
}
