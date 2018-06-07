package Com.Utilis;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
public class GetScreenShot {
	
	
	public String strAbsolutepath = new File("").getAbsolutePath();

	String strDataFileName = this.getClass().getSimpleName();
     
    public String capture(WebDriver driver,String screenShotName) throws IOException, InterruptedException
    {
    	Thread.sleep(500);
    	
    	
        TakesScreenshot ts = (TakesScreenshot)driver;
        
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"/ErrorScreenshots/"+screenShotName+".png";
        File destination = new File(dest);
        
        Thread.sleep(500);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
    
    
    /*public String capture(WebDriver driver,String strDataFileName, String name) throws IOException, InterruptedException
    {
    	Thread.sleep(500);
    	Date date = new Date();

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String Dest = System.getProperty(strAbsolutepath+"/ErrorScreenshots/"+name+"/"+ name + dateFormat.format(date)+".png");
        File destination = new File(Dest);
        
        Thread.sleep(500);
        FileUtils.copyFile(scrFile, destination);        
                     
        return Dest;
    }*/
    
}