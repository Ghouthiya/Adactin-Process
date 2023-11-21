package stepdefinition.com;

import base.com.BaseClass_MostlyUsed;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomclass.com.LogInPage;

public class Step_definition extends BaseClass_MostlyUsed {
	LogInPage lp=new LogInPage(driver);
	@Given(": User can able to Navigate the login page")
	public void user_can_able_to_navigate_the_login_page() {
		get("https://adactinhotelapp.com/");
	}
	@When(": User can able to send valid Username")
	public void user_can_able_to_send_valid_username() {
	    sendkey(lp.getUser(), "Ghouthiya");
	}
	@When(": User can able to send valid Password")
	public void user_can_able_to_send_valid_password() {
	    sendkey(lp.getPass(), "9087349822");
	}
	@When(": User can able to send click the login button")
	public void user_can_able_to_send_click_the_login_button() {
	    click(lp.getLogin());
	}
	@Then(": User can navigate to Home Page")
	public void user_can_navigate_to_home_page() {
	    
	}



	
}
