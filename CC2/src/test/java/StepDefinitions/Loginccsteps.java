package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginccsteps {
	
	@Given("user  in login page")
	public void user_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user in the login page ysr");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user entered the username and password page ysr");
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user clicked the button ysr");
	}

	@Then("user navigate the home page")
	public void user_navigate_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user iin the homepage  ysr");
	}


}
