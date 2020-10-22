package TestCases;

import org.testng.annotations.Test;
import Object_Repository.Ultra_VF_Page;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
// import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;




public class Ultra_UMTS {
	public static WebDriver driver;
	public WebDriverWait wait;
	Ultra_VF_Page hpp = new Ultra_VF_Page(driver);


 @BeforeMethod
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	 driver = new ChromeDriver();
	 wait = new WebDriverWait(driver,10);
	 
 }
 

	 public void ultraVF_IMEIandAddress_4G(String zipcode , String address, String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
//		 String CoverageResults2 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage2())).getText();
//		 Assert.assertEquals(CoverageResults2, Coverage2);
//		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ViewPlans())).click();
//		 Thread.sleep(2000);
//		 String URL = driver.getCurrentUrl();
//		 Assert.assertEquals(URL, "https://qa.ultramobile.com//plans/" );
//		 Thread.sleep(2000);
	 }
	 public void ultraVF_IMEIandAddress_3G(String zipcode , String address, String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_ZipcodeOnly_4G(String zipcode , String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_ZipcodeOnly_3G(String zipcode , String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_AddressOnly_4G(String zipcode , String address, String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_AddressOnly_3G(String zipcode , String address, String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_IMEIandZipcode_4G(String zipcode , String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void ultraVF_IMEIandZipcode_3G(String zipcode , String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void ultraVFincompatibleZipCode (String zipcode) throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_ErrorMessage()));
		 
	 }
	 
	 
	 public void ultraVFBrandModelAddressPart1(String zipcode , String address )throws InterruptedException {
	 driver.get("https://qa.ultramobile.com/");
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
	 Thread.sleep(1000);
	 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
	 Assert.assertEquals(CheckCoverageText, "Check Coverage");
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_textbox_StreetAddress())).sendKeys(address);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
	 Thread.sleep(5000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand())).click();
	  Thread.sleep(5000);
	 }
	  
	  
	 public void ultraVFBrandModelAddressZipcodePart2_4G(String Coverage1 , String Device )throws InterruptedException {
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
	 Thread.sleep(5000);
	 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage1())).getText();
	 Assert.assertEquals(CoverageResults1, Coverage1);
	 Thread.sleep(2000);
	 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
	 Assert.assertEquals(DeviceResults, Device);
	 Thread.sleep(2000);
}
	 public void ultraVFBrandModelAddressZipcodePart2_3G(String Coverage1 , String Device )throws InterruptedException {
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	}
	 public void ultraVFBrandModelZipcodePart1(String zipcode )throws InterruptedException {
		 driver.get("https://qa.ultramobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_CheckCoverage())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "Check Coverage");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand())).click();
		  Thread.sleep(5000);
		 }


	public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/camillemonzon/eclipse-workspace/ultraMobile/src/TestCases/ultraVFScreenshots06082020/"+fileName+".jpg"));
	}
		  
		  
	 
	 
	 @Test (priority = 1)
	 public void IMEIandAddress2() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("94112", "445 Persia Ave & Mission St.", "353001091708306","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress2");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Fantastic news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 445 Persia Ave & Mission St. is excellent and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
	}
	 @Test (priority = 2)
	 public void IMEIandAddress3() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("50423", "3175 Iowa Avenue", "353001091708306","4G LTE Coverage: GOOD", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress3");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue is very good and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
	 }
	 @Test (priority = 3)
	 public void IMEIandAddress4() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("50636", "2656 290th Street", "353001091708306","4G LTE Coverage: FAIR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress4");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is fairly good, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 4)
	 public void IMEIandAddress5() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_3G("52333", "2418 Quincy Rd", "353001091708306","3G Coverage: POOR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress5");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
	 }	
	 @Test (priority = 5)
	 public void IMEIandAddress6() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("95843", "5610 Great Valley Drive", "357498082396511","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress6");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 5610 Great Valley Drive is excellent and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 @Test (priority = 6)
	 public void IMEIandAddress7() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("20176", "44008 Indian Fields Court", "357498082396511","4G LTE Coverage: GOOD", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress7");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Great news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 44008 Indian Fields Court is very good and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
		 }
	 @Test (priority = 7)
	 public void IMEIandAddress8() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("95620", "6300 Weber Rd", "357498082396511","4G LTE Coverage: FAIR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress8");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 6300 Weber Rd is fairly good, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 8)
	 public void IMEIandAddress9() throws InterruptedException, IOException {
		 ultraVF_IMEIandAddress_3G("52333", "2418 Quincy Rd", "357498082396511","3G Coverage: POOR", "COMPATIBLE");
		 takeScreenshot("IMEIandAddress9");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "Although your Samsung Galaxy S8 Plus is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
			 }	
	 @Test (priority = 9)
	 public void IMEIandAddress10() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("03842", "8 Highland Avenue", "359677098824941","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress10");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 8 Highland Avenue is excellent and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 @Test (priority = 10)
	 public void IMEIandAddress11() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("04732", "32 Blackwater Rd", "359677098824941","4G LTE Coverage: GOOD", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress11");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Great news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 32 Blackwater Rd  is very good and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
		 }
	 @Test (priority = 11)
	 public void IMEIandAddress12() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("04732", "58 Heidi Circle", "359677098824941","4G LTE Coverage: FAIR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress12");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 58 Heidi Circle is fairly good, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 12)
	 public void IMEIandAddress13() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_3G("52333", "2418 Quincy Rd", "359677098824941","3G Coverage: POOR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress13");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Google Pixel 3a is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
		 }	
	 @Test (priority = 13)
	 public void IMEIandAddress14() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("86401", "310 North 4th Street", "3515330612345678","4G LTE Coverage: EXCELLENT", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress14");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 310 North 4th Street is excellent. However, it looks like your Galaxy S4 Mini isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
	 }
	 @Test (priority = 14)
	 public void IMEIandAddress15() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("95536", "6 Centerville Rd", "3515330612345678","4G LTE Coverage: GOOD", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress15");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 6 Centerville Rd is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
	 }
	 @Test (priority = 15)
	 public void IMEIandAddress16() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("67643", "2497 J Lane", "3515330612345678","4G LTE Coverage: FAIR", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress16");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 2497 J Lane is fairly good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
	 }
	 @Test (priority = 16)
	 public void IMEIandAddress17() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_3G("52333", "2418 Quincy Rd", "3515330612345678","3G Coverage: POOR", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress17");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Unfortunately, Ultra may not be the best fit for you.");
	 }
	 @Test (priority = 17)
	 public void IMEIandAddress18() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("58564", "8564 49th Avenue Southwest", "3515330612345678","4G LTE Coverage: EXCELLENT", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress18");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 8564 49th Avenue Southwest is excellent. However, it looks like your Galaxy S4 Mini isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 18)
	 public void IMEIandAddress19() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("20176", "44008 Indian Fields Court", "3515330612345678","4G LTE Coverage: GOOD", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress19");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 44008 Indian Fields Court is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 19)
	 public void IMEIandAddress20() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_4G("59336", "300 Road 357", "3515330612345678","4G LTE Coverage: FAIR", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress20");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Good news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 300 Road 357 is fairly good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 20)
	 public void IMEIandAddress21() throws InterruptedException, IOException {
	 ultraVF_IMEIandAddress_3G("52333", "2418 Quincy Rd", "3515330612345678","3G Coverage: POOR", "NOT COMPATIBLE");
	 takeScreenshot("IMEIandAddress21");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Unfortunately, Ultra may not be the best fit for you.");
		 }
	 @Test (priority = 20)
	 public void AddressOnly36() throws InterruptedException, IOException {
	ultraVF_AddressOnly_4G("94112", "Persia Ave & Mission St.", "4G LTE Coverage: EXCELLENT");
	 takeScreenshot("AddressOnly36");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, Persia Ave & Mission St. is excellent and your {Phone} is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 21)
	 public void AddressOnly37() throws InterruptedException, IOException {
	ultraVF_AddressOnly_4G("50423", "3175 Iowa Avenue", "4G LTE Coverage: GOOD");
	 takeScreenshot("AddressOnly37");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 22)
	 public void AddressOnly38() throws InterruptedException, IOException {
	ultraVF_AddressOnly_4G("50636", "2656 290th Street", "4G LTE Coverage: FAIR");
	 takeScreenshot("AddressOnly38");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 23)
	 public void AddressOnly39() throws InterruptedException, IOException {
	ultraVF_AddressOnly_3G("52333", "2418 Quincy Rd", "3G Coverage: POOR");
	 takeScreenshot("AddressOnly39");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header3())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 2418 Quincy Rd is poorer than we'd like to see. It doesn’t look like ultra is right for you...this is us crying now.");
	
	 }
	 @Test (priority = 24)
	 public void AddressOnly40() throws InterruptedException, IOException {
	ultraVF_AddressOnly_4G("50658", "1112 300th Street", "4G LTE Coverage: FAIR");
	 takeScreenshot("AddressOnly40");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 1112 300th Street is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 25)
	 public void AddressOnly43() throws InterruptedException, IOException {
	ultraVF_AddressOnly_3G("79040", "8580 County Road M.", "3G Coverage: POOR");
	 takeScreenshot("AddressOnly43");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Uh Oh.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 8580 County Road M. is poorer than we'd like to see. It doesn’t look like ultra is right for you...this is us crying now.");
	
	 }
	 @Test (priority = 26)
	 public void IMEIandZipcode44() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("94112", "353001091708306", "4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode44");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 94112 is excellent and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 27)
	 public void IMEIandZipcode45() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("79059", "353001091708306", "4G LTE Coverage: GOOD" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode45");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Great news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 79059  is very good and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
		 }
	 @Test (priority = 28)
	 public void IMEIandZipcode46() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86036", "353001091708306", "4G LTE Coverage: FAIR" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode46");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 29)
	 public void IMEIandZipcode48() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("95843", "357498082396511", "4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode48");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 95843 is excellent and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 30)
	 public void IMEIandZipcode49() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("95227", "357498082396511", "4G LTE Coverage: GOOD" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode49");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Great news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 95227  is very good and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
		 }
	 @Test (priority = 31)
	 public void IMEIandZipcode50() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86036", "357498082396511", "4G LTE Coverage: FAIR" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode50");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 32)
	 public void IMEIandZipcode52() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("03842", "359677098824941", "4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode52");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is excellent and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 33)
	 public void IMEIandZipcode53() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("96044", "359677098824941", "4G LTE Coverage: GOOD" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode53");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Great news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is very good and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
		 }
	 @Test (priority = 34)
	 public void IMEIandZipcode54() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86036", "359677098824941", "4G LTE Coverage: FAIR" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode54");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "Good news!");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	 }
	 @Test (priority = 35)
	 public void IMEIandZipcode56() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86401", "3515330612345678", "4G LTE Coverage: EXCELLENT" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode56");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 86401 is excellent. However, it looks like your Galaxy S4 Mini isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 36)
	 public void IMEIandZipcode57() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("96044", "3515330612345678", "4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode57");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 37)
	 public void IMEIandZipcode58() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86036", "3515330612345678", "4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode58");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Good news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 38)
	 public void IMEIandZipcode60() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("03842", "3515330612345678", "4G LTE Coverage: EXCELLENT" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode60");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is excellent. However, it looks like your Galaxy S4 Mini isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 39)
	 public void IMEIandZipcode61() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("79059", "3515330612345678", "4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode61");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 40)
	 public void IMEIandZipcode62() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_4G("86036", "3515330612345678", "4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode62");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Good news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 40)
	 public void IMEIandZipcode64() throws InterruptedException, IOException {
	ultraVF_IMEIandZipcode_3G("52772", "3515330612345680", "3G Coverage: GOOD" , "NOT COMPATIBLE");
	 takeScreenshot("IMEIandZipcode64");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Uh Oh.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 52772 is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
		 }
	 @Test (priority = 40)
	 public void ZipcodeOnly77() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("94112", "4G LTE Coverage: EXCELLENT" );
	 takeScreenshot("ZipcodeOnly77");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 94112 is excellent and your Galaxy S4 Mini is a perfect fit with our service. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 41)
	 public void ZipcodeOnly78() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("79059", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly78");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 42)
	 public void ZipcodeOnly79() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly79");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 43)
	 public void ZipcodeOnly81() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("95227", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly81");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 95227 is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 44)
	 public void ZipcodeOnly82() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly82");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 45)
	 public void ZipcodeOnly83() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("03842", "4G LTE Coverage: EXCELLENT" );
	 takeScreenshot("ZipcodeOnly83");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is excellent. let’s find you a plan.");
		}
	 
	 @Test (priority = 46)
	 public void ZipcodeOnly84() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("96044", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly84");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 47)
	 public void ZipcodeOnly85() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly85");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 48)
	 public void ZipcodeOnly86() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86401", "4G LTE Coverage: EXCELLENT" );
	 takeScreenshot("ZipcodeOnly86");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 86401 is excellent. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 49)
	 public void ZipcodeOnly87() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("96044", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly87");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 50)
	 public void ZipcodeOnly88() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly88");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 51)
	 public void ZipcodeOnly89() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("03842", "4G LTE Coverage: EXCELLENT" );
	 takeScreenshot("ZipcodeOnly89");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "Fantastic news!");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is excellent. Now let’s find the right plan for you.");
		}
	 
	 @Test (priority = 52)
	 public void ZipcodeOnly90() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("79059", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly90");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Great news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is good. Let’s find you a plan.");
	
	 }
	 @Test (priority = 53)
	 public void ZipcodeOnly91() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly91");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header2())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 54)
	 public void ZipcodeOnly92() throws InterruptedException, IOException {
	ultraVF_ZipcodeOnly_3G("52333", "4G LTE Coverage: FAIR" );
	 takeScreenshot("ZipcodeOnly92");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "Good news!");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 52333 is fairly good. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
	
	 }
	 @Test (priority = 55)
	 public void InvalidZipcode93() throws InterruptedException, IOException {
	ultraVFincompatibleZipCode("79376");
	 takeScreenshot("InvalidZipcode93");
	 }
	 @Test (priority = 56)
	 public void InvalidZipCode94() throws InterruptedException, IOException {
	ultraVFincompatibleZipCode("66518");
	 takeScreenshot("InvalidZipCode94");
	 }
	 @Test (priority = 56)
	 public void InvalidZipCode000() throws InterruptedException, IOException {
	ultraVFincompatibleZipCode("00000");
	 takeScreenshot("InvalidZipCode000");
	 }
	 @Test (priority = 57)
	 public void ultraVFBrandModelAddress109() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("94112" , "445 Persia Ave & Mission St.");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress109");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 445 Persia Ave & Mission St. is excellent and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 
	 @Test (priority = 58)
	 public void ultraVFBrandModelAddress110() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("50423" , "3175 Iowa Avenue");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress110");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue  is very good and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 59)
	 public void ultraVFBrandModelAddress111() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("50636" , "2656 290th Street");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress111");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is fairly good, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 60)
	 public void ultraVFBrandModelAddress112() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress112");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
			 }	
	 @Test (priority = 61)
	 public void ultraVFBrandModelAddress113() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("95843" , "5610 Great Valley Drive");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress113");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 5610 Great Valley Drive is excellent and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 
	 @Test (priority = 62)
	 public void ultraVFBrandModelAddress114() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("20176" , "44008 Indian Fields Court");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress114");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 44008 Indian Fields Court is very good and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 63)
	 public void ultraVFBrandModelAddress115() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("95620" , "6300 Weber Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress115");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 6300 Weber Rd is fairly good, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 64)
	 public void ultraVFBrandModelAddress116() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress116");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "Although your Samsung Galaxy S8 Plus is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
			 }	
	 @Test (priority = 65)
	 public void ultraVFBrandModelAddress117() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("03842" , "8 Highland Avenue");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress117");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 8 Highland Avenue is excellent and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 @Test (priority = 66)
	 public void ultraVFBrandModelAddress118() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("04732" , "32 Blackwater Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress118");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 32 Blackwater Rd is very good and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 67)
	 public void ultraVFBrandModelAddress119() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("04732" , "58 Heidi Circle");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress119");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 58 Heidi Circle is fairly good, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 68)
	 public void ultraVFBrandModelAddress120() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("52333" , "2418 Quincy Rd NE");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress120");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "Although your Google Pixel 3a is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd NE is not as great as we'd like to see. Ultra may not be the best fit for you.");
			 }	
	 @Test (priority = 69)
	 public void ultraVFBrandModelAddress121() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("86401" , "310 North 4th Street");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress121");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 310 North 4th Street is excellent and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 
	 @Test (priority = 70)
	 public void ultraVFBrandModelAddress122() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("95536" , "6 Centerville Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress122");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 6 Centerville Rd is very good and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 71)
	 public void ultraVFBrandModelAddress123() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("67643" , "2497 J Lane");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress123");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 2497 J Lane is fairly good, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 72)
	 public void ultraVFBrandModelAddress124() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress124");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "Although your Google Pixel 3a is perfectly compatible with our service, The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Ultra may not be the best fit for you.");
			 }	
	 @Test (priority = 88)
	 public void ultraVFBrandModelAddress125() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("58564" , "8564 49th Avenue Southwest");
		 Actions action2 = new Actions(driver);	
		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
 WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress125");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 8564 49th Avenue Southwest is excellent. However, it looks like your HTC Touch 3G isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
			 }
	 @Test (priority = 89)
	 public void ultraVFBrandModelAddress126() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("20176" , "44008 Indian Fields Court");
		 Actions action2 = new Actions(driver);	
		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
 WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress126");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 44008 Indian Fields Court is very good. However, it looks like your HTC Touch 3G isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
			 }
	 @Test (priority = 90)
	 public void ultraVFBrandModelAddress127() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("59336" , "300 Road 357");
		 Actions action2 = new Actions(driver);	
		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
 WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress127");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Good news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 300 Road 357 is fairly good. However, it looks like your HTC Touch 3G isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
			 }
	 @Test (priority = 91)
	 public void ultraVFBrandModelAddress128() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 Actions action2 = new Actions(driver);	
		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
 WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress128");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 2418 Quincy Rd is not as great as we'd like to see. Unfortunately, Ultra may not be the best fit for you.");
			 }
	 @Test (priority = 72)
	 public void ultraVFBrandModelAddress132() throws InterruptedException, IOException {
		 ultraVFBrandModelAddressPart1("79040" , "8580 County Road M");
		 Actions action2 = new Actions(driver);	
		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
 WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_3G("3G Coverage: POOR" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelAddress132");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 8580 County Road M is not as great as we'd like to see. Unfortunately, Ultra may not be the best fit for you.");
			 }

	 @Test (priority = 73)
	 public void ultraVFBrandModelZipcode135() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("94112");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode135");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 94112 is excellent and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 
	 @Test (priority = 74)
	 public void ultraVFBrandModelZipcode136() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("79059");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode136");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is very good and your Apple iPhone 8 is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 75)
	 public void ultraVFBrandModelZipcode137() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode137");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 76)
	 public void ultraVFBrandModelZipcode139() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("95843");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode139");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 95843 is excellent and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
			}

	 @Test (priority = 77)
	 public void ultraVFBrandModelZipcode140() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("95227");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode140");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 95227 is very good and your Samsung Galaxy S8 Plus is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 78)
	 public void ultraVFBrandModelZipcode141() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode141");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 79)
	 public void ultraVFBrandModelZipcode143() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("03842");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode143");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is excellent and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			}
	 
	 @Test (priority = 80)
	 public void ultraVFBrandModelZipcode144() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("96044");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode144");
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is very good and your Google Pixel 3a is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 81)
	 public void ultraVFBrandModelZipcode145() throws InterruptedException, IOException {
		 ultraVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("ultraVFBrandModelZipcode145");
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 82)
	 public void ultraVFBrandModelZipcode147() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("86401");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
			 Actions action = new Actions(driver);
			 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
			 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
		  Thread.sleep(2000);
		  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
		Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Fantastic news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 86401 is excellent and your Galaxy S4 Mini is a perfect fit with our service. Now let’s find the right plan for you.");
			}

	 @Test (priority = 83)
	 public void ultraVFBrandModelZipcode148() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("96044");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is fairly good, and your Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 84)
	 public void ultraVFBrandModelZipcode149() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).sendKeys("Galaxy S4 Mini");
		  Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS4mini())).click();
	  Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 @Test (priority = 85)
	 public void ultraVFBrandModelZipcode151() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("03842");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).sendKeys("Galaxy S4 Mini");
		  Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Model_GalaxyS4mini())).click();
	  Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
		 Thread.sleep(3000);
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Uh Oh.");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is very good. However, it looks like your Galaxy S4 Mini isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");
			 }
	 @Test (priority = 86)
	 public void ultraVFBrandModelZipcode152() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("79059");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
			String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
			Assert.assertEquals(HeaderText, "Great news!");
			String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
			Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is very good and your Galaxy S4 Mini is a perfect fit with our service. Now let’s find the right plan for you.");
			 }
	 @Test (priority = 87)
	 public void ultraVFBrandModelZipcode153() throws InterruptedException {
		 ultraVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_dropdown_Brand_Samsung())).click();
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.ultraVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 ultraVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
		 Assert.assertEquals(HeaderText, "Good news!");
		 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
		 Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is fairly good, and your Apple Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		 }
	 
	 @AfterMethod
 public void tearDown() {
		driver.quit();
 }

}
