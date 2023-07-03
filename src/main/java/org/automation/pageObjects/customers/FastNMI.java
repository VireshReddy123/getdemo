package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class FastNMI extends BasePage {
    public By nmi = By.id("thenmi");
    public By dlf = By.xpath("(//label[@class='col-sm-2 control-label']/../div/input)[2]");
    public By tni = By.xpath("(//label[@class='col-sm-2 control-label']/../div/input)[3]");

    public By goToSelectedNMI = By.xpath("//button[contains(text(),'Discovery')]");

    public By result = By.id("result");

    public String getResultText() {
        return getText_custom(result);
    }
    public String getDlfValue() {
        return getAttributevalue(dlf,"value");
    }
    public String getTnivalue() {
        return getAttributevalue(tni,"value");
    }
    public void enterNmi(String text) {
        sendKeys_custom(nmi,text);

    }
    public void clickDiscoveryBtn() {
        clickBtn_custom(goToSelectedNMI);

    }
}
