package PF_CC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_LoginPage {
	
	@FindBy(id = "user-name")
	WebElement text_username_lg;

	
	@FindBy(id = "password")
	WebElement text_password_lg;
	
	@FindBy(id = "login-button")
	WebElement button_login;
	
	WebDriver driver;

	public PF_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_username() {
		text_username_lg.sendKeys("standard_user");
		
	}
	public void enter_password() {
		text_password_lg.sendKeys("secret_sauce");
	}
	
	public void click_loginbutton() {
		button_login.click();
	}
	
	


}
