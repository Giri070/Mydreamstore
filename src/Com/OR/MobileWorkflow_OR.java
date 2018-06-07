package Com.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileWorkflow_OR 
{
	WebDriver driver;
	
	public By Mob_Loginmenu = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/login-icon.png')]");
	
	public By Mob_Menulines = By.xpath("//button[@type='button']");
	
	public By Mob_Mydreamstore = By.xpath("//img");
	
	public By Mob_Mydreamstore1 = By.xpath("//img[contains(@src,'https://mydreamstore.in/static/images/logo_mds.png')]");
	
	//public By Mob_Loginlink = By.xpath("//a[contains(text(),'Login')]");
	
	public By Mob_Loginlink = By.className("options");
	
	//public By Mob_MyAccount = By.linkText("My Account");
	
	public By Mob_MyAccount = By.xpath("//li[@class='dropdown login-info']/a");
	
	public By Mob_Logout = By.xpath("//a[contains(text(),'Logout')]");
	
	public By Mob_Image1 = By.xpath("//div[3]/div/a/img");
	
	public By Mob_Image2 = By.xpath("//div[2]/div/div/a/img");
	
	public By Mob_ImageSlide = By.id("rt");
	
	//public By Mob_Readmore = By.linkText("Read More");
	
	public By Mob_Readmore = By.xpath("//*[@id='hide_more_description']/a");
	
	
	public By Mob_Readless = By.linkText("Read Less");
	
	public By Mob_Description = By.xpath("//*[@id='show_description']");
	
	public By Mob_Description1 = By.xpath("//*[@id='hide_more_description']");
	
	public By Mob_MRP= By.className("cart-button");
	
	public By Mob_color1 = By.id("color_1");

	public By Mob_color2 = By.id("color_2");

	public By Mob_color3 = By.id("color_3");

	public By Mob_color4 = By.id("color_4");

	public By Mob_color5 = By.id("color_0");
	
	public By Mob_QuantityText = By.className("label_pro");
	
	public By Mob_QuantityText1 = By.cssSelector("div.vcell");
	
	public By Mob_Addtocart = By.id("cart_add_mob");
	
	public By Mob_Addtocartfinal = By.id("final_add");
	
	public By Mob_SizeS = By.id("size_S");
	
	public By Mob_SizeM = By.id("size_M");
	
	public By Mob_SizeL = By.id("size_L");
	
	public By Mob_SizeXL = By.id("size_XL");
	
	public By Mob_SizeXXL = By.id("size_XXL");
	
	public By Mob_SizeXXXL = By.id("size_XXXL");
	
	public By Mob_SizeS2 = By.id("size_mob_S");
	
public By Mob_SizeM2 = By.id("size_mob_M");
	
	public By Mob_SizeL2 = By.id("size_mob_L");
	
	public By Mob_SizeXL2 = By.id("size_mob_XL");
	
	public By Mob_SizeXXL2 = By.id("size_mob_XXL");
	
	public By Mob_SizeXXXL2 = By.id("size_mob_XXXL");
	
	public By Mob_Findyoursize = By.xpath("//a[contains(text(),'(Find your size)')]");
	
	public By Mob_Findyoursizeclose = By.xpath("//div[@id='imagemodal']/div/div/div/button");
	
	public By Mob_CartEdit = By.className("editCartItem");
	
	public By Mob_CartEditSize = By.id("size-1");
	
	public By Mob_CartEditQty = By.id("qty-1");
	
	public By Mob_CartEditCancel = By.id("cancel");
	
	public By Mob_CartEditSave = By.xpath("//button[@type='submit']");
	
	public By Mob_CartRemove = By.className("remove_cart_button");
	
	public By Mob_BuyNow = By.id("shop_now_mob");
	
	public By Mob_Placeorder = By.id("checkout");
	
	public By Mob_ShopCartfield = By.id("shop_cart");

	public By Mob_FirstName	 = By.xpath(".//*[@id='firstName']");

	public By Mob_FirstNameerror	 = By.xpath("//form[@id='buy_campaigns1']/div/div/span");

	public By Mob_MobileNumber = By.xpath(".//*[@id='phone_number']");

	public By Mob_MobileNumberError = By.xpath("//form[@id='buy_campaigns1']/div/div[2]/span");
	
	public By Mob_MobileNumberError1 = By.xpath("//span[contains(text(),'Please enter a valid mobile number.')]");

	public By Mob_Email = By.xpath(".//*[@id='email_text']");

	public By Mob_EmailError = By.xpath("//form[@id='buy_campaigns1']/div[2]/div/span");

	public By Mob_Zipcode = By.xpath(".//*[@id='zip_code']");

	public By Mob_ZipcodeError = By.xpath("//form[@id='buy_campaigns1']/div[2]/div[2]/span[2]");
	
	public By Mob_ZipcodeError1 = By.xpath("//span[contains(text(),'Please enter a valid Zip or postal code.')]");

	public By Mob_Address = By.xpath(".//*[@id='address']");

	public By Mob_AddressError = By.xpath("//form[@id='buy_campaigns1']/div[3]/div/span");
	
	public By Mob_AddressError1 = By.xpath("//span[contains(text(),'Enter valid Flat / House No. / Building Name.')]");

	public By Mob_Address2 = By.xpath(".//*[@id='street_2']");

	public By Mob_Address2Error = By.xpath("//form[@id='buy_campaigns1']/div[4]/div/span");
	
	public By Mob_Address2Error1 = By.xpath("//span[contains(text(),'Please enter valid Colony / Street / Locality')]");

	public By Mob_Landmark = By.xpath(".//*[@id='landmark']");

	public By Mob_City = By.xpath(".//*[@id='city_div']");

	public By Mob_CityError = By.xpath(".//*[@id='buy_campaigns1']/div[6]/div[1]/span");

	public By Mob_State = By.xpath(".//*[@id='state']");

	public By Mob_StateError = By.xpath(".//*[@id='buy_campaigns1']/div[6]/div[2]/span");

	public By Mob_Debitcard = By.xpath("//label[contains(text(),'Debit Card')]");

	public By Mob_Creditcard = By.xpath("//label[contains(text(),'Credit Card')]");

	public By Mob_Netbanking = By.xpath("//label[contains(text(),'Net Banking')]");

	public By Mob_Paytm = By.xpath("//img[@class='check_img']");

	public By Mob_MDSWallet = By.xpath("//label[contains(text(),'MDS Wallet')]");
	
	public By Mob_MDSWalletPOPup = By.xpath("//body/div[5]");
	
	public By Mob_MDSWalletPOPupOK = By.xpath("//button[@class='confirm']");
	
	public By Mob_CashonDeliveryText = By.xpath("//label[contains(text(),'Cash on Delivery')]");

//	public By Mob_CashonDeliveryradio = By.xpath(".//*[@id='p-3 checkbox8']");
	
	public By Mob_CashonDeliveryradio = By.xpath("//tr[7]/td/div/label");

	public By Mob_CouponCode = By.xpath(".//*[@id='coupon']");

	public By Mob_CouponApply = By.xpath(".//*[@id='discount_submit']");
	
	public By Mob_PopUpSaveMsg = By.xpath("//h2/span");

	public By Mob_PopUpMsg = By.xpath("//body/div[9]/p[1]");

	public By Mob_Willpayonline = By.xpath("//div[7]/button");

	public By Mob_Cashondelivery = By.xpath("//button[@class='confirm']");

	public By Mob_CartIcon = By.xpath("//a[contains(@href, 'https://mydreamstore.in/product/cart')]");
	
	
	
	
	
	
	
	

}
