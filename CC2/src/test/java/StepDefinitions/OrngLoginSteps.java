package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PF_CC2.PF_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrngLoginSteps {
	
	
	WebDriver driver=null;
	PF_LoginPage pf_LoginPage;
	public void createbrowser() {
		
		String pth=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  pth+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	
	
	@Given("Orn user navigate the login page")
	public void orn_user_navigate_the_login_page() {
		createbrowser();
		driver.navigate().to("https://www.saucedemo.com/");
		pf_LoginPage=new PF_LoginPage(driver);
		
	    
	}

	@When("orn user enter username and password")
	public void orn_user_enter_username_and_password() {
		pf_LoginPage.enter_username();
		pf_LoginPage.enter_password();
		
	   
	}

	@And("orn user click the login  button")
	public void orn_user_click_the_login_button() {
		pf_LoginPage.click_loginbutton();
	    
	}

	@Then("orn navigate the homepage and see the Dashboard title")
	public void orn_navigate_the_homepage_and_see_the_dashboard_title() {
		
	   driver.getPageSource().contains("Products");
	}

	

}
