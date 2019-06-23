package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;
import pl.lait.selenium.Init;

public class LoginPageStepDefs {
	
	WebDriver driver = Init.getDriver();
	MainPage mp = new MainPage();
	LoginPage lp = new LoginPage();
	ReservationPage rp = new ReservationPage();
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    System.out.println(driver.getTitle());
	}

	@When("^I click SIGN-ON link$")
	public void i_click_SIGN_ON_link() throws Throwable {
	    mp.signOnLinkClick();
	}

	@Then("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
	    System.out.println(driver.getTitle());
	}
	
	@When("^I log in as \"([^\"]*)\" with password \"([^\"]*)\"$")
	public void i_log_in_as_with_password(String arg1, String arg2) throws Throwable {
	    lp.loginAs(arg1, arg2);
	}

	@When("^I fill one passenger flight$")
	public void i_fill_one_passenger_flight() throws Throwable {
	    rp.passSelectClick("2");
	}

	@When("^Dates for tomorrow$")
	public void dates_for_tomorrow() throws Throwable {
	    rp.fromDayClick("31");
	    rp.fromMonthClick("2");
	}

	@When("^From flights: \"([^\"]*)\"$")
	public void from_flights(String arg1) throws Throwable {
	    rp.departureClick(arg1);
	}

	@When("^To flight: \"([^\"]*)\"$")
	public void to_flight(String arg1) throws Throwable {
	    rp.arrivalClick(arg1);
	}
	
	@When("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    Init.quit();
	}
}