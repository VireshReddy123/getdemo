package org.automation.pageObjects.customers;

import org.automation.pageObjects.IndexPage;
import org.automation.utilities.Assertions;
import org.automation.utilities.Configuration;
import org.automation.utilities.DateGenerator;
import org.automation.utilities.RandomGenerator;
import org.openqa.selenium.By;


public class RetailElectricityService extends IndexPage {
    // Add Service for  customer
    public By RetailElectricity_Plus_Subtab = By.xpath("//li/a[contains(text(),' Retail Electricity ')]//preceding-sibling::a");
    public By planNo = By.id("planNo");
    public By meterConfig = By.id("meterConfig");
    public By meterNumber = By.id("userName");

    public By readingType = By.id("readType");
    public By SaveChanges_Button = By.xpath("//*[@class=\"btn btn-primary iseditable\"]");
    public By createServiceBtn = By.xpath("//a[contains(text(),'Create')]");
    public By CustomerSuccessEditMsg = By.xpath("//div[@class='alert alert-success']/center");
    public By OverviewTab = By.xpath("//*[@class=\"icon-eye-open\"]"); // //*[contains(text(),'Overview')]
    public By okBtn = By.xpath("//button[contains(text(),'OK')]");



    public String addRetailElectricityService(String serviceId,String planType) throws InterruptedException {
        clickBtn_custom(OverviewTab);
        clickBtn_custom(RetailElectricity_Plus_Subtab);
        click_custom(planNo);
        selectDropDownByVisibleText_custom(planNo, planType);
        Configuration.setProperty("RetailElectricityServiceId", serviceId);
        sendKeys_custom(meterNumber, serviceId);
        selectDropDownByVisibleText_custom(meterConfig, "Flat Rate");
        selectDropDownByVisibleText_custom(readingType, "Reads");
        scrollIntoView(createServiceBtn);
        clickBtn_custom(createServiceBtn);
        clickBtn_custom(okBtn);
        return serviceId;
    }

    //    public  void editServiceStatus() throws InterruptedException {
//        clickBtn_custom(ServiceTab);
//        clickBtn_custom(Edit_icon);
//        scrollIntoView(Service_Status_Dropdown);
//        clickBtn_custom(Service_Status_Dropdown);
//        selectDropDownByVisibleText_custom(Service_Status_Dropdown,"Connected");
//        scrollIntoView(SaveChanges_Button);
//        clickBtn_custom(SaveChanges_Button);
//        clickBtn_custom(OkButton);
//    }
//    public  void navigateToEditServices() throws InterruptedException {
//        clickBtn_custom(ServiceTab);
//        clickBtn_custom(Edit_icon);
//    }
    public void validateSuccessMessage() throws InterruptedException {
        String ActualMsg = getText_custom(CustomerSuccessEditMsg);
        String ExpectedMsg1 = "Successfully saved service details.";
        Assertions assertions = new Assertions();
        assertions.assertEquals(ExpectedMsg1, ActualMsg);

    }
}
