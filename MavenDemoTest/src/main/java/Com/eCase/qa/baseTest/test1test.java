package Com.eCase.qa.baseTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test1test {
   public static WebDriver driver;
	public static Properties prop;
	public static String path="/MavenDemoTest/src/main/java/Com/eCase/qa/Config/Config.properties";
	prop=new Properties();
    FileInputStream fs=new FileInputStream(path);
    prop.load(fs);
    System.out.println(prop.getProperty("url"));
	public static void init(){
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SS\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
	DesiredCapabilities caps=DesiredCapabilities.firefox();
	caps.setCapability("Marrionette", "true");
	driver= new FirefoxDriver(caps);
	}
	//driver.get("http://www.facebook.com");

}
