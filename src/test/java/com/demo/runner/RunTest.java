package com.demo.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.demo.steps",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, 
    tags= {}
        )
public class RunTest {

	 @AfterClass
	    public static void teardown() {
	        Reporter.loadXMLConfig(new File("src/test/resources/conf/extent-config.xml"));
	       
	    }
}

