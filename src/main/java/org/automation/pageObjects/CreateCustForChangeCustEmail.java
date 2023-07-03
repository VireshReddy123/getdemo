package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.openqa.selenium.By;


public class CreateCustForChangeCustEmail extends BasePage {
    public By emailField = By.xpath("//input[@name='contact_email']");
    public By saveCustomerbutton = By.xpath("//div[@class='col-lg-12 text-left']/a/i");
    public By okbutton = By.xpath("//button[contains(text(),'OK')]");
    public By CustDetailsTab = By.xpath("//ul[@class='nav nav-tabs']/li[2]");
    BasePage bp = new BasePage();
    Assertions as;
    String SUCCESS_MESG = "Successfully saved customer.";

    public void clickOnCustomerDetailsTab() {
        click_custom(CustDetailsTab, " Details");
    }

    public void clearPreviousEnteredEmailAddress(String emailText) {
        bp.scrollIntoView(emailField);
        sendKeys_withClear(emailField, emailText, " Email");

    }

    public void clickSaveCustomerBtn() {
        bp.scrollIntoView(saveCustomerbutton);
        click_custom(saveCustomerbutton, "Save Customer");
    }

    public void clickOkBtn() {
        clickBtn_custom(okbutton, "Ok");
    }


    public void changeCustomerEmailAddress(String emailText) {
        clickOnCustomerDetailsTab();
        clearPreviousEnteredEmailAddress(emailText);
        clickSaveCustomerBtn();
        clickOkBtn();
    }


}
