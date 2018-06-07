package Com.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_OR {

	WebDriver driver;

	public By Mydreamstore = By.xpath("//img");

	public By Mydreamstore1 = By.xpath("//img[contains(@src,'https://mydreamstore.in/static/images/logo_mds.png')]");

	public By radio1 = By.xpath(".//*[@id='topCarousel']/ol/li[1]");

	public By image1 = By.xpath(".//*[@id='topCarousel']/div/div[1]/a/img");

	public By radio2 = By.xpath(".//*[@id='topCarousel']/ol/li[2]");

	public By image2 = By.xpath(".//*[@id='topCarousel']/div/div[2]/a/img");

	public By radio3 = By.xpath(".//*[@id='topCarousel']/ol/li[3]");

	public By image3 = By.xpath(".//*[@id='topCarousel']/div/div[3]/a/img");

	public By radio4 = By.xpath(".//*[@id='topCarousel']/ol/li[4]");

	public By image4 = By.xpath(".//*[@id='topCarousel']/div/div[4]/a/img");

	public By radio5 = By.xpath(".//*[@id='topCarousel']/ol/li[5]");

	public By image5 = By.xpath(".//*[@id='topCarousel']/div/div[5]/a/img");

	public By Filterpagetext = By.xpath("//div[contains(text(),' FILTER BY INTEREST')]");

	public By CashonDeliveryText = By.xpath("//label[contains(text(),'Cash on Delivery')]");

	/* Trending at mydreamstore */
	public By Trend_Image1 = By.xpath("//div[2]/div/a/img");

	public By Trend_LandImage1 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-sale-images/2018-Fashion-Forward-Men-02.jpg')]");


	public By Trend_Image_Readmore = By.xpath("//a[contains(text(),'Read More')]");

	public By Trend_Image_Description = By.xpath("//div[@id='show_description']");

	public By Trend_Image_Description1 = By.xpath(".//*[@id='hide_more_description']");

	public By Trend_Image_Readless = By.xpath("//a[contains(text(),'Read Less')]");

	public By Trend_Image_MRP = By.xpath("//div[3]/span");

	public By Trend_color1 = By.id("color_1");

	public By Trend_color2 = By.id("color_2");

	public By Trend_color3 = By.id("color_3");

	public By Trend_color4 = By.id("color_4");

	public By Trend_color5 = By.id("color_0");

	public By Qty = By.xpath("//input[@id='quantity']");

	public By Trend_QtyIncrease = By.xpath("//a[contains(text(),'+')]");

	public By Trend_QtyDecrease = By.xpath("//a[contains(text(),'-')]");

	public By Trend_Sizeerrormsg = By.xpath("//*[@id='szErr']");


	public By Size_S = By.cssSelector("div.vcell.prosize > #size_S");

	public By Size_M = By.cssSelector("div.vcell.prosize > #size_M");

	public By Size_L = By.cssSelector("div.vcell.prosize > #size_L");

	public By Size_XL = By.cssSelector("div.vcell.prosize > #size_XL");

	public By Size_XXL = By.cssSelector("div.vcell.prosize > #size_XXL");

	public By Size_XXXL = By.cssSelector("div.vcell.prosize > #size_XXXL");

	// html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[1]
	/*public By Trend_sizeS = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[1]");

	public By Trend_sizeM = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[2]");

	public By Trend_sizeL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[3]");

	public By Trend_sizeXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[4]");

	public By Trend_sizeXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[5]");

	public By Trend_sizeXXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[6]");*/

	public By Trend_FindUrSize = By.xpath("//a[@id='pop']");

	//public By Trend_FindUrSize_belowradio = By.xpath("//input[@id='r1']");

	public By Trend_FindUrSize_510radio = By.xpath("//div[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div/label");

	public By Trend_FindUrSize_above510radio = By.xpath("//label[@id='ht']");

	public By Trend_FindUrSize_Tightradio = By.xpath("//*[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div[2]/label[1]");	

	public By Trend_FindUrSize_Comfortradio = By.xpath("//*[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div[2]/label[2]");

	public By Trend_FindUrSize_sizeDD = By.xpath("//select[@id='shirt_size']");

	public By Trend_FindUrSize_submit = By.xpath("//a[@id='find_size']");

	public By Trend_FindUrSize_Displayedsize = By.xpath("html/body/div[13]/h2");

	public By Trend_FindUrSize_Displayedmsg = By.xpath("html/body/div[13]/p	");

	public By Trend_FindUrSize_Okbutton = By.xpath("//div[7]/div/button");

	public By Trend_FindUrSize_closebutton = By.xpath("//div[@id='imagemodal']/div/div/div[3]/button");

	public By Trend_Addcart = By.xpath("//*[@id='cart_add']");

	public By Trend_Addcart_edit = By.xpath(".//*[@id='cart_view-1']/div[2]/div/div/a[1]");

	public By Trend_Addcart_selectsize = By.xpath("//*[@id='size-1']");

	public By Trend_Addcart_selectqty = By.xpath("//*[@id='qty-1']");

	public By Trend_Addcart_save = By.xpath("//*[@id='editCart-1']/form/fieldset/div[3]/div/button[2]");

	public By Trend_Addcart_cancel = By.xpath("//*[@id='cancel']");

	public By Trend_Addcart_remove = By.linkText("Remove");

	public By Trend_Addcart_continueshopping = By.xpath("//a[contains(text(),'Continue Shopping')]");

	public By Trend_Addcart_placeorder = By.xpath("//*[@id='place_order']");

	public By Trend_Image2 = By.xpath("//div[2]/div[2]/a/img");

	public By Trend_Image3 = By.xpath("//div[2]/div[3]/a/img");

	/* New Arrivals */
	public By NewArr_Image1 = By.xpath("//div[3]/div/a/img");

	public By NewArr_Image2 = By.xpath("//div[3]/div[2]/a/img");

	public By NewArr_Image3 = By.xpath("//div[3]/div[3]/a/img");

	public By NewArr_Image4 = By.xpath("//div[3]/div[4]/a/img");


	public By BuyNow = By.xpath(".//*[@id='shop_now']");

	public By FirstName	 = By.xpath(".//*[@id='firstName']");

	public By FirstNameerror	 = By.xpath("//form[@id='buy_campaigns1']/div/div/span");

	public By MobileNumber = By.xpath(".//*[@id='phone_number']");

	public By MobileNumberError = By.xpath("//form[@id='buy_campaigns1']/div/div[2]/span");

	public By Email = By.xpath(".//*[@id='email_text']");

	public By EmailError = By.xpath("//form[@id='buy_campaigns1']/div[2]/div/span");

	public By Zipcode = By.xpath(".//*[@id='zip_code']");

	public By ZipcodeError = By.xpath("//form[@id='buy_campaigns1']/div[2]/div[2]/span[2]");

	public By Address = By.xpath(".//*[@id='address']");

	public By AddressError = By.xpath("//form[@id='buy_campaigns1']/div[3]/div/span");

	public By Address2 = By.xpath(".//*[@id='street_2']");

	public By Address2Error = By.xpath("//form[@id='buy_campaigns1']/div[4]/div/span");

	public By Landmark = By.xpath(".//*[@id='landmark']");

	public By City = By.xpath(".//*[@id='city_div']");

	public By CityError = By.xpath(".//*[@id='buy_campaigns1']/div[6]/div[1]/span");

	public By State = By.xpath(".//*[@id='state']");

	public By StateError = By.xpath(".//*[@id='buy_campaigns1']/div[6]/div[2]/span");

	public By Debitcard = By.xpath(".//*[@id='p-6 checkbox8']");

	public By Creditcard = By.xpath(".//*[@id='p-7 checkbox8']");

	public By Netbanking = By.xpath(".//*[@id='p-8 checkbox8']");

	public By Paytm = By.xpath(".//*[@id='p-5 checkbox8']");

	public By MDSWallet = By.xpath(".//*[@id='p-4 checkbox8']");

	public By CashonDeliveryradio = By.xpath(".//*[@id='p-3 checkbox8']");

	public By CouponCode = By.xpath(".//*[@id='coupon']");

	public By CouponApply = By.xpath(".//*[@id='discount_submit']");

	public By Placeorder = By.xpath(".//*[@id='checkout']");

	public By PopUpSaveMsg = By.xpath("//h2/span");

	public By PopUpMsg = By.xpath("//body/div[9]/p[1]");

	public By Willpayonline = By.xpath("//div[7]/button");

	public By Cashondelivery = By.xpath("//button[@class='confirm']");

	public By CartIcon = By.xpath("//a[contains(@href, 'https://mydreamstore.in/product/cart')]");

	//public By PopUpSaveMsg = By.xpath("//h2/span");














}
