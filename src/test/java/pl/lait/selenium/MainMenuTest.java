package pl.lait.selenium;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;
import pageObjects.ReservationPage2;

public class MainMenuTest {

	WebDriver driver;
	LoginPage lp = new LoginPage();
	MainPage mp = new MainPage();
	ReservationPage rp = new ReservationPage();
	ReservationPage2 rp2 = new ReservationPage2();

	
	@Before
	public void start() {
		driver = Init.getDriver();
	}

	/*@Test
	public void mainMenu() {
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.signOnLinkClick();
		mp.supportLinkClick();
	}*/
	
	@Ignore
	@Test
	public void loginAndReservation() {
		mp.signOnLinkClick();
		lp.loginAs("jakuba", "qwe123");
		rp.oneWayRadio();
		Init.sleep(2);
		rp.passSelectClick("2");
		Init.sleep(2);
		rp.from("Acapulco", "21", "12");
		Init.sleep(2);
		rp.to("Frankfurt", "31", "2");
		Init.sleep(2);
		driver.findElement(By.name("findFlights")).click();
		Init.sleep(2);
		rp2.radio3Click();
		Init.sleep(2);
		rp2.radio4Click();
		Init.sleep(2);
		rp2.continueClick();
		Init.sleep(2);
	}
	
	@Test
	public void loginAndReservation2() {
		mp.signOnLinkClick();
		lp.loginAs("jakuba", "qwe123");
		rp.departureClick("Frankfurt");
		Init.sleep(3);
		rp.fromMonthClick("February");
		Init.sleep(3);
		rp.fromDayClick("31");
		Init.sleep(3);
		rp.toMonthClick("December");
		Init.sleep(10);
	}
	
	@After
	public void quit() {
		System.out.println("A to co?");
		Init.quit();
	}
}