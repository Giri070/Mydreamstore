package Com.Utilis;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsers {

	WebDriver driver;

	static DesiredCapabilities  capabilities;
	static String deviceName;

	@Parameters("browser")
	@Test
	public WebDriver getBrowsers(String browser) 
	{

		if (browser.equalsIgnoreCase("FF"))
		{

			/*String myProxy = "10.10.17.25:3128";  //example: proxy host=localhost port=7777
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.PROXY,
				                           new Proxy().setHttpProxy(myProxy));	*/			
			//System.setProperty("webdriver.firefox.marionette", "/home/giri/Testing/Automation/Mydreamstore/Drivers/geckodriver");

			System.setProperty("webdriver.gecko.driver","/home/giri/Testing/seleniumintegration/Drivers/geckodriver");

			//driver = new FirefoxDriver(capabilities);
			ProfilesIni profile = new ProfilesIni();

			FirefoxProfile myprofile = profile.getProfile("SeleniumFF");

			driver = new FirefoxDriver(myprofile);


			//driver = new FirefoxDriver();
		}			
		if (browser.equalsIgnoreCase("Headless"))
		{
			File file = new File("/home/giri/Testing/Documents/Headless Browser/phantomjs-2.1.1-linux-i686/bin/phantomjs");				
			System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
			driver = new PhantomJSDriver();	
		}		
		else if (browser.equalsIgnoreCase("chromeprofile"))
		{
			System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");

		options.addArguments("user-data-dir=/home/giri/.config/chromium/Profile 8");
			options.addArguments("--start-maximized");
			options.addArguments("disable-infobars"); 
			driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");

		//	options.addArguments("user-data-dir=/home/giri/.config/chromium/Profile 8");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-plugins");
			options.addArguments("disable-infobars"); 
			driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("Mobile"))
		{
			/*deviceName = "Google Nexus 6";
			deviceName = "Samsung Galaxy S4";
			deviceName = "Samsung Galaxy Note 3";
			deviceName = "Samsung Galaxy Note II";
			deviceName = "Apple iPhone 4";
			deviceName = "Apple iPhone 5";
			deviceName = "Apple iPad 3 / 4";*/

			deviceName = "Nexus 6";


			System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");

			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", deviceName);

			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);

			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

			driver = new ChromeDriver(capabilities);
		}

		
		else if (browser.equalsIgnoreCase("MobileProfileFF"))
		{
			ProfilesIni profile = new ProfilesIni();

			FirefoxProfile myprofile = profile.getProfile("SeleniumFF");

			myprofile.setPreference("general.useragent.override", "iPhone"); //this will change the user agent which will open mobile browser

	//		myprofile.setPreference("dom.webnotifications.enabled", false);
			
	//		  myprofile.setPreference("permissions.default.desktop-notification", 1);
			
			driver = new FirefoxDriver(myprofile);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().window().setSize(new Dimension(700,1200)); //just to change the window size so that it will look like mobile ;)
		}
		
	
		else if (browser.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "/home/giri/Downloads/operadriver (2)");
			
			driver = new OperaDriver();
/*			
			DesiredCapabilities capabilities = DesiredCapabilities.opera();
			  capabilities.setCapability("opera.binary", "/home/giri/Downloads/operadriver");
			  driver = new OperaDriver(capabilities); */
		}
		
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.manage().window().maximize();	

		return driver;
	}

}