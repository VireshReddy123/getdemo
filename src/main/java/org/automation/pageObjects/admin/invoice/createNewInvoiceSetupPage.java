package org.automation.pageObjects.admin.invoice;


import org.automation.base.BasePage;
import org.automation.pageObjects.admin.miscellaneous.InvoiceSetup;
import org.openqa.selenium.By;

public class createNewInvoiceSetupPage extends BasePage {


    By invoiceName = By.xpath("//input[@id='invoice_name']");
    By paperSize = By.xpath("//*[@name='paper_size']");
    By backToInvoiceList = By.xpath("//a[@href='SrvHTMLInvoiceSetup']");
    By marginTop = By.xpath("//input[@name='margin_top']");
    By marginBottom = By.xpath("//input[@name='margin_bottom']");
    By marginLeft = By.xpath("//input[@name='margin_left']");
    By marginRight = By.xpath("//input[@name='margin_right']");
    By category2 = By.xpath("//input[@id='CHARGESUMMARY']");
    By category3 = By.xpath("//input[@id='CHARGESUMMARY-LIST']");
    By category4 = By.xpath("//input[@id='ITEMIZATION']");
    By category5 = By.xpath("//input[@id='ITEMIZATION-LIST-HEADER']");
    By category6 = By.xpath("//input[@id='ITEMIZATION-LIST']");
    By category7 = By.xpath("//input[@id='CARBON-GRAPH']");
    By category8 = By.xpath("//input[@id='GAS-GRAPH']");
    By category9 = By.xpath("//input[@id='WATER-GRAPH']");
    By category10 = By.xpath("//input[@id='ELECTRICITY-GRAPH-IMAGE']");
    By category11 = By.xpath("//input[@id='GAS-GRAPH-IMAGE']");
    By category12 = By.xpath("//input[@id='GRAPH-IMAGE']");
    By category13 = By.xpath("//input[@id='CARBON-GRAPH-IMAGE']");
    By category14 = By.xpath("//input[@id='WATER-GRAPH-IMAGE'");
    By category15 = By.xpath("//input[@id='GRAPH-IMAGE2']");
    By category16 = By.xpath("//input[@id='BPAY']");
    By category17 = By.xpath("//input[@id='ITEMIZATION-ENERGY-CHARGES']");
    By category18 = By.xpath("//input[@id='ITEMIZATION-ENERGY-LIST-HEADER']");
    By category19 = By.xpath("//input[@id='ITEMIZATION-ENERGY-LIST']");
    By category20 = By.xpath("//input[@id='BILLPAY']");
    By category21 = By.xpath("//input[@id='ITEMIZATION-ACCOUNT-LEVEL']");
    By category22 = By.xpath("//input[@id='ITEMIZATION-ACCOUNT-LEVEL-LIST']");
    By saveInvoiceBtn = By.xpath("//button[@id='saveInvoice']");
    By next = By.xpath("//button[@id='btnNext']");

    public void setInvoiceName(String name) {
        sendKeys_withClear(invoiceName, name, "InvoiceName");


    }

    public void setPaperSize() {
        selectDropDownByIndex_custom(paperSize, 2, "PaperSize");

    }

    public void setMargins() {
        sendKeys_custom(marginTop, "", "Top");
        sendKeys_custom(marginBottom, "", "Bottom");
        sendKeys_custom(marginLeft, "", "Left");
        sendKeys_custom(marginRight, "", "Right");

    }

    public void setCategory() {
        ScrollDownThePageMax();
        selectCheckBox(category2, "CHARGESUMMARY");
        selectCheckBox(category3, "CHARGESUMMARY-LIST");
        selectCheckBox(category4, "ITEMIZATION");
        selectCheckBox(category5, "ITEMIZATION-LIST-HEADER");
    }

    public invoiveSetupPageAction saveInvoice() {
        ScrollDownThePageMax();
        clickBtn_custom(saveInvoiceBtn, "Save Invoice");
        return new invoiveSetupPageAction();
    }

    public InvoiceSetup backToInvoice() {
        clickBtn_custom(backToInvoiceList, "backToInvoiceList");
        return new InvoiceSetup();

    }

    public invoiveSetupPageAction clkNext() {
        clickBtn_custom(next, "Next");
        return new invoiveSetupPageAction();
    }

}
