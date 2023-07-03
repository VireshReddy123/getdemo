package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.userManager.UserDetails;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest {


    @Test(priority = 1, enabled = true,description = "To Edit User ")
    public void EditUser() throws InterruptedException {
        UserDetails Eu = new UserDetails();
        Eu.clickAdmin();
        Eu.clickUsersDetails();
        Thread.sleep(2000);
        Eu.enterFirstName("Adams");
        Eu.enterLastName("josh");
        Thread.sleep(2000);
        Eu.clickSaveBtn();
        Eu.clickOkBtn();
    }
}
