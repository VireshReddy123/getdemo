package org.automation.pageObjects.admin.paymentGateway;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class PaymentBatch extends BasePage {

	public By AdminIcon = By.xpath("//a[@title='Administration']/i");
	public By paymentBatch = By.xpath("(//*[@class='quick-button-small'])[15]");
	public By batchNo = By.id("batchNo");
	public By transactionType = By.id("transType");
	public By paymentMethod = By.id("payMethod");
	public By customerType = By.id("idUsed");
	public By customerID = By.id("custno-1");
	public By amount = By.id("amt-1");
	public By comment = By.id("comment-1");
	public By refresh = By.xpath("(//*[@class='btn btn-primary'])[1]");

	public void clickAdmin() {
		clickBtn_custom(AdminIcon);
	}

	public void clickPaymentBatch() {
		clickBtn_custom(paymentBatch);
	}

	public void clickRefresh() {
		scrollIntoView(refresh);
		clickBtn_custom(refresh);
	}

	public void enterBatchNumber(String batchNumberText) {
		clickBtn_custom(batchNo);
		sendKeys_custom(batchNo, batchNumberText);
	}

	public void enterCustomerID(String customerIDText) {
		clickBtn_custom(customerID);
		sendKeys_custom(customerID, customerIDText);
	}

	public void enterAmount(String amountText) {
		clickBtn_custom(amount);
		sendKeys_custom(amount, amountText);
	}

	public void enterComments(String commentText) {
		clickBtn_custom(comment);
		sendKeys_custom(comment, commentText);
	}

	public void selectTransType(String transTypeText) {
		clickBtn_custom(transactionType);
		selectDropDownByVisibleText_custom(transactionType, transTypeText);
	}

	public void selectPaymentMethod(String paymentText) {
		clickBtn_custom(paymentMethod);
		selectDropDownByVisibleText_custom(paymentMethod, paymentText);
	}

	public void selectIDUsed(String IDText) {
		clickBtn_custom(customerType);
		selectDropDownByVisibleText_custom(customerType, IDText);
	}
}
