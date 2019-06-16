package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class ReservationPage3 {
	
	WebDriver driver;
	
	public ReservationPage3() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "passFirst0")
	WebElement passFirst0;
	
	@FindBy(name = "passLast0")
	WebElement passLast0;
	
	@FindBy(name = "passFirst1")
	WebElement passFirst1;
	
	@FindBy(name = "passLast1")
	WebElement passLast1;
	
	@FindBy(name = "passFirst2")
	WebElement passFirst2;
	
	@FindBy(name = "passLast2")
	WebElement passLast2;
	
	public void pass0(String first, String last) {
		passFirst0.sendKeys(first);
		passLast0.sendKeys(last);
	}
	
	public void pass1(String first, String last) {
		passFirst1.sendKeys(first);
		passLast1.sendKeys(last);
	}
	
	public void pass2(String first, String last) {
		passFirst2.sendKeys(first);
		passLast2.sendKeys(last);
	}
}