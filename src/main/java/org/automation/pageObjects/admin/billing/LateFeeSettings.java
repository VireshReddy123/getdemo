package org.automation.pageObjects.admin.billing;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class LateFeeSettings extends BasePage {
    By search = By.xpath("//input[@type='search']");
    By checkBox = By.xpath("//input[@data-desc='Electricity flat usage']/..");
    By checkBoxValue = By.xpath("//input[@data-desc='Electricity flat usage']");

//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");

    public void enableCheckBox() {
        selectCheckBox(checkBox, "Electricity flat Usage");
    }

    public void disableCheckBox() {
        uncheckCheckBox(checkBox, "Electricity flat Usage");
    }

    public void enterSearchText(String searchText) {

        sendKeys_withClear(search, searchText, "Search");
    }

    public boolean isEnabledCheckBox() {
        return getCheckBoxValue(checkBox, "Electricity flat Usage");

    }

}
