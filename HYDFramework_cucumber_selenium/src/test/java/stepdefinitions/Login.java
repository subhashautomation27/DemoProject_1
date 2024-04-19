package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("User should be navigate to home page")
	public void user_should_be_navigate_to_home_page() {

		System.out.println(">> user is on home page");

	}

	@When("user has to click on login link")
	public void user_has_to_click_on_login_link() {
		System.out.println(">> user is clicks on login link");
	}

	@When("^user has to enter valid email address (.+)$")
	public void user_has_to_enter_valid_email_address_address(String emailAddress) {
		System.out.println(">> user is enter valid email" + emailAddress);

	}

	@When("^user has to enter valid password (.+)$")
	public void user_has_to_enter_valid_password(String password)

	{
		System.out.println(">> user enter the password" + password);
	}

	@When("user has to click on the login button")
	public void user_has_to_click_on_the_login_button() {
		System.out.println("user click on login button");
	}

	@Then("user should be login succesfully")
	public void user_should_be_login_succesfully() {
		System.out.println("user should successfully login ");
	}

	@When("user has to enter invalid  email address {string}")
	public void user_has_to_enter_invalid_email_address(String email) {
		System.out.println(">> user is enter invalidemail" + email);
	}

	@When("user has to enter invalid password {string}")
	public void user_has_to_enter_invalid_password1(String password) {
		System.out.println(">> user enter the ivalid password" + password);
	}

	@Then("user should not able to login succesfully")
	public void user_should_not_able_to_login_succesfully() {
		System.out.println(">> user got logged succesfully");
	}

	@Then("get a proper warring message")
	public void get_a_proper_warring_message() {

	}

	@When("user has to enter invalid  password {string}")
	public void user_has_to_enter_invalid_password(String password) {
		System.out.println(">> user enter the ivalid password" + password);
	}

	@When("user has to enter invalid email address {string}")
	public void user_has_to_enter_invalid_email_address_address(String email) {
		System.out.println(">> user enter the ivalid password" + email);
	}

	@When("user dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		System.out.println(">> euser not providing any details");

	}

	@Then("user should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">>user get a proper warning message ");

	}

}
