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
//import org.openqa.selenium.Keys;
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

public class Ultra_accountManagement_demo {
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

  public void ultraSignInWPROD(String MSISDN) throws InterruptedException {
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



//@Test (priority = 1)
//public void UpData1gb_CC()  throws InterruptedException, IOException {
//	  ultraSignIn("6572478637");
//String URL = driver.getCurrentUrl();
//Assert.assertEquals(URL, "https://my.ultramobile.com/account/summary" );
//Thread.sleep(3000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
//Thread.sleep(3000);
//wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
//Thread.sleep(1000);
//takeScreenshot("preUpData");
//Thread.sleep(1000);
//String preUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
//double preUpDataAmountInt = Double.parseDouble(preUpDataAmount);
//Thread.sleep(3000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_UpData())).click();
//Thread.sleep(1000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Updata1gb())).click();
//Thread.sleep(3000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodCC())).click();
//Thread.sleep(3000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
//Thread.sleep(20000);
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_text_purchaseConfirmation()));
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
//Thread.sleep(3000);
//driver.navigate().refresh();
//wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
//Thread.sleep(3000);
//wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
//Thread.sleep(1000);
//takeScreenshot("postUpData");
//String postUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
//double postUpDataAmountInt = Double.parseDouble(postUpDataAmount);
//Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 1);
//}
@Test (priority = 2)
public void UpData3gb_Wallet()  throws InterruptedException, IOException {
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
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodWallet())).click();
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
public void UpRoam5_CC()  throws InterruptedException, IOException {
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
//
//@Test (priority = 4)
//public void UpRoam10_Wallet()  throws InterruptedException, IOException {
//	 ultraSignIn("6572478637");
// Thread.sleep(1000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTLRoamingCreditCheck())).click();
// Thread.sleep(3000);
// wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance()));
// Thread.sleep(1000);
// takeScreenshot("preUpRoam");
// Thread.sleep(1000);
// String preUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance())).getText();
// int preUpRoamAmountInt = Integer.parseInt(preUpRoamAmount);
// Thread.sleep(1000);
// Thread.sleep(1000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_UpRoam())).click();
// Thread.sleep(1000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTL$10())).click();
// Thread.sleep(3000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodWallet())).click();
// Thread.sleep(3000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
// Thread.sleep(10000);
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
// Thread.sleep(10000);
// driver.navigate().refresh();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_INTLRoamingCreditCheck())).click();
// Thread.sleep(3000);
// wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance()));
// Thread.sleep(1000);
// takeScreenshot("postUpRoam");
// String postUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_roamBalance())).getText();
// int postUpRoamAmountInt = Integer.parseInt(postUpRoamAmount);
// Assert.assertEquals(postUpRoamAmountInt, preUpRoamAmountInt + 10);  
//}
//
@Test (priority = 5)
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
//
@Test (priority = 6)
public void updateAccountInfo()  throws InterruptedException, IOException {
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529585"); // REPLACE
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  takeScreenshot("preAccountChanges");
	  Thread.sleep(2000);
	  driver.get("https://www.ultramobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("7143529585");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_myAccount())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_PersonalInfo())).click();
	  Thread.sleep(1000);
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
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_promo_SMS())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_submit())).click();
	  Thread.sleep(5000);
	  driver.get("https://dugtrio.ultramobile.com/");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529585"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  String Name = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_name())).getText();
	  Assert.assertEquals(Name, "UltraTest MobileTest");
	  String Email = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_email())).getText();
	  Assert.assertEquals(Email, "noemail@ultra.meTest");
	  String Notifs = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_notifs())).getText();
	  Assert.assertEquals(Notifs,
	  		"Promo:\n" + "SMS\n" + "3rd Party Promos:\n" + "Do Not Contact");

	  takeScreenshot("postAccountChanges");
}
//
//	  
//
//  
//@Test (priority = 7)
//public void prePlanChange() throws InterruptedException, IOException {
//	cloverLogIn();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529628"); //REPLACE
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
//	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
//	  Thread.sleep(1000);
//	   WebElement element = driver.findElement(By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[26]"));
//	   Actions actions = new Actions(driver);
//	   actions.moveToElement(element).click().perform();
//	  takeScreenshot("prePlanChange");
//}
//
//@Test (priority = 8)
//public void postPlanChange() throws InterruptedException, IOException {
//	ultraSignIn("7143529628"); //ABOVE
//	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_ManagePlan())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_plan$16())).click();
//	  Thread.sleep(2000);
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_SetasNextPlan())).click();
//	  Thread.sleep(5000);
//		cloverLogIn();
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529628"); 
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
//		  Thread.sleep(3000);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
//		  Thread.sleep(1000);
//		   WebElement element = driver.findElement(By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[26]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		  takeScreenshot("postPlanChange");
//		  Thread.sleep(3000);
//		  driver.get("https://www.ultramobile.com");
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
//			  Thread.sleep(3000);
//			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_ManagePlan())).click();
//			  Thread.sleep(5000);
//			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_plan$19())).click();
//			  Thread.sleep(2000);
//			  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_SetasNextPlan())).click();
//			  Thread.sleep(5000);
//}
//
//////------------------------ Suspended --------------
//@Test (priority = 9)
//public void suspendAndRestoreUser() throws InterruptedException, IOException {
//	cloverLogIn();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529637"); //REPLACE
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
//	  Thread.sleep(5000);
//	  takeScreenshot("preSuspend");
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_planINfoEdit())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_planInfo_wallet())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_planInfo_wallet_add())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_planInfo_wallet_reason())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_planInfo_wallet_reason_testing())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_wallet_amount())).click();
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_wallet_amount())).sendKeys("150.00");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_editSave())).click();
//	  Thread.sleep(10000);
//	  System.out.println("wallet");
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch())).sendKeys("api/subscribers/recharge/order/get");
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_rechargeOrderGet())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).clear();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).sendKeys("{\n" + 
//	  		"  \"createOrder\": true\n" + 
//	  		"}");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend())).click();
//	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch2())).sendKeys("api/subscribers/networksuspend");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_networkSuspendGet())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails2())).clear();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails2())).sendKeys("{\n" + 
//	  		"  \"suspendReason\": \"TEST\",\n" + 
//	  		"  \"suspendType\": \"SUSPENDED\"\n" + 
//	  		"}");
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend2())).click();
//	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
//	  Thread.sleep(3000);
//	  takeScreenshot("postSuspend");
//	  Thread.sleep(5000);
//	  driver.get("https://www.ultramobile.com");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("7143529637");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_suspendError()));
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_Reactivate())).click();
//	  Thread.sleep(7000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_paymentMethodWallet())).click();
//	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_button_purchaseNow())).click();
//	  Thread.sleep(5000);
//	  driver.get("https://dugtrio.ultramobile.com/");
//	  Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7143529637"); 
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
//		  Thread.sleep(5000);
//		  takeScreenshot("accountRestore");
//		  Thread.sleep(1000);
//}
	 
	 
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

