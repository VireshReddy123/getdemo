package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AllocateStatementafterMakepayment extends BasePage {
	
	public static SoftAssert softAssert = new SoftAssert();
	
	public By searchBth = By.id("btn_search");
	public By customerNo = 	By.xpath("//*[@id='tbl-customer']/tbody/tr[1]/td[1]/a");
	public By transactions = By.xpath("(//*[@class='icon-money'])[1]");
	public By transactionType = By.id("tranType");
	public By paymentMethod = By.id("tranSubType");
	public By amount = By.id("amount");
	public By comment = By.id("comment");
	public By viewHistory = By.xpath("(//*[@class='icon-search'])[1]");
	public By transactionSearch = By.xpath("//*[@type='search']");
	public By submitBtn = By.id("submitBtn");
	public By confirmation = By.xpath("(//*[@class='btn btn-primary'])[4]");
	public By validateTransType = By.xpath("//tbody/tr[1]//td[4]");
	public By validatePayMethod = By.xpath("//tbody/tr[1]//td[5]");
	public By delete = By.xpath("(//*[@id='delBtn'])[1]");
	public By deleteDescription = By.xpath("//*[@name='notes']");
	public By deleteConfirmation = By.xpath("(//*[@class='btn btn-primary'])[4]");
	
    String RESULT_MSG = "Cash";

	
	public void validatePayMethod(String paymentText) {
		WebdriverWaits.sleep(2);
		Assertions ass = new Assertions();
		ass.assertEquals(RESULT_MSG, getText_custom(validatePayMethod));
	}

	
	public void clickSubmitBtn() throws InterruptedException {
		scrollIntoView(submitBtn);
		clickBtn_custom(submitBtn);
	}
	
	public void clickDeleteConfirmation() {
		clickBtn_custom(deleteConfirmation);
	}
	
	public void clickSearchBtn() {
		clickBtn_custom(searchBth);
	}
	
	public void clickDelete() {
		clickBtn_custom(delete);
	}
	
	
	public void clickCustomerNumber() throws InterruptedException {
		clickBtn_custom(customerNo);
		WebdriverWaits.SwitchToNewTab();
	}
	
	public void clickTransactions() {
		clickBtn_custom(transactions);
	}
	
	public void clickConfirmation(){
		clickBtn_custom(confirmation);
	}
	
	public void clickViewHistory(){
		clickBtn_custom(confirmation);
	}
	
	public void enterAmount(String amountText) {
		sendKeys_withClear(amount,amountText);
	}
	
	public void enterDeleteDescription(String descriptionText) {
		sendKeys_withClear(deleteDescription,descriptionText);
	}
	
	public void enterComment(String commentText) {
		sendKeys_withClear(comment,commentText);
	}
	
	public void searchTransaction(String searchText) {
		sendKeys_withClear(transactionSearch,searchText);
	}

	public void selectTransactionType(String transactionTypeText){
		clickBtn_custom(transactionType);
		selectDropDownByVisibleText_custom(transactionType, transactionTypeText);
		
    }
	
	public void selectPaymentMethod(String paymentMethodText){
		clickBtn_custom(paymentMethod,paymentMethodText);
		selectDropDownByVisibleText_custom(paymentMethod, paymentMethodText);
		
	}
}

