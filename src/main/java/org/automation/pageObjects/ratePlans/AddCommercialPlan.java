package org.automation.pageObjects.ratePlans;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class AddCommercialPlan extends BasePage {

	By ratePlans = By.xpath("//*[@title='Plans']");
	By createNewPlan = By.xpath("//*[@id='addBtn']");
	By group = By.xpath("//*[@id='groupNo']");
	By usageTypes = By.xpath("//*[@id='usageTypes']");
	By name = By.xpath("//*[@id='name']");
	By dateFromValid = By.xpath("//*[@name='dateValidFrom']");
	By dateToValid = By.xpath("//*[@name='dateValidTo']");
	By dateValidFrom = By.xpath("//div[@class='datepicker-days']//tr/td[@class='active day']");
	By dateValidTo = By.xpath("//div[@class='datepicker-days']//tr/td[@class='active day']");
	By addTarrif = By.id("addTrfBtn");
	By chargeDescription = By.xpath("//*[@name='charge-desc']");
	By rollupDescription = By.xpath("//*[@name='rollup-desc']");
	By chargeType = By.xpath("//*[@name='charge-type']");
	By allocation = By.xpath("//*[@name='alloc']");
	By ratingMethod = By.xpath("//*[@name='method-type']");
	By unit = By.xpath("//*[@name='unit-type']");
	By rate = By.xpath("//*[@name='rate']");
	By taxType = By.xpath("//*[@name='tax-type']");
	By addButton = By.id("addTrf");
	By publish = By.id("publishBtn");
	By successMsg = By.xpath("//*[@id=\"successPlnAlrt\"]/div/center/p/strong");
	By crossIcon = By.xpath("//*[@id=\"closePlnBtn\"]/i");

	String SUCCESS_MESG = "Adams Johhons has been successfully created.  ";

	public void assertSuccessMessage() {
		WebdriverWaits.sleep(2);
		Assertions ass = new Assertions();
		ass.assertEquals(SUCCESS_MESG.trim(), getText_custom(successMsg).trim());
	}

	public void clickPublish() {
		click_custom(publish);
		WebdriverWaits.waitForElementVisible(publish, 2);
	}

	public void clickCrossIcon() {
		click_custom(crossIcon);
	}

	public void clickAdd() {
		WebdriverWaits.waitForElementVisible(addTarrif, 2);
		click_custom(addButton);
		WebdriverWaits.waitForElementVisible(publish, 2);
	}

	public void clickRatePlans() {
		click_custom(ratePlans);
		WebdriverWaits.waitForElementVisible(ratePlans, 2);
	}

	public void clickCreateNewPlan() {
		click_custom(createNewPlan);
	}

	public void selectGroup(String groupSelect) {
		selectDropDownByVisibleText_custom(group, groupSelect, "Select Group Dropdown");
		WebdriverWaits.waitForElementVisible(group, 1);
	}

	public void selectUsageTypes(String usagetype) {
		selectDropDownByVisibleText_custom(usageTypes, usagetype, "Usage Type Dropdown");
		WebdriverWaits.waitForElementVisible(usageTypes, 1);
	}

	public void enterName(String nameText) {
		sendKeys_withClear(name, nameText);
	}

	public void clickCurrentDateFrom() {
		click_custom(dateValidFrom);
	}

	public void clickCurrentDateTo() {
		click_custom(dateValidTo);
	}

	public void clickDateFrom() {
		click_custom(dateFromValid);
		WebdriverWaits.waitForElementVisible(dateValidFrom, 2);
	}

	public void clickDateTo() {
		click_custom(dateToValid);
		WebdriverWaits.waitForElementVisible(dateValidTo, 2);
	}

	public void clickAddTarif() {
		click_custom(addTarrif);
		WebdriverWaits.waitForElementVisible(addTarrif, 2);
	}

	public void enterChargeDescriptrion(String descriptionText) {
		sendKeys_withClear(chargeDescription, descriptionText);
	}

	public void enterRollupDescriptrion(String rollupText) {
		sendKeys_withClear(rollupDescription, rollupText);
	}

	public void enterRate(String rateText) {
		sendKeys_withClear(rate, rateText);
	}

	public void selectChargeType(String chargeTypeText) {
		WebdriverWaits.waitForElementVisible(chargeType, 2);
		selectDropDownByVisibleText_custom(chargeType, chargeTypeText, "Select Charge Type");
	}

	public void selectAllocation(String allocationText) {
		WebdriverWaits.waitForElementVisible(allocation, 4);
		selectDropDownByVisibleText_custom(allocation, allocationText, "Select Allocation");
	}

	public void selectRatingMethod(String ratingMethodText) {
		click_custom(ratingMethod);
		WebdriverWaits.waitForElementVisible(ratingMethod, 3);
		selectDropDownByVisibleText_custom(ratingMethod, ratingMethodText, "Select Rating Method");

	}

	public void selectUnit(String unitText) {
		click_custom(unit);
		WebdriverWaits.waitForElementVisible(addButton, 5);
		selectDropDownByVisibleText_custom(unit, unitText, "Select Unit");

	}

	public void selectTaxType(String textTypeText) {
		WebdriverWaits.waitForElementVisible(taxType, 1);
		selectDropDownByVisibleText_custom(taxType, textTypeText, "Select TaxType");
	}

	public void createCommercialPlan(String groupSelect, String usagetype, String nameText, String descriptionText,
			String rollupText, String chargeTypeText, String allocationText, String ratingMethodText, String unitText,
			String rateText) throws InterruptedException {

		clickRatePlans();
		clickCreateNewPlan();
		//selectGroup(groupSelect);
		selectUsageTypes(usagetype);
		enterName(nameText);
		clickDateFrom();
		clickCurrentDateFrom();
		clickDateTo();
		clickCurrentDateTo();
		clickAddTarif();
		enterChargeDescriptrion(descriptionText);
		enterRollupDescriptrion(rollupText);
		selectChargeType(chargeTypeText);
		selectAllocation(allocationText);
		Thread.sleep(1000);
		selectRatingMethod(ratingMethodText);
		Thread.sleep(1000);
		selectUnit(unitText);
		enterRate(rateText);
		clickAdd();
		clickPublish();
		assertSuccessMessage();
		clickCrossIcon();
	}

}
