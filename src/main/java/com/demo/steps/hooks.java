package com.demo.steps;

import java.net.MalformedURLException;

import com.demo.actions.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseClass{
	
    @Before
    public void beforeHookfunction() throws MalformedURLException, InterruptedException{
    	createLocalDriver();
    	System.out.println("Initilized driver");
    }

    @After
    public void afterHookfunction() {
    	System.out.println("Driver closed");
    	closeDriver();
    }
    
}
