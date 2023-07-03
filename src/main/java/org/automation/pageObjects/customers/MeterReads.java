package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.automation.utilities.RandomGenerator;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MeterReads extends BasePage {
    public By AddMeterIcon = By.xpath("//a[@id='addMeter']/i");
    public By MeterSerialNumber_Field = By.xpath("//*[@id='meterNo']");
    public By ConfigurationType_Dropdown = By.xpath("//*[@id='configurationType']");
    public By ConfigurationType_Opn = By.xpath("//option[text()='POS']");
    public By LastTestdate_Datepiker = By.xpath("//*[@id='maintenanceDate']");
    public By Select_LastTestdate_Datepiker = By.xpath("//td[@class='active day']");
    public By DateConnected_Datepicker = By.xpath("//*[@id='datecon']");
    public By Select_DateConnected_Datepicker = By.xpath("//*[@class='active day']");
    public By CreateMeter_Button = By.xpath("//*[@id='createMeter']");
    public By MeterEdit_icon = By.xpath("//*[@class='icon-edit']");
    public By AddMeterRegister_Icon = By.xpath("//*[@id='addRegister']");
    public By RegisterID_Field = By.xpath("//*[@id='registerNo']");
    public By NetworkTariffCode_Field = By.xpath("//*[@id='networkTariffCode']");
    public By UnitOfMeasure_Field = By.xpath("//*[@id='unitOfMeasure']");
    public By TimeofDay_Field = By.xpath("//*[@id='timeOfDay']");
    public By DialFormat_Field = By.xpath("//*[@id='dialFormat']");
    public By Demand1_Field = By.xpath("//*[@id='demand1']");
    public By Demand2_Field = By.xpath("//*[@id='demand2']");
    public By NMISuffix_Field = By.xpath("//*[@id='nmiSuffix']");
    public By DateConnectedDatepicker = By.xpath("//*[@id='datecon']");
    public By SelectTodayDateConnected_Datepicker = By.xpath("//*[@class='active day']");
    public By CreateRegister_Button = By.xpath("//*[@id='createRegister']");
    public By MeterReads_Tab = By.xpath("//*[@class='icon-bar-chart']");
    public By ServiceName_Dropdown = By.xpath("//*[@id='nmis']");
    public By ServiceName_DropdownOpn = By.xpath("//*[@id='nmis']/option[2]");
    public By MeterNumber_Dropdown = By.xpath("//*[@id='meterNo']");
    public By MeterNumber_DropdownOpn = By.xpath("//*[@id='meterNo']/option[2]");
    public By ViewMeterReads = By.xpath("//*[@id='viewMeterReads']");
    public By AddMeterReads = By.xpath("//*[@title='Add Read']");
    public By MeterNo_Dropdown = By.xpath("//*[@id='rmeterno']");
    public By MeterNo_DropdownOpn = By.xpath("//*[@id='rmeterno']/option[2]");
    public By RegisterNo_Dropdown = By.xpath("//*[@id='rregno']");
    public By RegisterNo_DropdownOpn = By.xpath("//*[@id='rregno']/option[2]");
    public By ReadType_Dropdown = By.id("rreadType");
    public By ReadType_DropdownOpn1 = By.xpath("//*[@id='rreadType']/option[2]");
    public By ReadType_DropdownOpn2 = By.xpath("//*[@id='rreadType']/option[4]");
    public By ReadDate_Datepicker = By.xpath("//*[@id='rreadDate']");
    public By Select_ReadDate_Datepicker = By.xpath("//*[@class='active day']");
    public By MeterReadPeak_Field = By.xpath("//*[@id='modalReadingP']");
    public By MeterReadOffPeak_Field = By.xpath("//*[@id='modalReadingO']");
    public By MeterReadShoulder_Field = By.xpath("//*[@id='modalReadingS']");
    public By Save_Button = By.xpath("(//button[contains(text(),'Save')])[2]");
    public By CustomerSuccessMeterRegister = By.xpath("//div[@class='alert alert-success']/center");
    public SoftAssert softAssert = new SoftAssert();
    RandomGenerator randomGenerator = new RandomGenerator();

    public String AddMeter() throws InterruptedException {
        scrollIntoView(AddMeterIcon);
        clickBtn_custom(AddMeterIcon);
        clickBtn_custom(MeterSerialNumber_Field);
        String meterNumber = "Meter" + randomGenerator.requiredDigits(5);
        sendKeys_custom(MeterSerialNumber_Field, meterNumber);
        clickBtn_custom(ConfigurationType_Dropdown);
        clickBtn_custom(ConfigurationType_Opn);
        scrollIntoView(LastTestdate_Datepiker);
        clickBtn_custom(LastTestdate_Datepiker);
        clickBtn_custom(Select_LastTestdate_Datepiker);
        clickBtn_custom(DateConnected_Datepicker);
        Thread.sleep(2000);
        clickBtn_custom(Select_DateConnected_Datepicker);
        clickBtn_custom(CreateMeter_Button);
        Thread.sleep(2000);
        String ExpectedMsg = "Successfully registered meter";
        softAssert.assertEquals(ExpectedMsg, "Successfully registered meter");
        return meterNumber;
    }

    public String createRegister() throws InterruptedException {
        scrollIntoView(MeterEdit_icon);
        clickBtn_custom(MeterEdit_icon);
        scrollIntoView(AddMeterRegister_Icon);
        clickBtn_custom(AddMeterRegister_Icon);

        //Create register
        clickBtn_custom(RegisterID_Field);
        Thread.sleep(2000);
        String registerId = "9234" + randomGenerator.requiredDigits(6);
        sendKeys_custom(RegisterID_Field, registerId);
        clickBtn_custom(NetworkTariffCode_Field);
        sendKeys_custom(NetworkTariffCode_Field, "Na");
        clickBtn_custom(UnitOfMeasure_Field);
        sendKeys_custom(UnitOfMeasure_Field, "KWH");
        clickBtn_custom(TimeofDay_Field);
        sendKeys_custom(TimeofDay_Field, "ALLDAY");
        scrollIntoView(DialFormat_Field);
        clickBtn_custom(DialFormat_Field);
        sendKeys_custom(DialFormat_Field, "5");
        clickBtn_custom(Demand1_Field);
        sendKeys_custom(Demand1_Field, "0");
        clickBtn_custom(Demand2_Field);
        sendKeys_custom(Demand2_Field, "0");
        clickBtn_custom(NMISuffix_Field);
        sendKeys_custom(NMISuffix_Field, "17");
        clickBtn_custom(DateConnectedDatepicker);
        clickBtn_custom(SelectTodayDateConnected_Datepicker);
        clickBtn_custom(CreateRegister_Button);
        return registerId;
    }

    public void assertSuccessMesg() {
        // Validate Successfully created meter register.
        String ActualSucessMsg = getText_custom(CustomerSuccessMeterRegister);
        String ExpectedSucessMsg1 = "Successfully created meter register.";
        softAssert.assertEquals(ExpectedSucessMsg1, ActualSucessMsg);
    }

    public void addMeterReads(String readType, String peakValue, String offPeakValue, String shoulderValue) throws InterruptedException {
        Thread.sleep(3000);
        clickBtn_custom(MeterReads_Tab);
        clickBtn_custom(ServiceName_Dropdown);
        Thread.sleep(1000);
        clickBtn_custom(ServiceName_DropdownOpn);
        clickBtn_custom(MeterNumber_Dropdown);
        Thread.sleep(1000);
        clickBtn_custom(MeterNumber_DropdownOpn);
        scrollIntoView(ViewMeterReads);
        clickBtn_custom(ViewMeterReads);
        scrollIntoView(AddMeterReads);
        clickBtn_custom(AddMeterReads);
        Thread.sleep(1000);
        clickBtn_custom(MeterNo_Dropdown);
        clickBtn_custom(MeterNo_DropdownOpn);
        clickBtn_custom(RegisterNo_Dropdown);
        clickBtn_custom(RegisterNo_DropdownOpn);
        clickBtn_custom(RegisterNo_DropdownOpn);

        selectDropDownByVisibleText_custom(ReadType_Dropdown, readType);
        // WebElement ReadTypeOption2 = WebDriverWaits.WaitUntilVisibleWE(ReadType_Dropdown);
        // select = new Select(ReadTypeOption2);
        // select.selectByVisibleText("Actual Read");
        clickBtn_custom(ReadDate_Datepicker);
        clickBtn_custom(Select_ReadDate_Datepicker);
        clickBtn_custom(MeterReadPeak_Field);
        sendKeys_custom(MeterReadPeak_Field, peakValue);
        clickBtn_custom(MeterReadOffPeak_Field);
        sendKeys_custom(MeterReadOffPeak_Field, offPeakValue);
        clickBtn_custom(MeterReadShoulder_Field);
        sendKeys_custom(MeterReadShoulder_Field, shoulderValue);
        clickBtn_custom(Save_Button);

    }

}
