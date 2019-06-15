package pl.lait.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	
    public static WebDriver getDriver() {
    	System.out.println("wewnątrz getDriver");
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6420\\Downloads\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.get("http://newtours.demoaut.com");
    	
    	return driver;
    }
    
    public static void quit() {
    	driver.quit();
    	driver = null;
    }
    public static void sleep(int seconds){
    	try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
   	/*public static void sleep(int seconds){
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }*/	
    }
}
