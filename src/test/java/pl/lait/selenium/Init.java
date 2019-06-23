package pl.lait.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	static WebDriver driver;
	
    public static WebDriver getDriver() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6420\\Downloads\\chromedriver.exe");
    	
    	//driver = new ChromeDriver();
    	URL url = null;
		try {
			url = new URL("http://192.168.0.112:4444/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    	DesiredCapabilities capability = DesiredCapabilities.chrome();
    	driver = new RemoteWebDriver(url, capability);
    	driver.get("http://newtours.demoaut.com");
    	
    	return driver;
    }
    
    public static void quit() {
    	driver.quit();
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
