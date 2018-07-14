package Com.eCase.qa.TestCases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Com.eCase.qa.baseTest.test1test;
//static WebDriver driver;
public class test1 extends test1test{
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SS\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
	DesiredCapabilities caps=DesiredCapabilities.firefox();
	caps.setCapability("Marrionette", "true");
	driver= new FirefoxDriver(caps);
	
	
}
