package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.billing.Penalty;
import org.automation.pageObjects.admin.miscellaneous.CustomerPortalSettings;
import org.automation.pageObjects.admin.paymentGateway.PaymentBatch;
import org.testng.annotations.Test;

public class OtherAdminTest extends BaseTest {

	PaymentBatch payBatch = new PaymentBatch();
	Penalty penalty = new Penalty();
	CustomerPortalSettings custPortal = new CustomerPortalSettings();

	@Test(priority = 0,enabled = true)
	public void paymentBatchTest() {

		payBatch.clickAdmin();
		payBatch.clickPaymentBatch();
		payBatch.enterBatchNumber("3442");
		payBatch.selectTransType("P");
		payBatch.selectPaymentMethod("Cash");
		payBatch.selectIDUsed("Customer ID");
		payBatch.enterCustomerID("230874");
		payBatch.enterAmount("146");
		payBatch.enterComments("Payments Batch Generated");
		payBatch.clickRefresh();

	}

	@Test(priority = 1,enabled = true)
	public void createPenaltyTest() throws InterruptedException {

		penalty.clickAdmin();
		penalty.clickPenalty();
		penalty.clickCreatePenalty();
		penalty.selectPenaltyOptions("Simple Penalty");
		penalty.enterPenaltyDescription("New Penalty Test");
		penalty.enterGraceDays("10");
		penalty.clickSavePenalty();
		penalty.validatePenalty("Successfully added new penalty.");
	}

	@Test(priority = 2,enabled = true)
	public void updatePenaltyTest() {
		penalty.clickEditPenalty();
		penalty.enterPenaltyDescription("Penalty Check");
		penalty.enterGraceDays("20");
		penalty.clickSavePenalty();

	}

	@Test(priority = 3,enabled = true)
	public void deletePenaltyTest() {
		penalty.clickDeletePenalty();
		penalty.clickOKButton();

	}

	@Test(priority = 4,enabled = true)
	public void customerPortalSettings() throws InterruptedException {
		custPortal.clickAdmin();
		custPortal.clickCustomerPortal();
		custPortal.activateArchievedToggle();
		custPortal.enableServiceEditToggle();
		custPortal.enableAccountSettingDetailsEditToggle();
		custPortal.enableServiceSettingEditToggle();
		custPortal.enableCustomerPortalSignUpToggle();
		custPortal.clickSaveSetting();

	}

}
