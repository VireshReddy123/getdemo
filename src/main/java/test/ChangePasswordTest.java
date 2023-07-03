package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.paymentGateway.PaymentBatch;
import org.automation.pageObjects.admin.userManager.Password;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseTest {

	
    @Test(priority = 1,enabled = true, description = "Change Password")
    public void changePassword() {
        Password cp = new Password();
        cp.clickAdmin();
        cp.clickPassword();
        cp.enterNewPassword("Sqeuser@1");
        cp.ReEnterNewPassword("Sqeuser@1");
        cp.clickChangePassword();
        cp.clickConfirmPopup();
        cp.getInformationMessage();
    
}
}
//Sqe#1234
//password=Sqe123!@#
