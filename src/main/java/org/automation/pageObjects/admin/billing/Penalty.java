package org.automation.pageObjects.admin.billing;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class Penalty extends BasePage {

	public By AdminIcon = By.xpath("//a[@title='Administration']/i");
	public By penalty = By.xpath("(//*[@class='quick-button-small'])[18]");
	public By createPenalty = By.id("addBtn");
	public By penaltyOptions = By.xpath("(//*[@class='caret'])[9]");
	public By simplePenalty = By.xpath("//*[@id='formPenalty']/div/div[1]/div/div/div/ul/li[2]/a/span");
	public By penaltyDescription = By.id("penaltyDescription");
	public By graceDays = By.id("graceDays");
	public By savePenalty = By.id("savePenalty");
	public By resultMsg = By.id("resultMsg");
	public By editPenalty = By.id("editPenalty");
	public By deletePenalty = By.xpath("(//*[@class='btn btn-danger'])[2]");
	public By ButtonOK = By.xpath("(//*[@class='btn btn-primary'])[6]");

	String RESULT_MSG = "Successfully added new penalty.";

	public void clickAdmin() {
		clickBtn_custom(AdminIcon);
	}

	public void clickSimplePenalty() {
		clickBtn_custom(simplePenalty);
	}

	public void clickPenalty() {
		scrollIntoView(penalty);
		clickBtn_custom(penalty);
	}

	public void clickSavePenalty() {
		clickBtn_custom(savePenalty);
	}

	public void clickCreatePenalty() {
		clickBtn_custom(createPenalty);
	}

	public void clickEditPenalty() {
		clickBtn_custom(editPenalty);
	}

	public void clickDeletePenalty() {
		clickBtn_custom(deletePenalty);
	}

	public void clickOKButton() {
		clickBtn_custom(ButtonOK);
	}

	public void enterPenaltyDescription(String descriptionText) {
		clickBtn_custom(penaltyDescription);
		sendKeys_withClear(penaltyDescription, descriptionText);
	}

	public void enterGraceDays(String graceDaysText) {
		clickBtn_custom(graceDays);
		sendKeys_withClear(graceDays, graceDaysText);
	}

	public void selectPenaltyOptions(String penaltyOptionsText) throws InterruptedException {
		clickBtn_custom(penaltyOptions);
		Thread.sleep(3000);
		clickBtn_custom(simplePenalty);

	}

	public void validatePenalty(String validateText) {
		WebdriverWaits.sleep(2);
		Assertions ass = new Assertions();
		ass.assertEquals(RESULT_MSG, getText_custom(resultMsg));
	}
}
