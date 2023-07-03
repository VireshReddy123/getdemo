package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.RandomGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class UpdateAllocationBucket extends BasePage {

    public By adminIcon = By.xpath("//a[@title='Administration']/i");
    public By allocation = By.xpath("(//*[@class='quick-button-small'])[19]");
    public By editAllocation = By.xpath("(//*[@class='btn btn-success'])[1]");
    public By discription = By.id("editBucket");
    public By update = By.xpath("(//*[@class='btn btn-primary'])[2]");
    public By updatedAllocation = By.xpath("//*[@id='Desc_617']");
    public By newBucket = By.xpath("//*[@id='Desc_626']");
    public By saveChanges = By.xpath("//*[@class='btn btn-mini btn-success']");
    public By successMsg = By.id("successMsg");
    BasePage bp = new BasePage();
    RandomGenerator randomGenerator = new RandomGenerator();
    String SUCCESS_MESG = "Allocation setup has been successfully saved.";


    public void fetchdetails() {
        getText_custom(newBucket);
        bp.scrollIntoView(saveChanges);
    }

    public void clickSaveChanges() {
        bp.scrollIntoView(saveChanges);
        click_custom(saveChanges);
    }

    public void clickUpdate() {
        click_custom(update);
    }

    public void bucketName() {
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

    public void clickEditAllocation() {
        click_custom(editAllocation);
    }


    public void assertSuccessMessage() {
        WebdriverWaits.sleep(2);
        Assertions ass = new Assertions();
        ass.assertEquals(SUCCESS_MESG, getText_custom(successMsg));
    }


    public void updateBucket(String discriptionText) throws InterruptedException {
        clickAdmin();
        clickAllocation();
        clickEditAllocation();
        String allocationBucket = "Update Bucket" + randomGenerator.requiredDigits(5);
        sendKeys_withClear(discription, allocationBucket);
        clickUpdate();
        fetchdetails();
        clickSaveChanges();
        assertSuccessMessage();

    }
}
