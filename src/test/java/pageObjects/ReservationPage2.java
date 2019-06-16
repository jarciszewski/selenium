package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class ReservationPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbo"
			+ "dy/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement radio3;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table"
			+ "/tbody/tr[4]/td/table/tbody/tr/"
			+ "td[2]/table/tbody/tr[5]/td/form/"
			+ "table[2]/tbody/tr[9]/td[1]/input")
	WebElement radio4;
	
	@FindBy(name = "findFlightd")
	WebElement Continue;
	
	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void radio3Click() {
		radio3.click();
	}
	
	public void radio4Click() {
		radio4.click();
	}
	
	public void continueClick() {
		Continue.click();
	}
}