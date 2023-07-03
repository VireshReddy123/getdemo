package org.automation.pageObjects.admin.commmunications;

import org.automation.base.BasePage;
import org.automation.utilities.RandomGenerator;
import org.openqa.selenium.By;

public class ReminderSetup extends BasePage {

    RandomGenerator randomGenerator = new RandomGenerator();


    public By reminderName = By.xpath("(//*[@name='Rem1'])[2]");

    public By numberOfDays = By.xpath("(//*[@name='days1'])[2]");


    public By dueDate = By.xpath("//*[@name='cut1']");

    public By minimumAmount = By.xpath("(//*[@id='min1'])[2]");

    public By autoSend = By.xpath("(//*[@id='out1'])[2]");
    public By followUpActivity = By.xpath("(//*[@id='follow1'])[2]");

    public By deliveryEmail = By.xpath("(//*[@id='email1'])[2]");

    public By deliveryPost = By.xpath("(//*[@id='post1'])[1]");

    public By updateReminder = By.id("reminders-schedule-update");

    public By okButton = By.xpath("//button[@class='btn btn-primary']");

    public By AdminIcon = By.xpath("//a[@title='Administration']/i");


    public void enter_ReminderName(String nameText) {
        sendKeys_withClear(reminderName,nameText);
    }

    public void enter_NumberOfDays(String numberOfDaysText) {
        sendKeys_withClear(numberOfDays,numberOfDaysText);
    }

    public void enter_DueDate(String dueDateText) {
        sendKeys_withClear(dueDate,dueDateText);
    }

    public void enter_MinimumAmount(String amountValue) {
        sendKeys_withClear(minimumAmount,amountValue);
    }
    public void click_UpdateReminder() {
        click_custom(updateReminder);
    }

    public void update_Reminder(String reminderName,String numberOfDaysText,String dueDateText,String amountValue) throws InterruptedException {
        enter_ReminderName(reminderName)     ;
        enter_NumberOfDays(numberOfDaysText);
        enter_DueDate(dueDateText);
        Thread.sleep(1000);
        enter_MinimumAmount(amountValue);
        click_custom(autoSend);
        click_custom(followUpActivity);
        click_custom(deliveryEmail);
        click_custom(deliveryPost);
        click_UpdateReminder();
        click_custom(okButton);
        Thread.sleep(2000);
        click_custom(AdminIcon);

    }
}
