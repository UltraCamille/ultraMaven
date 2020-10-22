package TestCases;

import org.testng.annotations.Test;
import Object_Repository.Clov3rDugtrio_Page;
import Object_Repository.Ultra_activations_Page;
import Object_Repository.Ultra_homepage_Page;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import java.awt.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.*;
//import com.google.common.base.Function;
//import com.google.common.base.Predicate;
//import Selenium.utils.*;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
////import java.util.Iterator;
//import java.util.List; 
//---
//import java.util.Properties;
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;

public class Ultra_accountManagement_CC {
	public static WebDriver driver;
	public WebDriverWait wait;
	Ultra_homepage_Page hpp = new Ultra_homepage_Page(driver);
	Clov3rDugtrio_Page cd = new Clov3rDugtrio_Page(driver);
	Ultra_activations_Page maa = new Ultra_activations_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  driver.manage().window().maximize();
	  
  }


  
  public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/camillemonzon/eclipse-workspace/ultraMobile/src/TestCases/ultraAMAutomation/"+fileName+".jpg"));
  }
  
  public void cloverLogIn() throws InterruptedException {
  driver.get("https://dugtrio.ultramobile.com/");
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_signIn())).click();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_inputEmail())).sendKeys("camille@ultra.me");
  Thread.sleep(5000);
  WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
  Thread.sleep(2000); 
  WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  Actions actions = new Actions(driver);
  actions.moveToElement(element).click().perform();
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_enterPassword())).sendKeys("Camille1!!"); 
  Thread.sleep(5000);
  WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
  Thread.sleep(2000); 
  WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  actions.moveToElement(element3).click().perform();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_continueWithGoogle()));
  Thread.sleep(5000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_continueWithGoogle())).click();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_profile())).click();
  Thread.sleep(10000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input()));
  String URL = driver.getCurrentUrl();
  Assert.assertEquals(URL, "https://dugtrio.ultramobile.com/" );
  Thread.sleep(2000);
}
  
  public void ultraSignIn(String MSISDN) throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys(MSISDN);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(5000);
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
}
  
  public void ultraSignInOld(String MSISDN) throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
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
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_Password())).sendKeys("Testing1!");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraActivation_textbox_ConfirmPassword())).sendKeys("Testing1!");
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
  
  public void ultraOrangeActivate_19()throws InterruptedException {
	  driver.get("https://www.slack.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
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
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.getICCID_OrangeSim())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_Brand())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_PRODUltra())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
	  Thread.sleep(3000);
	  Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"));
	  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"))).build().perform();
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_plan19_Type())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_InitialProductID())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_plan19_ID())).click();
	   Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.getICCID_button_GetICCID())).click();
	  Thread.sleep(3000);
	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
	 String substr = "";
	 substr = CopyActCode.substring(5,11);
	 driver.manage().deleteAllCookies();
	  Thread.sleep(3000);
	  driver.get("https://www.ultramobile.com");	
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_Activate())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_image_OrangeSim())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultra_textbox_ActCode())).sendKeys(CopyActCode);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_button_StartActivation())).click();
	  Thread.sleep(3000);
	  String GettingStartedText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_Activations_GettingStarted())).getText();
	  Assert.assertEquals(GettingStartedText, "Getting Started");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_textbox_InputZipCode())).sendKeys("92626");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_ActivateaNewNumber())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraActivation_button_Checkbox())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signActivation_button_ProceedActivation())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.ultraBillingInto_Link_Skip())).click();
	  Thread.sleep(3000);  
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
	  Thread.sleep(60000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultra_button_StartActivation())).click();
	  Thread.sleep(120000);
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
public void UpData1gb()  throws InterruptedException, IOException {
		  ultraSignIn("6572478637");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
	  Thread.sleep(1000);
	  takeScreenshot("preUpData");
	  Thread.sleep(1000);
	  System.out.println("screenshot");
	  String preUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
	  double preUpDataAmountInt = Double.parseDouble(preUpDataAmount);
	  System.out.println("preupdataamount");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_UpData())).click();
	  Thread.sleep(1000);
	  System.out.println("Updata");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Updata1gb())).click();
	  Thread.sleep(3000);
	  System.out.println("Updata1gb");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  System.out.println("Methodwallet");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  System.out.println("purchaseNow");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
	  Thread.sleep(3000);
	  System.out.println("Home");
	  driver.navigate().refresh();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
	  Thread.sleep(3000);
	  System.out.println("Dastacheck");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
	  Thread.sleep(1000);
	  takeScreenshot("postUpData");
	  String postUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
	  double postUpDataAmountInt = Double.parseDouble(postUpDataAmount);
	  Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 1);
}
@Test (priority = 2)
public void UpData3gb()  throws InterruptedException, IOException {
	  ultraSignIn("6572478637");
String URL = driver.getCurrentUrl();
Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
Thread.sleep(1000);
takeScreenshot("preUpData");
Thread.sleep(1000);
String preUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
double preUpDataAmountInt = Double.parseDouble(preUpDataAmount);
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_UpData())).click();
Thread.sleep(1000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Updata3gb())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodCC())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
Thread.sleep(10000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
Thread.sleep(3000);
driver.navigate().refresh();
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
Thread.sleep(1000);
takeScreenshot("postUpData");
String postUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
double postUpDataAmountInt = Double.parseDouble(postUpDataAmount);
Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 3);

}

@Test (priority = 3)
public void UpRoam()  throws InterruptedException, IOException {
		 ultraSignIn("6572478637");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTLRoamingCreditCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance()));
	  Thread.sleep(1000);
	  takeScreenshot("preUpRoam");
	  Thread.sleep(1000);
	  String preUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance())).getText();
	  int preUpRoamAmountInt = Integer.parseInt(preUpRoamAmount);
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_UpRoam())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTL$5())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
	  Thread.sleep(10000);
	  driver.navigate().refresh();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTLRoamingCreditCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance()));
	  Thread.sleep(1000);
	  takeScreenshot("postUpRoam");
	  String postUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance())).getText();
	  int postUpRoamAmountInt = Integer.parseInt(postUpRoamAmount);
	  Assert.assertEquals(postUpRoamAmountInt, preUpRoamAmountInt + 5);  
}

@Test (priority = 4)
public void UpWallet()  throws InterruptedException, IOException {
		 ultraSignIn("6572478637");
	  Thread.sleep(1000);
	  takeScreenshot("preUpWallet");
	  Thread.sleep(1000);
	  String preUpWalletAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_amount_wallet())).getText();
	  int preUpWalletAmountInt = Integer.parseInt(preUpWalletAmount);
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_LoadWallet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_wallet$5())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  takeScreenshot("postUpRoam");
	  String postUpWalletAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_amount_wallet())).getText();
	  int postUpWalletAmountInt = Integer.parseInt(postUpWalletAmount);
	  Assert.assertEquals(postUpWalletAmountInt, preUpWalletAmountInt + 5);  
}

  @Test (priority = 5)
  public void updateAccountInfo()  throws InterruptedException, IOException {
  	ultraPurpleActivate_19();
  	 String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
  	cloverLogIn();
  	  Thread.sleep(1000);
  	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
  	  Thread.sleep(1000);
  	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
  	  Thread.sleep(3000);
  	  takeScreenshot("preAccountChanges");
  	  Thread.sleep(2000);
  	  driver.get("https://www.ultramobile.com");
  	  Thread.sleep(1000);
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
  	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
  	  Thread.sleep(3000);
  	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_myAccount())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_PersonalInfo())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_firstName())).sendKeys("Test");
  		  Thread.sleep(1000);
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_lastName())).sendKeys("Test"); 
  		  Thread.sleep(1000);
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_email())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_email())).sendKeys("Test"); 
  		  Thread.sleep(1000);
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_password())).sendKeys("Success123!"); 
  		  Thread.sleep(1000);
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_textbox_passwordConfirm())).sendKeys("Success123!"); 
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
  		  Thread.sleep(5000);
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Preferences())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_promo_emails())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_promo_phoneCalls())).click();
  		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
  		  Thread.sleep(5000);
  		  driver.get("https://dugtrio.ultramobile.com/");
  		  Thread.sleep(3000);
  		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
  		  Thread.sleep(1000);
  		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
  		  Thread.sleep(3000);
  		  String Name = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_name())).getText();
  		  Assert.assertEquals(Name, "UltraTest MobileTest");
  		  String Email = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_email())).getText();
  		  Assert.assertEquals(Email, "noemail@ultra.meTest");
  		  String Notifs = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_notifs())).getText();
  		  Assert.assertEquals(Notifs, "Promo:\n" + 
  		  		"SMS");
  		  takeScreenshot("postAccountChanges");
  }

	  

  
@Test (priority = 6)
public void prePlanChange() throws InterruptedException, IOException {
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6573759441"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
	  Thread.sleep(1000);
	  takeScreenshot("prePlanChange");
}

@Test (priority = 7)
public void postPlanChange() throws InterruptedException, IOException {
	ultraSignIn("6573759441");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_ManagePlan())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_plan$16())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_SetasNextPlan())).click();
	  Thread.sleep(5000);
		cloverLogIn();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6573759441"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
		  Thread.sleep(1000);
		  takeScreenshot("postPlanChange");
		  Thread.sleep(3000);
		  driver.get("https://www.ultramobile.com");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_ManagePlan())).click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_plan$19())).click();
			  Thread.sleep(2000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_SetasNextPlan())).click();
			  Thread.sleep(5000);
}

//------------------------ Suspended --------------
@Test (priority = 8)
public void suspendAndRestoreUser() throws InterruptedException, IOException {
	ultraPurpleActivate_19();
String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
Thread.sleep(1000);
System.out.println("SuspendTestMSISDN" + activatedSubMSISDN);
System.out.println("activate");
	cloverLogIn();
	  System.out.println("cloverlogin");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(5000);
	  takeScreenshot("preSuspend");
	  System.out.println("search");
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch())).sendKeys("api/subscribers/recharge/order/get");
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_rechargeOrderGet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).clear();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).sendKeys("{\n" + 
	  		"  \"createOrder\": true\n" + 
	  		"}");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch())).sendKeys("api/subscribers/networksuspend");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_networkSuspendGet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails2())).clear();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails2())).sendKeys("{\n" + 
	  		"  \"suspendReason\": \"TEST\",\n" + 
	  		"  \"suspendType\": \"SUSPENDED\"\n" + 
	  		"}");
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend2())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  takeScreenshot("postSuspend");
	  Thread.sleep(5000);
	  driver.get("https://www.ultramobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_checkbox_terms())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();	
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_suspendError()));
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_Reactivate())).click();
	  Thread.sleep(7000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_purchaseNow())).click();
	  Thread.sleep(5000);
	  driver.get("https://dugtrio.ultramobile.com/");
	  Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(5000);
		  takeScreenshot("accountRestore");
		  Thread.sleep(1000);
}



// --------------------------- Email Sending -------------------------
  
//  public class SendMailSSLWithAttachment {
//	  
//		public void main(String[] args) {
//	 
//			// Create object of Property file
//			Properties props = new Properties();
//	 
//			// this will set host of server- you can change based on your requirement 
//			props.put("mail.smtp.host", "smtp.gmail.com");
//	 
//			// set the port of socket factory 
//			props.put("mail.smtp.socketFactory.port", "465");
//	 
//			// set socket factory
//			props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//	 
//			// set the authentication to true
//			props.put("mail.smtp.auth", "true");
//	 
//			// set the port of SMTP server
//			props.put("mail.smtp.port", "465");
//	 
//			// This will handle the complete authentication
//			Session session = Session.getDefaultInstance(props,
//	 
//					new javax.mail.Authenticator() {
//	 
//						protected PasswordAuthentication getPasswordAuthentication() {
//	 
//						return new PasswordAuthentication("camille@ultra.me", "Camille1!!");
//	 
//						}
//	 
//					});
//	 
//			try {
//	 
//				// Create object of MimeMessage class
//				Message message = new MimeMessage(session);
//	 
//				// Set the from address
//				message.setFrom(new InternetAddress("camille@ultra.me"));
//	 
//				// Set the recipient address
//				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("kulitmaides@gmail.com"));
//	            
//	                        // Add the subject link
//				message.setSubject("ultra VF Test Report");
//	 
//				// Create object to add multimedia type content
//				BodyPart messageBodyPart1 = new MimeBodyPart();
//	 
//				// Set the body of email
//				messageBodyPart1.setText("This is message body");
//	 
//				// Create another object to add another content
//				MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//	 
//				// Mention the file which you want to send
//				String filename = "/Users/camillemonzon/eclipse-workspace/ultraMobile/test-output/emailable-report.html";
//	 
//				// Create data source and pass the filename
//				DataSource source = new FileDataSource(filename);
//	 
//				// set the handler
//				messageBodyPart2.setDataHandler(new DataHandler(source));
//	 
//				// set the file
//				messageBodyPart2.setFileName(filename);
//	 
//				// Create object of MimeMultipart class
//				Multipart multipart = new MimeMultipart();
//	 
//				// add body part 1
//				multipart.addBodyPart(messageBodyPart2);
//	 
//				// add body part 2
//				multipart.addBodyPart(messageBodyPart1);
//	 
//				// set the content
//				message.setContent(multipart);
//	 
//				// finally send the email
//				Transport.send(message);
//	 
//				System.out.println("=====Email Sent=====");
//	 
//			} catch (MessagingException e) {
//	 
//				throw new RuntimeException(e);
//	 
//			}
//	 
//		}
//	 
//	}


  

	 
//	 @Test (priority = 2)
//	 public void SendMailSSLWithAttachment()  throws InterruptedException, IOException {
//		 SendMailSSLWithAttachment();
//	 }
	 
	 
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

