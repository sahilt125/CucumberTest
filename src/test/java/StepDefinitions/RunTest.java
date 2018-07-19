package StepDefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = "StepDefinitions",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, 
    tags= {}
        )
public class RunTest {

	 @AfterClass
	    public static void teardown() {
	        Reporter.loadXMLConfig(new File("src/test/java/conf/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "iOS");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	    }
}

