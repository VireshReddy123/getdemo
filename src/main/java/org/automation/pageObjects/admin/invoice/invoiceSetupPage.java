package org.automation.pageObjects.admin.invoice;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class invoiceSetupPage extends BasePage {

    By createNewInvoice = By.xpath("//a[@href='SrvHTMLInvoiceSetup?pageAction=new']");
    By search = By.xpath("//input[@type='search']");
    By editIcon = By.xpath("//a[@class=\"btn btn-info\"]");


    public void search(String name) {
        sendKeys_custom(search, name, "Search");

    }

    public void clkSeachInvoice() {
        clickBtn_custom(editIcon, "EditButton");
    }


    public createNewInvoiceSetupPage clkCreateNewInvoice() {

        clickBtn_custom(createNewInvoice, "createNewInvoice");
        return new createNewInvoiceSetupPage();

    }

}
