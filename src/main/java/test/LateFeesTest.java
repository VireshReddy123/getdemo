package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.billing.LateFeeSettings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LateFeesTest extends BaseTest {
    AdminPage admin = new AdminPage();

    @Test(priority = 0, enabled = true,description = "Change Password")
    public void enable_ElectricityFlatUsage_LateFees() {
        LateFeeSettings lateFeesPage = admin.navigateToLateFees();
        lateFeesPage.enterSearchText("Electricity flat usage");
        lateFeesPage.enableCheckBox();
        // Assert.assertTrue( lateFeesPage.isEnabledCheckBox());


    }

    @Test(priority = 1,enabled = true, description = "Change Password")
    public void disable_ElectricityFlatUsage_LateFees() throws InterruptedException {
        LateFeeSettings lateFeesPage = admin.navigateToLateFees();
        lateFeesPage.enterSearchText("Electricity flat usage");
         
        lateFeesPage.disableCheckBox();
        Assert.assertFalse(lateFeesPage.isEnabledCheckBox());


    }
}
