package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class EditRatePlan_WithAllocaionBucket extends BasePage {

    By ratePlans = By.xpath("//*[@title='Plans']");
    By searchField = By.xpath("//*[@id=\"datatablePlnList_filter\"]/label/input");
    By planEditIcon = By.xpath("(//*[@class='btn btn-info'])[1]");
    By tarifEditIcon = By.xpath("//*[@id='plnContent']/tr/td[11]/div/a[1]/i");
    By allocation = By.xpath("//*[@name='alloc']");
    By rate = By.xpath("//*[@name='rate']");
    By updateButton = By.id("addTrf");
    By publish = By.id("publishBtn");
    By successMsg = By.xpath("//*[@id=\"successPlnAlrt\"]/div/center/p/strong");
    By crossIcon = By.xpath("//*[@id=\"closePlnBtn\"]");  //*[@id="closePlnBtn"]/i

    String SUCCESS_MESG = "Commercial plan has been successfully updated.";


    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(successMsg));
    }


    public void clickRatePlans() {
        click_custom(ratePlans);
        WebdriverWaits.waitForElementVisible(ratePlans, 2);
    }

    public void clickCrossIcon() {
        click_custom(crossIcon);
        //  WebdriverWaits.waitForElementVisible(crossIcon, 2);
    }

    public void enterPlanName(String planNameText) {
        sendKeys_withClear(searchField, planNameText);
    }

    public void clickPlanEditIcon() {
        click_custom(planEditIcon);
        WebdriverWaits.waitForElementVisible(planEditIcon, 2);
    }

    public void clickTarifEditIcon() {
        click_custom(tarifEditIcon);
        WebdriverWaits.waitForElementVisible(tarifEditIcon, 2);
    }

    public void selectAllocation(String allocationText) {
        WebdriverWaits.waitForElementVisible(allocation, 6);
        selectDropDownByVisibleText_custom(allocation, allocationText, "Select Allocation");
    }

    public void enterRate(String rateText) {
        sendKeys_withClear(rate, rateText);
    }

    public void clickUpdateTarif() {
        click_custom(updateButton);
        WebdriverWaits.waitForElementVisible(updateButton, 2);
    }


    public void clickPublish() {
        click_custom(publish);
        WebdriverWaits.waitForElementVisible(publish, 2);
    }


    public void edit_Allocation(String planNameText, String allocationText, String rateText) throws InterruptedException {
        clickRatePlans();
        enterPlanName(planNameText);
        clickPlanEditIcon();
        clickTarifEditIcon();
        Thread.sleep(2000);
        selectAllocation(allocationText);
        enterRate(rateText);
        clickUpdateTarif();
        clickPublish();
        assertSuccessMessage();
        clickCrossIcon();

    }
}
