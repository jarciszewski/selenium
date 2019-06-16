package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class ReservationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(name = "passCount")
	WebElement passSelect;
	
	@FindBy(name = "fromPort")
	WebElement departure;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement arrival;
	
	@FindBy(name = "toMonth")
	WebElement toMonth;
	
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	public void oneWayRadio() {
		oneWayRadio.click();
	}
	
	public void passSelectClick(String number) {
		Select pass = new Select(passSelect);
		pass.selectByValue("2");
	}
	
	public void from(String fPort, String fDay, String fMonth) {
		Select fp = new Select(departure);
		fp.selectByVisibleText(fPort);
		
		Select fd = new Select(fromDay);
		fd.selectByValue(fDay);
		
		Select fm = new Select(fromMonth);
		fm.selectByValue(fMonth);
	}
	
	public void to(String tPort, String tDay, String tMonth) {
		Select tp = new Select(arrival);
		tp.selectByVisibleText(tPort);
		
		Select td = new Select(toDay);
		td.selectByValue(tDay);
		
		Select tm = new Select(toMonth);
		tm.selectByValue(tMonth);
	}
	
	public void departureClick(String fPort) {
		departure.click();
		departure.sendKeys(fPort);
	}
	
	public void fromMonthClick(String fMonth) {
		fromMonth.click();
		fromMonth.sendKeys(fMonth);
	}
	
	public void fromDayClick(String fDay) {
		fromDay.click();
		fromDay.sendKeys(fDay);
	}
	
	public void arrivalClick(String toPort) {
		arrival.click();
		arrival.sendKeys(toPort);
	}
	
	public void toMonthClick(String tMonth) {
		toMonth.click();
		toMonth.sendKeys(tMonth);
	}
	
	public void toDayClick(String tDay) {
		toDay.click();
		toDay.sendKeys(tDay);
	}
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
}