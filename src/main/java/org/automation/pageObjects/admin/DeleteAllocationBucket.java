package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.RandomGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class DeleteAllocationBucket extends BasePage {

    public By adminIcon = By.xpath("//a[@title='Administration']/i");
    public By allocation = By.xpath("(//*[@class='quick-button-small'])[19]");
    public By deleteAllocation = By.xpath("(//*[@class='fa fa-trash'])[3]");
    public By okPopup = By.xpath("(//*[@class='btn btn-primary'])[3]");
    public By update = By.xpath("(//*[@class='btn btn-primary'])[2]");
    public By saveChanges = By.xpath("//*[@class='btn btn-mini btn-success']");
    public By successMsg = By.id("successMsg");
    BasePage bp = new BasePage();
    RandomGenerator randomGenerator = new RandomGenerator();
    String SUCCESS_MESG = "Allocation setup has been successfully saved.";

    public void clickSaveChanges() {
        bp.scrollIntoView(saveChanges);
        click_custom(saveChanges);
    }

    public void clickAdmin() {
        clickBtn_custom(adminIcon);
    }

    public void clickOkButton() {
        clickBtn_custom(okPopup);
    }

    public void clickAllocation() {
        bp.scrollIntoView(allocation);
        click_custom(allocation);
    }

    public void clickDeleteAllocation() {
        click_custom(deleteAllocation);
    }


    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(successMsg));
    }

    public void deleteBucket(String discriptionText) throws InterruptedException {
        clickAdmin();
        clickAllocation();
        clickDeleteAllocation();
        clickOkButton();
        clickSaveChanges();
        assertSuccessMessage();

    }
}
