package TestCases;

import org.testng.annotations.Test;


import Object_Repository.Ultra_activations_Page;
import Object_Repository.Ultra_homepage_Page;

import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.By;
// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
// import org.openqa.selenium.support.ui.Select;


public class Ultra_Automation_Showcase {
	public WebDriver driver;
	public WebDriverWait wait;
	Ultra_activations_Page hpp = new Ultra_activations_Page(driver);
	Ultra_homepage_Page haa = new Ultra_homepage_Page(driver);
	

  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }
  
  // Activation (1)
	 @Test (priority =1)
	 public void ultraPurpleActivate_3Mo3GB()throws InterruptedException {
		  driver.get("https://www.slack.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.slack_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.slack_email_Address())).sendKeys("qatester@ultra.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_Available())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.getICCID_PurpleSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_Brand())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_AUTOMATIONUltra())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);
		 String CopyICCID =  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_textbox_GetICCID())).getText();
		 String substr = "";
		 substr = CopyICCID.substring(13,19);
		 driver.manage().deleteAllCookies();
		  driver.get("https://www.ultramobile.com");	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_Activate())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_image_PurpleSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_textbox_ICCID())).sendKeys(CopyICCID);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_button_StartActivation())).click();
		  Thread.sleep(3000);
		  String GettingStartedText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_Activations_GettingStarted())).getText();
		  Assert.assertEquals(GettingStartedText, "Getting Started");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_InputZipCode())).sendKeys("92626");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_plan_3Mo3Gb())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_ActivateaNewNumber())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_Checkbox())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signActivation_button_ProceedActivation())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_FirstName())).sendKeys("Ultra");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_LastName())).sendKeys("Mobile");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_Email())).sendKeys("noemail@ultra.me");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_UserName())).sendKeys("Test" + substr);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_Password())).sendKeys("Testing1!");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_ConfirmPassword())).sendKeys("Testing1!");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_SubmitInfo())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_CreditCard())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_CreditCard())).sendKeys("4111 1111 1111 1111");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_CVV())).sendKeys("123");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_ExpDate())).sendKeys("01/30");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraBillingInfo_textbox_FirstName())).sendKeys("Ultra");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraBillingInfo_textbox_LastName())).sendKeys("Test");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_Address())).sendKeys("1550 Scenic Ave");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_Address2())).sendKeys("Suite 100");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_City())).sendKeys("Costa Mesa");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_State())).sendKeys("CA");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_ZipCode())).sendKeys("92626");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_CCContinue())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_ChargeCC())).click();
		  Thread.sleep(60000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_button_StartActivation())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_text_Complete()));
		  Thread.sleep(5000);
		  
	 }  
	 
	// Links Test Show case Only (2)
		  @Test(priority=2)
		  public void ultraLinks() throws InterruptedException {
			  driver.get("https://www.ultramobile.com");
			  Thread.sleep(3000); 
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).click(); 
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Phones())).click(); 
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraPhones_BuyANewOne())).click(); 
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_INTL())).click(); 
			  Thread.sleep(3000);
			  String ultraINTLPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraINTLpage_text_English())).getText();
			  Assert.assertEquals(ultraINTLPage_text, "Connecting friends and family worldwide");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_StoreLocator())).click(); 
			  Thread.sleep(3000);
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/store-locator/" );
			  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraCoveragePage_text_English())).getText();
//			  Assert.assertEquals(ultraStoreLocatorPage_text, "Test");
			  Assert.assertEquals(ultraStoreLocatorPage_text, "Find Ultra Near You");
		  }
	  
// Account Management Sign In (3)
	  @Test(priority=3)
	  public void ultraSignIn() throws InterruptedException {
		  driver.get("https://www.ultramobile.com");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("5625215053");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Camille1!");
		  String textSignInViaSMS = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignInViaSMS())).getText();
		  Assert.assertEquals(textSignInViaSMS , "SMS a Password to My Device");   
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
		  Thread.sleep(1000);
		  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
		  Assert.assertEquals(AccountManagementText, "My Plan");
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
	  }
	// Change Language Setting (4&5)
		  @Test(priority=4)
		  public void ultraLanguageSettingSpanish() throws InterruptedException {
			  driver.get("https://www.ultramobile.com");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHeader_dropdown_Lang_English())).click();
			  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHeader_dropdown_Lang_Spanish())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHomePage_text_Spanish()));
		  Thread.sleep(1000);
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://www.ultramobile.com/es/" );
		  }
		  
		  
		  @Test(priority=5)
		  public void ultraLanguageSettingChinese() throws InterruptedException {
			  driver.get("https://www.ultramobile.com");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHeader_dropdown_Lang_English())).click();
			  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHeader_dropdown_Lang_Chinese())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(haa.ultraHomePage_text_Chinese()));
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://www.ultramobile.com/zh/" );
	 }

	 
	 @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
