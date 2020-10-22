package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ultra_activations_Page {
	
	WebDriver driver;
	
	public Ultra_activations_Page(WebDriver driver){
		this.driver=driver;
	}
	
	By ultraHeader_button_SignIn = By.xpath("(//a[contains(text(),'Sign In')])[1]");
	By signInPage_textbox_MSISDN = By.xpath("//input[@id='InputText']");
	By signInPage_button_SignInViaSMS = By.xpath("//a[contains(text(),'SMS a Password to My Device')]");
	By ultraHeader_dropdown_Lang_English = By.xpath("(//span[contains(text(),'English')])[1]");
	By ultraHeader_dropdown_Lang_Spanish = By.xpath("(//span[contains(text(),'Español')])[1]");
	By ultraHeader_dropdown_Lang_Chinese = By.xpath("(//span[contains(text(),'简体中文')])[1]");
	By ultraMobile_Logo = By.className("d-none dark_theme Logo--image");
	By signInPage_textbox_Password = By.xpath("//input[@id='InputTextPassword']");
	By signInPage_button_SignIn = By.xpath("//button[@id='btn-login-submit']");
	By accountManagement_text_MyPlan = By.xpath("//div[contains(text(),'My Plan')]");
	By ultraMenu_button_Plans = By.xpath("//a[contains(text(),'Plans')][1]");
	By ultraMenu_button_Phones = By.xpath("//a[contains(text(),'Phones')][1]");
	By ultraMenu_button_INTL = By.xpath("//a[contains(text(),'International')][1]");	
	By ultraMenu_button_Coverage = By.xpath("//a[contains(text(),'Coverage')][1]");
	By ultraMenu_button_StoreLocator = By.xpath("//a[contains(text(),'Store Locator')][1]");
	By ultraMenu_dropdown_Help = By.xpath("//a[contains(text(),'Help')][1]");
	By ultraMenu_image_FAQ = By.xpath(("//img[contains(@src,'https://www.ultramobile.com/wp-content/themes/ultramobile/images/icon-faq.png')]"));
	By ultraMenu_image_Logo = By.xpath(("//img[contains(@src,'https://www.ultramobile.com/wp-content/themes/ultramobile/images/logo-ultra-dark-theme.png')]"));
	By ultraMenu_image_Support = By.xpath(("//img[contains(@src,'https://www.ultramobile.com/wp-content/themes/ultramobile/images/icon-support.png')]"));
	By homePage_textbox_IntlRates = By.cssSelector("input.IntlRates-field");
	By homePage_text_Korea = By.xpath("//div[contains(text(),'South Korea')]");
	By homePage_text_India = By.xpath("//div[contains(text(),'India')]");
	By homePage_text_Philippines = By.xpath("//div[contains(text(),'Philippines')]");
	By homePage_button_1GBPlan_ViewDetails = By.xpath("//a[@href='https://www.ultramobile.com/product/1gb-plan-sim-kit/']");
	By homePage_button_3GBPlan_ViewDetails = By.xpath("//a[@href='https://www.ultramobile.com/product/3gb-plan-sim-kit/']");
	By homePage_button_6GBPlan_ViewDetails = By.xpath("//a[@href='https://www.ultramobile.com/product/6gb-plan-sim-kit/']");
	By homePage_button_UnliPlan_ViewDetails = By.xpath("//a[@href='https://www.ultramobile.com/product/unlimited-data-plan-sim-kit/']");
	By ultraHeader_button_Activate = By.xpath("//a[contains(text(),'Activate')]");
	By slack_button_SignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By slack_workpace_URL = By.xpath("//input[@id='domain']");
	By slack_email_Address = By.xpath("//input[@id='email']");
	By slack_password = By.xpath("//input[@id='password']");
	By slack_textbox = By.tagName("p");
	By getICCID_SelectSimStatus = By.xpath("//input[@placeholder='Select Sim Status...']");
	By getICCID_InitialProductType = By.xpath("//input[@placeholder='Initial Product Type...']");
	By getICCID_InitialProductID = By.xpath("//input[@placeholder='Initial Product ID...']");
	By getICCID_Available = By.xpath("//span[contains(text(),'AVAILABLE')]");
	By getICCID_Type = By.xpath("//input[@placeholder='Type...']");
	By getICCID_PurpleSim = By.xpath("//span[contains(text(),'Purple')]");
	By getICCID_OrangeSim = By.xpath("//span[contains(text(),'Orange')]");
	By getICCID_Brand = By.xpath("//input[@placeholder='Brand...']");
	By getICCID_AUTOMATIONUltra = By.xpath("//span[contains(text(),'AUTOMATION Ultra')]");
	By getICCID_QAUltra = By.xpath("//span[contains(text(),'QA Ultra')]");
	By getICCID_PRODUltra = By.xpath("//span[contains(text(),'PROD Ultra')]");
	By getICCID_button_GetICCID = By.xpath("//span[contains(text(),'Get ICCID')]");
	By ultra_image_PurpleSim = By.xpath("//img[@id='Purple']");
	By ultra_image_OrangeSim = By.xpath("//img[@id='Orange']");
	By ultra_textbox_ICCID = By.xpath("//input[@placeholder='ICCID']");
	By ultra_textbox_ActCode = By.xpath("//input[@id='InputTextActCode']");
	By ultra_button_StartActivation = By.xpath("//button[@id='Button']");
	By chrome_button_ClearCache = By.cssSelector("* /deep/ #clearBrowsingDataConfirm");
	By ultra_Activations_GettingStarted = By.xpath("//h1[contains(text(),'Getting Started')]");
	By getICCID_DispatchEnv = By.xpath("//input[@placeholder='Dispatch Env...']");
	By getICCID_PIPNEW = By.xpath("//span[contains(text(),'PIPNEW')]");
	By ultraActivation_textbox_InputZipCode = By.xpath("//input[@id='InputTextZipCode']");
	By ultraActivation_plan_3Mo1Gb = By.xpath("//div[@id='7000022']");
	By ultraActivation_plan_3Mo3Gb = By.xpath("//div[@id='7000023']");
	By ultraActivation_plan_3Mo6Gb = By.xpath("//div[@id='7000024']");
	By ultraActivation_plan_3MoUnli = By.xpath("//div[@id='7000055']");
	By ultraActivation_plan_6Mo1Gb = By.xpath("//div[@id='7000026']");
	By ultraActivation_plan_6Mo3Gb = By.xpath("//div[@id='7000027']");
	By ultraActivation_plan_6Mo6Gb = By.xpath("//div[@id='7000028']");
	By ultraActivation_plan_6MoUnli = By.xpath("//div[@id='7000047']");
	By ultraActivation_plan_12Mo1Gb = By.xpath("//div[@id='7000030']");
	By ultraActivation_plan_12Mo3Gb = By.xpath("//div[@id='7000031']");
	By ultraActivation_plan_12Mo6Gb = By.xpath("//div[@id='7000032']");
	By ultraActivation_plan_12MoUnli = By.xpath("//div[@id='7000054']");
	By ultraActivation_plan_19 = By.xpath("//div[@id='1000023']");
	By ultraActivation_plan_23 = By.xpath("//div[@id='105']");
	By ultraActivation_plan_29 = By.xpath("//div[@id='79']");
	By ultraActivation_plan_49 = By.xpath("//div[@id='7000048']");
	By ultraActivation_plan_39 = By.xpath("//div[@id='106']");
	By ultraActivation_button_ActivateaNewNumber = By.xpath("//button[@id='NewNumberButton']");
	By ultraActivation_button_Checkbox = By.xpath("//label[@id='Agreement_Agree']");
	By signActivation_button_ProceedActivation = By.xpath("//button[contains(text(),'Proceed with Activating New Number')]");
	By ultraActivation_textbox_FirstName = By.xpath("//input[@id='InputFirstName']");
	By ultraActivation_textbox_LastName = By.xpath("//input[@id='InputLastName']");
	By ultraActivation_textbox_Email = By.xpath("//input[@id='InputTextEmail']");
	By ultraActivation_textbox_UserName = By.xpath("//input[@id='InputUsername']");
	By ultraActivation_textbox_Password = By.xpath("//input[@id='InputGroupPassword']");
	By ultraActivation_textbox_ConfirmPassword = By.xpath("//input[@id='InputGroupPasswordConfirm']");
	By ultraActivation_button_SubmitInfo = By.xpath("//button[@id='Button']");
	By phonesPage_image_Logo = By.xpath(("//img[contains(@src,'skin/electronics_black/images/logo-ultra.png')][1]"));
	By coveragePage_image_Logo = By.xpath(("//img[contains(@src,'https://www.ultramobile.com/wp-content/themes/ultramobile/images/logo-ultra.png')]"));
	By ultraActivation_button_CreditCard = By.xpath("//button[@id='ccPath']");
	By ultraActivation_button_PinCard = By.xpath("//button[@id='pinsPath']");
	By ultraActivation_textbox_CreditCard = By.xpath("//input[@id='CardNumber']");
	By ultraActivation_textbox_CVV = By.xpath("//input[@id='CVV']");
	By ultraActivation_textbox_ExpDate = By.xpath("//input[@id='ExpirationDate']");
	By ultraActivation_textbox_State = By.xpath("//input[@id='InputState']");
	By ultraActivation_textbox_Address = By.xpath("//input[@id='InputAddress1']");
	By ultraActivation_textbox_Address2 = By.xpath("//input[@id='InputAddress2']");
	By ultraActivation_textbox_City = By.xpath("//input[@id='InputCity']");
	By ultraActivation_textbox_ZipCode = By.xpath("//input[@id='InputTextZipCode']");
	By ultraActivation_button_CCContinue = By.xpath("//button[@id='ccNext']");
	By ultraActivation_button_ChargeCC = By.xpath("//button[@id='ccPathSubmit']");
	By ultraActivation_text_Complete = By.xpath("//h1[contains(text(),'Activation Complete')]");
	By ultraBillingInfo_textbox_FirstName = By.xpath("//input[@id='InputFirstName']");
	By ultraBillingInfo_textbox_LastName = By.xpath("//input[@id='InputLastName']");
	By ultraActivation_text_AccountInfo = By.xpath("//h1[contains(text(),'My Account Info')]");
	By ultraActivation_button_AddCC = By.xpath("//button[@id='Button']");
	By ultraBillingInto_Link_Skip = By.xpath("//a[@id='Link']");
	By ultraActivation_button_Refresh = By.xpath("//button[@id='Button']");
	By getICCID_textbox_GetICCID = By.xpath("(//span/code)[1]");
	By getICCID_textbox_GetACTCODE = By.xpath("(//span/code)[2]");
	By getICCID_3MoSmall_ID = By.xpath("//span[contains(text(),'3 Month 3GB (7000058')]");
	By getICCID_3MoSmall_Type = By.xpath("//span[contains(text(),'3 Month Small')]");
	By getICCID_3MoMedium_ID = By.xpath("//span[contains(text(),'3 Month 8GB (7000040')]");
	By getICCID_3MoMedium_Type = By.xpath("//span[contains(text(),'3 Month Medium')]");
	By getICCID_3MoLarge_ID = By.xpath("//span[contains(text(),'3 Month 12GB (7000041')]");
	By getICCID_3MoLarge_Type = By.xpath("//span[contains(text(),'3 Month Large')]");
	By getICCID_6MoSmall_ID = By.xpath("//span[contains(text(),'6 Month 3GB (7000015')]");
	By getICCID_6MoSmall_Type = By.xpath("//span[contains(text(),'6 Month Small')]");
	By getICCID_6MoLarge_ID = By.xpath("//span[contains(text(),'6 Month 12GB (7000017')]");
	By getICCID_6MoLarge_Type = By.xpath("//span[contains(text(),'6 Month Large')]");
	By getICCID_6MoMedium_ID = By.xpath("//span[contains(text(),'6 Month 8GB (7000016')]");
	By getICCID_6MoMedium_Type = By.xpath("//span[contains(text(),'6 Month Medium')]");
	By getICCID_12MoLarge_ID = By.xpath("//span[contains(text(),'12 Month 12GB (7000020')]");
	By getICCID_12MoLarge_Type = By.xpath("//span[contains(text(),'12 Month Large')]");
	By getICCID_12MoMedium_Type = By.xpath("//span[contains(text(),'12 Month Medium')]");
	By getICCID_12MoMedium_ID = By.xpath("//span[contains(text(),'12 Month 8GB (7000019')]");
	By getICCID_12MoSmall_Type = By.xpath("//span[contains(text(),'12 Month Small')]");
	By getICCID_12MoSmall_ID = By.xpath("//span[contains(text(),'12 Month 3GB (7000018')]");
	By getICCID_plan19_Type = By.xpath("//span[contains(text(),'Ultra $19 Single Month')]");
	By getICCID_plan23_Type = By.xpath("//span[contains(text(),'Ultra $23 Single Month')]");
	By getICCID_plan29_Type = By.xpath("//span[contains(text(),'Ultra $29 Single Month')]");
	By getICCID_plan39_Type = By.xpath("//span[contains(text(),'Ultra $39 Single Month')]");
	By getICCID_plan49_Type = By.xpath("//span[contains(text(),'Ultra $49 Single Month')]");
	By getICCID_plan19_ID = By.xpath("//span[contains(text(),'$19 | 1 Month (1000023)')]");
	By getICCID_plan23_ID = By.xpath("//span[contains(text(),'$23 | 1 Month (105)')]");
	By getICCID_plan29_ID = By.xpath("//span[contains(text(),'$29 | 1 Month (79)')]");
	By getICCID_plan39_ID = By.xpath("//span[contains(text(),'$39 | 1 Month (106)')]");
	By getICCID_plan49_ID = By.xpath("//span[contains(text(),'$49 | 1 Month (113)')]");
	By ultraActivation_button_submit = By.xpath("//button[@type='submit']");
	By ultraActivation_skipDeviceCheck = By.xpath("//p[contains(text(),'Skip')]");	public By ultraActivation_skipDeviceCheck() { return ultraActivation_skipDeviceCheck; } 
	By ultraActivation_newMSISDN = By.xpath("(//p/span)[1]");	public By ultraActivation_newMSISDN() { return ultraActivation_newMSISDN; } 
	

	public By ultraActivation_button_submit() { return ultraActivation_button_submit; } 
	public By getICCID_plan19_Type() { return getICCID_plan19_Type; } 
	public By getICCID_plan23_Type() { return getICCID_plan23_Type; } 
	public By getICCID_plan29_Type() { return getICCID_plan29_Type; } 
	public By getICCID_plan39_Type() { return getICCID_plan39_Type; } 
	public By getICCID_plan49_Type() { return getICCID_12MoSmall_ID; } 
	public By getICCID_plan19_ID() { return getICCID_plan19_ID; } 
	public By getICCID_plan23_ID() { return getICCID_plan23_ID; } 
	public By getICCID_plan29_ID() { return getICCID_plan29_ID; } 
	public By getICCID_plan39_ID() { return getICCID_plan39_ID; } 
	public By getICCID_plan49_ID() { return getICCID_plan49_ID; } 
	public By getICCID_12MoSmall_ID() { return getICCID_12MoSmall_ID; } 
	public By getICCID_12MoMedium_ID() { return getICCID_12MoMedium_ID; } 
	public By getICCID_12MoLarge_ID() { return getICCID_12MoLarge_ID; } 
	public By getICCID_6MoLarge_ID() { return getICCID_6MoLarge_ID; } 
	public By getICCID_6MoMedium_ID() { return getICCID_6MoMedium_ID; } 
	public By getICCID_6MoSmall_ID() { return getICCID_6MoSmall_ID; } 
	public By getICCID_3MoLarge_ID() { return getICCID_3MoLarge_ID; } 
	public By getICCID_3MoMedium_ID() { return getICCID_3MoMedium_ID; } 
	public By getICCID_3MoMedium_Type() { return getICCID_3MoMedium_Type; } 
	public By getICCID_3MoLarge_Type() { return getICCID_3MoLarge_Type; } 
	public By getICCID_6MoSmall_Type() { return getICCID_6MoSmall_Type; } 
	public By getICCID_6MoMedium_Type() { return getICCID_6MoMedium_Type; } 
	public By getICCID_6MoLarge_Type() { return getICCID_6MoLarge_Type; } 
	public By getICCID_12MoSmall_Type() { return getICCID_12MoSmall_Type; } 
	public By getICCID_12MoMedium_Type() {return getICCID_12MoMedium_Type;}
	public By getICCID_12MoLarge_Type() {return getICCID_12MoLarge_Type;}
	public By getICCID_3MoSmall_Type() {return getICCID_3MoSmall_Type;}
	public By getICCID_3MoSmall_ID() {return getICCID_3MoSmall_ID;}
	public By ultraActivation_button_PinCard() {return ultraActivation_button_PinCard;}
	public By getICCID_textbox_GetACTCODE() {return getICCID_textbox_GetACTCODE;}
	public By ultraActivation_button_Refresh() {return ultraActivation_button_Refresh;}
	public By ultraActivation_button_AddCC() {return ultraActivation_button_AddCC;}
    public By ultraActivation_text_AccountInfo() {return ultraActivation_text_AccountInfo;}
    public By ultraBillingInto_Link_Skip() {return ultraBillingInto_Link_Skip;}
    public By ultra_textbox_ActCode() {return ultra_textbox_ActCode;}
    public By ultraActivation_plan_39() {return ultraActivation_plan_39;}
    public By ultraBillingInfo_textbox_LastName() {return ultraBillingInfo_textbox_LastName;}
    public By ultraBillingInfo_textbox_FirstName() {return ultraBillingInfo_textbox_FirstName;}
    public By ultraActivation_text_Complete() {return ultraActivation_text_Complete;}
	public By ultraActivation_button_ChargeCC() {return ultraActivation_button_ChargeCC;}
	public By ultraActivation_textbox_State() {return ultraActivation_textbox_State;}
	public By ultraActivation_textbox_ExpDate() { return ultraActivation_textbox_ExpDate; }
	public By ultraActivation_textbox_FirstName() { return ultraActivation_textbox_FirstName; }
	public By ultraActivation_textbox_LastName() { return ultraActivation_textbox_LastName; }
	public By ultraActivation_textbox_Email() { return ultraActivation_textbox_Email; }
	public By ultraActivation_textbox_UserName() { return ultraActivation_textbox_UserName; }
	public By ultraActivation_textbox_Password() { return ultraActivation_textbox_Password; }
	public By ultraActivation_textbox_ConfirmPassword() { return ultraActivation_textbox_ConfirmPassword; }
	public By ultraActivation_button_SubmitInfo() { return ultraActivation_button_SubmitInfo; }
	public By ultraActivation_button_CreditCard() { return ultraActivation_button_CreditCard; }
	public By ultraActivation_textbox_CreditCard() { return ultraActivation_textbox_CreditCard; }
	public By ultraActivation_textbox_CVV() { return ultraActivation_textbox_CVV; }
	public By ultraActivation_textbox_Address() { return ultraActivation_textbox_Address; }
	public By ultraActivation_textbox_Address2() { return ultraActivation_textbox_Address2; }
	public By ultraActivation_textbox_City() { return ultraActivation_textbox_City; }
	public By ultraActivation_textbox_ZipCode() { return ultraActivation_textbox_ZipCode; }
	public By ultraActivation_button_CCContinue() {return ultraActivation_button_CCContinue;}
	public By ultraActivation_button_Checkbox() {return ultraActivation_button_Checkbox;}	
	public By signActivation_button_ProceedActivation() {return signActivation_button_ProceedActivation;}	
	public By ultraActivation_plan_3Mo1Gb() {return ultraActivation_plan_3Mo1Gb;}	
	public By ultraActivation_plan_3Mo3Gb() {return ultraActivation_plan_3Mo3Gb;}	
	public By ultraActivation_plan_3Mo6Gb() {return ultraActivation_plan_3Mo6Gb;}
	public By ultraActivation_plan_3MoUnli() {return ultraActivation_plan_3MoUnli;}
	public By ultraActivation_plan_6Mo1Gb() {return ultraActivation_plan_6Mo1Gb;}
	public By ultraActivation_plan_6Mo3Gb() {return ultraActivation_plan_6Mo3Gb;}
	public By ultraActivation_plan_6Mo6Gb() {return ultraActivation_plan_6Mo6Gb;}
	public By ultraActivation_plan_6MoUnli() {return ultraActivation_plan_6MoUnli;}
	public By ultraActivation_plan_12Mo1Gb() {return ultraActivation_plan_12Mo1Gb;}
	public By ultraActivation_plan_12Mo3Gb() {return ultraActivation_plan_12Mo3Gb;}
	public By ultraActivation_plan_12Mo6Gb() {return ultraActivation_plan_12Mo6Gb;}
	public By ultraActivation_plan_12MoUnli() {return ultraActivation_plan_12MoUnli;}
	public By ultraActivation_plan_19() {return ultraActivation_plan_19;}
	public By ultraActivation_plan_23() {return ultraActivation_plan_23;}
	public By ultraActivation_plan_29() {return ultraActivation_plan_29;}
	public By ultraActivation_plan_49() {return ultraActivation_plan_49;}
	public By ultraActivation_button_ActivateaNewNumber() {return ultraActivation_button_ActivateaNewNumber;}
	public By ultraActivation_textbox_InputZipCode() {return ultraActivation_textbox_InputZipCode;}
	public By getICCID_InitialProductType() {return getICCID_InitialProductType;}
	public By getICCID_InitialProductID() {return getICCID_InitialProductID;}
	public By getICCID_PIPNEW() {return getICCID_PIPNEW;}
	public By getICCID_DispatchEnv() {return getICCID_DispatchEnv;}
	public By ultra_Activations_GettingStarted() {return ultra_Activations_GettingStarted;}
	public By chrome_button_ClearCache() {return chrome_button_ClearCache;}
//	public By ultra_GettingStarted_ICCID() {return ultra_GettingStarted_ICCID;}
	public By ultra_button_StartActivation() {return ultra_button_StartActivation;}
	public By getICCID_Brand() {return getICCID_Brand;}
	public By ultra_textbox_ICCID() {return ultra_textbox_ICCID;}
	public By ultra_image_PurpleSim() {return ultra_image_PurpleSim;}
	public By ultra_image_OrangeSim() {return ultra_image_OrangeSim;}
	public By getICCID_button_GetICCID() {return getICCID_button_GetICCID;}
	public By getICCID_textbox_GetICCID() {return getICCID_textbox_GetICCID;}
	public By getICCID_AUTOMATIONUltra() {return getICCID_AUTOMATIONUltra;}
	public By getICCID_QAUltra() {return getICCID_QAUltra;}
	public By getICCID_PRODUltra() {return getICCID_PRODUltra;}
	public By slack_textbox() {return slack_textbox;}
	public By getICCID_Type() {return getICCID_Type;}
	public By getICCID_OrangeSim() {return getICCID_OrangeSim;}
	public By getICCID_PurpleSim() {return getICCID_PurpleSim;}
	public By getICCID_Available() {return getICCID_Available;}
	public By getICCID_SelectSimStatus() {return getICCID_SelectSimStatus;}
	public By slack_email_Address() {return slack_email_Address;}
	public By slack_password() {return slack_password;}
	public By slack_workpace_URL() {return slack_workpace_URL;}
	public By ultraHeader_button_SignIn() {return ultraHeader_button_SignIn;}
	public By ultraHeader_button_Activate() {return ultraHeader_button_Activate;}
	public By signInPage_textbox_MSISDN() {return signInPage_textbox_MSISDN;}
	public By signInPage_button_SignInViaSMS() {return signInPage_button_SignInViaSMS;}
	public By ultraHeader_dropdown_Lang_English() {return ultraHeader_dropdown_Lang_English;}
	public By ultraHeader_dropdown_Lang_Spanish() {return ultraHeader_dropdown_Lang_Spanish;}
	public By ultraHeader_dropdown_Lang_Chinese() {return ultraHeader_dropdown_Lang_Chinese;}
	public By ultraMobile_Logo() {return ultraMobile_Logo;}
	public By signInPage_textbox_Password() {return signInPage_textbox_Password;}
	public By signInPage_button_SignIn() {return signInPage_button_SignIn;}
	public By accountManagement_text_MyPlan() {return accountManagement_text_MyPlan;}
	public By ultraMenu_button_Plans() {return ultraMenu_button_Plans;}
	public By ultraMenu_button_Phones() {return ultraMenu_button_Phones;}	
	public By ultraMenu_button_INTL() {return ultraMenu_button_INTL;}	
	public By ultraMenu_button_Coverage() {return ultraMenu_button_Coverage;}	
	public By ultraMenu_button_StoreLocator() {return ultraMenu_button_StoreLocator;}
	public By ultraMenu_dropdown_Help() {return ultraMenu_dropdown_Help;}
	public By ultraMenu_image_FAQ() {return ultraMenu_image_FAQ;}
	public By ultraMenu_image_Logo() {return ultraMenu_image_Logo;}
	public By phonesPage_image_Logo() {return phonesPage_image_Logo;}
	public By coveragePage_image_Logo() {return coveragePage_image_Logo;}
	public By ultraMenu_image_Support() {return ultraMenu_image_Support;}
	public By homePage_textbox_IntlRates() {return homePage_textbox_IntlRates;}
	public By homePage_text_Korea() {return homePage_text_Korea;}
	public By homePage_text_India() {return homePage_text_India;}
	public By homePage_text_Philippines() {return homePage_text_Philippines;}
	public By homePage_button_1GBPlan_ViewDetails() {return homePage_button_1GBPlan_ViewDetails;}
	public By homePage_button_3GBPlan_ViewDetails() {return homePage_button_3GBPlan_ViewDetails;}
	public By homePage_button_6GBPlan_ViewDetails() {return homePage_button_6GBPlan_ViewDetails;}
	public By homePage_button_UnliPlan_ViewDetails() {return homePage_button_UnliPlan_ViewDetails;}
	public By slack_button_SignIn() {return slack_button_SignIn;}
	
	
}
