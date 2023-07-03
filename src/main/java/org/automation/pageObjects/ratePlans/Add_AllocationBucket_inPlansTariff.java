package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class Add_AllocationBucket_inPlansTariff extends BasePage {

    By ratePlans = By.xpath("//*[@title='Plans']");
    By searchField = By.xpath("//*[@id='datatablePlnList_filter']/label/input");
    By planEditIcon = By.xpath("(//*[@class='btn btn-info'])[1]");
    By tarifEditIcon = By.xpath("//*[@id='plnContent']/tr/td[11]/div/a[1]/i");
    By chargeDescription = By.xpath("//*[@name='charge-desc']");
    By rollupDescription = By.xpath("//*[@name='rollup-desc']");
    By allocation = By.xpath("//*[@name='alloc']");
    By chargeType = By.xpath("//*[@name='charge-type']");
    By ratingMethod = By.xpath("//*[@name='method-type']");
    By unit = By.xpath("//*[@name='unit-type']");
    By rate = By.xpath("//*[@name='rate']");
    By updateButton = By.xpath("//*[@id='addTrf']");
    By publish = By.id("publishBtn");
    By successMsg = By.xpath("(//tbody/tr[1]//td[2])[1]");
    By crossIcon = By.xpath("//*[@id=\"closePlnBtn\"]/i");

    String SUCCESS_MESG = "Commercial plan";


    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(successMsg));
    }


    public void clickRatePlans() {
        click_custom(ratePlans);
        WebdriverWaits.waitForElementVisible(ratePlans, 2);
    }

    public void enterPlanName(String planNameText) {
        sendKeys_withClear(searchField, planNameText);
    }

    public void clickPlanEditIcon() {
        click_custom(planEditIcon);
        WebdriverWaits.waitForElementVisible(planEditIcon, 2);
    }

    public void clickCrossIcon() {
        click_custom(crossIcon);
    }

    public void clickTarifEditIcon() {
        click_custom(tarifEditIcon);
        WebdriverWaits.waitForElementVisible(tarifEditIcon, 2);
    }

    public void enterRollupDescriptrion(String rollupText) {
        sendKeys_withClear(rollupDescription, rollupText);
    }

    public void selectAllocation(String allocationText) {
        WebdriverWaits.waitForElementVisible(allocation, 4);
        selectDropDownByVisibleText_custom(allocation, allocationText, "Select Allocation");
    }

    public void enterChargeDescriptrion(String chargeText) {
        sendKeys_withClear(chargeDescription, chargeText);
    }

    public void selectRatingMethod(String ratingMethodText) {
        click_custom(ratingMethod);
        WebdriverWaits.waitForElementVisible(ratingMethod, 3);
        selectDropDownByVisibleText_custom(ratingMethod, ratingMethodText, "Select Rating Method");

    }

    public void selectUnit(String unitText) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        click_custom(unit);
        WebdriverWaits.waitForElementVisible(unit, 5);
        selectDropDownByVisibleText_custom(unit, unitText, "Select Unit");

    }

    public void enterRate(String rateText) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        sendKeys_withClear(rate, rateText);
    }

    public void clickUpdateTarif() {
        click_custom(updateButton);
        //   WebdriverWaits.waitForElementVisible(updateButton, 2);
    }


    public void clickPublish() {
        click_custom(publish);
        WebdriverWaits.waitForElementVisible(publish, 2);
    }


    public void add_Allocation(String planNameText, String descriptionText, String rollupText, String allocationText, String chargeText, String ratingMethodText, String unitText, String rateText) throws InterruptedException {
        clickRatePlans();
        enterPlanName(planNameText);
        clickPlanEditIcon();
        clickTarifEditIcon();
        selectAllocation(allocationText);
        enterChargeDescriptrion(descriptionText);
        enterRollupDescriptrion(rollupText);
        selectAllocation(allocationText);
        enterChargeDescriptrion(chargeText);
        selectUnit(unitText);
        enterRate(rateText);
        clickUpdateTarif();
        clickPublish();
        assertSuccessMessage();
        clickCrossIcon();

    }

}
