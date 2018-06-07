package Com.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_OR 
{
	
	WebDriver driver;
	

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

	public By Debitcard = By.xpath("//label[contains(text(),'Debit Card')]");

	public By Creditcard = By.xpath("//label[contains(text(),'Credit Card')]");

	public By Netbanking = By.xpath("//label[contains(text(),'Net Banking')]");

	public By Paytm = By.xpath("//img[@class='check_img']");

	public By MDSWallet = By.xpath("//label[contains(text(),'MDS Wallet')]");
	
	public By MDSWalletPOPup = By.xpath("//body/div[5]");
	
	public By MDSWalletPOPupOK = By.xpath("//button[@class='confirm']");
	
	public By CashonDeliveryText = By.xpath("//label[contains(text(),'Cash on Delivery')]");

	public By CashonDeliveryradio = By.xpath(".//*[@id='p-3 checkbox8']");

	public By CouponCode = By.xpath(".//*[@id='coupon']");

	public By CouponApply = By.xpath(".//*[@id='discount_submit']");

	public By Placeorder = By.xpath(".//*[@id='checkout']");

	public By PopUpSaveMsg = By.xpath("//h2/span");

	public By PopUpMsg = By.xpath("//body/div[9]/p[1]");

	public By Willpayonline = By.xpath("//div[7]/button");

	public By Cashondelivery = By.xpath("//button[@class='confirm']");

	public By CartIcon = By.xpath("//a[contains(@href, 'https://mydreamstore.in/product/cart')]");
	
	//Prepaid window
	
	public By Prepaid_Creditcard = By.id("creditlink");
	
	public By Prepaid_creditcard_Visaradio = By.xpath("//img[contains(@src,'https://static.payu.in/images/visa-master_card.jpg')]");
	
	public By Prepaid_creditcard_Americanradio = By.xpath("//img[contains(@src,'https://static.payu.in/images/pay-american.jpg')]");
	
	public By Prepaid_creditcard_CardNumber = By.id("ccard_number");
	
	public By Prepaid_creditcard_NameonCard = By.id("cname_on_card");
	
	public By Prepaid_creditcard_CVV = By.id("ccvv_number");
	
	public By Prepaid_creditcard_ExpMonth = By.id("cexpiry_date_month");
	
	public By Prepaid_creditcard_ExpYear = By.id("cexpiry_date_year");
	
	public By Prepaid_creditcard_Paynow = By.id("pay_button");
	
	
	
	public By Prepaid_Debitcard = By.linkText("Debit Card");
	
	public By Prepaid_Debitcard_SelectCard = By.id("debit_card_select");
	
	public By Prepaid_Debitcard_Paynow = By.className("debit_pay_button custom_colorLfWbr5");
	
public By Prepaid_Debitcard_CardNumber = By.id("dcard_number");
	
	public By Prepaid_Debitcard_NameonCard = By.id("dname_on_card");
	
	public By Prepaid_Debitcard_CVV = By.id("dcvv_number");
	
	public By Prepaid_Debitcard_ExpMonth = By.id("dexpiry_date_month");
	
	public By Prepaid_Debitcard_ExpYear = By.id("dexpiry_date_year");
	

	
	public By Prepaid_Netbanking = By.linkText("Net Banking");
	
	public By Prepaid_Netbanking_HDFCradio = By.id("custom-label");
	
	public By Prepaid_Netbanking_ICICIradio = By.xpath("//div[@id='bank-rect-id-2']/label");
	
	public By Prepaid_Netbanking_SelectbankDD = By.id("netbanking_select");
	
	public By Prepaid_Netbanking_DispayedText = By.xpath("//div[@id='content']/div");
	
	public By Prepaid_Netbanking_Paynow = By.xpath("//div[@id='netbanking']/div[3]/input");
	
	
		
	public By Prepaid_Tez = By.id("tezlink");
	
	public By Prepaid_Tez_UPIfield = By.id("tez_vpa");
	
	public By Prepaid_Tez_bank = By.id("vpa-bank");
	
	
	
	public By Prepaid_UPI = By.linkText("UPI");
	
	public By Prepaid_UPI_UPIfield = By.xpath(".//*[@id='vpa']");
	
	
	
	public By Prepaid_lazypaylink = By.id("lazypaylink");
	
	public By Prepaid_visaCheckoutLink = By.id("visaCheckoutLink");
	
	public By Prepaid_EMI = By.linkText("EMI");
	
	public By Prepaid_EMI_text = By.xpath("//div/div[4]/div/div");
	
	public By Prepaid_Wallets = By.linkText("Wallets");
	
	public By Prepaid_Wallets_SelectwalletDD = By.id("cash_card_select");
	
	public By Prepaid_Wallets_Paynow = By.xpath("//div[@id='cashcard']/div[3]/input[2]");
	
	public By Prepaid_PayUMoney = By.linkText("PayUMoney");
	
	
	
	public By Cart = By.xpath("//a[contains(@href, 'https://mydreamstore.in/product/cart')]");
	
	public By Remove = By.linkText("Remove");
	
	
	public By PrepaidText = By.xpath("//p[contains(text(),'Choose a payment method')]");
	
	public By OrderConfirmText = By.xpath("//h1[contains(text(),'Order Confirmation')]");
	
	public By ContinueShipping = By.linkText("Continue Shopping");
	
	
	
	
	
	
	
	
	
	
	

}
