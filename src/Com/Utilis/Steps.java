package Com.Utilis;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import Com.Data.ReadDataFile;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class Steps {

	Screenshot screen = new Screenshot();

	ReadDataFile readData = new ReadDataFile();
	int rownumber= 1;
	public String strStartTime = null;

	public String strExestartTime = null;
	private String am_pm;
	private boolean running = false;
	public long startTime;
	public long exestartTime;

	long stopTime;
	long exestopTime;
	private int hour;
	private int min;
	private int sec;

	public void OpenUrl(WebDriver driver, String strDataFileName , String strElement, String Methodname ) throws Exception
	{
		try
		{

			String	 strData = readData.readDataFile(strDataFileName, rownumber, strElement , Methodname);

			driver.get(strData);

		}

		catch (Exception e)
		{


			System.out.println("URL hasn't navigated");
		}
	}



	public void EnterText(By locator, WebDriver driver, String strDataFileName, String strElement, String Methodname)
	{
		try
		{
			int rowNumber = 1;

			String	 strData = readData.readDataFile(strDataFileName, rowNumber, strElement , Methodname);

			waitForElement(locator, driver);

			driver.findElement(locator).sendKeys(strData);

		}

		catch (Exception e)
		{
			System.out.println("Not Able to Enter Text in:  "+locator);
		}
	}

	public void EnterText(By locator, WebDriver driver, String strElement, String Methodname)
	{
		try
		{
			int rowNumber = 1;

			//String	 strData = readData.readDataFile(strDataFileName, rowNumber, strElement , Methodname);

			waitForElement(locator, driver);

			driver.findElement(locator).sendKeys(strElement);
		}

		catch (Exception e)
		{
			System.out.println("Not Able to Enter Text in:  "+locator);
		}
	}



	public void clickButton(By locator ,WebDriver driver , String screenName) throws Exception
	{

		try
		{
			waitForElement(locator, driver);

			driver.findElement(locator).click();

		}
		catch (Exception e)
		{
			screen.getscreenshot(driver,screenName);

			System.out.println("Not Able to Click:  "+locator);
		}
	}

	public void clickJSButton(By locator ,WebDriver driver , String screenName) throws Exception
	{
		try{
			waitForElement(locator, driver);

			WebElement element = driver.findElement(locator);

			((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

		} catch (Exception e)
		{

			screen.getscreenshot(driver,screenName);

			System.out.println("Unable to click on element:  "+locator);
		}	
	}

	public void Clear(By locator ,WebDriver driver , String screenName) throws Exception
	{

		try
		{
			driver.findElement(locator).clear();

		}
		catch (Exception e)
		{

			System.out.println("Not Able to Clear:  "+locator);
		}
	}

	public void selectDropdown(By locator,  WebDriver driver , String strDataFileName ,String strElement ,String Methodname)
	{
		try
		{
			int rowNumber = 1;

			String	 strData = readData.readDataFile(strDataFileName, rowNumber, strElement , Methodname);


			Select dropdownValue = new Select(driver.findElement(locator));
			dropdownValue.selectByVisibleText(strData);	


		}

		catch (Exception e)
		{
			System.out.println("Dropdown hasn't selected:  "+locator);
		}

	}
	public void selectDropdownIndex(By locator,  WebDriver driver , int index ,String Methodname)
	{
		try
		{

			waitForElement(locator, driver);

			Select dropdownValue = new Select(driver.findElement(locator));

			dropdownValue.selectByIndex(index);


		}

		catch (Exception e)
		{
			System.out.println("Dropdown hasn't selected:  "+locator);
		}

	}

	public void Verifytext(By locator,  WebDriver driver , String strDataFileName ,String strElement ,String Methodname)
	{
		try
		{
			waitForElement(locator, driver);

			int rowNumber = 1;

			String ExpectedText = readData.readDataFile(strDataFileName, rowNumber, strElement , Methodname);

			String Actualtext = driver.findElement(locator).getText();

			if(Actualtext.contains(ExpectedText))
			{
				System.out.println("Text is present");
			}
			else 
			{
				System.out.println("Text is not present:  "+locator);
			}

		}

		catch (Exception e)
		{
			System.out.println("Text hasn't verified");
		}

	}

	public void Verifytext(By locator,  WebDriver driver , String strtext ,String Methodname)
	{

		int rowNumber = 1;

		String ExpectedText = strtext;

		String Actualtext = driver.findElement(locator).getText();

		waitForElement(locator, driver);

		if(Actualtext.contains(ExpectedText))
		{
			System.out.println("Text is present");
		}
		else 
		{
			System.out.println("Text is not present");
		}



	}

	public void waitForElement(By locator,  WebDriver driver)
	{
		try
		{
			for (int i=0; i<120; i++)
			{
				driver.findElement(locator).isDisplayed();
				Thread.sleep(500);
				break;
			}                      
		}


		catch (Exception e)
		{
			System.out.println("Not Able to Find Element:  "+locator);
		}
	}

	


	public void WaitUntilElementPresent(By locator,  WebDriver driver)
	{
		try
		{

			Thread.sleep(1000);
			WebElement element = (new WebDriverWait(driver, 120))
					.until(ExpectedConditions.elementToBeClickable(locator));
			Thread.sleep(1000);
			element.click();
		}
		catch(Exception e)
		{
			System.out.println("Element is not present and not clicked:  "+locator);
		}
	}


	public void WaitElementPresent(By locator,  WebDriver driver)
	{
		try
		{

			Thread.sleep(1000);

			WebDriverWait wait=new WebDriverWait(driver, 120);

			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			System.out.println("Element is not present:  "+locator);
		}
	}
	public void Actions(By locator,  WebDriver driver , String strDataFileName ,String Methodname)
	{
		try
		{

			Actions act = new Actions(driver);
			act.click(driver.findElement(locator));
			act.perform();

		}

		catch (Exception e)
		{
			System.out.println("Not Able to Perform Action");
		}

	}
	public void Window(WebDriver driver)
	{
		try
		{
			((JavascriptExecutor)driver).executeScript("window.showModalDialog =window.open;");

			System.out.println("Modal pop window converted to Normal window");
		}
		catch(Exception e)
		{
			System.out.println("Modal pop window not converted to Normal window");
		}
	}

	public void ChildWindow(WebDriver driver)
	{
		try
		{
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext())
			{
				subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
		}
		catch(Exception e)
		{
			System.out.println("Winow not handled");
		}
	}

	public void ChildWindow(WebDriver driver,String windowname)
	{
		try
		{

			driver.switchTo().window(windowname);
		}
		catch(Exception e)
		{
			System.out.println("Winow not handled");
		}
	}



	public void Date(By locator,  WebDriver driver , String strDataFileName ,String strElement,String Methodname,String Format)
	{
		String	 strData = readData.readDataFile(strDataFileName, rownumber, strElement , Methodname);
		try{
			WebElement elementList1 = driver.findElement(locator);
			int status=0;
			String date = strData;
			String ele;
			System.out.println(date);
			String[] temp = new String[3];
			String[] temp1= new String[2];

			temp = date.split("/");
			String d, m, y;
			String cd,cm,cy;
			String LowYear,UpYear;
			int ILowyear,IUpYear,Iy;
			String Format1=Format+"title']";
			String sliderXpath1= Format+"prevArrow']";
			String Years1=Format+"years']/table/tbody/tr";
			String Month1=Format+"months']/table/tbody/tr";
			String Days1=Format+"days']/table/tbody/tr";
			d=temp[0];
			m=temp[1];
			y=temp[2];
			System.out.println(d);
			System.out.println(m);
			System.out.println(y);
			String cyear,cmonth;
			WebElement cal;
			List<WebElement> rows;
			List<WebElement> cells;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//ele=elementList1.getText();
			//System.out.println(ele);
			elementList1.click();
			driver.findElement(By.xpath(Format1)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(Format1)).click();
			Thread.sleep(2000);
			String Years= driver.findElement(By.xpath(Format1)).getText();
			System.out.println(Years);
			String[] temp2 = new String[2];
			temp2 = Years.split("-");
			LowYear=temp2[0];
			ILowyear=Integer.parseInt(LowYear);
			System.out.println(ILowyear);
			UpYear = temp2[1];
			IUpYear = Integer.parseInt(UpYear);
			System.out.println(IUpYear);
			Iy=Integer.parseInt(y);
			Boolean Ystatus=true;
			while(Ystatus)
			{
				if(ILowyear>=Iy)
				{
					driver.findElement(By.xpath(sliderXpath1)).click();
					Thread.sleep(2000);
					Years= driver.findElement(By.xpath(Format1)).getText();
					temp2 = Years.split("-");
					LowYear=temp2[0];
					ILowyear=Integer.parseInt(LowYear);
					System.out.println(ILowyear);
					UpYear = temp2[1];
					IUpYear = Integer.parseInt(UpYear);
					System.out.println(IUpYear);
				}
				else 
				{
					break;
				}
			}
			List<WebElement> YearsList;
			List<WebElement> MonthsList;
			List<WebElement> DaysList;
			YearsList=driver.findElements(By.xpath(Years1));
			status=0;
			System.out.println(YearsList.size());
			List<WebElement> IndYear;
			for (int l = 0; l < YearsList.size(); l++) 
			{
				if(status==0)
				{
					IndYear = YearsList.get(l).findElements(By.tagName("td"));
					System.out.println(IndYear.size());
					for (int k = 0; k < IndYear.size(); k++) 
					{
						if (IndYear.get(k).getText().equals(y)) 
						{	
							System.out.println(IndYear.get(k).getText());
							IndYear.get(k).click();
							Thread.sleep(2000);
							status=1;
							k=100;
						}
					}
				}
				else
				{
					break;
				}
			}

			MonthsList=driver.findElements(By.xpath(Month1));
			status=0;
			List<WebElement> IndMonth;
			for (int l = 0; l < MonthsList.size(); l++) 
			{
				if(status==0)
				{
					IndMonth = MonthsList.get(l).findElements(By.tagName("td"));
					System.out.println(IndMonth.size());
					for (int k = 0; k < IndMonth.size(); k++) 
					{
						if (IndMonth.get(k).getText().equals(m)) 
						{
							System.out.println(IndMonth.get(k).getText());
							IndMonth.get(k).click();
							Thread.sleep(2000);
							status=1;
							k=100;
						}
					}
				}
				else
				{
					break;
				}
			}
			DaysList=driver.findElements(By.xpath(Days1));
			status=0;
			System.out.println(DaysList.size());
			List<WebElement> IndDate;
			for (int l = 0; l < YearsList.size(); l++) 
			{
				if(status==0)
				{
					IndDate = DaysList.get(l).findElements(By.tagName("td"));
					System.out.println(IndDate.size());
					for (int k = 0; k < IndDate.size(); k++) 
					{
						if (IndDate.get(k).getText().equals(d)) 
						{
							System.out.println(IndDate.get(k).getText());
							IndDate.get(k).click();
							Thread.sleep(2000);
							status=1;
							k=100;
						}
					}
				}
				else
				{
					break;
				}
			}
		}
		catch(Exception e){
			System.out.println("Unable to select Date");
		}
	}

	public void MoveElement(By locator ,WebDriver driver , String screenName)
	{

		try
		{
			waitForElement(locator, driver);

			Actions mov = new Actions(driver);

			mov.moveToElement(driver.findElement(locator));

			mov.build().perform();

			System.out.println("Moved to locator");

		}
		catch (Exception e)
		{
			System.out.println("Not Able to Move:  "+locator);
		}
	}


	public String start() {
		Calendar calendar = new GregorianCalendar();
		strStartTime = null;
		int hour, min, sec;
		Long actualStartTime = System.currentTimeMillis();
		hour = calendar.get(Calendar.HOUR);
		min = calendar.get(Calendar.MINUTE);
		sec = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}
		running = true;
		startTime = actualStartTime;
		strStartTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;
		System.out.println(strStartTime);
		return strStartTime;
	}

	public String Executionstart() {
		Calendar calendar = new GregorianCalendar();
		strExestartTime = null;
		int hour, min, sec;
		Long exeactualStartTime = System.currentTimeMillis();
		hour = calendar.get(Calendar.HOUR);
		min = calendar.get(Calendar.MINUTE);
		sec = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}
		running = true;
		exestartTime = exeactualStartTime;
		strExestartTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;
		System.out.println(strExestartTime);
		return strExestartTime;
	}

	public String stop() {
		String strStoTime = null;

		Calendar stop = new GregorianCalendar();
		Long actualstopTime = System.currentTimeMillis();
		hour = stop.get(Calendar.HOUR);
		min = stop.get(Calendar.MINUTE);
		sec = stop.get(Calendar.SECOND);
		if (stop.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		// .currentTimeMillis();
		stopTime = actualstopTime;
		strStoTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;

		running = false;
		return strStoTime;
	}
	public String exestop() {
		String exestrStoTime = null;

		Calendar stop = new GregorianCalendar();
		Long exeactualstopTime = System.currentTimeMillis();
		hour = stop.get(Calendar.HOUR);
		min = stop.get(Calendar.MINUTE);
		sec = stop.get(Calendar.SECOND);
		if (stop.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		// .currentTimeMillis();
		exestopTime = exeactualstopTime;
		exestrStoTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;

		running = false;
		return exestrStoTime;
	}
	public float getElapsedTime() {
		float elapsedTime = 0;
		if (running) {
			elapsedTime = (System.currentTimeMillis() - startTime);
			// .currentTimeMillis() - startTime);
		} else {
			elapsedTime = (stopTime - startTime);
		}
		return elapsedTime;
	}
	public float getExecutionElapsedTime() {
		float elapsedTime = 0;
		if (running) {

			elapsedTime = (System.currentTimeMillis() - exestartTime);
			// .currentTimeMillis() - startTime);
		} else {
			elapsedTime = (exestopTime - exestartTime);
		}
		return elapsedTime;
	}

	public String ExecutionTime( float timeElapsed)
	{
		int seconds = Math.round((timeElapsed / (60000)) * 60);
		int hours = 0;
		int minutes = 0;
		int newSeconds = 0;
		int newSecond1 = 0;
		String strExecutiontime = "";
		if (seconds >= 3600) {
			hours = seconds / 3600;
			minutes = (seconds % 3600) / 60;
			newSeconds = (seconds % 3600) % 60;
			if (minutes == 0) {
				newSecond1 = (seconds % 3600) % 60;
				if (newSecond1 != 0) {
					strExecutiontime = hours + " Hour(s)" + newSecond1 + " Second(s)";
				} else {
					strExecutiontime = hours + " Hour(s)";
				}
			}

			if (minutes > 0 && minutes < 60) {
				if (newSeconds > 0 && minutes > 0) {
					strExecutiontime = hours + " Hour(s) " + minutes + " Minute(s)" + newSeconds + " Second(s)";
				}
				if (newSeconds == 0 && minutes > 0) {
					strExecutiontime = hours + " Hour(s) " + minutes + " Minute(s)";
				}
			}

			if (minutes > 60) {
				seconds = minutes % 60;
				minutes = minutes / 60;
				strExecutiontime = hours + " Hour(s) " + minutes + " Minutes " + seconds + " Seconds";
			}

		} else {
			minutes = seconds / 60;
			seconds = seconds % 60;
			if (minutes > 0 && seconds == 0) {
				strExecutiontime = minutes + " Minute(s)";
			}
			if (minutes > 0 && seconds > 0) {
				strExecutiontime = minutes + " Minute(s) " + seconds + " Second(s)";
			}
			if (minutes == 0) {
				strExecutiontime = seconds + " Second(s)";
			}
		}
		return strExecutiontime;

	}


	public void HighLighterMethod(WebDriver driver, By locator)
	{

		try 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locator);

			System.out.println("Element highlighted");
		}
		catch(Exception e)
		{
			System.out.println("Element not highlighted");
		}
	}

	public void ScrollDown(WebDriver driver)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			jse.executeScript("window.scrollBy(0,500)", "");

			System.out.println("Window Scrolled down");
		}
		catch(Exception e)
		{
			System.out.println("Window Not Scrolled down");
		}
	}


	public void ScrollUp(WebDriver driver)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			jse.executeScript("window.scrollBy(0,-500)", "");

			System.out.println("Window Scrolled Up");
		}
		catch(Exception e)
		{
			System.out.println("Window Not Scrolled Up");
		}
	}

	public void Scroll(WebDriver driver, By locator)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			jse.executeScript("arguments[0].scrollIntoView();", locator);

			System.out.println("Window Scrolled Up to Locator Present");
		}
		catch(Exception e)
		{
			System.out.println("Window Not Scrolled Up to Locator Present");
		}
	}

}

