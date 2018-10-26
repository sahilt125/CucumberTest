package com.demo.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {

	@When("^User enters Username \"([^\"]*)\"$")
	public void user_enters_username(String UserName) {
		System.out.println("Enter UserName"+ UserName);
	}

	@When("^User enters Password \"([^\"]*)\"$")
	public void user_enters_password(String Password) {
		System.out.println("Enter password"+Password);

	}

	@When("^User clicks on Login button$")
	public void user_clicks_onSignIn() throws Throwable {
		System.out.println("Click Login button");

	}

	@Then("^User is successfully logged in$")
	public void user_is_displayed_login_screen() throws Throwable {
		System.out.println("Successfull Login!!");
	}

}
