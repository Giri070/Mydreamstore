package Com.Scenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Com.OR.Checkout_OR;
import Com.OR.Homepage2_OR;
import Com.OR.Homepage_OR;
import Com.OR.Login_OR;
import Com.Utilis.Browsers;
import Com.Utilis.CommonMethods;
import Com.Utilis.GetScreenShot;
import Com.Utilis.Screenshot;
import Com.Utilis.Steps;
import Com.Utilis.TestBase;
import jxl.format.Border;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

public class GuestCheckout extends TestBase
{
	WebDriver driver;

	Login_OR login = new Login_OR();

	Steps steps = new Steps();

	GetScreenShot getscreen = new GetScreenShot();

	Screenshot screen = new Screenshot();

	public String strAbsolutepath = new File("").getAbsolutePath();

	HSSFWorkbook workbook;

	HSSFSheet sheet;

	String strDataFileName = this.getClass().getSimpleName();

	Map<String, Object[]> testresultdata; 

	CommonMethods commonmethods = new CommonMethods();

	Homepage_OR home = new Homepage_OR();

	Homepage2_OR home2 = new Homepage2_OR();

	Checkout_OR checkout = new Checkout_OR();

	Screenshot screenshot = new Screenshot();

	String passstatus = screenshot.status("PASS");

	String failstatus = screenshot.status("FAIL");

	int cnt = 2;

	public static String GPCcheck1 = "";

	public static String GPCcheck2 = "";

	public static String GPCcheck3 = "";

	public static String GPCcheck4 = "";

	public static String GPCcheck5 = "";

	public static String GPCcheck6 = "";

	public static String GPCcheck7 = "";

	public static String GPCcheck8 = "";

	public static String GPCcheck9 = "";

	public static String GPCcheckColor1 = "";

	public static String GPCcheckhex1 = "";

	public static String GPCcheckFirstcolor1 = "";

	public static String GPCcheckcolor5 = "";

	public static String GPCcheckhex5 = "";

	public static String GPCcheckFifthcolor1 = "";

	public static String GPCcheckcqty1 = "";

	public static String GPCcheckiqty1 = "";

	public static String GPCcheckdqty1 = "";

	public static String GPCcheckSizemsg1 = "";

	public static String GPCchecksizeS1 = "";

	public static String GPCchecksizeM1 = "";

	public static String GPCchecksizeL1 = "";

	public static String GPCchecksizeXL1 = "";

	public static String GPCchecksizeXXL1 = "";

	public static String GPCchecksizeXXXL1 = "";

	public static String GPCcheckbelow5101 = "";

	public static String GPCcheckabove5101 = "";

	public static String GPCchecktightfit1 = "";

	public static String GPCcheckcomfit1 = "";

	public static String GPCcheckfindursize1 = "";

	public static String GPCcheckaddcart1 = "";

	public static String GPCcheckupdateproduct1 = "";

	public static String GPCcheckremovecart1 = "";

	public static String GPCbuynow1 = "";

	public static String GPCbuynow2 = "";

	public static String GPCbuynow3 = "";

	public static String GPCLoginUserstatus = "";

	public static String GPCLoginUserstatusfail = "";


	public static String GCODcheck1 = "";

	public static String GCODcheck2 = "";

	public static String GCODcheck3 = "";

	public static String GCODcheck4 = "";

	public static String GCODcheck5 = "";

	public static String GCODcheck6 = "";

	public static String GCODcheck7 = "";

	public static String GCODcheck8 = "";

	public static String GCODcheck9 = "";

	public static String GCODcheckColor1 = "";

	public static String GCODcheckhex1 = "";

	public static String GCODcheckFirstcolor1 = "";

	public static String GCODcheckColor5 = "";

	public static String GCODcheckhex5 = "";

	public static String GCODcheckFifthcolor1 = "";

	public static String GCODcheckcqty1 = "";

	public static String GCODcheckiqty1 = "";

	public static String GCODcheckdqty1 = "";

	public static String GCODcheckSizemsg1 = "";

	public static String GCODchecksizeS1 = "";

	public static String GCODchecksizeM1 = "";

	public static String GCODchecksizeL1 = "";

	public static String GCODchecksizeXL1 = "";

	public static String GCODchecksizeXXL1 = "";

	public static String GCODchecksizeXXXL1 = "";

	public static String GCODcheckbelow5101 = "";

	public static String GCODcheckabove5101 = "";

	public static String GCODchecktightfit1 = "";

	public static String GCODcheckcomfit1 = "";

	public static String GCODcheckfindursize1 = "";

	public static String GCODcheckaddcart1 = "";

	public static String GCODcheckupdateproduct1 = "";

	public static String GCODcheckremovecart1 = "";

	public static String GCODbuynow1 = "";

	public static String GCODbuynow2 = "";

	public static String GCODbuynow3 = "";

	public static String GCODLoginUserstatus = "";

	public static String GCODLoginUserstatusfail = "";






	public GuestCheckout()

	{
		Browsers b = new Browsers();

		this.driver = b.getBrowsers("chromeprofile");		 
	}

	@Test(priority=0)
	public void GuestPrepaidCheckoutFlow() throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;

		try
		{
			test = extent.createTest("Guest User Prepaid CheckOut");

			System.out.println("Guest User Prepaid CheckOut Test Case Executing...");

			/*			commonmethods.Login(driver);

			test.log(Status.INFO, MarkupHelper.createLabel("User able to Login", ExtentColor.BLUE));
			 */
			Thread.sleep(1000);

			commonmethods.URLNaviagtion(driver);

			Thread.sleep(1000);

			String Parent = driver.getWindowHandle();

			steps.clickButton(home.Mydreamstore, driver, name);

			Thread.sleep(2000);

			steps.clickButton(home2.Checkout_Image, driver, name);

			steps.ChildWindow(driver);

			driver.manage().window().maximize();

			GPCcheck1 = getscreen.capture(driver, "GPCcheck1");

			test.addScreenCaptureFromPath(GPCcheck1);

			Thread.sleep(1000);

			try
			{
				steps.clickButton(home.Trend_Image_Readmore, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Readmore", ExtentColor.BLUE));

				GPCcheck2 = getscreen.capture(driver, "GPCcheck2");

				test.addScreenCaptureFromPath(GPCcheck2);

				GPCcheck3 = driver.findElement(home.Trend_Image_Description).getText();

				System.out.println("Item Description   "+GPCcheck3);

				test.log(Status.INFO, MarkupHelper.createLabel("Description about Item:  "+GPCcheck3, ExtentColor.BLUE));

				steps.clickButton(home.Trend_Image_Readless, driver, name);
			}
			catch(Exception e)
			{
				steps.clickButton(home.Trend_Image_Readmore, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Readmore", ExtentColor.BLUE));

				GPCcheck4 = getscreen.capture(driver, "GPCcheck4");

				test.addScreenCaptureFromPath(GPCcheck4);

				GPCcheck5 = driver.findElement(home.Trend_Image_Description1).getText();

				System.out.println("Item Description   "+GPCcheck5);

				test.log(Status.INFO, MarkupHelper.createLabel("Description about Item:  "+GPCcheck5, ExtentColor.BLUE));

				steps.clickButton(home.Trend_Image_Readless, driver, name);
			}


			Thread.sleep(1000);

			GPCcheck6 = driver.findElement(home.Trend_Image_MRP).getText();

			System.out.println("Item Price   "+GPCcheck6);

			test.log(Status.INFO, MarkupHelper.createLabel("MRP of an Item:  "+GPCcheck6, ExtentColor.ORANGE));

			try
			{
				String col1 = driver.findElement(home.Trend_color1).getCssValue("color");

				System.out.println(col1);

				steps.clickButton(home.Trend_color1, driver, name);

				Thread.sleep(2000);

				GPCcheckColor1 = driver.findElement(home.Trend_color1).getCssValue("background-color");

				GPCcheckhex1 = Color.fromString(GPCcheckColor1).asHex();

				System.out.println("Image color: "+GPCcheckhex1);

				test.log(Status.INFO, MarkupHelper.createLabel("User changed item color to:  "+GPCcheckhex1, ExtentColor.BLUE));

				GPCcheckFirstcolor1 = getscreen.capture(driver, "GPCcheckFirstcolor1");

				test.addScreenCaptureFromPath(GPCcheckFirstcolor1);
			}
			catch(Exception e)
			{
				System.out.println("Color 2 is not exists");
			}

			try
			{
				String col2 = driver.findElement(home.Trend_color5).getCssValue("color");

				System.out.println(col2);

				steps.clickButton(home.Trend_color5, driver, name);

				Thread.sleep(2000);

				GPCcheckcolor5 = driver.findElement(home.Trend_color5).getCssValue("background-color");

				GPCcheckhex5 = Color.fromString(GPCcheckcolor5).asHex();

				System.out.println("Image color: "+GPCcheckhex5);

				test.log(Status.INFO, MarkupHelper.createLabel("User changed item color to:  "+GPCcheckhex5, ExtentColor.BLUE));

				GPCcheckFifthcolor1 = getscreen.capture(driver, "GPCcheckFifthcolor1");

				test.addScreenCaptureFromPath(GPCcheckFifthcolor1);

			}
			catch(Exception e)
			{
				System.out.println("Color 1 is not exists");
			}

			GPCcheckcqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Current Quantity:  "+ GPCcheckcqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product:  "+GPCcheckcqty1, ExtentColor.BLUE));

			Thread.sleep(1000);

			steps.clickButton(home.Trend_QtyIncrease, driver, name);

			GPCcheckiqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Quantity after increase:  "+ GPCcheckiqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product after Increase:  "+GPCcheckiqty1, ExtentColor.BLUE));

			steps.clickButton(home.Trend_QtyDecrease, driver, name);

			GPCcheckdqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Quantity after decrease:  "+ GPCcheckdqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product after increase:  "+GPCcheckdqty1, ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(home.Trend_Addcart, driver, name);

			GPCcheckSizemsg1 = driver.findElement(home.Trend_Sizeerrormsg).getText();

			System.out.println("User clicked on Addcart before Size selection:  "+GPCcheckSizemsg1);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Addcart before Size selection:  "+GPCcheckSizemsg1, ExtentColor.RED));

			steps.clickJSButton(home2.Size_S, driver, name);

			GPCchecksizeS1 = driver.findElement(home2.Size_S).getText();

			System.out.println("Selected Size:  "+GPCchecksizeS1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeS1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_M, driver, name);

			GPCchecksizeM1 = driver.findElement(home2.Size_M).getText();

			System.out.println("Selected Size:  "+GPCchecksizeM1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeM1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_L, driver, name);

			GPCchecksizeL1 = driver.findElement(home2.Size_L).getText();

			System.out.println("Selected Size:  "+GPCchecksizeL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XL, driver, name);

			GPCchecksizeXL1 = driver.findElement(home2.Size_XL).getText();

			System.out.println("Selected Size:  "+GPCchecksizeXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeXL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XXL, driver, name);

			GPCchecksizeXXL1 = driver.findElement(home2.Size_XXL).getText();

			System.out.println("Selected Size:  "+GPCchecksizeXXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeXXL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XXXL, driver, name);

			GPCchecksizeXXXL1 = driver.findElement(home2.Size_XXXL).getText();

			System.out.println("Selected Size:  "+GPCchecksizeXXXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GPCchecksizeXXXL1, ExtentColor.BLUE));

			steps.clickButton(home.Trend_FindUrSize, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Find your size", ExtentColor.BLUE));

			Thread.sleep(1000);

			steps.clickButton(home.Trend_FindUrSize_closebutton, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User navigate to Product details page", ExtentColor.BLUE));

			Thread.sleep(3000);

			steps.clickButton(home2.Size_L, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size", ExtentColor.BLUE));

			steps.clickButton(home.Trend_Addcart, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User added product to Cart", ExtentColor.BLUE));

			GPCcheckaddcart1 = getscreen.capture(driver, "GPCcheckaddcart1");

			test.addScreenCaptureFromPath(GPCcheckaddcart1);

			try
			{
				String edit1 = driver.findElement(home.Trend_Addcart_edit).getText();

				System.out.println(edit1);

				steps.clickButton(home.Trend_Addcart_edit, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Edit", ExtentColor.BLUE));

				steps.ScrollUp(driver);

				steps.selectDropdown(home.Trend_Addcart_selectsize, driver, strDataFileName, "SelectSize", name);

				steps.selectDropdown(home.Trend_Addcart_selectqty, driver, strDataFileName, "Quantity", name);

				test.log(Status.INFO, MarkupHelper.createLabel("User selected Size and Quantity", ExtentColor.BLUE));

				steps.clickButton(home.Trend_Addcart_cancel, driver, name);

				steps.clickButton(home.Trend_Addcart_edit, driver, name);

				steps.ScrollUp(driver);

				steps.selectDropdown(home.Trend_Addcart_selectsize, driver, strDataFileName, "SelectSize", name);

				steps.selectDropdown(home.Trend_Addcart_selectqty, driver, strDataFileName, "Quantity", name);

				steps.clickButton(home.Trend_Addcart_save, driver, name);

				GPCcheckupdateproduct1 = getscreen.capture(driver, "GPCcheckupdateproduct1");

				test.addScreenCaptureFromPath(GPCcheckupdateproduct1);

				test.log(Status.INFO, MarkupHelper.createLabel("User updated product size and quantity", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Edit feature is not available for this product");
			}

			steps.clickButton(home.Trend_Addcart_remove, driver, name);

			GPCcheckremovecart1 = getscreen.capture(driver, "GPCcheckremovecart1");

			test.addScreenCaptureFromPath(GPCcheckremovecart1);

			test.log(Status.INFO, MarkupHelper.createLabel("User removed product from Cart", ExtentColor.BLUE));

			//checkout process

			steps.clickButton(home.Size_L, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size", ExtentColor.BLUE));

			steps.clickButton(checkout.BuyNow, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on BuyNow, navigated to checkout page", ExtentColor.BLUE));

			GPCbuynow1 = getscreen.capture(driver, "GPCbuynow1");

			test.addScreenCaptureFromPath(GPCbuynow1);

			Thread.sleep(2000);
			


			// Debit card option

			try
			{
				String Debit = driver.findElement(checkout.Debitcard).getText();

				System.out.println("Payment method:  "+Debit);

				steps.Verifytext(checkout.Debitcard, driver, Debit, name);

				steps.clickButton(checkout.Debitcard, driver, name);

				System.out.println("Debit card option is available");

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+Debit   +    "      Available", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Debit card option is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Debit card option is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);

			// Credit card option

			try
			{
				String Credit = driver.findElement(checkout.Creditcard).getText();

				System.out.println("Payment method:  "+Credit);

				steps.Verifytext(checkout.Creditcard, driver, Credit, name);

				steps.clickButton(checkout.Creditcard, driver, name);

				System.out.println("Credit card option is available");

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+Credit+    "Available", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Credit card option is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Credit card option is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);

			// Net Banking option

			try
			{
				String NetBanking = driver.findElement(checkout.Netbanking).getText();

				System.out.println("Payment method:  "+NetBanking);

				steps.Verifytext(checkout.Netbanking, driver, NetBanking, name);

				steps.clickButton(checkout.Netbanking, driver, name);

				System.out.println("Net Banking option is available");

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+NetBanking+    "Available", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Net Banking option is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Net Banking option is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);

			// Paytm option

			try
			{
				String Paytm = driver.findElement(checkout.Paytm).getText();

				System.out.println("Payment method:  "+Paytm);

				steps.Verifytext(checkout.Paytm, driver, Paytm, name);

				steps.clickButton(checkout.Paytm, driver, name);

				System.out.println("Paytm option is available");

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+Paytm+    "Available", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Paytm option is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Paytm option is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);


			// Debit card option

			try
			{
				String Debit = driver.findElement(checkout.Debitcard).getText();

				System.out.println("Payment method:  "+Debit);

				steps.Verifytext(checkout.Debitcard, driver, Debit, name);

				steps.clickButton(checkout.Debitcard, driver, name);

				System.out.println("Debit card option is available");

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+Debit   +    "      Available", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Debit card option is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Debit card option is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);
			
			
			steps.Clear(checkout.FirstName, driver, name);

			steps.Clear(checkout.MobileNumber, driver, name);

			steps.Clear(checkout.Email, driver, name);

			steps.Clear(checkout.Zipcode, driver, name);

			steps.Clear(checkout.Address, driver, name);

			steps.Clear(checkout.Address2, driver, name);

			steps.Clear(checkout.City, driver, name);

			steps.Clear(checkout.State, driver, name);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User cleared all Form fields", ExtentColor.BLUE));
			 

			//Form Validation

			try
			{
				steps.Clear(checkout.FirstName, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				Thread.sleep(2000);

				String Gcheck14 = driver.findElement(checkout.FirstNameerror).getText();

				System.out.println(Gcheck14);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck14, ExtentColor.RED));

				steps.EnterText(checkout.FirstName, driver, strDataFileName, "Firstname", name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("Firstname error message is not displayed");
			}

			try
			{
				steps.Clear(checkout.MobileNumber, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				String Gcheck15 = driver.findElement(checkout.MobileNumberError).getText();

				System.out.println(Gcheck15);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck15, ExtentColor.RED));

				steps.EnterText(checkout.MobileNumber, driver, strDataFileName, "Mobile", name);

				steps.clickButton(checkout.Placeorder, driver, name);

			}
			catch(Exception e )
			{
				System.out.println("Mobile Number error message is not displayed");
			}

			try
			{
				steps.Clear(checkout.Email, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				String Gcheck16 = driver.findElement(checkout.EmailError).getText();

				System.out.println(Gcheck16);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck16, ExtentColor.RED));

				steps.EnterText(checkout.Email, driver, strDataFileName, "Email", name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("Email error message is not displayed");
			}

			try
			{
				steps.Clear(checkout.Zipcode, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				String Gcheck17 = driver.findElement(checkout.ZipcodeError).getText();

				System.out.println(Gcheck17);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck17, ExtentColor.RED));

				steps.EnterText(checkout.Zipcode, driver, strDataFileName, "Zipcode", name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("Zipcode error message is not displayed");
			}

			try
			{
				steps.Clear(checkout.Address, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				String Gcheck18 = driver.findElement(checkout.AddressError).getText();

				System.out.println(Gcheck18);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck18, ExtentColor.RED));

				steps.EnterText(checkout.Address, driver, strDataFileName, "Address", name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("Address 1  error message is not displayed");
			}

			try
			{
				steps.Clear(checkout.Address2, driver, name);

				steps.clickButton(checkout.Placeorder, driver, name);

				String Gcheck19 = driver.findElement(checkout.Address2Error).getText();

				System.out.println(Gcheck19);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck19, ExtentColor.RED));

				steps.EnterText(checkout.Address2, driver, strDataFileName, "Address2", name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("Address 2  error message is not displayed");
			}

			try
			{
				String Gcheck20 = driver.findElement(checkout.CityError).getText();

				System.out.println(Gcheck20);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck20, ExtentColor.RED));

				steps.EnterText(checkout.City, driver, strDataFileName, "City",name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("City  error message is not displayed");
			}

			try
			{
				String Gcheck21 = driver.findElement(checkout.StateError).getText();

				System.out.println(Gcheck21);

				test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck21, ExtentColor.RED));

				steps.EnterText(checkout.State, driver, strDataFileName, "State",name);

				steps.clickButton(checkout.Placeorder, driver, name);
			}
			catch(Exception e )
			{
				System.out.println("State  error message is not displayed");
			}


			// Cash on delivery 
			try
			{
				String cash = driver.findElement(checkout.CashonDeliveryText).getText();

				System.out.println("Payment method:  "+cash);

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+cash+    "Available", ExtentColor.BLUE));

				steps.Verifytext(checkout.CashonDeliveryText, driver, cash, name);

				steps.clickButton(checkout.CashonDeliveryradio, driver, name);

				String LPCbuynow2 = driver.findElement(checkout.PopUpSaveMsg).getText();

				System.out.println("Displayed message:   "+LPCbuynow2);

				test.log(Status.INFO, MarkupHelper.createLabel("Displayed message:   "+LPCbuynow2, ExtentColor.BLUE));

				Thread.sleep(3000);

				String LPCbuynow3 = getscreen.capture(driver, "LPCbuynow3");

				test.addScreenCaptureFromPath(LPCbuynow3);

				steps.clickButton(checkout.Cashondelivery, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Cash on Delivery link", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Cash on Delivery is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Cash on Delivery is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);

			String LPcheckout1 = getscreen.capture(driver, "LPcheckout1");

			test.addScreenCaptureFromPath(LPcheckout1);

			//steps.clickButton(checkout.Placeorder, driver, name);

			Thread.sleep(4000);

			String Ptext = driver.findElement(checkout.PrepaidText).getText();

			System.out.println("User navigated to Prepaid page:   "+Ptext);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User navigated to Prepaid page", ExtentColor.BLUE));
			
			String LPcheckout2 = getscreen.capture(driver, "LPcheckout2");

			test.addScreenCaptureFromPath(LPcheckout2);

			steps.clickButton(checkout.Prepaid_Creditcard, driver, name);

			steps.clickButton(checkout.Prepaid_creditcard_Visaradio, driver, name);

			steps.clickButton(checkout.Prepaid_creditcard_Americanradio, driver, name);

			steps.EnterText(checkout.Prepaid_creditcard_CardNumber, driver, strDataFileName, "CardNumber", name);

			steps.EnterText(checkout.Prepaid_creditcard_NameonCard, driver, strDataFileName, "NameonCard", name);

			steps.EnterText(checkout.Prepaid_creditcard_CVV, driver, strDataFileName, "CVV", name);

			steps.selectDropdown(checkout.Prepaid_creditcard_ExpMonth, driver, strDataFileName, "Month", name);

			steps.selectDropdownIndex(checkout.Prepaid_creditcard_ExpYear, driver, 4, name);

			//	steps.selectDropdown(checkout.Prepaid_creditcard_ExpYear, driver, strDataFileName, "Year", name);

			Thread.sleep(1000);

			String Prepaid1 = getscreen.capture(driver, "Prepaid1");

			test.addScreenCaptureFromPath(Prepaid1);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Credit Card facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_Debitcard, driver, name);

			steps.selectDropdown(checkout.Prepaid_Debitcard_SelectCard, driver, strDataFileName, "DebitcardType", name);

			//	steps.clickButton(checkout.Prepaid_Debitcard_Paynow, driver, name);

			Thread.sleep(1000);

			steps.EnterText(checkout.Prepaid_Debitcard_CardNumber, driver, strDataFileName, "CardNumber", name);

			steps.EnterText(checkout.Prepaid_Debitcard_NameonCard, driver, strDataFileName, "NameonCard", name);

			steps.EnterText(checkout.Prepaid_Debitcard_CVV, driver, strDataFileName, "CVV", name);

			steps.selectDropdown(checkout.Prepaid_Debitcard_ExpMonth, driver, strDataFileName, "Month", name);

			steps.selectDropdownIndex(checkout.Prepaid_Debitcard_ExpYear, driver, 4, name);

			//	steps.selectDropdown(checkout.Prepaid_Debitcard_ExpYear, driver, strDataFileName, "Year", name);

			Thread.sleep(1000);

			String Prepaid2 = getscreen.capture(driver, "Prepaid2");

			test.addScreenCaptureFromPath(Prepaid2);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Debit Card facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_Netbanking, driver, name);

			steps.clickButton(checkout.Prepaid_Netbanking_HDFCradio, driver, name);

			steps.clickButton(checkout.Prepaid_Netbanking_ICICIradio, driver, name);

			steps.selectDropdown(checkout.Prepaid_Netbanking_SelectbankDD, driver, strDataFileName, "Bank", name);

			//		steps.clickButton(checkout.Prepaid_Netbanking_Paynow, driver, name);

			Thread.sleep(1000);

			String Prepaid3 = getscreen.capture(driver, "Prepaid3");

			test.addScreenCaptureFromPath(Prepaid3);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Netbanking facility", ExtentColor.BLUE));

			try
			{
				String Nettext = driver.findElement(checkout.Prepaid_Netbanking_DispayedText).getText();

				System.out.println("Displaying text:    "+Nettext);
			}
			catch(Exception e)
			{
				System.out.println("Netbanking working");
			}

			//	driver.navigate().back();

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_Tez, driver, name);

			steps.EnterText(checkout.Prepaid_Tez_UPIfield, driver, strDataFileName, "UPIid", name);

			steps.selectDropdown(checkout.Prepaid_Tez_bank, driver, strDataFileName, "UPIBank", name);

			String Prepaid4 = getscreen.capture(driver, "Prepaid4");

			test.addScreenCaptureFromPath(Prepaid4);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Tez  facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_UPI, driver, name);

			steps.EnterText(checkout.Prepaid_UPI_UPIfield, driver, strDataFileName, "UPIwithBank", name);

			String Prepaid5 = getscreen.capture(driver, "Prepaid5");

			test.addScreenCaptureFromPath(Prepaid5);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated UPI facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_lazypaylink, driver, name);

			String Prepaid6 = getscreen.capture(driver, "Prepaid6");

			test.addScreenCaptureFromPath(Prepaid6);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Lazy Pay facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_visaCheckoutLink, driver, name);

			String Prepaid7 = getscreen.capture(driver, "Prepaid7");

			test.addScreenCaptureFromPath(Prepaid7);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Visa Checkout facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_EMI, driver, name);

			String Prepaid8 = getscreen.capture(driver, "Prepaid8");

			test.addScreenCaptureFromPath(Prepaid8);

			try
			{
				String EMItext = driver.findElement(checkout.Prepaid_EMI_text).getText();

				System.out.println("Displayed msg in EMI:    "+EMItext);
			}
			catch(Exception e)
			{
				System.out.println("EMI is not available");
			}
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated EMI facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_Wallets, driver, name);

			steps.selectDropdown(checkout.Prepaid_Wallets_SelectwalletDD, driver, strDataFileName, "Wallet", name);

			//		steps.clickButton(checkout.Prepaid_Wallets_Paynow, driver, name);

			String Prepaid9 = getscreen.capture(driver, "Prepaid9");

			test.addScreenCaptureFromPath(Prepaid9);

			try
			{
				String Wallettext = driver.findElement(checkout.Prepaid_Netbanking_DispayedText).getText();

				System.out.println("Displaying text:    "+Wallettext);
			}
			catch(Exception e)
			{
				System.out.println("Wallet working");
			}
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated Wallets facility", ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(checkout.Prepaid_PayUMoney, driver, name);

			String Prepaid10 = getscreen.capture(driver, "Prepaid10");

			test.addScreenCaptureFromPath(Prepaid10);
			
			test.log(Status.INFO, MarkupHelper.createLabel("User validated PayUmoney facility", ExtentColor.BLUE));

			driver.close();

			driver.switchTo().window(Parent);

			//		test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Cash on Delivery link", ExtentColor.BLUE));

			GPCLoginUserstatus = passstatus;

			Assert.assertTrue(true);

			System.out.println("Guest User Prepaid CheckOut Successful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "Guest User Prepaid CheckOut ", "Guest User Prepaid CheckOut Successful",passstatus});

		}
		catch(Exception e)
		{
			System.out.println("Guest User Prepaid CheckOut Unsuccessful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "Guest User Prepaid CheckOut", "Guest User Prepaid CheckOut Unsuccessful",failstatus});

			GPCLoginUserstatus = failstatus;

			GPCLoginUserstatusfail = getscreen.capture(driver, "GPCLoginUserstatusfail");

			test.addScreenCaptureFromPath(GPCLoginUserstatusfail);

			driver.close();

			Assert.assertTrue(false);		
		}
	}


	@Test(priority=1)
	public void GuestCODCheckoutFlow() throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;

		try
		{
			test = extent.createTest("Guest User COD CheckOut");

			System.out.println("Guest User COD CheckOut Test Case Executing...");

			/*			commonmethods.Login(driver);

			test.log(Status.INFO, MarkupHelper.createLabel("User able to Login", ExtentColor.BLUE));
			 */
			Thread.sleep(1000);

			commonmethods.URLNaviagtion(driver);

			Thread.sleep(1000);

			String Parent = driver.getWindowHandle();

			steps.clickButton(checkout.Cart, driver, name);

			Thread.sleep(2000);

			try
			{
				String ok = driver.findElement(checkout.MDSWalletPOPupOK).getText();

				System.out.println(ok);

				steps.clickButton(checkout.MDSWalletPOPupOK, driver, name);

				steps.clickButton(checkout.Remove, driver, name);
			}
			catch(Exception e)
			{
				System.out.println("Ok button is not displayed");

				steps.clickButton(checkout.Remove, driver, name);
			}


			steps.clickButton(home.Mydreamstore, driver, name);

			Thread.sleep(2000);

			steps.clickButton(home2.Checkout_Image, driver, name);

			steps.ChildWindow(driver);

			driver.manage().window().maximize();

			GCODcheck1 = getscreen.capture(driver, "GCODcheck1");

			test.addScreenCaptureFromPath(GCODcheck1);

			Thread.sleep(1000);

			try
			{
				steps.clickButton(home.Trend_Image_Readmore, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Readmore", ExtentColor.BLUE));

				GCODcheck2 = getscreen.capture(driver, "GCODcheck2");

				test.addScreenCaptureFromPath(GCODcheck2);

				GCODcheck3 = driver.findElement(home.Trend_Image_Description).getText();

				System.out.println("Item Description   "+GCODcheck3);

				test.log(Status.INFO, MarkupHelper.createLabel("Description about Item:  "+GCODcheck3, ExtentColor.BLUE));

				steps.clickButton(home.Trend_Image_Readless, driver, name);
			}
			catch(Exception e)
			{
				steps.clickButton(home.Trend_Image_Readmore, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Readmore", ExtentColor.BLUE));

				GCODcheck4 = getscreen.capture(driver, "GCODcheck4");

				test.addScreenCaptureFromPath(GCODcheck4);

				GCODcheck5 = driver.findElement(home.Trend_Image_Description1).getText();

				System.out.println("Item Description   "+GCODcheck5);

				test.log(Status.INFO, MarkupHelper.createLabel("Description about Item:  "+GCODcheck5, ExtentColor.BLUE));

				steps.clickButton(home.Trend_Image_Readless, driver, name);
			}


			Thread.sleep(1000);

			GCODcheck6 = driver.findElement(home.Trend_Image_MRP).getText();

			System.out.println("Item Price   "+GCODcheck6);

			test.log(Status.INFO, MarkupHelper.createLabel("MRP of an Item:  "+GCODcheck6, ExtentColor.ORANGE));

			try
			{
				String col1 = driver.findElement(home.Trend_color1).getCssValue("color");

				System.out.println(col1);

				steps.clickButton(home.Trend_color1, driver, name);

				Thread.sleep(2000);

				GCODcheckColor1 = driver.findElement(home.Trend_color1).getCssValue("background-color");

				GCODcheckhex1 = Color.fromString(GCODcheckColor1).asHex();

				System.out.println("Image color: "+GCODcheckhex1);

				test.log(Status.INFO, MarkupHelper.createLabel("User changed item color to:  "+GCODcheckhex1, ExtentColor.BLUE));

				GCODcheckFirstcolor1 = getscreen.capture(driver, "GCODcheckFirstcolor1");

				test.addScreenCaptureFromPath(GCODcheckFirstcolor1);
			}
			catch(Exception e)
			{
				System.out.println("Color 2 is not exists");
			}

			try
			{
				String col2 = driver.findElement(home.Trend_color5).getCssValue("color");

				System.out.println(col2);

				steps.clickButton(home.Trend_color5, driver, name);

				Thread.sleep(2000);

				GCODcheckColor5 = driver.findElement(home.Trend_color5).getCssValue("background-color");

				GCODcheckhex5 = Color.fromString(GCODcheckColor5).asHex();

				System.out.println("Image color: "+GCODcheckhex5);

				test.log(Status.INFO, MarkupHelper.createLabel("User changed item color to:  "+GCODcheckhex5, ExtentColor.BLUE));

				GCODcheckFifthcolor1 = getscreen.capture(driver, "GCODcheckFifthcolor1");

				test.addScreenCaptureFromPath(GCODcheckFifthcolor1);

			}
			catch(Exception e)
			{
				System.out.println("Color 1 is not exists");
			}

			GCODcheckcqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Current Quantity:  "+ GCODcheckcqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product:  "+GCODcheckcqty1, ExtentColor.BLUE));

			Thread.sleep(1000);

			steps.clickButton(home.Trend_QtyIncrease, driver, name);

			GCODcheckiqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Quantity after increase:  "+ GCODcheckiqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product after Increase:  "+GCODcheckiqty1, ExtentColor.BLUE));

			steps.clickButton(home.Trend_QtyDecrease, driver, name);

			GCODcheckdqty1 = driver.findElement(home.Qty).getAttribute("value");

			System.out.println("Quantity after decrease:  "+ GCODcheckdqty1);

			test.log(Status.INFO, MarkupHelper.createLabel("Current Quantity of product after increase:  "+GCODcheckdqty1, ExtentColor.BLUE));

			Thread.sleep(2000);

			steps.clickButton(home.Trend_Addcart, driver, name);

			GCODcheckSizemsg1 = driver.findElement(home.Trend_Sizeerrormsg).getText();

			System.out.println("User clicked on Addcart before Size selection:  "+GCODcheckSizemsg1);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Addcart before Size selection:  "+GCODcheckSizemsg1, ExtentColor.RED));

			steps.clickJSButton(home2.Size_S, driver, name);

			GCODchecksizeS1 = driver.findElement(home2.Size_S).getText();

			System.out.println("Selected Size:  "+GCODchecksizeS1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeS1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_M, driver, name);

			GCODchecksizeM1 = driver.findElement(home2.Size_M).getText();

			System.out.println("Selected Size:  "+GCODchecksizeM1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeM1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_L, driver, name);

			GCODchecksizeL1 = driver.findElement(home2.Size_L).getText();

			System.out.println("Selected Size:  "+GCODchecksizeL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XL, driver, name);

			GCODchecksizeXL1 = driver.findElement(home2.Size_XL).getText();

			System.out.println("Selected Size:  "+GCODchecksizeXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeXL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XXL, driver, name);

			GCODchecksizeXXL1 = driver.findElement(home2.Size_XXL).getText();

			System.out.println("Selected Size:  "+GCODchecksizeXXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeXXL1, ExtentColor.BLUE));

			steps.clickButton(home2.Size_XXXL, driver, name);

			GCODchecksizeXXXL1 = driver.findElement(home2.Size_XXXL).getText();

			System.out.println("Selected Size:  "+GCODchecksizeXXXL1);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size:  "+GCODchecksizeXXXL1, ExtentColor.BLUE));

			steps.clickButton(home.Trend_FindUrSize, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Find your size", ExtentColor.BLUE));

			Thread.sleep(1000);

			steps.clickButton(home.Trend_FindUrSize_closebutton, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User navigate to Product details page", ExtentColor.BLUE));

			Thread.sleep(1000);

			steps.clickButton(home2.Size_L, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size", ExtentColor.BLUE));

			steps.clickButton(home.Trend_Addcart, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User added product to Cart", ExtentColor.BLUE));

			GCODcheckaddcart1 = getscreen.capture(driver, "GCODcheckaddcart1");

			test.addScreenCaptureFromPath(GCODcheckaddcart1);

			try
			{
				String edit1 = driver.findElement(home.Trend_Addcart_edit).getText();

				System.out.println(edit1);

				steps.clickButton(home.Trend_Addcart_edit, driver, name);

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Edit", ExtentColor.BLUE));

				steps.selectDropdown(home.Trend_Addcart_selectsize, driver, strDataFileName, "SelectSize", name);

				steps.selectDropdown(home.Trend_Addcart_selectqty, driver, strDataFileName, "Quantity", name);

				test.log(Status.INFO, MarkupHelper.createLabel("User selected Size and Quantity", ExtentColor.BLUE));

				steps.clickButton(home.Trend_Addcart_cancel, driver, name);

				steps.clickButton(home.Trend_Addcart_edit, driver, name);

				steps.selectDropdown(home.Trend_Addcart_selectsize, driver, strDataFileName, "SelectSize", name);

				steps.selectDropdown(home.Trend_Addcart_selectqty, driver, strDataFileName, "Quantity", name);

				steps.clickButton(home.Trend_Addcart_save, driver, name);

				GCODcheckupdateproduct1 = getscreen.capture(driver, "GCODcheckupdateproduct1");

				test.addScreenCaptureFromPath(GCODcheckupdateproduct1);

				test.log(Status.INFO, MarkupHelper.createLabel("User updated product size and quantity", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Edit feature is not available for this product");
			}

			steps.clickButton(home.Trend_Addcart_remove, driver, name);

			GCODcheckremovecart1 = getscreen.capture(driver, "GCODcheckremovecart1");

			test.addScreenCaptureFromPath(GCODcheckremovecart1);

			test.log(Status.INFO, MarkupHelper.createLabel("User removed product from Cart", ExtentColor.BLUE));

			//checkout process

			steps.clickButton(home.Size_L, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User selected size", ExtentColor.BLUE));

			steps.clickButton(checkout.BuyNow, driver, name);

			test.log(Status.INFO, MarkupHelper.createLabel("User clicked on BuyNow, navigated to checkout page", ExtentColor.BLUE));

			GCODbuynow1 = getscreen.capture(driver, "GCODbuynow1");

			test.addScreenCaptureFromPath(GCODbuynow1);

			Thread.sleep(3000);

			// Cash on delivery 
			try
			{
				steps.WaitUntilElementPresent(checkout.CashonDeliveryText, driver);

				String cash = driver.findElement(checkout.CashonDeliveryText).getText();

				System.out.println("Payment method:  "+cash);

				test.log(Status.INFO, MarkupHelper.createLabel("Payment method:  "+cash+    "Available", ExtentColor.BLUE));

				steps.Verifytext(checkout.CashonDeliveryText, driver, cash, name);

				steps.clickButton(checkout.CashonDeliveryradio, driver, name);

				Thread.sleep(3000);

				GCODbuynow2 = driver.findElement(checkout.PopUpSaveMsg).getText();

				System.out.println("Displayed message:   "+GCODbuynow2);

				test.log(Status.INFO, MarkupHelper.createLabel("Displayed message:   "+GCODbuynow2, ExtentColor.BLUE));

				GCODbuynow3 = getscreen.capture(driver, "GCODbuynow3");

				test.addScreenCaptureFromPath(GCODbuynow3);

				steps.clickButton(checkout.Cashondelivery, driver, name);
				
				System.out.println("user clicked on cachondelivery link");

				test.log(Status.INFO, MarkupHelper.createLabel("User clicked on Cash on Delivery link", ExtentColor.BLUE));

			}
			catch(Exception e)
			{
				System.out.println("Cash on Delivery is not available");

				test.log(Status.INFO, MarkupHelper.createLabel("Cash on Delivery is not available", ExtentColor.BLUE));
			}

			Thread.sleep(2000);

			String GCODcheckout1 = getscreen.capture(driver, "GCODcheckout1");

			test.addScreenCaptureFromPath(GCODcheckout1);

			steps.clickButton(checkout.Placeorder, driver, name);

			Thread.sleep(2000);

			String GCODPrepaid10 = getscreen.capture(driver, "GCODPrepaid10");

			test.addScreenCaptureFromPath(GCODPrepaid10);
			
			Thread.sleep(5000);
	/*		
			steps.Clear(checkout.FirstName, driver, name);

			steps.Clear(checkout.MobileNumber, driver, name);

			steps.Clear(checkout.Email, driver, name);

			steps.Clear(checkout.Zipcode, driver, name);

			steps.Clear(checkout.Address, driver, name);

			steps.Clear(checkout.Address2, driver, name);

			steps.Clear(checkout.City, driver, name);

			steps.Clear(checkout.State, driver, name);
*/
			
			try
			{
				String Orderconfirmation = driver.findElement(checkout.OrderConfirmText).getText();
				
				System.out.println("User moved to Order Confirmation page:  "+Orderconfirmation);
			}
			catch(Exception e)
			{
				//Form Validation

				try
				{
					steps.Clear(checkout.FirstName, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck14 = driver.findElement(checkout.FirstNameerror).getText();

					System.out.println(Gcheck14);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck14, ExtentColor.RED));

					steps.EnterText(checkout.FirstName, driver, strDataFileName, "Firstname", name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("Firstname error message is not displayed");
				}

				try
				{
					steps.Clear(checkout.MobileNumber, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck15 = driver.findElement(checkout.MobileNumberError).getText();

					System.out.println(Gcheck15);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck15, ExtentColor.RED));

					steps.EnterText(checkout.MobileNumber, driver, strDataFileName, "Mobile", name);

					steps.clickButton(checkout.Placeorder, driver, name);

				}
				catch(Exception f )
				{
					System.out.println("Mobile Number error message is not displayed");
				}

				try
				{
					steps.Clear(checkout.Email, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck16 = driver.findElement(checkout.EmailError).getText();

					System.out.println(Gcheck16);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck16, ExtentColor.RED));

					steps.EnterText(checkout.Email, driver, strDataFileName, "Email", name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("Email error message is not displayed");
				}

				try
				{
					steps.Clear(checkout.Zipcode, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck17 = driver.findElement(checkout.ZipcodeError).getText();

					System.out.println(Gcheck17);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck17, ExtentColor.RED));

					steps.EnterText(checkout.Zipcode, driver, strDataFileName, "Zipcode", name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("Zipcode error message is not displayed");
				}

				try
				{
					steps.Clear(checkout.Address, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck18 = driver.findElement(checkout.AddressError).getText();

					System.out.println(Gcheck18);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck18, ExtentColor.RED));

					steps.EnterText(checkout.Address, driver, strDataFileName, "Address", name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("Address 1  error message is not displayed");
				}

				try
				{
					steps.Clear(checkout.Address2, driver, name);

					steps.clickButton(checkout.Placeorder, driver, name);
					
					String Gcheck19 = driver.findElement(checkout.Address2Error).getText();

					System.out.println(Gcheck19);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck19, ExtentColor.RED));

					steps.EnterText(checkout.Address2, driver, strDataFileName, "Address2", name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("Address 2  error message is not displayed");
				}

				try
				{
					String Gcheck20 = driver.findElement(checkout.CityError).getText();

					System.out.println(Gcheck20);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck20, ExtentColor.RED));

					steps.EnterText(checkout.City, driver, strDataFileName, "City",name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("City  error message is not displayed");
				}

				try
				{
					String Gcheck21 = driver.findElement(checkout.StateError).getText();

					System.out.println(Gcheck21);

					test.log(Status.INFO, MarkupHelper.createLabel("Error message:   "+Gcheck21, ExtentColor.RED));

					steps.EnterText(checkout.State, driver, strDataFileName, "State",name);

					steps.clickButton(checkout.Placeorder, driver, name);
				}
				catch(Exception f )
				{
					System.out.println("State  error message is not displayed");
				}

			}
			
			Thread.sleep(1000);

			String GCODPrepaid11 = getscreen.capture(driver, "GCODPrepaid11");

			test.addScreenCaptureFromPath(GCODPrepaid11);

			steps.clickButton(checkout.Cart, driver, name);

			steps.clickButton(checkout.Remove, driver, name);

			GCODLoginUserstatus = passstatus;

			Assert.assertTrue(true);

			System.out.println("Guest User COD CheckOut Successful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "Guest User COD CheckOut", "Guest User COD CheckOut Successful",passstatus});

		}
		catch(Exception e)
		{
			System.out.println("Guest User COD CheckOut Unsuccessful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "Guest User COD CheckOut", "Guest User COD CheckOut Unsuccessful",failstatus});

			GCODLoginUserstatus = failstatus;

			GCODLoginUserstatusfail = getscreen.capture(driver, "GCODLoginUserstatusfail");

			test.addScreenCaptureFromPath(GCODLoginUserstatusfail);

			driver.close();

			Assert.assertTrue(false);		
		}
	}



	@BeforeClass
	public void before()
	{
		workbook = new HSSFWorkbook();

		sheet = workbook.createSheet(strDataFileName);

		testresultdata = new LinkedHashMap<String, Object[]>();

		testresultdata.put("1", new Object[] { "Test Step Name", "Expected Result","Actual Result" ,"Status"});


	}
	@AfterClass
	public void after() throws Exception
	{


		Set<String> keyset = testresultdata.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object [] objArr = testresultdata.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof Date) 
					cell.setCellValue((Date)obj);
				else if(obj instanceof Boolean)
					cell.setCellValue((Boolean)obj);
				else if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Double)
					cell.setCellValue((Double)obj);

			}
		}
		try {


			FileOutputStream out = new FileOutputStream(new File("TestResults/"+strDataFileName +".xls"));

			workbook.write(out);

			out.close();

			System.out.println("Excel written successfully..");

			TestResult();

			driver.quit();

		}

		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}






	public void TestResult() throws Exception
	{
		HSSFRow row;

		HSSFCell cell;

		WritableFont cellFont;

		WritableCellFormat cellFormat;

		Border border = null;

		int count;

		FileInputStream inp = new FileInputStream( "TestResults/"+strDataFileName +".xls");

		HSSFWorkbook wb = new HSSFWorkbook(inp);

		HSSFSheet sh = wb.getSheetAt(0);

		count=sh.getLastRowNum();

		for (int i = 1; i <= count; i++) 
		{
			row=sh.getRow(i);

			cell=row.getCell(3);

			String status=row.getCell(3).getStringCellValue();

			if(status.equalsIgnoreCase("Pass"))
			{

				HSSFCellStyle pass= wb.createCellStyle();

				pass.setFillForegroundColor(IndexedColors.GREEN.getIndex());

				pass.setFillPattern(CellStyle.SOLID_FOREGROUND);

				cell.setCellStyle(pass);
			}
			else
			{
				HSSFCellStyle fail= wb.createCellStyle();

				fail.setFillForegroundColor(IndexedColors.RED.getIndex());

				fail.setFillPattern(CellStyle.SOLID_FOREGROUND);

				cell.setCellStyle(fail);
			}

		}

		FileOutputStream out = new FileOutputStream("TestResults/"+strDataFileName+".xls");

		wb.write(out);

		wb.close();
	}
}
