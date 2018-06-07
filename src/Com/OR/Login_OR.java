package Com.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_OR {
	
	WebDriver driver;
	
	public By log = By.xpath("html/body/header/div/div/div[3]/ul/li[3]/a");
	
	public By Logintext = By.xpath("//div[@id='appmain']/div/form/div/center/h3");
	
	//public By Login = By.linkText("Login");
	
	public By Login = By.className("login header-font font_top");
	
	//public By MyAccount = By.linkText("My Account");
	
	public By Login_Email = By.xpath("//input[@id='data']");
	
	public By Email_error = By.xpath("//*[@id='appmain']/div/form/div[3]/span[3]");
	
	public By Password_error = By.xpath(".//*[@id='appmain']/div/form/div[3]/span[3]");
	
	public By Login_Continue = By.xpath("//*[@id='appmain']/div[1]/form[1]/button[2]/div[1]");
	
	public By Login_password = By.xpath("//input[@type='password']");
	
	public By Login_loginbutton = By.xpath("//div[@id='appmain']/div/form/button");
	
	public By MyAccount = By.xpath("//a[contains(text(),'My Account')]");
	
	public By Logout = By.xpath(".//*[@id='logout_button']");
	
	
	
	

}
