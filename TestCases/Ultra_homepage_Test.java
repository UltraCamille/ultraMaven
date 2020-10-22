package TestCases;

import org.testng.annotations.Test;


import Object_Repository.Ultra_homepage_Page;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ultra_homepage_Test {
//	private static final String URL = null;
	public WebDriver driver;
	public WebDriverWait wait;
	Ultra_homepage_Page hpp = new Ultra_homepage_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }
  
  
  @Test(priority=1)
  public void ultraLanguageSettingEnglish() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_dropdown_Lang_English())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHomePage_text_English()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/" );
  }
	  
	  @Test(priority=2)
	  public void ultraLanguageSettingSpanish() throws InterruptedException {
		  driver.get("https://www.ultramobile.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_dropdown_Lang_English())).click();
		  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_dropdown_Lang_Spanish())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHomePage_text_Spanish()));
	  Thread.sleep(1000);
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/es/" );
	  }
	  
	  
	  @Test(priority=3)
	  public void ultraLanguageSettingChinese() throws InterruptedException {
		  driver.get("https://www.ultramobile.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_dropdown_Lang_English())).click();
		  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHeader_dropdown_Lang_Chinese())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHomePage_text_Chinese()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/zh/" );
  }
  
  @Test(priority=4)
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
	  
	  
	 @Test(priority=5)
	 public void ultraMenuLinksPlansPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).click(); 
	  Thread.sleep(1000);
	  String PlansPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPlansPage_text_English())).getText();
	  Assert.assertEquals(PlansPageEnglishText, "Multi-Month Plans");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/plans/" );
	  
	 }
	 @Test(priority=6)
	 public void ultraMenuLinksUltraLogo() {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_image_Logo())).click(); 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraHomePage_text_English()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/" );
	 }
	 
	 @Test(priority=7)
	 public void ultraMenuLinksPhonesPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Phones())).click(); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPhones_BuyANewOne())).click(); 
	  Thread.sleep(1000);
	  String ultraPhonesPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPhonesPage_text())).getText();
	  Assert.assertEquals(ultraPhonesPage_text, "Phones");
	 }
	 
//	 @Test(priority=8)
//	 public void ultraMenuLinksTabletsPage() throws InterruptedException {
//	  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPhonesPage_button_Tablet())).click(); 
//	  Thread.sleep(1000);
//	  String ultraTabletsPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraTabletsPage_text())).getText();
//	  Assert.assertEquals(ultraTabletsPage_text, "Tablets");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://phones.ultramobile.com/tablets.html" );
//	 }
	 
	 @Test(priority=9)
	 public void ultraMenuLinksINTLPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_INTL())).click(); 
	  Thread.sleep(1000);
	  String ultraINTLPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraINTLpage_text_English())).getText();
	  Assert.assertEquals(ultraINTLPage_text, "Connecting friends and family worldwide");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/international-calling/" );
	 }
	 @Test(priority=10)
	 public void ultraMenuLinksCoveragePage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Coverage())).click(); 
	  Thread.sleep(1000);
	  String ultraCoveragePage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCoveragePage_text_English())).getText();
	  Assert.assertEquals(ultraCoveragePage_text, "Find Ultra Near You");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/coverage/" );
	 }
	 
	 @Test(priority=11)
	 public void ultraMenuLinksStoreLocatorPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_StoreLocator())).click(); 
	  Thread.sleep(1000);
	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCoveragePage_text_English())).getText();
	  Assert.assertEquals(ultraStoreLocatorPage_text, "Find Ultra Near You");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/store-locator/" );
	 }
	 
	 @Test(priority=12)
	 public void ultraMenuLinksFAQPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_dropdown_Help())).click(); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraMenu_image_FAQ())).click(); 
	  Thread.sleep(1000);
	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFAQPage_text_English())).getText();
	  Assert.assertEquals(ultraStoreLocatorPage_text, "Have Questions? We Have Answers.");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/faq/" );
	  
	 }
	 
	 @Test(priority=13)
	 public void ultraMenuLinksSupportPage() throws InterruptedException {
	  driver.get("https://www.ultramobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_dropdown_Help())).click(); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraMenu_image_Support())).click(); 
	  Thread.sleep(1000);
	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraSupportPage_text_English())).getText();
	  Assert.assertEquals(ultraStoreLocatorPage_text, "Support");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.ultramobile.com/support/" );
	 }
	 
//	  @Test(priority=14)
//	  public void ultraHomeINTLRates() throws InterruptedException {
//		  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_textbox_IntlRates())).sendKeys("Korea");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_Korea()));
//	  Thread.sleep(1000);
//	  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_textbox_IntlRates())).sendKeys("INDIA");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_India()));
//	  Thread.sleep(1000);
//	  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_textbox_IntlRates())).sendKeys("Philippines");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_Philippines()));
//	  Thread.sleep(1000);
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.ultramobile.com/" );
//	  }
	  
		 
	  @Test(priority=15)
	  public void ultraFooterPhonespage() throws InterruptedException{
	   driver.get("https://ultramobile.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_Phones())).click(); 
		  String ultraPhonesPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPhonesPage_text())).getText();
		  Assert.assertEquals(ultraPhonesPage_text, "Phones");
	  }
		 

	  @Test(priority=16)
	  public void ultraFooterPlansPage() throws InterruptedException{
	   driver.get("https://ultramobile.com");
	   Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_Plans())).click(); 
		  String PlansPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraPlansPage_text_English())).getText();
		  Assert.assertEquals(PlansPageEnglishText, "Multi-Month Plans");
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://www.ultramobile.com/plans/" );
	  }
		 
	  
	  @Test(priority=17)
	  public void ultraFooterTabletsPage() throws InterruptedException{
	   driver.get("https://ultramobile.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_Tablets())).click(); 
		  String ultraTabletsPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
		  Assert.assertEquals(ultraTabletsPage_text, "Plans");
//		  String URL = driver.getCurrentUrl();
//		  Assert.assertEquals(URL, "https://phones.ultramobile.com/tablets.html" );
	  }
		 
	  @Test(priority=18)
	  public void ultraFooterFAQ() throws InterruptedException{
	   driver.get("https://ultramobile.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_FAQ())).click(); 
		  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFAQPage_text_English())).getText();
		  Assert.assertEquals(ultraStoreLocatorPage_text, "Have Questions? We Have Answers.");
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://www.ultramobile.com/faq/" );
	  }
		 
		  @Test(priority=19)
		  public void ultraFooterFlexPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_Flex())).click(); 
			  String FlexPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFlexPage_text_English())).getText();
			  Assert.assertEquals(FlexPageEnglishText, "FEATURES");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/flex/" );
		  }
		 
		  @Test(priority=20)
		  public void ultraFooterTouristPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFooter_button_Tourist())).click(); 
			  String TouristPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraTouristPage_text_English())).getText();
			  Assert.assertEquals(TouristPageEnglishText, "The Tourist Plan is available at select T-Mobile locations");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/tourist/" );
		  }
		 
//		  @Test(priority=21)
//		  public void ultraFooterPayGoPage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'PayGo')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'PayGo')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String PayGoPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(PayGoPageEnglishText, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/paygo/" );
//		  }
		 
		  @Test(priority=22)
		  public void ultraFooterFeaturesPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Features')])[2]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Features')])[2]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String FeaturesPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraFeaturesPage_text_English())).getText();
			  Assert.assertEquals(FeaturesPageEnglishText, "International Roaming");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/international-roaming/" );
		  }

		  @Test(priority=23)
		  public void ultraFooterCallChinaPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Call China')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Call China')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String CallChinaPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCallChinaPage_text_English())).getText();
			  Assert.assertEquals(CallChinaPageEnglishText, "FREE calling to China");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/call-china/" );
		  }
		  @Test(priority=24)
		  public void ultraFooterCallMexicoPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Call Mexico')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Call Mexico')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String CallMexicoPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCallMexicoPage_text_English())).getText();
			  Assert.assertEquals(CallMexicoPageEnglishText, "FREE calling to Mexico");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/call-mexico/" );
		  }  
		  @Test(priority=25)
		  public void ultraFooterCallIndiaPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Call India')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Call India')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String CallIndiaPageEnglishText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCallIndiaPage_text_English())).getText();
			  Assert.assertEquals(CallIndiaPageEnglishText, "FREE calling to India");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/call-india/" );
		  }
		  
		  @Test(priority=26)
		  public void ultraFooterRAFPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Refer A Friend')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Refer A Friend')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String ultraRAF_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraRAF_text_English())).getText();
			  Assert.assertEquals(ultraRAF_text_English, "How It Works");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/refer/" );
		  }
		  @Test(priority=27)
		  public void ultraFooterCareersPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String ultraCareers_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraCareers_text_English())).getText();
			  Assert.assertEquals(ultraCareers_text_English, "View Our Openings");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/careers/" );
		  }
		  @Test(priority=28)
		  public void ultraFooterIOTSolutionsPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'IOT Solutions')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'IOT Solutions')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String ultraIoT_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraIoT_text_English())).getText();
			  Assert.assertEquals(ultraIoT_text_English, "Simplifi");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobileiot.com/" );
		  } 
		  @Test(priority=29)
		  public void ultraFooterInTheNewsPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'In The News')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'In The News')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String ultraNews_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraNews_text_English())).getText();
			  Assert.assertEquals(ultraNews_text_English, "Ultra Mobile Newsroom");
			  String URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.ultramobile.com/newsroom/" );
		  } 
//		  @Test(priority=30)
//		  public void ultraFooterValuesPage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Ultra Values')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Ultra Values')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraValues_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraValues_text_English())).getText();
//			  Assert.assertEquals(ultraValues_text_English, "UltraMobile.com");
////			  String URL = driver.getCurrentUrl();
////			  Assert.assertEquals(URL, "https://info.ultramobile.com/values/" );
//		  } 
		  @Test(priority=31)
		  public void ultraFooterPhoneOrderStatusPage() throws InterruptedException{
		   driver.get("https://ultramobile.com");
		   Thread.sleep(5000);
	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
		   Thread.sleep(2000);
		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Phone Order Status')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Phone Order Status')]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		   Thread.sleep(5000);
			  String ultraPhoneOrderStatus_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
			  Assert.assertEquals(ultraPhoneOrderStatus_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://phones.ultramobile.com/login.php" );
		  } 
//
////		  @Test(priority=32)
////		  public void ultraFooterTandCPage() throws InterruptedException{
////		   driver.get("https://mintmobile.com");
////		   Thread.sleep(5000);
////	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
////		   Thread.sleep(2000);
////		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Plans Terms & Conditions')]"));
////		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
////		   Thread.sleep(2000); 
////		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Plans Terms & Conditions')]"));
////		   Actions actions = new Actions(driver);
////		   actions.moveToElement(element).click().perform();
////		   Thread.sleep(5000);
////			  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
////			  Assert.assertEquals(MintFooterPlansPageText, "Plans");
////			  String URL = driver.getCurrentUrl();
////			  Assert.assertEquals(URL, "https://www.ultramobile.com/mobile-plans-terms-conditions/" );
////		  }
//		  @Test(priority=33)
//		  public void ultraFooterPrivacyPolicyPage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraPrivacyPolicy_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultraPrivacyPolicy_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/privacy-policy/" );
//		  }
//		  @Test(priority=34)
//		  public void ultraFooterAcceptableUsePolicyPage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Acceptable Use Policy')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Acceptable Use Policy')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraUsePolicy_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultraUsePolicy_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/ultra-mobile-acceptable-use-policy/" );
//		  }
//		  @Test(priority=35)
//		  public void ultraFooterSiteTermsofUsePage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Site Terms of Use')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Site Terms of Use')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraTermsofUse_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultraTermsofUse_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/site-terms-use/" );
//		  }	  
//		  @Test(priority=36)
//		  public void ultraFooter911E911Page() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'911 and E911 Disclosure')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'911 and E911 Disclosure')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultra911E911_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultra911E911_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/911-e911-disclosure/" );
//		  }	  
//		  @Test(priority=37)
//		  public void ultraFooterMTSSurchargePage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Prepaid MTS Surcharge')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Prepaid MTS Surcharge')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraSurcharge_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultraSurcharge_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/ca-mts/" );
//		  }	 
//		  @Test(priority=38)
//		  public void ultraFooterDeviceUnlockPolicyPage() throws InterruptedException{
//		   driver.get("https://ultramobile.com");
//		   Thread.sleep(5000);
//	// 	   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraDismiss())).click(); 
//		   Thread.sleep(2000);
//		   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Unlock Policy')]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		   Thread.sleep(2000); 
//		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Prepaid MTS Surcharge')]"));
//		   Actions actions = new Actions(driver);
//		   actions.moveToElement(element).click().perform();
//		   Thread.sleep(5000);
//			  String ultraSurcharge_text_English = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_button_Plans())).getText();
//			  Assert.assertEquals(ultraSurcharge_text_English, "Plans");
//			  String URL = driver.getCurrentUrl();
//			  Assert.assertEquals(URL, "https://www.ultramobile.com/ultra-mobile-device-unlock-policy/" );
//		  }	 		  
//

	  
//	@Test
//	public void ultraHomePage1GBPlan() {
//		  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_button_1GBPlan_ViewDetails())).click(); 
//	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_1GBPlan())).getText();
//	  Assert.assertEquals(ultraStoreLocatorPage_text, "1GB");
//	}
//	@Test
//	public void ultraHomePage3GBPlan() {
//		  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_button_3GBPlan_ViewDetails())).click(); 
//	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_3GBPlan())).getText();
//	  Assert.assertEquals(ultraStoreLocatorPage_text, "3GB");
//	}
//	
//	
//	@Test
//	public void ultraHomePage6GBPlan() {
//		  driver.get("https://www.ultramobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_button_6GBPlan_ViewDetails())).click(); 
//	  String ultraStoreLocatorPage_text = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_text_6GBPlan())).getText();
//	  Assert.assertEquals(ultraStoreLocatorPage_text, "6GB");
//	}
	  
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_image_Logo())).click(); 
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.homePage_button_UnliPlan_ViewDetails())).click(); 
//	  
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraMenu_image_Logo())).click(); 
//	}
	  
	  //Verify Title of Next Page - Account Management
	  
	  
	  
	  
	  
	  
  
  

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
