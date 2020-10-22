package TestCases;

import org.testng.annotations.Test;
import Object_Repository.Clov3rDugtrio_Page;
import Object_Repository.Ultra_activations_Page;
import Object_Repository.Ultra_homepage_Page;
//import org.testng.annotations.BeforeMethod;
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
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Ultra_accountManagement_teamDemo {
	public static WebDriver driver;
	public WebDriverWait wait;
	Ultra_homepage_Page hpp = new Ultra_homepage_Page(driver);
	Clov3rDugtrio_Page cd = new Clov3rDugtrio_Page(driver);
	Ultra_activations_Page maa = new Ultra_activations_Page(driver);


  @BeforeClass
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


@Test (priority = 2)
public void UpData1gb_Wallet()  throws InterruptedException, IOException {
	  ultraSignIn("6573217720");
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
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Updata1gb())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_paymentMethodWallet())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_purchaseNow())).click();
Thread.sleep(50000);
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(9000);
driver.navigate().refresh();
wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_DataCheck())).click();
Thread.sleep(3000);
wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData()));
Thread.sleep(1000);
takeScreenshot("postUpData");
String postUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraAM_text_4GData())).getText();
double postUpDataAmountInt = Double.parseDouble(postUpDataAmount);
Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 1);

}

@Test (priority = 3)
public void UpRoam5_CC()  throws InterruptedException, IOException {
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
 Thread.sleep(20000);
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraAM_button_Home())).click();
 Thread.sleep(20000);
 driver.navigate().refresh();
 Thread.sleep(3000);
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

@Test (priority = 5)
public void UpWallet()  throws InterruptedException, IOException {
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

@Test (priority = 6)
public void updateAccountInfo()  throws InterruptedException, IOException {
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6573217720"); // REPLACE
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  takeScreenshot("preAccountChanges");
	  Thread.sleep(2000);
	  driver.get("https://www.ultramobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_button_SignIn())).click();
	  Thread.sleep(3000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("6573217720");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
//	  Thread.sleep(20000);
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
	  driver.get("https://dugtrio.ultramobile.com/");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6573217720"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  String Name = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_name())).getText();
	  Assert.assertEquals(Name, "UltraTest MobileTest");
	  takeScreenshot("postAccountChanges");
}

	 
  @AfterClass
  public void tearDown() {
		driver.quit();
  }

}

