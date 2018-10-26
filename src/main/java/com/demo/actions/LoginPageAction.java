package com.demo.actions;

import com.demo.locators.LoginPageLocator;

public class LoginPageAction {

	public static void clickOnLoginButton() {
		LoginPageLocator loginLocator = new LoginPageLocator();		
		loginLocator.loginBoutton.click();
	}
	
}
