package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Ultra_VF_Page {
	
	WebDriver driver;
	
	public Ultra_VF_Page(WebDriver driver){
		this.driver=driver;
	}
	

	
	By ultraVF_test_zipCode = By.xpath("//input[@placeholder='Enter Zip Code']");
	By ultraVF_button_CheckCoverage = By.xpath("//button[contains(text(),'Check Coverage')]");
	By ultraVF_textbox_StreetAddress = By.xpath("//input[@placeholder='Home # and Street Address']");
	By ultraVF_button_Continue = By.xpath("//button[contains(text(),'Continue')]");
	By ultraVF_button_ContinueIMEI = By.xpath("//button[contains(text(),'Continue')]");
	By ultraVF_dropdown_Brand = By.xpath("(//div[@class='react-select__value-container css-1hwfws3'])[1]");
	By ultraVF_dropdown_Model = By.xpath("//div[@class='react-select__placeholder css-ogcd26-placeholder']");
	By ultraVF_textbox_IMEI = By.xpath("//input[@class='RVF-numberInput RVF-form-control']");
	By ultraVF_button_ViewPlans = By.xpath("//button[contains(text(),'View Plans')]");
	By ultraVF_text_CheckCoverage = By.xpath("//h1[contains(text(),'Check Coverage')]");
	By ultraVF_header_CheckCoverage = By.xpath("//h2[contains(text(),'Ultra Mobile runs on the Nation’s most advanced 4G LTE high-speed network')]");
	By ultraVF_directions_CheckCoverage = By.xpath("//p[contains(text(),'Enter a street address for best results and ZIP code.')]");
	By ultraVF_results_Coverage1 = By.xpath("//h4[contains(text(),'4G LTE Coverage: ')]");
	By ultraVF_results_Coverage2 = By.xpath("(//h4/span)[1]");
	By ultraVF_results_Device = By.xpath("(//h4/span)[2]");
	By ultraVF_text_ErrorMessage = By.xpath("//div[contains(text(),'Please input a valid zipcode')]");
	By ultraVF_results_Coverage3G = By.xpath("//h4[contains(text(),'3G Coverage: ')]");
	By ultraVF_button_IMEIskip = By.xpath("//span[@class='RVF-imei-skip']");
	By ultraVF_dropdown_Brand_Apple = By.xpath("//div[contains(text(),'Apple')]");
	By ultraVF_dropdown_Brand_Samsung = By.xpath("//div[contains(text(),'Samsung')]");
	By ultraVF_dropdown_Brand_Google = By.xpath("//div[contains(text(),'Google')]");
	By ultraVF_dropdown_Model_iPhone8 = By.xpath("//div[contains(text(),'iPhone 8')]");
	By ultraVF_dropdown_Model_GalaxyS8 = By.xpath("//div[contains(text(),'Galaxy S8')]");
	By ultraVF_dropdown_Model_Pixel3a = By.xpath("//div[contains(text(),'Pixel 3a')]");
	By ultraVF_dropdown_Model_GalaxyS4mini = By.xpath("//div[contains(text(),'Galaxy S4 Mini')]");
	By ultraVF_textbox_Model = By.xpath("//div[@class='react-select__placeholder css-ogcd26-placeholder']");
	By ultraVF_button_LetsGo = By.xpath("(//button[@class='a-btn buttonText RVF-button'])[1]");
	By ultraVF_result_header = By.xpath("//div/h1[@class='RVF-header RVF-Header-Bold RVF-pt-0']"); public By ultraVF_result_header() { return ultraVF_result_header;}
	
	By ultraVF_result_header2 = By.xpath("//div/h1[@class='RVF-header pt-0 RVF-Header-Bold']"); 	public By ultraVF_result_header2() { return ultraVF_result_header2;}

	By ultraVF_result_header3 = By.xpath("//div/h1[@class='RVF-header RVF-pt-0 RVF-Header-Bold']"); 	public By ultraVF_result_header3() { return ultraVF_result_header3;}

	By ultraVF_text_subtitle = By.xpath("//p[@class='RVF-subtitle']"); 	public By ultraVF_text_subtitle() { return ultraVF_text_subtitle;}

	By ultraVF_result_address = By.xpath("(//div/p/b)[1]"); 	public By ultraVF_result_address() { return ultraVF_result_address;}

	By ultraVF_result_device = By.xpath("(//div/p/b)[2]"); 	public By ultraVF_result_device() { return ultraVF_result_device;}

	
	//--
	public By ultraVF_textbox_Model() { return ultraVF_textbox_Model;}
	public By ultraVF_button_IMEIskip() { return ultraVF_button_IMEIskip;}
	public By ultraVF_dropdown_Model_iPhone8() { return ultraVF_dropdown_Model_iPhone8;}
	public By ultraVF_dropdown_Model_GalaxyS8() { return ultraVF_dropdown_Model_GalaxyS8;}
	public By ultraVF_dropdown_Model_Pixel3a() { return ultraVF_dropdown_Model_Pixel3a;}
	public By ultraVF_dropdown_Model_GalaxyS4mini() { return ultraVF_dropdown_Model_GalaxyS4mini;}
	public By ultraVF_dropdown_Brand_Apple() { return ultraVF_dropdown_Brand_Apple;}
	public By ultraVF_dropdown_Brand_Samsung() { return ultraVF_dropdown_Brand_Samsung;}
	public By ultraVF_dropdown_Brand_Google() { return ultraVF_dropdown_Brand_Google;}
	public By ultraVF_results_Coverage3G() { return ultraVF_results_Coverage3G;}
	public By ultraVF_text_ErrorMessage() { return ultraVF_text_ErrorMessage;}
	public By ultraVF_button_ContinueIMEI() { return ultraVF_button_ContinueIMEI;}
	public By ultraVF_results_Device() { return ultraVF_results_Device;}
	public By ultraVF_results_Coverage2() { return ultraVF_results_Coverage2;}
	public By ultraVF_results_Coverage1() { return ultraVF_results_Coverage1;}
	public By ultraVF_directions_CheckCoverage() { return ultraVF_directions_CheckCoverage;}
	public By ultraVF_header_CheckCoverage() { return ultraVF_header_CheckCoverage;}
	public By ultraVF_text_CheckCoverage() { return ultraVF_text_CheckCoverage;}
	public By ultraVF_button_ViewPlans() { return ultraVF_button_ViewPlans;}
	public By ultraVF_textbox_IMEI() { return ultraVF_textbox_IMEI;}
	public By ultraVF_dropdown_Model() { return ultraVF_dropdown_Model;}
	public By ultraVF_dropdown_Brand() { return ultraVF_dropdown_Brand;}
	public By ultraVF_button_Continue() { return ultraVF_button_Continue;}
	public By ultraVF_button_CheckCoverage() { return ultraVF_button_CheckCoverage;}
	public By ultraVF_textbox_StreetAddress() { return ultraVF_textbox_StreetAddress;}
	public By ultraVF_test_zipCode() { return ultraVF_test_zipCode;}
	public By ultraVF_button_LetsGo() { return ultraVF_button_LetsGo;}

	
}

//-----------
//IMEI and Address
//--------------------------- Excellent and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "FANTASTIC NEWS!");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage ate the given location, { } is excellent and your {Phone} is a perfect fit with our service. Now let's find the right plan for you.");
//
//------------------------------- Good and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "GREAT NEWS!");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, {ZIP}  is very good and your [device] is a perfect fit with our service. Now let’s find the right plan for you.");
//
//--------------------------------- Fair and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "GOOD NEWS!");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, {ZIP} is fairly good, and your [device] is a perfect fit with our service. We suggest you try our service first with our 7-day trial plan before committing to a full plan. If you love our service, you get a $5 credit to use on a full plan.");
//
//-------------------------------- Poor and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "UH. OH.");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Although your [device] is perfectly compatible with our service, the coverage at the given location, {ZIP} is not as great as we’d like to see. Ultra may not be the best fit for you.");
//
//---------------------------- Excellent and Non-Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "UH OH.");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, {ZIP} is excellent. However, it looks like your {PHONE} isn’t compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");

//---------------------------Good and Non-Compatible
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "UH OH.");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, {ZIP} is very good. However, it looks like your [device] isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");

//---------------------------Fair and Non-Compatible

//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "GOOD NEWS!");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, {ZIP} is fairly good. However, it looks like your [device] isn’t quite compatible with our service. We recommend upgrading your device so you can take advantage of great wireless savings. Shop our low-cost phones here.");

//-------------------------- Poor and Non-Compatible

//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "UH OH.");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, { } is not as great as we'd like to see. Unfortunately, Ultra may not be the best fit for you.");





//---ADDRESS ONLY

//------ EXCELLENT
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "FOXTASTIC");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, Persia Ave & Mission St. is excellent. Let’s find you a plan.");
//

//------ GOOD
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "OH FOX YEAH");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue is good. Let’s find you a plan.");
//

//------ FAIR
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "PRETTY SWEET");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//
//------ POOR
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "AWW FOX");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.ultraVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like ultra is right for you…this is us crying now.");
//

