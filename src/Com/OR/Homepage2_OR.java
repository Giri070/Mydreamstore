package Com.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage2_OR {

	WebDriver driver;

	public By Mydreamstore = By.xpath("//img");

	/* Recently Viewed */
	public By Recent_Image1 = By.xpath("//img[contains(@src='https://s3-ap-southeast-1.amazonaws.com/mds-new-home-images/Best-Seller 1.jpg')]");

	public By Recent_Image2 = By.xpath("//div/div[2]/div[2]/div/a/img");

	public By Recent_Image3 = By.xpath("//div/div[2]/div[3]/div/a/img");


	/* Best Seller */
	public By Best_Image1 = By.xpath("html/body/div[1]/div[4]/div[1]/a[1]/img[1]");
	
	public By Best_Image11 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/04-Best-Seller---1.jpg')]");

	public By Best_ImageUnderimage = By.xpath("html/body/div[1]/div/div[2]/div[1]/a/img");

	public By Best_Image2 = By.xpath("html/body/div[1]/div[4]/div[2]/a[1]/img[1]");

	public By Best_Image3 = By.xpath("html/body/div[1]/div[4]/div[3]/a[1]/img[1]");

	public By Best_Image4 = By.xpath("html/body/div[1]/div[4]/div[4]/a[1]/img[1]");

	public By Size_S = By.cssSelector("div.vcell.prosize > #size_S");

	public By Size_M = By.cssSelector("div.vcell.prosize > #size_M");

	public By Size_L = By.cssSelector("div.vcell.prosize > #size_L");

	public By Size_XL = By.cssSelector("div.vcell.prosize > #size_XL");

	public By Size_XXL = By.cssSelector("div.vcell.prosize > #size_XXL");

	public By Size_XXXL = By.cssSelector("div.vcell.prosize > #size_XXXL");


	/*public By Best_sizeS = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[1]");

	public By Best_sizeM = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[2]");

	public By Best_sizeL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[3]");

	public By Best_sizeXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[4]");

	public By Best_sizeXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[5]");

	public By Best_sizeXXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[3]/div/div[2]/button[6]");

	public By Travelling_sizeS = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[1]");

	public By Travelling_sizeM = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[2]");

	public By Travelling_sizeL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[3]");

	public By Travelling_sizeXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[4]");

	public By Travelling_sizeXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[5]");

	public By Travelling_sizeXXXL = By.xpath("html/body/div[1]/section/div/div/div[2]/div[4]/div[2]/div/div[2]/button[6]");
	 */

	/* What Inspires You Most */
	public By WIM_Image1 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/photo-1.jpg')]");

	public By Photography_Motherday = By.id("tag-0");

	public By Photography_Bolly = By.id("tag-1");

	public By Photography_Regional = By.id("tag-2");

	public By Photography_Sports = By.id("tag-4");

	public By Photography_NoCampaignFound = By.xpath(".//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/center");

	public By Photography_SortDD = By.xpath("//div[@class='sort_dropdown']/section/span/select");
	//div[@id='appmain']/div/div/div[2]/div[3]/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img
	public By Photography_Image1 = By.xpath("//div[@id='appmain']/div/div/div[2]/div[3]/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By Photography_Image1_Readmore = By.linkText("Read More");

	public By Photography_Image1_Description = By.xpath("//*[@id='show_description']");

	public By Photography_Image1_Description1 = By.xpath("//*[@id='hide_more_description']");

	//public By Photography_Image1_Readless = By.xpath("//*[@id='show_description']/a");

	public By Photography_Image1_Readless = By.linkText("Read Less");


	public By Photography_Image1_MRP = By.xpath("html/body/div[1]/section/div/div/div[2]/div[3]/span");

	public By Photography_Image1_Prpduct1 = By.xpath(".//*[@id='shirt-btn']/img");

	public By Photography_Image1_Prpduct2 = By.xpath(".//*[@id='mens-full-sleeve-btn']/img");

	public By Photography_Image1_Prpduct3 = By.xpath(".//*[@id='hoodie-btn']/img");

	public By color1 = By.id("color_1");

	public By color2 = By.id("color_2");

	public By color3 = By.id("color_3");

	public By color4 = By.id("color_0");

	public By Qty = By.xpath("//input[@id='quantity']");

	public By QtyIncrease = By.xpath("//a[contains(text(),'+')]");

	public By QtyDecrease = By.xpath("//a[contains(text(),'-')]");

	public By Sizeerrormsg = By.xpath("//*[@id='szErr']");

	public By Addcart = By.xpath("//*[@id='cart_add']");

	public By FindUrSize = By.xpath("//a[@id='pop']");

	//public By Trend_FindUrSize_belowradio = By.xpath("//input[@id='r1']");

	public By FindUrSize_510radio = By.xpath("//div[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div/label");

	public By FindUrSize_above510radio = By.xpath("//label[@id='ht']");

	public By FindUrSize_Tightradio = By.xpath("//*[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div[2]/label[1]");	

	public By FindUrSize_Comfortradio = By.xpath("//*[@id='imagemodal']/div/div/div[2]/div/div[2]/form/fieldset/div[2]/label[2]");

	public By FindUrSize_sizeDD = By.xpath("//select[@id='shirt_size']");

	public By FindUrSize_submit = By.xpath("//a[@id='find_size']");

	public By FindUrSize_Displayedsize = By.xpath("html/body/div[13]/h2");

	public By FindUrSize_Displayedmsg = By.xpath("html/body/div[13]/p	");

	public By FindUrSize_Okbutton = By.xpath("//div[7]/div/button");

	public By FindUrSize_closebutton = By.xpath("//div[@id='imagemodal']/div/div/div[3]/button");

	public By Addcart_edit = By.xpath("//a[@class='editCartItem']");

	public By Addcart_selectsize = By.xpath("//*[@id='size-1']");

	public By Addcart_selectqty = By.xpath("//*[@id='qty-1']");

	public By Addcart_save = By.xpath("//*[@id='editCart-1']/form/fieldset/div[3]/div/button[2]");

	public By Addcart_cancel = By.xpath("//*[@id='cancel']");

	public By Addcart_remove = By.xpath("//*[@id='cart_view-1']/div[2]/div/div/a[2]");

	public By Addcart_continueshopping = By.xpath("//a[contains(text(),'Continue Shopping')]");

	public By Addcart_placeorder = By.xpath("//*[@id='place_order']");




	public By Photography_Image2 = By.xpath(".//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[2]/div/div[1]/a[2]/img");

	public By Photography_Image3 = By.xpath(".//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[3]/div/div[1]/a[2]/img");


	public By WIM_Image2 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/travel-2.jpg')]");

	public By Travelling_Image1 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-sale-images/travel-store-updated-01.jpg')]");

	public By Travelling__Description = By.xpath("//*[@id='show_description']");

	public By Travelling__Description1 = By.xpath(".//*[@id='hide_more_description']");

	public By Travelling_Prpduct1 = By.xpath("//a[@id='shirt-btn']/img");

	public By Travelling_Prpduct2 = By.xpath("//a[@id='w-round-neck-tee-btn']/img");


	public By WIM_Image3 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/music-3.jpg')]");

	public By MusicLover_Image1 = By.xpath("html/body/div[1]/div/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[1]/a[2]/img");

	public By  MusicLoverAddcart_remove = By.linkText("Remove");;


	public By WIM_Image4 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/fit-4.jpg')]");

	public By Fitness_Image1 = By.xpath("html/body/div[1]/div/div[2]/div[1]/a/img");



	public By WIM_Image5 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/food-5.jpg')]");

	public By Foodie_Image1 = By.xpath("//div[@class='col-lg-4 col-md-6 col-sm-12 ng-scope']/div/div/a[2]/img");

	//*[@id="appmain"]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]

	public By Foodie_Description = By.xpath("//*[@id='show_description']");

	public By Foodie_Description1 = By.xpath(".//*[@id='hide_more_description']");

	public By Foodie_SizeS = By.cssSelector("div.vcell.prosize > #size_S");

	public By Foodie_remove = By.linkText("Remove");


	public By WIM_Image6 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/biker-6.jpg')]");

	public By Biker_Filter_Image1 = By.xpath("//div[@id='appmain']/div/div/div[2]/div[3]/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]/a/div/div");

	public By Biker_Image1 = By.xpath("//div[2]/div/a/img");

	public By Biker_product1 = By.xpath("//a[@id='shirt-btn']/img");

	public By Biker_product2 = By.xpath("//a[@id='mens-full-sleeve-btn']/img");

	public By Biker_remove = By.linkText("Remove");

	public By Biker_description = By.xpath("//div[@id='show_description']");

	public By Biker_description1 = By.xpath("//*[@id='hide_more_description']");





	public By WIM_Image7 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/start-7.jpg')]");

	public By Startup_radio = By.xpath("//div[@id='appmain']/div/div/div[2]/div[2]/div/div/section/div[15]/label");

	public By Startup_image1 = By.xpath("html/body/div[1]/div/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By Startup_description = By.xpath("//*[@id='hide_more_description']");

	public By Startup_description1 = By.xpath("//div[@id='show_description']");

	public By Startup_product1 = By.xpath("//*[@id='hoodie-btn']/img");

	public By Startup_product2 = By.xpath("//*[@id='shirt-btn']/img");

	public By Startup_sizeS = By.xpath("//button[@id='size_S']");



	public By WIM_Image8 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/profession-8.jpg')]");

	public By Profession_image1 = By.xpath("//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By Profession_description = By.xpath("//*[@id='show_description']");

	public By Profession_description1 = By.xpath("//*[@id='hide_more_description']");

	public By Profession_Readless = By.linkText("Read Less");



	public By WIM_Image9 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/gifting-9.jpg')]");

	public By Gifting_image1 = By.xpath("//img[contains(@src,'https://s3-us-west-2.amazonaws.com/mds-banner-images/Great-DAD.jpg')]");

	public By Gifting_description = By.xpath("//*[@id='show_description']");

	public By Gifting_description1 = By.xpath("//*[@id='hide_more_description']");


	public By WIM_Image10 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/sports-10.jpg')]");

	public By Sports_image1 = By.xpath("//img[contains(@src,'https://d2xhmhznfa660k.cloudfront.net/124940fa6e1eff43f8a3623b26101f4cb6f634ee49f3dc2d1f45be92f5d2124a.png')]");

	public By Sports_imageBuyNow = By.linkText("BUY NOW");

	public By Sports_description = By.xpath("//*[@id='show_description']");

	public By Sports_description1 = By.xpath("//*[@id='hide_more_description']");

	public By Sports_Product2 = By.xpath("//*[@id='w-round-neck-tee-btn']/img");

	public By Sports_Product1 = By.xpath("//*[@id='shirt-btn']/img");


	public By WIM_Image11 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/humour-11.jpg')]");

	public By Humour_image1 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-anniversary-sale/3-new.jpg')]");

	public By Humour_description = By.xpath("//*[@id='show_description']");

	public By Humour_description1 = By.xpath("//*[@id='hide_more_description']");




	public By WIM_Image12 = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/developer-12.jpg')]");

	public By Developer_image1 = By.xpath("html/body/div[1]/div/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By Developer_description1 = By.xpath("//*[@id='hide_more_description']");

	public By Developer_description = By.xpath("//div[@id='show_description']");





	public By ExploreCat_TShirts = By.cssSelector("div:nth-of-type(2) > a > img.pad_bot.cat_hover");

	public By ExploreCat_TShirts_Image1 = By.xpath("//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By ExploreCat_TShirts_Description1 = By.xpath("//*[@id='show_description']");

	public By ExploreCat_TShirts_Description2 = By.xpath(".//*[@id='hide_more_description']");

	public By ExploreCat_TShirts_Product1 = By.xpath("//div[4]/div/div/a/img");

	public By ExploreCat_TShirts_Product2 = By.xpath("//a[2]/img");

	public By ExploreCat_TShirts_Product3 = By.cssSelector("img.product_thumb.firepath-matching-node");


	public By ExploreCat_Polos = By.cssSelector("div:nth-of-type(3) > a > img.pad_bot.cat_hover");

	public By ExploreCat_Polos_Image1 = By.xpath("//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By ExploreCat_Polos_Description = By.xpath("//div[@id='show_description']");

	public By ExploreCat_Polos_Description1 = By.xpath(".//*[@id='hide_more_description']");



	/*public By ExploreCat_Polos_Product1 = By.cssSelector("img.product_thumb");

	public By ExploreCat_Polos_Product2 = By.cssSelector("#shirt-btn > img.product_thumb");

	public By ExploreCat_Polos_Product3 = By.cssSelector("img.product_thumb.firepath-matching-node");
	 */



	public By ExploreCat_FullSleeve = By.xpath("//a[@href='active_campaigns?product=mens-full-sleeve']/img");

	public By ExploreCat_FullSleeve_Image1 = By.xpath("//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By ExploreCat_FullSleeve_Description = By.xpath("//div[@id='show_description']");

	public By ExploreCat_FullSleeve_Description2 = By.xpath("//*[@id='hide_more_description']");

	public By ExploreCat_FullSleeve_Product1 = By.xpath("//div[4]/div/div/a/img");

	public By ExploreCat_FullSleeve_Product2 = By.xpath("//a[2]/img");

	public By ExploreCat_FullSleeve_Product3 = By.cssSelector("#hoodie-btn > img.product_thumb");




	public By ExploreCat_MobileCases = By.cssSelector("div:nth-of-type(5) > a > img.pad_bot.cat_hover");

	public By ExploreCat_MobileCases_Image1 = By.xpath(".//*[@id='appmain']/div/div/div[2]/div[3]/div[1]/section/div/div[1]/div/div[2]/div/table/tbody/tr/td[2]/a/div/div/img");

	public By ExploreCat_MobileCases_Description = By.xpath("//*[@id='hide_more_description']");

	public By ExploreCat_MobileCases_Dropdown = By.xpath("//*[@id='product-select']");

	public By ExploreCat_MobileCases_Description1 = By.xpath("//*[@id='show_description']");


	public By ExploreCat_CoffeeMugs = By.cssSelector("div:nth-of-type(6) > a > img.pad_bot.cat_hover");

	public By ExploreCat_Coffemugs_Page = By.xpath("//a/div");

	public By ExploreCat_Coffemugs_Image1 = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/a/img");

	//public By ExploreCat_Coffemugs_Page = By.xpath("//a/div");




	/* Footer Links */

	public By FollowUS_Facebook = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/fb-icon.png')]");

	public By FollowUS_Twitter = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/twitter-icon.png')]");

	public By FollowUS_Instagram = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/insta-icon.png')]");

	public By FollowUS_MDSBlog = By.xpath("//img[contains(@src,'https://s3-ap-southeast-1.amazonaws.com/mds-home-page-images/blog-icon.png')]");

	public By Footer_About = By.xpath("//a[contains(text(),'About')]");

	public By Footer_FAQ = By.xpath("//a[contains(text(),'FAQ')]");

	public By Footer_Return_Refundpolicy = By.xpath("//a[contains(text(),'Return/Refund Policy')]");

	public By Footer_University = By.xpath("//a[contains(text(),'University')]");

	public By Footer_Blog = By.xpath("//a[contains(text(),'Blog')]");

	public By Footer_Support = By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12']/div/div/a[5]");

	public By Footer_Contact = By.xpath("//a[contains(text(),'Contact')]");

	public By Footer_Careers = By.xpath("//a[contains(text(),'Careers')]");

	public By Footer_PrivacyPolicy = By.linkText("Privacy Policy");

	public By Footer_TermsofUse = By.linkText("Terms of Use");
	
	
	// Checkout
	
	public By Checkout_Image1 = By.cssSelector("html > body > div:nth-of-type(2) > div:nth-of-type(2) > a > img");
	
	public By Checkout_Image = By.cssSelector("img.pad_bot.card_img");
	
	public By Checkout_Image2 = By.xpath("html/body/div[1]/div[4]/div[2]/a[1]/img[1]");
	
	
	



}
