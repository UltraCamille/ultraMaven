package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ultra_homepage_Page {
	
	WebDriver driver;
	
	public Ultra_homepage_Page(WebDriver driver){
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
	By ultraMenu_image_Logo = By.xpath(("//a[@class='navbar-brand']"));
	By ultraMenu_image_Support = By.xpath(("//img[contains(@src,'https://www.ultramobile.com/wp-content/themes/ultramobile/images/icon-support.png')]"));
	By homePage_textbox_IntlRates = By.cssSelector("input.IntlRates-field");
	By homePage_text_Korea = By.xpath("//div[contains(text(),'South Korea')]");
	By homePage_text_India = By.xpath("//div[contains(text(),'India')]");
	By homePage_text_Philippines = By.xpath("//div[contains(text(),'Philippines')]");
	By homePage_button_1GBPlan_ViewDetails = By.xpath("//button[contains(text(),'View Details')])[1]");
	By homePage_button_3GBPlan_ViewDetails = By.xpath("//button[contains(text(),'View Details')])[2]");
	By homePage_button_6GBPlan_ViewDetails = By.xpath("//button[contains(text(),'View Details')])[3]");
	By homePage_button_UnliPlan_ViewDetails = By.xpath("//button[contains(text(),'View Details')])[4]");
	By ultraHeader_button_Activate = By.xpath("//a[contains(text(),'Activate')]");
	By slack_button_SignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By slack_workpace_URL = By.xpath("//input[@id='domain']");
	By slack_email_Address = By.xpath("//input[@id='email']");
	By slack_password = By.xpath("//input[@id='password']");
	By slack_textbox = By.tagName("p");
	By getICCID_SelectSimStatus = By.xpath("//input[@placeholder='Select Sim Status...']");
	By getICCID_InitialProductID = By.xpath("//input[@placeholder='Initial Product ID...']");
	By getICCID_Available = By.xpath("//span[contains(text(),'AVAILABLE')]");
	By getICCID_Type = By.xpath("//input[@placeholder='Type...']");
	By getICCID_PurpleSim = By.xpath("//span[contains(text(),'Purple')]");
	By getICCID_OrangeSim = By.xpath("//span[contains(text(),'Orange')]");
	By getICCID_Brand = By.xpath("//input[@placeholder='Brand...']");
	By getICCID_PRODUltra = By.xpath("//span[contains(text(),'PROD Ultra')]");
	By getICCID_button_GetICCID = By.xpath("//span[contains(text(),'Get ICCID')]");
	By getICCID_textbox_GetICCID = By.xpath("//span[@data-qa='message-text'] / code[1]");
	By ultra_image_PurpleSim = By.xpath("//img[@id='Purple']");
	By ultra_image_OrangeSim = By.xpath("//img[@id='Orange']");
	By ultra_textbox_ICCID = By.xpath("//input[@placeholder='ICCID']");
	By ultra_button_StartActivation = By.xpath("//button[@id='Button']");
	By ultra_GettingStarted_ICCID = By.xpath("//span /span");
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
	By ultraActivation_button_ActivateaNewNumber = By.xpath("//button[@id='NewNumberButton']");
	By ultraActivation_button_Checkbox = By.xpath("//label[@id='Agreement_Agree']");
	By signActivation_button_ProceedActivation = By.xpath("//button[@id='Proceed with Activating New Number']");
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
	By ultraActivation_textbox_CreditCard = By.xpath("//input[@id='CardNumber']");
	By ultraActivation_textbox_CVV = By.xpath("//input[@id='CVV']");
	By ultraActivation_textbox_ExpDate = By.xpath("//input[@id='ExpirationDate']");
	By ultraActivation_textbox_State = By.xpath("//input[@id='State']");
	By ultraActivation_textbox_Address = By.xpath("//input[@id='InputAddress1']");
	By ultraActivation_textbox_Address2 = By.xpath("//input[@id='InputAddress2']");
	By ultraActivation_textbox_City = By.xpath("//input[@id='InputCity']");
	By ultraActivation_textbox_ZipCode = By.xpath("//input[@id='InputTextZipCode']");
	By ultraActivation_button_CCContinue = By.xpath("//button[@id='ccNext']");
	By ultraActivation_button_ChargeCC = By.xpath("//button[@id='ccPathSubmit']");
	By ultraActivation_text_Complete = By.xpath("//div[contains(text(),'Activation Complete')]");
	By ultraPlansPage_text_English = By.xpath("//h1[contains(text(),'Multi-Month Plans')]");
	By ultraPhonesPage_text = By.xpath("//span[contains(text(),'Featured Products')]");
	By ultraPhones_BuyANewOne = By.xpath("//span[contains(text(),'Buy A New One')]");
	By ultraPhones_BringYourOwn = By.xpath("//span[contains(text(),'Bring Your Own')]");
	By ultraPhonesPage_button_Tablet = By.xpath("//a[@class='nav-link nav-tablets']");
	By ultraTabletsPage_text = By.xpath("//h1[contains(text(),'Tablets')]");
	By ultraINTLpage_text_English = By.xpath("//h2[contains(text(),'Connecting friends and family worldwide')]");
	By ultraCoveragePage_text_English = By.xpath("//h1[contains(text(),'Find Ultra Near You')]");
	By ultraFAQPage_text_English = By.xpath("//h1[contains(text(),'Have Questions? We Have Answers.')]");
	By ultraHomePage_text_English = By.xpath("//div[contains(text(),'See if Ultra is right for you.')]");
	By ultraHomePage_text_Spanish = By.xpath("//div[contains(text(),'Mira si Ultra es perfecto para ti')]");
	By ultraHomePage_text_Chinese = By.xpath("//div[contains(text(),'查看Ultra是否适合您使用')]");
	By ultraSupportPage_text_English = By.xpath("//h1[contains(text(),'Support')]");
	By homePage_text_1GBPlan = By.xpath("//span[contains(text(),'1GB')]");
	By homePage_text_3GBPlan = By.xpath("//span[contains(text(),'3GB')]");
	By homePage_text_6GBPlan = By.xpath("//span[contains(text(),'6GB')]");
	By ultraFooter_button_Phones = By.xpath("//a[@data-ga='Footer Menu|Phones']");
	By ultraFooter_button_Plans = By.xpath("//a[@data-ga='Footer Menu|Plans']");
	By ultraFooter_button_Tablets = By.xpath("//a[@data-ga='Footer Menu|Tablets']");
	By ultraFooter_button_Flex = By.xpath("//a[@data-ga='Footer Menu|Flex']");
	By ultraFooter_button_Tourist = By.xpath("//a[@data-ga='Footer Menu|Tourist']");
	By ultraFooter_button_PayGo = By.xpath("//a[@data-ga='Footer Menu|PayGo']");
	By ultraFooter_button_Features = By.xpath("//a[@data-ga='Footer Menu|Features']");
	By ultraFooter_button_CallChina = By.xpath("//a[@data-ga='Footer Menu|Call China']");
	By ultraFooter_button_CallMexico = By.xpath("//a[@data-ga='Footer Menu|Call Mexico']");
	By ultraFooter_button_CallIndia = By.xpath("//a[@data-ga='Footer Menu|Call India']");
	By ultraFooter_button_RAF = By.xpath("//a[@data-ga='Footer Menu|Refer A Friend']");
	By ultraFooter_button_Careers = By.xpath("//a[@data-ga='Footer Menu|Careers']");
	By ultraFooter_button_IOT = By.xpath("//a[@data-ga='Footer Menu|IOT Solutions']");
	By ultraFooter_button_News = By.xpath("//a[@data-ga='Footer Menu|In The News']");
	By ultraFooter_button_Values = By.xpath("//a[@data-ga='Footer Menu|Ultra Values']");
	By ultraFooter_button_FAQ = By.xpath("//a[@data-ga='Footer Menu|FAQ']");
	By ultraFooter_button_OrderStatus = By.xpath("//a[@data-ga='Footer Menu|Phone Order Status']");
	By ultraFooter_button_TandC = By.xpath("//a[@data-ga='Footer Menu|Plans Terms & Conditions']");
	By ultraFooter_button_PrivacyPolicy = By.xpath("//a[@data-ga='Footer Menu|Privacy Policy']");
	By ultraFooter_button_UsePolicy = By.xpath("//a[@data-ga='Footer Menu|Acceptable Use Policy']");
	By ultraFooter_button_TermsofUse = By.xpath("//a[@data-ga='Footer Menu|'Site Terms of Use']");
	By ultraFooter_button_911E911 = By.xpath("//a[@data-ga='Footer Menu|911 and E911 Disclosure']");
	By ultraFooter_button_Surcharge = By.xpath("//a[@data-ga='Footer Menu|'Prepaid MTS Surcharge']");
	By ultraFooter_button_UnlockPolicy = By.xpath("//a[@data-ga='Footer Menu|'Unlock Policy']");
	By ultraFlexPage_text_English = By.xpath("//a[contains(text(),'Features')]");
	By ultraTouristPage_text_English = By.xpath("//p[contains(text(),'The Tourist Plan is available at select T-Mobile locations')]");
	By ultraPayGoPage_text_English = By.xpath("//p[contains(text(),'The PayGo Plan is available at select T-Mobile locations')]");
	By ultraFeaturesPage_text_English = By.xpath("//h1[contains(text(),'International Roaming')]");
	By ultraCallChinaPage_text_English = By.xpath("//span[contains(text(),'FREE calling to China')]");
	By ultraCallMexicoPage_text_English = By.xpath("//span[contains(text(),'FREE calling to Mexico')]");
	By ultraCallIndiaPage_text_English = By.xpath("//span[contains(text(),'FREE calling to India')]");
	By ultraDismiss = By.xpath("//button[contains(text(),'Dismiss')]");
	By ultraRAF_text_English = By.xpath("//h1[contains(text(),'How It Works')]");
	By ultraCareers_text_English = By.xpath("//a[contains(text(),'View Our Openings')]");
	By ultraIoT_text_English = By.xpath("//p[contains(text(),'Simplifi')]");
	By ultraNews_text_English = By.xpath("//h2[contains(text(),'Ultra Mobile Newsroom')]");
	By ultraValues_text_English = By.xpath("//a[contains(text(),'UltraMobile.com')]");
	By ultraPhoneOrderStatus_text_English = By.xpath("//h1[contains(text(),'Login to My Account')]");
	By ultraTandC_text_English = By.xpath("//h1[contains(text(),'Plans Terms & Conditions')]");
	By ultraPrivacyPolicy_text_English = By.xpath("//h1[contains(text(),'Privacy Policy')]");
	By ultraUsePolicy_text_English = By.xpath("//h1[contains(text(),'Acceptable Use Policy')]");
	By ultraTermsofUse_text_English = By.xpath("//h1[contains(text(),'Site Terms of Use')]");
	By ultra911E911_text_English = By.xpath("//h1[contains(text(),'911 & E911 Disclosures')]");
	By ultraSurcharge_text_English = By.xpath("//h1[contains(text(),'Changes to Prepaid MTS Surcharge')]");
	By ultraUnlockPolicy_text_English = By.xpath("//h1[contains(text(),'Ultra Mobile Device Unlock Policy')]");
	By ultraVF_test_zipCode = By.xpath("//input[@placeholder='Enter Zip Code']");
	By ultra_textbox_INTL = By.xpath("//input[@placeholder='Enter Country']");
	By ultraVF_button_CheckCoverage = By.xpath("//button[contains(text(),'Check Coverage')]");
	By ultraVF_textbox_StreetAddress = By.xpath("//input[@placeholder='Home # and Street Address']");
	By ultraVF_button_Continue = By.xpath("//button[@class='RVF-ctaButton mt-5 RVF-Button RVF-Button-']");
	By ultraVF_dropdown_Brand = By.xpath("//div[@class='react-select__value-container css-1hwfws3']");
	By ultraVF_dropdown_Model = By.xpath("//div[@class='react-select-container react-select--is-disabled css-1whsls-container']");
	By ultraVF_textbox_IMEI = By.xpath("//input[@class='RVF-numberInput form-control']");
	By ultraVF_button_ViewPlans = By.xpath("//button[@class='RVF-ctaButton RVF-ctaButtonResults mt-lg-1 RVF-Button RVF-Button-']");
	By ultraVF_text_CheckCoverage = By.xpath("//h1[contains(text(),'Check Coverage')]");
	By ultraVF_header_CheckCoverage = By.xpath("//h2[contains(text(),'Ultra Mobile runs on the Nation’s most advanced 4G LTE high-speed network')]");
	By ultraVF_directions_CheckCoverage = By.xpath("//p[contains(text(),'Enter a street address for best results and ZIP code.')]");
	By ultraVF_results_Coverage1 = By.xpath("//h4[contains(text(),'4G LTE Coverage: ')]");
	By ultraVF_results_Coverage2 = By.xpath("//h4 /span");
	By ultraVF_results_Device = By.xpath("(//h4/span)[2]");
	By ultraAM_button_MakeAPayment = By.xpath("(//button[@type='submit'])[1]"); public By ultraAM_button_MakeAPayment() {return ultraAM_button_MakeAPayment;}
	By ultraAM_button_DataCheck = By.xpath("//button[@id='CheckData']"); 	public By ultraAM_button_DataCheck() {return ultraAM_button_DataCheck;}
	By ultraAM_button_INTLRoamingCreditCheck = By.xpath("//button[@id='CheckRoam']"); public By ultraAM_button_INTLRoamingCreditCheck() {return ultraAM_button_INTLRoamingCreditCheck;}
	By ultraAM_text_roamBalance = By.xpath("//span[@id='roamBalance']"); public By ultraAM_text_roamBalance() {return ultraAM_text_roamBalance;}
	By ultraAM_text_4GData = By.xpath("//span[@id='4GData']"); public By ultraAM_text_4GData() {return ultraAM_text_4GData;}
	By ultraAM_button_ManagePlan = By.xpath("//a[@id='ManagePlan']"); public By ultraAM_button_ManagePlan() {return ultraAM_button_ManagePlan;}
	By ultraAM_button_Home = By.xpath("//a[@id='Home']"); public By ultraAM_button_Home() {return ultraAM_button_Home;}
	By ultraAM_button_UpData = By.xpath("//a[@id='UpData']"); public By ultraAM_button_UpData() {return ultraAM_button_UpData;}
	By ultraAM_button_UpRoam = By.xpath("//a[@id='UpRoam']"); public By ultraAM_button_UpRoam() {return ultraAM_button_UpRoam;}
	By ultraAM_button_AutoRenew = By.xpath("//a[@id='AutoRecharge']"); public By ultraAM_button_AutoRenew() {return ultraAM_button_AutoRenew;}
	By ultraAM_button_LoadWallet = By.xpath("//a[@id='LoadWallet']"); public By ultraAM_button_LoadWallet() {return ultraAM_button_LoadWallet;}
	By ultraAM_button_BillingInfo = By.xpath("//a[@id='Billing']"); public By ultraAM_button_BillingInfo() {return ultraAM_button_BillingInfo;}
	By ultraAM_button_WFC = By.xpath("//a[@id='WifiCalling']"); public By ultraAM_button_WFC() {return ultraAM_button_WFC;}
	By ultraAM_button_ReferAFriend = By.xpath("//a[@id='ReferAFriend']"); public By ultraAM_button_ReferAFriend() {return ultraAM_button_ReferAFriend;}
	By ultraAM_button_TransactionHistory = By.xpath("//a[@id='TransactionHistory']"); public By ultraAM_button_TransactionHistory() {return ultraAM_button_TransactionHistory;}
	By ultraAM_button_INTLCallHistory = By.xpath("//a[@id='INTLCallHistory']"); public By ultraAM_button_INTLCallHistory() {return ultraAM_button_INTLCallHistory;}
	By ultraAM_button_Preferences = By.xpath("//a[@id='Preferences']"); public By ultraAM_button_Preferences() {return ultraAM_button_Preferences;}
	By ultraAM_button_PersonalInfo = By.xpath("//a[@id='Info']"); public By ultraAM_button_PersonalInfo() {return ultraAM_button_PersonalInfo;}
	By ultraAM_button_OrderReplacementSIM = By.xpath("//a[@id='OrderReplacementSIM']"); public By ultraAM_button_OrderReplacementSIM() {return ultraAM_button_OrderReplacementSIM;}
	By ultraAM_button_ActivateReplacementSIM = By.xpath("//a[@id='ActivateReplacementSIM']"); public By ultraAM_button_ActivateReplacementSIM() {return ultraAM_button_ActivateReplacementSIM;}
	By ultraAM_button_LogOut = By.xpath("//a[@id='LogOut']"); public By ultraAM_button_LogOut() {return ultraAM_button_LogOut;}
	By ultraAM_button_RenewNow = By.xpath("(//p[contains(text(),'Renew Now')])[1]"); public By ultraAM_button_RenewNow() {return ultraAM_button_RenewNow;}
	By ultraAM_button_Forum = By.xpath("(//p[contains(text(),'Forum')])[1]"); public By ultraAM_button_Forum() {return ultraAM_button_Forum;}
	By ultraAM_plan_3mo3gb = By.xpath("(//span[contains(text(),'TOTAL $75')])[1]"); public By ultraAM_plan_3mo3gb() {return ultraAM_plan_3mo3gb;}
	By ultraAM_plan_3mo8gb = By.xpath("(//span[contains(text(),'TOTAL $105')])[1]"); public By ultraAM_plan_3mo8gb() {return ultraAM_plan_3mo8gb;}
	By ultraAM_plan_3mo12gb = By.xpath("(//span[contains(text(),'TOTAL $135')])[1]"); public By ultraAM_plan_3mo12gb() {return ultraAM_plan_3mo12gb;}
	By ultraAM_plan_6mo3gb = By.xpath("(//span[contains(text(),'TOTAL $120')])[1]"); public By ultraAM_plan_6mo3gb() {return ultraAM_plan_6mo3gb;}
	By ultraAM_plan_6mo8gb = By.xpath("(//span[contains(text(),'TOTAL $150')])[1]"); public By ultraAM_plan_6mo8gb() {return ultraAM_plan_6mo8gb;}
	By ultraAM_plan_6mo12gb = By.xpath("(//span[contains(text(),'TOTAL $210')])[1]"); public By ultraAM_plan_6mo12gb() {return ultraAM_plan_6mo12gb;}
	By ultraAM_plan_12mo3gb = By.xpath("(//span[contains(text(),'TOTAL $180')])[1]"); public By ultraAM_plan_12mo3gb() {return ultraAM_plan_12mo3gb;}
	By ultraAM_plan_12mo8gb = By.xpath("(//span[contains(text(),'TOTAL $240')])[1]"); public By ultraAM_plan_12mo8gb() {return ultraAM_plan_12mo8gb;}
	By ultraAM_plan_12mo12gb = By.xpath("(//span[contains(text(),'TOTAL $300')])[1]"); public By ultraAM_plan_12mo12gb() {return ultraAM_plan_12mo12gb;}
	By ultraAM_checkbox_AR = By.xpath("(//div/label[@id='AutoRecharge_Enable Auto Renew'])"); public By ultraAM_checkbox_AR() {return ultraAM_checkbox_AR;}
	By ultraAM_button_SetasNextPlan = By.xpath("(//div/button[@id='SetNextBtn'])"); public By ultraAM_button_SetasNextPlan() {return ultraAM_button_SetasNextPlan;}
	By ultraAM_button_SwitchImmediately = By.xpath("(//div/button[@id='ImmediateBtn'])"); public By ultraAM_button_SwitchImmediately() {return ultraAM_button_SwitchImmediately;}
	By ultraAM_button_Updata1gb = By.xpath("//button[@id='47']"); public By ultraAM_button_Updata1gb() {return ultraAM_button_Updata1gb;}
	By ultraAM_button_Updata3gb = By.xpath("//button[@id='48']"); public By ultraAM_button_Updata3gb() {return ultraAM_button_Updata3gb;}
	By ultraAM_button_INTL$5 = By.xpath("(//td/button[@id='74'])"); public By ultraAM_button_INTL$5() {return ultraAM_button_INTL$5;}
	By ultraAM_button_INTL$10 = By.xpath("(//td/button[@id='75'])"); public By ultraAM_button_INTL$10() {return ultraAM_button_INTL$10;}
	By ultraAM_button_INTL$20 = By.xpath("(//td/button[@id='76'])"); public By ultraAM_button_INTL$20() {return ultraAM_button_INTL$20;}
	By ultraAM_switch_AROn = By.xpath("(//div/label[@id='autoRecharge_true'])"); public By ultraAM_switch_AROn() {return ultraAM_switch_AROn;}
	By ultraAM_switch_AROff = By.xpath("(//div/label[@id='autoRecharge_false'])"); public By ultraAM_switch_AROff() {return ultraAM_switch_AROff;}
	By ultraAM_button_wallet$5 = By.xpath("(//div/button[@id='5'])"); public By ultraAM_button_wallet$5() {return ultraAM_button_wallet$5;}
	By ultraAM_button_wallet$10 = By.xpath("(//div/button[@id='10'])"); public By ultraAM_button_wallet$10() {return ultraAM_button_wallet$10;}
	By ultraAM_button_wallet$20 = By.xpath("(//div/button[@id='20'])"); public By ultraAM_button_wallet$20() {return ultraAM_button_wallet$20;}
	By ultraAM_button_ChangeCCInfo = By.xpath("(//div/button[@id='toggleButton'])"); public By ultraAM_button_ChangeCCInfo() {return ultraAM_button_ChangeCCInfo;}
	By ultraAM_button_RemoveCCInfo = By.xpath("(//div/button[@id='RemoveButton'])"); public By ultraAM_button_RemoveCCInfo() {return ultraAM_button_RemoveCCInfo;}
	By ultraAM_switch_WFCenable = By.xpath("(//div/label[@id='WifiCalling_true'])"); public By ultraAM_switch_WFCenable() {return ultraAM_switch_WFCenable;}
	By ultraAM_switch_WFCdisable = By.xpath("(//div/label[@id='WifiCalling_false'])");  public By ultraAM_switch_WFCdisable() {return ultraAM_switch_WFCdisable;}
	By ultraAM_text_suspendError = By.xpath("//div[@id='InputError']"); public By ultraAM_text_suspendError() {return ultraAM_text_suspendError;}
	By ultraAM_button_Reactivate = By.xpath("//a[@id='Recharge']"); public By ultraAM_button_Reactivate() {return ultraAM_button_Reactivate;}
	By ultraAM_button_proceedToRenew = By.xpath("//div/button[@id='SetNextBtn']"); public By ultraAM_button_proceedToRenew() {return ultraAM_button_proceedToRenew;}
	By ultraAM_button_paymentMethodCC = By.xpath("//div/label[@id='PaymentMethod_cc']"); public By ultraAM_button_paymentMethodCC() {return ultraAM_button_paymentMethodCC;}
	By ultraAM_button_paymentMethodWallet = By.xpath("//div/label[@id='PaymentMethod_wallet']"); public By ultraAM_button_paymentMethodWallet() {return ultraAM_button_paymentMethodWallet;}
	By ultraAM_button_purchaseNow = By.xpath("//button[contains(text(),'Purchase Now')]"); public By ultraAM_button_purchaseNow() {return ultraAM_button_purchaseNow;}
	By ultraAM_amount_data = By.xpath("//div/span[@id='4GData']");	public By ultraAM_amount_data() {return ultraAM_amount_data;}
	By ultraAM_amount_roam = By.xpath("//div/span[@id='roamBalance']");	public By ultraAM_amount_roam() {return ultraAM_amount_roam;}
	By ultraAM_amount_wallet = By.xpath("//span[@id='walletNum']");	public By ultraAM_amount_wallet() {return ultraAM_amount_wallet;}
	By ultraAM_checkbox_terms = By.xpath("//label[@id='terms_I agree to the Site Terms of Use']"); public By ultraAM_checkbox_terms() {return ultraAM_checkbox_terms;}
	By ultraAM_button_submit = By.xpath("//button[@type='submit']"); public By ultraAM_button_submit() {return ultraAM_button_submit;}
	By ultraAM_textbox_firstName = By.xpath("//input[@id='InputFirstName']"); public By ultraAM_textbox_firstName() {return ultraAM_textbox_firstName;}
	By ultraAM_textbox_lastName = By.xpath("//input[@id='InputLastName']"); public By ultraAM_textbox_lastName() {return ultraAM_textbox_lastName;}	 
	By ultraAM_textbox_email = By.xpath("//input[@id='InputTextEmail']"); public By ultraAM_textbox_email() {return ultraAM_textbox_email;}	 
	By ultraAM_textbox_password = By.xpath("//input[@id='InputGroupPassword']"); public By ultraAM_textbox_password() {return ultraAM_textbox_password;}
	By ultraAM_textbox_passwordConfirm = By.xpath("//input[@id='InputGroupPasswordConfirm']"); public By ultraAM_textbox_passwordConfirm() {return ultraAM_textbox_passwordConfirm;}
	By ultraAM_promo_emails = By.xpath("//label[@id='promotional_Emails']"); public By ultraAM_promo_emails() {return ultraAM_promo_emails;}
	By ultraAM_promo_SMS = By.xpath("//label[@id='promotional_SMS']"); public By ultraAM_promo_SMS() {return ultraAM_promo_SMS;}
	By ultraAM_promo_phoneCalls = By.xpath("//label[@id='promotional_Phone Calls']"); public By ultraAM_promo_phoneCalls() {return ultraAM_promo_phoneCalls;}
	By ultraAM_button_myAccount = By.xpath("(//div[contains(text(),'My Account')])[1]"); public By ultraAM_button_myAccount() {return ultraAM_button_myAccount;}
	By ultraAM_button_plan$16 = By.xpath("(//div[contains(text(),'$16')])[2]"); public By ultraAM_button_plan$16() {return ultraAM_button_plan$16;}
	By ultraAM_button_plan$19 = By.xpath("(//div[contains(text(),'$19')])[1]"); public By ultraAM_button_plan$19() {return ultraAM_button_plan$19;}
	By ultraAM_text_purchaseConfirmation = By.xpath("//div[contains(text(),'Purchase Confirmation')]");  public By ultraAM_text_purchaseConfirmation() {return ultraAM_text_purchaseConfirmation;}

	
	
	//--
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
	public By ultraVF_button_CheckCoverage() { return ultra_textbox_INTL;}
	public By ultraVF_textbox_StreetAddress() { return ultraVF_textbox_StreetAddress;}
	public By ultraVF_test_zipCode() { return ultra_textbox_INTL;}
	public By ultra_textbox_INTL() {
		return ultra_textbox_INTL;
	}
	//--
	public By ultraTandC_text_English() {
		return ultraTandC_text_English;
	}
	public By ultraPrivacyPolicy_text_English() {
		return ultraPrivacyPolicy_text_English;
	}
	public By ultraUsePolicy_text_English() {
		return ultraUsePolicy_text_English;
	}
	public By ultraTermsofUse_text_English() {
		return ultraTermsofUse_text_English;
	}
	public By ultra911E911_text_English() {
		return ultra911E911_text_English;
	}
	public By ultraSurcharge_text_English() {
		return ultraSurcharge_text_English;
	}
	public By ultraUnlockPolicy_text_English() {
		return ultraUnlockPolicy_text_English;
	}
	
	public By ultraRAF_text_English() {
		return ultraRAF_text_English;
	}
	public By ultraCareers_text_English() {
		return ultraCareers_text_English;
	}
	public By ultraIoT_text_English() {
		return ultraIoT_text_English;
	}
	public By ultraPhones_BuyANewOne() {
		return ultraPhones_BuyANewOne;
	}
	public By ultraPhones_BringYourOwn() {
		return ultraPhones_BringYourOwn;
	}
	public By ultraNews_text_English() {
		return ultraNews_text_English;
	}
	public By ultraValues_text_English() {
		return ultraValues_text_English;
	}
	public By ultraPhoneOrderStatus_text_English() {
		return ultraPhoneOrderStatus_text_English;
	}

	public By ultraDismiss() {
		return ultraDismiss;
	}
	public By ultraCallChinaPage_text_English() {
		return ultraCallChinaPage_text_English;
	}
	public By ultraCallMexicoPage_text_English() {
		return ultraCallMexicoPage_text_English;
	}
	public By ultraCallIndiaPage_text_English() {
		return ultraCallIndiaPage_text_English;
	}
	public By ultraFeaturesPage_text_English() {
		return ultraFeaturesPage_text_English;
	}
	public By ultraPayGoPage_text_English() {
		return ultraPayGoPage_text_English;
	}
	public By ultraTouristPage_text_English() {
		return ultraTouristPage_text_English;
	}
	public By ultraFlexPage_text_English() {
		return ultraFlexPage_text_English;
	}
	
	public By ultraFooter_button_Phones() {
		return ultraFooter_button_Phones;
	}
	public By ultraFooter_button_Plans() {
		return ultraFooter_button_Plans;
	}
	public By ultraFooter_button_Tablets() {
		return ultraFooter_button_Tablets;
	}
	public By ultraFooter_button_Flex() {
		return ultraFooter_button_Flex;
	}
	public By ultraFooter_button_Tourist() {
		return ultraFooter_button_Tourist;
	}
	public By ultraFooter_button_PayGo() {
		return ultraFooter_button_PayGo;
	}
	public By ultraFooter_button_Features() {
		return ultraFooter_button_Features;
	}
	public By ultraFooter_button_CallChina() {
		return ultraFooter_button_CallChina;
	}
	public By ultraFooter_button_CallMexico() {
		return ultraFooter_button_CallMexico;
	}
	public By ultraFooter_button_CallIndia() {
		return ultraFooter_button_CallIndia;
	}
	public By ultraFooter_button_RAF() {
		return ultraFooter_button_RAF;
	}
	public By ultraFooter_button_Careers() {
		return ultraFooter_button_Careers;
	}
	public By ultraFooter_button_IOT() {
		return ultraFooter_button_IOT;
	}
	public By ultraFooter_button_News() {
		return ultraFooter_button_News;
	}
	public By ultraFooter_button_Values() {
		return ultraFooter_button_Values;
	}
	public By ultraFooter_button_FAQ() {
		return ultraFooter_button_FAQ;
	}
	public By ultraFooter_button_OrderStatus() {
		return ultraFooter_button_OrderStatus;
	}
	public By ultraFooter_button_TandC() {
		return ultraFooter_button_TandC;
	}
	public By ultraFooter_button_PrivacyPolicy() {
		return ultraFooter_button_PrivacyPolicy;
	}
	public By ultraFooter_button_UsePolicy() {
		return ultraFooter_button_UsePolicy;
	}
	public By ultraFooter_button_TermsofUse() {
		return ultraFooter_button_TermsofUse;
	}
	public By ultraFooter_button_911E911() {
		return ultraFooter_button_911E911;
	}
	public By ultraFooter_button_Surcharge() {
		return ultraFooter_button_Surcharge;
	}
	public By ultraFooter_button_UnlockPolicy() {
		return ultraFooter_button_UnlockPolicy;
	}
	
//	--------
	public By homePage_text_3GBPlan() {
		return homePage_text_3GBPlan;
	}
	public By homePage_text_6GBPlan() {
		return homePage_text_6GBPlan;
	}
	public By homePage_text_1GBPlan() {
		return homePage_text_1GBPlan;
	}
	public By ultraSupportPage_text_English() {
		return ultraSupportPage_text_English;
	}
	public By ultraFAQPage_text_English() {
		return ultraFAQPage_text_English;
	}
	public By ultraHomePage_text_English() {
		return ultraHomePage_text_English;
	}
	public By ultraHomePage_text_Spanish() {
		return ultraHomePage_text_Spanish;
	}
	public By ultraHomePage_text_Chinese() {
		return ultraHomePage_text_Chinese;
	}
	public By ultraCoveragePage_text_English() {
		return ultraCoveragePage_text_English;
	}
	public By ultraPhonesPage_button_Tablet() {
		return ultraPhonesPage_button_Tablet;
	}
	public By ultraTabletsPage_text() {
		return ultraTabletsPage_text;
	}
	public By ultraINTLpage_text_English() {
		return ultraINTLpage_text_English;
	}
	public By ultraPhonesPage_text() {
		return ultraPhonesPage_text;
	}
	public By ultraPlansPage_text_English() {
		return ultraPlansPage_text_English;
	}
	public By ultraActivation_text_Complete() {
		return ultraActivation_text_Complete;
	}
	public By ultraActivation_button_ChargeCC() {
		return ultraActivation_button_ChargeCC;
	}
	public By ultraActivation_textbox_State() {
		return ultraActivation_textbox_State;
	}
	public By ultraActivation_textbox_ExpDate() {
		return ultraActivation_textbox_ExpDate;
	} public By ultraActivation_textbox_FirstName() {
		return ultraActivation_textbox_FirstName;
	}		
	public By ultraActivation_textbox_LastName() {
		return ultraActivation_textbox_LastName;
	}		public By ultraActivation_textbox_Email() {
		return ultraActivation_textbox_Email;
	}		
	public By ultraActivation_textbox_UserName() {
		return ultraActivation_textbox_UserName;
	}		
		public By ultraActivation_textbox_Password() {
		return ultraActivation_textbox_Password;
	}	public By ultraActivation_textbox_ConfirmPassword() {
		return ultraActivation_textbox_ConfirmPassword;
	}	public By ultraActivation_button_SubmitInfo() {
		return ultraActivation_button_SubmitInfo;
	}	public By ultraActivation_button_CreditCard() {
		return ultraActivation_button_CreditCard;
	}	public By ultraActivation_textbox_CreditCard() {
		return ultraActivation_textbox_CreditCard;
	}	public By ultraActivation_textbox_CVV() {
		return ultraActivation_textbox_CVV;
	}	public By ultraActivation_textbox_Address() {
		return ultraActivation_textbox_Address;
	}	public By ultraActivation_textbox_Address2() {
		return ultraActivation_textbox_Address2;
	}	public By ultraActivation_textbox_City() {
		return ultraActivation_textbox_City;
	}	public By ultraActivation_textbox_ZipCode() {
		return ultraActivation_textbox_ZipCode;
	}	public By ultraActivation_button_CCContinue() {
		return ultraActivation_button_CCContinue;
	}
	public By ultraActivation_button_Checkbox() {
		return ultraActivation_button_Checkbox;
	}	
	public By signActivation_button_ProceedActivation() {
		return signActivation_button_ProceedActivation;
	}	
	public By ultraActivation_plan_3Mo1Gb() {
		return ultraActivation_plan_3Mo1Gb;
	}	
	public By ultraActivation_plan_3Mo3Gb() {
		return ultraActivation_plan_3Mo3Gb;
	}	
	public By ultraActivation_plan_3Mo6Gb() {
		return ultraActivation_plan_3Mo6Gb;
	}
	public By ultraActivation_plan_3MoUnli() {
		return ultraActivation_plan_3MoUnli;
	}
	public By ultraActivation_plan_6Mo1Gb() {
		return ultraActivation_plan_6Mo1Gb;
	}
	public By ultraActivation_plan_6Mo3Gb() {
		return ultraActivation_plan_6Mo3Gb;
	}
	public By ultraActivation_plan_6Mo6Gb() {
		return ultraActivation_plan_6Mo6Gb;
	}
	public By ultraActivation_plan_6MoUnli() {
		return ultraActivation_plan_6MoUnli;
	}
	public By ultraActivation_plan_12Mo1Gb() {
		return ultraActivation_plan_12Mo1Gb;
	}
	public By ultraActivation_plan_12Mo3Gb() {
		return ultraActivation_plan_12Mo3Gb;
	}
	public By ultraActivation_plan_12Mo6Gb() {
		return ultraActivation_plan_12Mo6Gb;
	}
	public By ultraActivation_plan_12MoUnli() {
		return ultraActivation_plan_12MoUnli;
	}
	public By ultraActivation_plan_19() {
		return ultraActivation_plan_19;
	}
	public By ultraActivation_plan_23() {
		return ultraActivation_plan_23;
	}
	public By ultraActivation_plan_29() {
		return ultraActivation_plan_29;
	}
	public By ultraActivation_plan_49() {
		return ultraActivation_plan_49;
	}
	public By ultraActivation_button_ActivateaNewNumber() {
		return ultraActivation_button_ActivateaNewNumber;
	}
	public By ultraActivation_textbox_InputZipCode() {
		return ultraActivation_textbox_InputZipCode;
	}
	public By getICCID_InitialProductID() {
		return getICCID_InitialProductID;
	}
	public By getICCID_PIPNEW() {
		return getICCID_PIPNEW;
	}
	public By getICCID_DispatchEnv() {
		return getICCID_DispatchEnv;
	}
	public By ultra_Activations_GettingStarted() {
		return ultra_Activations_GettingStarted;
	}
	public By chrome_button_ClearCache() {
		return chrome_button_ClearCache;
	}
//	public By ultra_GettingStarted_ICCID() {
//		return ultra_GettingStarted_ICCID;
//	}
	public By ultra_button_StartActivation() {
		return ultra_button_StartActivation;
	}
	public By getICCID_Brand() {
		return getICCID_Brand;
	}
	public By ultra_textbox_ICCID() {
		return ultra_textbox_ICCID;
	}
	public By ultra_image_PurpleSim() {
		return ultra_image_PurpleSim;
	}
	public By ultra_image_OrangeSim() {
		return ultra_image_OrangeSim;
	}
	public By getICCID_button_GetICCID() {
		return getICCID_button_GetICCID;
	}
	public By getICCID_textbox_GetICCID() {
		return getICCID_textbox_GetICCID;
	}
	public By getICCID_PRODUltra() {
		return getICCID_PRODUltra;
	}
	public By slack_textbox() {
		return slack_textbox;
	}
	public By getICCID_Type() {
		return getICCID_Type;
	}
	public By getICCID_OrangeSim() {
		return getICCID_OrangeSim;
	}
	public By getICCID_PurpleSim() {
		return getICCID_PurpleSim;
	}
	public By getICCID_Available() {
		return getICCID_Available;
	}
	public By getICCID_SelectSimStatus() {
		return getICCID_SelectSimStatus;
	}
	public By slack_email_Address() {
		return slack_email_Address;
	}
	public By slack_password() {
		return slack_password;
	}
	public By slack_workpace_URL() {
		return slack_workpace_URL;
	}
	
	public By ultraHeader_button_SignIn() {
		return ultraHeader_button_SignIn;
	}
	public By ultraHeader_button_Activate() {
		return ultraHeader_button_Activate;
	}
	public By signInPage_textbox_MSISDN() {
		return signInPage_textbox_MSISDN;
	}
	public By signInPage_button_SignInViaSMS() {
		return signInPage_button_SignInViaSMS;
	}
	public By ultraHeader_dropdown_Lang_English() {
		return ultraHeader_dropdown_Lang_English;
	}
	public By ultraHeader_dropdown_Lang_Spanish() {
		return ultraHeader_dropdown_Lang_Spanish;
	}
	public By ultraHeader_dropdown_Lang_Chinese() {
		return ultraHeader_dropdown_Lang_Chinese;
	}
	public By ultraMobile_Logo() {
		return ultraMobile_Logo;
	}
	public By signInPage_textbox_Password() {
		return signInPage_textbox_Password;
	}
	public By signInPage_button_SignIn() {
		return signInPage_button_SignIn;
	}
	public By accountManagement_text_MyPlan() {
		return accountManagement_text_MyPlan;
	}
	public By ultraMenu_button_Plans() {
		return ultraMenu_button_Plans;
	}
	public By ultraMenu_button_Phones() {
		return ultraMenu_button_Phones;
	}	
	public By ultraMenu_button_INTL() {
		return ultraMenu_button_INTL;
	}	
	public By ultraMenu_button_Coverage() {
		return ultraMenu_button_Coverage;
	}	
	public By ultraMenu_button_StoreLocator() {
		return ultraMenu_button_StoreLocator;
	}
	public By ultraMenu_dropdown_Help() {
		return ultraMenu_dropdown_Help;
	}
	public By ultraMenu_image_FAQ() {
		return ultraMenu_image_FAQ;
	}
	public By ultraMenu_image_Logo() {
		return ultraMenu_image_Logo;
	}
	public By phonesPage_image_Logo() {
		return phonesPage_image_Logo;
	}
	public By coveragePage_image_Logo() {
		return coveragePage_image_Logo;
	}
	public By ultraMenu_image_Support() {
		return ultraMenu_image_Support;
	}
	
	public By homePage_textbox_IntlRates() {
		return homePage_textbox_IntlRates;
	}
	
	public By homePage_text_Korea() {
		return homePage_text_Korea;
	}
	public By homePage_text_India() {
		return homePage_text_India;
	}
	public By homePage_text_Philippines() {
		return homePage_text_Philippines;
	}
	public By homePage_button_1GBPlan_ViewDetails() {
		return homePage_button_1GBPlan_ViewDetails;
	}
	public By homePage_button_3GBPlan_ViewDetails() {
		return homePage_button_3GBPlan_ViewDetails;
	}
	public By homePage_button_6GBPlan_ViewDetails() {
		return homePage_button_6GBPlan_ViewDetails;
	}
	public By homePage_button_UnliPlan_ViewDetails() {
		return homePage_button_UnliPlan_ViewDetails;
	}
	public By slack_button_SignIn() {
		return slack_button_SignIn;
	}
	
}
