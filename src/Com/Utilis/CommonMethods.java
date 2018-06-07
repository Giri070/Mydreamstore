package Com.Utilis;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.OR.Login_OR;
import Com.OR.MobileWorkflow_OR;

import org.testng.Assert;
import jxl.format.Border;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

public class CommonMethods extends Login_OR{

	WebDriver driver;

	Steps steps = new Steps();

	Screenshot screen = new Screenshot();
	
	MobileWorkflow_OR mob = new MobileWorkflow_OR();

	public String strAbsolutepath = new File("").getAbsolutePath();

	HSSFWorkbook workbook;

	HSSFSheet sheet;

	String strDataFileName = this.getClass().getSimpleName();

	Map<String, Object[]> testresultdata; 
	
	Screenshot screenshot = new Screenshot();

	String passstatus = screenshot.status("PASS");

	String failstatus = screenshot.status("FAIL");



	String name= "";

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	

	public void URLNaviagtion(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			steps.OpenUrl(driver, strDataFileName, "URL", name);
			
			System.out.println("URL Navigation to existing page successfully");
		}

	
	catch(Exception e)
	{
		System.out.println("URL Navigation to existing page unsuccessful ");

	}
}


	public void Login1(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			Thread.sleep(500);

			steps.OpenUrl(driver, strDataFileName, "URL", name);

			Thread.sleep(500);

			steps.clickButton(log, driver, name);

			Thread.sleep(2000);

			if (driver.findElement(Login_Email).isDisplayed())
			{
				Thread.sleep(2000);

				steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

				Thread.sleep(500);

				steps.clickButton(Login_Continue, driver, name);

				Thread.sleep(500);

				steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

				Thread.sleep(500);

				steps.clickButton(Login_loginbutton, driver, name);

				System.out.println("Login Successful");

			}
			else
			{
				//steps.clickButton(Login, driver, name);

				steps.clickButton(Logout, driver, name);

				System.out.println("Logout Successful");

				Thread.sleep(2000);

				steps.clickButton(log, driver, name);

				Thread.sleep(500);

				steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

				Thread.sleep(500);

				steps.clickButton(Login_Continue, driver, name);

				Thread.sleep(500);

				steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

				Thread.sleep(500);

				steps.clickButton(Login_loginbutton, driver, name);

				System.out.println("Login Successful");

			}


		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");

		}
	}


	public void Loginn(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			Thread.sleep(500);

			steps.OpenUrl(driver, strDataFileName, "URL", name);

			Thread.sleep(2000);
			/*
			String Log = driver.findElement(Login).getText();

			System.out.println(Log);

			Assert.assertEquals("Login", Log);
			 */
			steps.clickButton(log, driver, name);

			Thread.sleep(500);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");

			Thread.sleep(3000);

			steps.clickButton(log, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(500);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(500);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");


		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");

			//steps.clickButton(MyAccount, driver, name);

			Thread.sleep(500);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");

			Thread.sleep(3000);

			steps.clickButton(log, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(500);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(500);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");




		}
	}

	public void Login(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			Thread.sleep(500);

			steps.OpenUrl(driver, strDataFileName, "URL", name);

			Thread.sleep(2000);
		
			steps.clickButton(log, driver, name);
			
			try
			{
				String logtext = driver.findElement(Logintext).getText();
				
				System.out.println(logtext);
				
				Thread.sleep(500);

				steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

				Thread.sleep(500);

				steps.clickButton(Login_Continue, driver, name);

				Thread.sleep(500);

				steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

				Thread.sleep(500);

				steps.clickButton(Login_loginbutton, driver, name);

				System.out.println("Login Successful");
			}
			catch(Exception e)
			{
				System.out.println("User already loggedin");
			}

		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");

			//steps.clickButton(MyAccount, driver, name);

			Thread.sleep(500);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");

			Thread.sleep(3000);

			steps.clickButton(log, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(500);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(500);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");




		}
	}
	
	public void MobileLogin(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			Thread.sleep(500);

			steps.OpenUrl(driver, strDataFileName, "URL", name);

			Thread.sleep(2000);
			/*
			String Log = driver.findElement(Login).getText();

			System.out.println(Log);

			Assert.assertEquals("Login", Log);
			 */
			steps.clickButton(mob.Mob_Loginmenu, driver, name);
			
			steps.clickButton(mob.Mob_Loginlink, driver, name);

			/*Thread.sleep(500);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");

			Thread.sleep(3000);

			steps.clickButton(log, driver, name);*/

			Thread.sleep(500);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(500);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(500);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");


		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");

			//steps.clickButton(MyAccount, driver, name);

			Thread.sleep(500);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");

			Thread.sleep(3000);

			steps.clickButton(log, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(500);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(500);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(500);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");
		}
	}
	
	public void BrowserStackLogin(WebDriver driver) throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		try
		{
			
			Thread.sleep(2000);
		
			steps.clickButton(mob.Mob_Loginmenu, driver, name);
			
			steps.clickButton(mob.Mob_Loginlink, driver, name);

			Thread.sleep(2000);

			steps.EnterText(Login_Email, driver, strDataFileName, "Username", name);

			Thread.sleep(2000);

			steps.clickButton(Login_Continue, driver, name);

			Thread.sleep(2000);

			steps.EnterText(Login_password, driver, strDataFileName, "Password", name);

			Thread.sleep(2000);

			steps.clickButton(Login_loginbutton, driver, name);

			System.out.println("Login Successful");


		}
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");
		}
	}
	

	public void Logout(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		try
		{
			Thread.sleep(1000);

			steps.clickButton(MyAccount, driver, name);

			steps.clickButton(Logout, driver, name);

			System.out.println("Logout Successful");
		}
		catch(Exception e)
		{
			System.out.println("Logout Unsuccessful");
		}
	}

	
	public void MobileLogout(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		try
		{
			Thread.sleep(1000);

			steps.clickButton(mob.Mob_Menulines, driver, name);
			
			Thread.sleep(1000);
			
			steps.clickButton(mob.Mob_MyAccount, driver, name);
			
			Thread.sleep(1000);

			steps.clickButton(mob.Mob_Logout, driver, name);

			System.out.println("Logout Successful");
		}
		catch(Exception e)
		{
			System.out.println("Logout Unsuccessful");
		}
	}
	public void Uplodfile(WebDriver driver)
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		try 
		{
			Robot robot = new Robot();

			Thread.sleep(2000);

			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_A);
			
			Thread.sleep(1000);

			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("File Uploaded");
		}
		catch(Exception e)
		{
			System.out.println("File unable to upload");
		}

	}

}

