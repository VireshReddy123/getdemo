package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.DateGenerator;
import org.automation.utilities.ExplicitWait;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreateServicePage extends BasePage {

    DateGenerator dateGeneration = new DateGenerator();
    static String waterPlan = "Water Flat Template Plan";
    static String gasPlan = "Gas Flat Template Plan";
    static String notesstr = "Editing done";
    public By searchBtn = By.xpath("//button[@id='btn_search']");
    public By recordId = By.xpath("//input[@id='search_input']");
    public By Overviewtab = By.xpath("//i[@class='icon-eye-open']");
    public By AddRetailelect = By.xpath("(//a[@class='addicon'])[2]");
    public By SelectPlan = By.xpath("//select[@id='planNo']");
    public By MeterNo = By.xpath("//input[@id='userName']");
    public By MeterConfig = By.xpath("//select[@id='meterConfig']");
    public By ReadType = By.xpath("//select[@id='readType']");
    public By DemandReadsToggle = By.xpath("//span[@class='switch-label']");
    public By CreateElectServ = By.xpath("//*[@class='btn btn-mini btn-primary']");
    public By OK_btn = By.xpath("//button[text()='OK']");
    public By CreatedElectServc = By.xpath("//td[@class='sorting_1']");
    public By CreateWaterSrvc = By.xpath("//button[@id='createServBtn']");
    public By AddWaterServc = By.xpath("(//i[@class='icon-plus'])[4]");
    public By AddGasServc = By.xpath("(//a[@class='addicon'])[1]");
    public By NotesSectn = By.xpath("//textarea[@name='notes']");
    public By SaveServiceChanges = By.xpath("(//a[@class='btn btn-primary'])[4]");
    public By ChangesSavedText = By.xpath("//p[@class='message']");
    public By addProrata = By.xpath("//a[@class='btn btn-primary']");
    public By NewProRataDate = By.xpath("//input[@class='date-picker readOnlyText']");
    public By MoveOutbtn = By.xpath("//i[@class='icon-signout']");
    public By MoveOutOK = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public By AddGenericService = By.xpath("(//a[@class='addicon'])[6]");
    public By ProductDesc = By.xpath("//input[@id='meterName']");
    public By ProrataDate = By.xpath("//input[@id='start-date']");
    public By Todaydate = By.xpath("//td[@class='active day']");
    public By Quantity = By.xpath("//input[@id='quantity']");
    public By RollupDesc = By.xpath("//input[@id='rollup-desc']");
    public By ChargeType = By.xpath("//select[@id='charge-type']");
    public By UnitType = By.xpath("//select[@id='unit-type']");
    public By Rate = By.xpath("//input[@id='rate']");
    public By SaveServ = By.xpath("//button[@id='saveSrv']");
    public By OKbtn = By.xpath("//button[text()='OK']");
    public By Finishbtn = By.xpath("//button[@id='finishBtn']");
    public By Services = By.xpath("//ul[@class='nav nav-tabs']/li[3]");
    public By ManageService = By.xpath("//button[@class='btn btn-primary toolt']");
    public By UpdtServc = By.xpath("//a[@id='updateSrv']");
    public By UpdtAllert = By.xpath("//div[@id='successAlert']");
    public By NewDay = By.xpath("//td[@class='new day']");
    public By MovereadDate = By.xpath("//input[@id='moveOutDate']");
    public By FinalreadDate = By.xpath("//input[@id='finalreaddate']");
    public By FinalRead = By.xpath("//input[@name='finalRead']");
    public By ContmoveOut = By.xpath("//a[@name='continueMoveOut']");
    public By MoveOutConfOK = By.xpath("(//button[text()='OK'])[2]");
    public By SuccessMoveOutMsg = By.xpath("//p[@class='message']");
    public By GenServcExpand = By.xpath("//i[@class='pull-right icon-chevron-down']");
    public By CreatedGenericService = By
            .xpath("//*[@id='content']/div[2]/div[3]/div[1]/div[1]/ul[2]/li/ul/li/span/span[1]/a");
    public By AssertElectricity = By.xpath("//tr[@class='odd']/td[2]");
    public By EditWaterPlan = By.xpath("//select[@id='planNo']");
    public By serviceType = By.id("serviceType");
    public By marketType = By.id("marketTypeSel");
    public By transferType = By.id("transferType");
    public By water = By.xpath("(//a[@class='addicon'])[4]");
    public By gas = By.xpath("//i[@class='icon-fire']/../../a[1]");
    public By generic = By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div[1]/div[1]/ul[2]/li/a[1]/i");
    public By chargeToggle  = By.id("chargeToggle");
    public By productDescription = By.id("meterName");
    public By prorataDate = By.id("start-date");
    public By currentProrataDate = By.xpath("//div[@class='datepicker-days']//tr/td[@class='active day']");
    public By endDate = By.id("end-date");
    public By quantity  = By.id("quantity");
    public By notes = By.id("notes");
    public By chargeDescription = By.id("charge-desc");
    public By rollupDescription = By.id("rollup-desc");
    public By chargeType = By.id("charge-type");
    public By unitType = By.id("unit-type");
    public By rate = By.id("rate");
    public By saveService = By.id("saveSrv");
    public By okButton = By.xpath("(//*[@class='btn btn-primary'])[2]");
    public By finish = By.id("finishBtn");
    public By services = By.xpath("(//*[@class='icon-user'])[5]");
    public By editService = By.xpath("(//*[@class='btn btn-primary toolt'])[1]");
    public By updateService = By.id("updateSrv");
    public By editOkButton = By.xpath("(//*[@class='btn btn-primary'])[2]");

    public By proRataDate = By.id("proRataDate");
    public By prevMonthArrow = By.xpath("(//*[@class='prev'])[1]");

    public By previousDate = By.xpath("/html/body/div[12]/div[1]/table/tbody/tr[3]/td[5]");
    public By SUCCESSALERT = By.id("successAlert");

    String SUCCESS_MESG = "Generic service is successfully saved.";

    public void validateUpdateService(String validateText) {
    	 scrollIntoView(services);
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(SUCCESSALERT));
    }

    public void clickFinish() {
    	click_custom(finish);
    }

    public void clickProRataDate() {
        click_custom(proRataDate);
    }

    public void clickPrevMonthArrow() {
        click_custom(prevMonthArrow);
    }

    public void clickPreviousDate() {
        click_custom(previousDate);
    }

    public void clickUpdateService() throws InterruptedException {
    	 scrollIntoView(updateService);
    	click_custom(updateService);
    	Thread.sleep(1000);
    	click_custom(editOkButton);
    }

    public void clickEditService() {
    	 scrollIntoView(editService);
    	click_custom(editService);
    }

    public void clickEditService(String serviceName) {
        By var =  By.xpath("//td[contains(text(),'"+serviceName+"')]/../td[9]/button");
        scrollIntoView(var);
        click_custom( var);
    }

    public void clickChargeToggle() {
    	click_custom(chargeToggle);
    }

    public void enterProductDescription(String productText) {
 	        sendKeys_withClear(productDescription, productText);
 	    }

    public void enterProrataDate(String prorataText) {
	        sendKeys_withClear(prorataDate, prorataText);
	    }

    public void enterEndDate(String dateText) {
	        sendKeys_withClear(endDate, dateText);
	    }

    public void enterQuantity(String quantityText) {
	        sendKeys_withClear(quantity, quantityText);
	    }

    public void enterNotes(String notesText) {
	        sendKeys_withClear(notes, notesText);
	    }

    public void enterChargeDescription(String chargeText) {
	        sendKeys_withClear(chargeDescription, chargeText);
	        WebdriverWaits.waitForElementVisible(rollupDescription, 2);

	    }
    public void enterRollupDescription(String rollupText) {
    	WebdriverWaits.waitForElementVisible(rollupDescription, 2);
        sendKeys_withClear(rollupDescription, rollupText);
    }

    public void enterRate(String rateText) {

        sendKeys_withClear(rate, rateText);
        scrollIntoView(saveService);

    }

    public void selectChargeType(String typeText) {
    	click_custom(chargeType);
        WebdriverWaits.waitForElementVisible(chargeType, 2);
        selectDropDownByVisibleText_custom(chargeType, typeText);

    }

    public void selectUnitType(String unitText) {
    	click_custom(unitType);
        WebdriverWaits.waitForElementVisible(unitType, 3);
        selectDropDownByVisibleText_custom(unitType, unitText);
    }

    public void clickSaveService(){
    	click_custom(saveService);
    	click_custom(okButton);

    }

    public void selectProrataDate(String prorataText){
    	click_custom(prorataDate, prorataText);
    	click_custom(currentProrataDate, prorataText);

    }
    public void selectEndDate(String endText){
    	click_custom(endDate,endText);
    }

    Assertions as;
    String SUCCESS_MSG = "Electricity";

    public void clickWaterService() {
    	click_custom(water);
    }

    public void selectTransferType(String TransferType) {
    	click_custom(transferType, "Type");
        selectDropDownByVisibleText_custom(transferType, TransferType, "Type");
    }


    public void selectMarketType(String MarketType) {
    	click_custom(marketType, "Type");
        selectDropDownByVisibleText_custom(marketType, MarketType, "Type");
    }


    public void selectServiceType(String ServiceType) {
    	click_custom(serviceType, "Type");
        selectDropDownByVisibleText_custom(serviceType, ServiceType, "Type");
    }

    public void clickOnOverview() {
        click_custom(Overviewtab, "Overview");
    }

    public void clickGenericService() {

    	click_custom(generic, "Generic Service");
    }

    public void clickRetailElectricity() {
        click_custom(AddRetailelect, "Retail Electricity Icon");
    }

    public void clickWaterElectricity() {
    	click_custom(water, "Water Icon");
    }


    public void clickGasElectricity() {
    	click_custom(gas, "Gas Icon");
    }



    public void selectPlan(String selectPlanText) {
      //  click_custom(SelectPlan, "Plan");
        selectDropDownByVisibleText_custom(SelectPlan, selectPlanText, "Plan");
        
       
    }

    public void enterMeterNumber() {
        //dateGeneration.getCurrentDate(-29);
        DateFormat dateFormat = new SimpleDateFormat("HHmmss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
        String mno = cal.getTime().toString();
        System.out.println(mno = mno.substring(11, 19));
        mno = mno.replaceAll(":", "");
        sendKeys_custom(MeterNo, "Ele" + mno, "First Name");
        String MeterNumberEntered = getText_custom(MeterNo);
        scrollIntoView(MeterConfig);
        System.out.println("........");
        System.out.println(MeterNumberEntered);
    }

    public void selectMeterConfiguration(String MeterConfigurationText) {
        clickBtn_custom(MeterConfig, "Meter Configuration");
        selectDropDownByVisibleText_custom(MeterConfig, MeterConfigurationText, "Meter Configuration");
      //  scrollIntoView(CreateElectServ);
    }

    public void selectreadType(String readingTypeText) {
        scrollIntoView(ReadType);
        click_custom(ReadType, "Reading Type");
        selectDropDownByVisibleText_custom(ReadType, readingTypeText, "Reading Type");
    }

    public void clickDemandToggleButton() {
        click_custom(DemandReadsToggle, "Enable Demand Type");

    }

    public void clickCreateService() {
        scrollIntoView(CreateElectServ);
        click_custom(CreateElectServ, "Create Service");

    }

    public void clickOkButton() {
        click_custom(OK_btn, "Ok");

    }

    public void clickServices() {
    	click_custom(services);

    }

    public String createNewRetailElectrcityService() {
        WebdriverWaits.waitForElementVisible(AssertElectricity, 10);
        return getText_custom(AssertElectricity);
    }

    public void clickOnSearchBtn(String recordIdText) throws InterruptedException
    {
    	sendKeys_custom(recordId, recordIdText, "Record Id");
    	WebdriverWaits.waitForElementVisible(searchBtn, 10);
    //	Thread.sleep(4000);
    	click_custom(searchBtn, "Search icon");

    }
    public void clickkOnSearchBtn(String recordIdText) {
        sendKeys_custom(recordId, recordIdText, "Record Id");
        WebdriverWaits.waitForElementVisible(searchBtn, 10);
        click_custom(searchBtn, "Search icon");
    }

    public void newRetailElectricitySevice(String recordIdText, String selectPlanText, String MeterConfigurationText, String readingTypeText) throws InterruptedException {
        // 1. Customer is already created using Customer flow.
        // 2. Adding electricity service to a customer.
        // 3. Overview > Electricity
        as = new Assertions();
        DateGenerator dateGenerator = new DateGenerator();
        clickOnSearchBtn(recordIdText);
        clickOnOverview();
        clickRetailElectricity();
        //  Thread.sleep(1000);
        selectPlan(selectPlanText);
        enterMeterNumber();
        selectMeterConfiguration(MeterConfigurationText);
        selectreadType(readingTypeText);

        clickDemandToggleButton();
        clickProRataDate();
        clickPrevMonthArrow();
        clickPrevMonthArrow();

        clickPreviousDate();

        clickCreateService();
        clickOkButton();
        as.assertEquals(createNewRetailElectrcityService(), SUCCESS_MSG);
    }
    public void addProvisioning(String ServiceType, String MarketType, String TransferType) throws InterruptedException {
        selectServiceType(ServiceType);
        selectMarketType(MarketType);
        selectTransferType(TransferType);

    }

    public void addTransferDetails(String servicType , String marketTYpe , String transferType) throws InterruptedException {
        // 1. Customer is already created using Customer flow.
        // 2. Adding electricity service to a customer.
        // 3. Overview > Electricity
    }

    public void waterSevice(String recordIdText,String selectPlanText, String MeterConfigurationText, String readingTypeText) throws InterruptedException {
        // 1. Customer is already created using Customer flow.
        // 2. Adding water service to a customer.
        // 3. Overview > Water
        as = new Assertions();
        clickOnSearchBtn(recordIdText);
        clickOnOverview();
        clickWaterService();
        Thread.sleep(3000);
        selectPlan(selectPlanText);
        enterMeterNumber();
        Thread.sleep(2000);
        selectMeterConfiguration(MeterConfigurationText);
        selectreadType(readingTypeText);
        Thread.sleep(2000);
        clickCreateService();
        clickOkButton();

    }

    public void gasService(String recordIdText,String selectPlanText, String MeterConfigurationText, String readingTypeText) throws InterruptedException {
        // 1. Customer is already created using Customer flow.
        // 2. Adding water service to a customer.
        // 3. Overview > Water
        as = new Assertions();
        clickOnSearchBtn(recordIdText);
        clickOnOverview();
        clickGasElectricity();
        Thread.sleep(3000);
        selectPlan(selectPlanText);
        enterMeterNumber();
        Thread.sleep(2000);
        selectMeterConfiguration(MeterConfigurationText);
        selectreadType(readingTypeText);
        Thread.sleep(2000);
        clickCreateService();
        clickOkButton();
    }


    public void genericService(String recordIdText,String productText,String prorataText,String dateText,String quantityText,String notesText,String chargeText,String rollupText,String typeText ,String unitText, String rateText) throws InterruptedException {
    	 as = new Assertions();
         clickOnSearchBtn(recordIdText);
         Thread.sleep(2000);
         clickGenericService();
         Thread.sleep(2000);
      //   clickChargeToggle();
         enterProductDescription(productText);
         selectProrataDate(prorataText);
         enterQuantity(quantityText);
         enterNotes(notesText);
         enterRollupDescription(rollupText);
         selectChargeType(typeText);
         Thread.sleep(1000);
         selectUnitType(unitText);
         enterRate(rateText);
         Thread.sleep(2000);
         clickSaveService();
         clickFinish();

    }

    public void editGenericService(String productText,String quantityText,String notesText,String rollupText,String typeText ,String unitText,String validateText) throws InterruptedException {
   	 as = new Assertions();
        clickServices();
        clickEditService(productText);
        enterProductDescription(productText+"Description");
        enterQuantity(quantityText);
        enterNotes(notesText);
        enterRollupDescription(rollupText);
        selectChargeType(typeText);
        Thread.sleep(2000);
        selectUnitType(unitText);
     //   enterRate(rateText);
        clickUpdateService();
        validateUpdateService(validateText);

    }

}
