package pl.lait.selenium;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.MainPage;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		System.out.println("wewnątrz metody start - @before");
		driver = Init.getDriver();
	}

	@Test
	public void mainMenu() {
		System.out.println("start test mainMenu, przed new MP");
		MainPage mp = new MainPage();
		System.out.println("po new MP przed contact click");
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.signOnLinkClick();
		mp.supportLinkClick();
	}
	
	@Test
	public void login() {
		System.out.println("przed new LP");
		LoginPage lp = new LoginPage();
		System.out.println("po new LP, przed new MP");
		MainPage mp = new MainPage();
		System.out.println("po new MP, przed singOnLinkClick");
		mp.signOnLinkClick();
		lp.loginAs("jakuba", "qwe123");
	}

	@After
	public void quit() {
		System.out.println("A to co?");
		Init.quit();
	}

}