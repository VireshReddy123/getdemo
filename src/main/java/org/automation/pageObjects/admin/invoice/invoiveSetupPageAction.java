package org.automation.pageObjects.admin.invoice;

import org.automation.base.BasePage;
import org.openqa.selenium.By;


public class invoiveSetupPageAction extends BasePage {

    By finishBtn = By.xpath("//button[@id='btnNext']");


    public invoiceSetupPage clkFininshBtn() {


        clickBtn_custom(finishBtn, "Finish");
        return new invoiceSetupPage();

    }
}
