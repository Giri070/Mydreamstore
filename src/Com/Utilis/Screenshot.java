package Com.Utilis;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.border.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WriteException;


public class Screenshot {



	private static final int windowCount = 0;

	WebDriver driver;

	public String strAbsolutepath = new File("").getAbsolutePath();

	String strDataFileName = this.getClass().getSimpleName();

	public void getscreenshot(WebDriver driver,String name) throws Exception
	{
		try
		{	 
			//name = new Object(){}.getClass().getEnclosingMethod().getName();

			Date date = new Date();

			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");

			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File(strAbsolutepath+"/Screenshot/"+name+"/"+ name + dateFormat.format(date)+".png"));

			System.out.println("screenshot has taken");		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}


	public void switchToNewWindow(int windowNumber) {
		Set < String > s = driver.getWindowHandles();   
		Iterator < String > ite = s.iterator();
		int i = 1;
		while (ite.hasNext() && i < 10) {
			String popupHandle = ite.next().toString();
			driver.switchTo().window(popupHandle);
			System.out.println("Window title is : "+driver.getTitle());
			if (i == windowCount) break;
			i++;
		}
	}


	public String status(String Status)
	{
		WritableFont cellFont = null;
		WritableCellFormat cellFormat = null;
		jxl.format.Border border = null;


		if(Status.equalsIgnoreCase("PASS"))
		{

			try {
				WritableFont bold10font1 = new WritableFont(WritableFont.TAHOMA,10,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.DARK_GREEN); 
				WritableCellFormat bold10format1 = new WritableCellFormat (bold10font1);
				bold10format1.setWrap(true);

			} catch (WriteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		else if (Status.equalsIgnoreCase("FAIL"))
		{
			try {
				WritableFont bold10font2 = new WritableFont(WritableFont.TAHOMA,10,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED); 
				WritableCellFormat bold10format2 = new WritableCellFormat (bold10font2);
				bold10format2.setWrap(true);

			} catch (WriteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}



		}
		return Status;
	}





}