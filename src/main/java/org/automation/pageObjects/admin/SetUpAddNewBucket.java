package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.RandomGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class SetUpAddNewBucket extends BasePage {

    public By adminIcon = By.xpath("//a[@title='Administration']/i");
    public By allocation = By.xpath("(//*[@class='quick-button-small'])[19]");
    public By addAllocation = By.xpath("//*[@class='btn btn-mini btn-primary']");
    public By discription = By.id("newBucket");
    public By list = By.xpath("//*[@id=\"myModal\"]/div/div/div/div/div[3]/div[2]/button");
    public By newBucket = By.xpath("//tbody/tr[last()]/td[3]");
    public By saveChanges = By.xpath("//*[@class='btn btn-mini btn-success']");
    public By successMsg = By.id("successMsg");
    BasePage bp = new BasePage();
    String SUCCESS_MESG = "Allocation setup has been successfully saved.";

    public void clickSaveChanges() {
        click_custom(saveChanges);
    }

    public void fetchBucket() {
        getText_custom(newBucket);
        bp.scrollIntoView(saveChanges);
    }

    public void clickAdmin() {
        clickBtn_custom(adminIcon);
    }

    public void clickAllocation() {
        bp.scrollIntoView(allocation);
        click_custom(allocation);
    }

    public void clickAddAllocation() {
        bp.scrollIntoView(addAllocation);
        click_custom(addAllocation);
    }

    public void clickAddToList() {
        click_custom(list);
    }

    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(successMsg));
    }

    public void setUpBucket(String bucketName) throws InterruptedException {
        clickAdmin();
        clickAllocation();
        clickAddAllocation();
        sendKeys_custom(discription, bucketName);
        Thread.sleep(1000);
        clickAddToList();
        fetchBucket();
        clickSaveChanges();
        assertSuccessMessage();

    }
}
