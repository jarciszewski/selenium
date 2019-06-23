package pl.lait.selenium;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		driver = Init.getDriver();
	}

	/*@Test
	public void mainMenu() {
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
	}*/

	@Test
	public void login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("jakuba");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.name("login")).click();
		
		String onewayXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
		driver.findElement(By.xpath(onewayXpath)).click();
		
		WebElement passSelect = driver.findElement(By.name("passCount"));
		Select pass = new Select(passSelect);
		pass.selectByValue("2");
		
		WebElement departure = driver.findElement(By.name("fromPort"));
		Select depart = new Select(departure);
		depart.selectByValue("Frankfurt");
		
		WebElement fromMonths = driver.findElement(By.name("fromMonth"));
		Select fromMonth = new Select(fromMonths);
		fromMonth.selectByValue("1");
		
		WebElement fromDays = driver.findElement(By.name("fromDay"));
		Select fromDay = new Select(fromDays);
		fromDay.selectByValue("31");
		
		WebElement arrival = driver.findElement(By.name("toPort"));
		Select arrive = new Select(arrival);
		arrive.selectByVisibleText("Frankfurt");
		
		WebElement toMonths = driver.findElement(By.name("toMonth"));
		Select toMonth = new Select(toMonths);
		toMonth.selectByValue("2");
		
		WebElement toDays = driver.findElement(By.name("toDay"));
		Select toDay = new Select(toDays);
		toDay.selectByValue("31");
		
		String classXpath = "/html/body/div/table/tbody/tr/td[2]/table"
				+ "/tbody/tr[4]/td/table/tbody/"
				+ "tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr"
				+ "[9]/td[2]/font/font/input[2]";
		
		driver.findElement(By.xpath(classXpath)).click();
		
		WebElement airlines = driver.findElement(By.name("airline"));
		Select airline = new Select(airlines);
		airline.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Jakub");
		
		driver.findElement(By.name("passLast0")).sendKeys("A");
	}

	@After
	public void quit() {
		Init.quit();
	}

}