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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
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

public class Tesett extends TestBase {
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

	public static String GCOD = "";

	public Tesett()
	{
		Browsers b = new Browsers();

		this.driver = b.getBrowsers("FF");		 
	}

	@Test
	public void tert() throws Exception
	{
		String name = new Object(){}.getClass().getEnclosingMethod().getName();

		cnt ++;

		try
		{
			test = extent.createTest("Guest User Prepaid CheckOut");

			System.out.println("test");

			driver.get("https://mydreamstore.in/");

			test.log(Status.INFO, MarkupHelper.createLabel("User navigated to Mydreamstore", ExtentColor.BLUE));

			String GP = getscreen.capture(driver, "GP");

			test.addScreenCaptureFromPath(GP);

			System.out.println(driver.getTitle());

			GCOD = passstatus;

			Assert.assertTrue(true);

			System.out.println("tert Successful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "tert Successful", "tert Successful Successful",passstatus});

		}
		catch(Exception e)
		{
			System.out.println("tert Successful Unsuccessful");

			testresultdata.put(Integer.toString(cnt), new Object[] {name, "tert Unsuccessful", "tert Successful Unsuccessful",failstatus});

			GCOD = failstatus;

			String GCODfail = getscreen.capture(driver, "GCODfail");

			test.addScreenCaptureFromPath(GCODfail);

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
