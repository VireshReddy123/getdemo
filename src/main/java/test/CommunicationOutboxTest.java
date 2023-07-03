 /*package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.commmunications.ReminderSetup;
import org.automation.pageObjects.outbox.OutBoxPage;
import org.automation.utilities.RandomGenerator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CommunicationOutboxTest extends BaseTest {

    AdminPage admin = new AdminPage();
    OutBoxPage outbox = new OutBoxPage();
    ReminderSetup reminder = new ReminderSetup();

    RandomGenerator randomGenerator = new RandomGenerator();

    @Test(priority = 1, enabled = true, description = "Verify user is able to create new reminder")
    public void reminder_Section() throws InterruptedException {
        ReminderSetup reminder   =admin.navigateToReminder();
        String newReminder = "Reminder" + randomGenerator.requiredDigits(3);
        reminder.update_Reminder(newReminder,"13","12","100");
    }

    @Test(priority = 2, enabled = true, description = "Verify user is able tpo generate reminder")
    public void outbox_To_Communication(){
        outbox.navigateToOutbox();
        outbox.sendEmail_SelectedCustomer();
    }
}*/
