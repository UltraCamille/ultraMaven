package TestCases;

import org.testng.annotations.Test;


import Object_Repository.Ultra_activations_Page;
import Object_Repository.Ultra_homepage_Page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ultra_activations_TestforSubs {
	public WebDriver driver;
	public WebDriverWait wait;
	Ultra_activations_Page maa = new Ultra_activations_Page(driver);
	Ultra_homepage_Page hpp = new Ultra_homepage_Page(driver);


	  @BeforeMethod
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		  driver = new ChromeDriver();
		  wait = new WebDriverWait(driver,10);
		  
	  }
	  public void ultraPurpleActivate_19()throws InterruptedException {
		  driver.get("https://www.slack.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_email_Address())).sendKeys("qatester@ultra.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Available())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_PurpleSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Brand())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_AUTOMATIONUltra())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);
		 String CopyICCID =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetICCID())).getText();
		 String substr = "";
		 substr = CopyICCID.substring(13,19);
		 driver.manage().deleteAllCookies();
		  driver.get("https://www.ultramobile.com");	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_Activate())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_image_PurpleSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_textbox_ICCID())).sendKeys(CopyICCID);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_button_StartActivation())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_skipDeviceCheck())).click();
		  String GettingStartedText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_Activations_GettingStarted())).getText();
		  Assert.assertEquals(GettingStartedText, "Getting Started");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_InputZipCode())).sendKeys("92626");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_plan_19())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_ActivateaNewNumber())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_Checkbox())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.signActivation_button_ProceedActivation())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_FirstName())).sendKeys("Ultra");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_LastName())).sendKeys("Mobile");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_Email())).sendKeys("noemail@ultra.me");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_UserName())).sendKeys("Test" + substr);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_Password())).sendKeys("Test123!");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_ConfirmPassword())).sendKeys("Test123!");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_SubmitInfo())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_CreditCard())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_CreditCard())).sendKeys("4111 1111 1111 1111");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_CVV())).sendKeys("123");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_ExpDate())).sendKeys("01/30");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraBillingInfo_textbox_FirstName())).sendKeys("Ultra");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraBillingInfo_textbox_LastName())).sendKeys("Test");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_Address())).sendKeys("1550 Scenic Ave");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_Address2())).sendKeys("Suite 100");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_City())).sendKeys("Costa Mesa");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_State())).sendKeys("CA");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_ZipCode())).sendKeys("92626");
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_CCContinue())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_ChargeCC())).click();
		  Thread.sleep(30000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_button_StartActivation())).click();
		  Thread.sleep(180000);
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText().equals("Activation In Progress")) {
			  Thread.sleep(120000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText().equals("Activation In Progress")) {
			  Thread.sleep(120000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText().equals("Activation In Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText().equals("Activation In Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText().equals("Activation In Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};

	}  

	 @Test (priority = 1)
	 public void User1() throws InterruptedException, IOException {
		 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 1. " + activatedSubMSISDN);
	 }
	 @Test (priority = 2)
	 public void User2() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 2. " + activatedSubMSISDN);
	 }
	 @Test (priority = 3)
	 public void User3() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 3. " + activatedSubMSISDN);
	 }
	 @Test (priority = 4)
	 public void User4() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 4. " + activatedSubMSISDN);
	 }
	 @Test (priority = 5)
	 public void User5() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 5. " + activatedSubMSISDN);
	 }
	 
	 @Test (priority = 6)
	 public void User6() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 6. " + activatedSubMSISDN);
	 }
	 
	 @Test (priority = 7)
	 public void User7() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 7. " + activatedSubMSISDN);
	 }
	 @Test (priority = 9)
	 public void User9() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 9. " + activatedSubMSISDN);
	 }
	 
	 @Test (priority = 8)
	 public void User8() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 8. " + activatedSubMSISDN);
	 }
	 
	 @Test (priority = 10)
	 public void User10() throws InterruptedException, IOException {
	 ultraPurpleActivate_19();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.Ultramobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  System.out.println("Ultra 19 - 10. " + activatedSubMSISDN);
	 }
	 
	 
	

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
