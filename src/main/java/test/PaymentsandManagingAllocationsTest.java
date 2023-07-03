package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.customers.AllocateStatementafterMakepayment;
import org.testng.annotations.Test;

public class PaymentsandManagingAllocationsTest extends BaseTest {
	
	AllocateStatementafterMakepayment asmp = new AllocateStatementafterMakepayment();
	
	@Test(priority=0,enabled = true)
	public void AllocateStatementafterMakepayment() throws InterruptedException {
		asmp.clickSearchBtn();
		asmp.clickCustomerNumber();
		asmp.clickTransactions();
		asmp.selectTransactionType("Payment");
		asmp.selectPaymentMethod("Cash");
		asmp.enterAmount("100");
		asmp.enterComment("Added Comments");
		asmp.clickSubmitBtn();
		asmp.clickConfirmation();
		asmp.validatePayMethod("Cash");
		asmp.clickDelete();
		asmp.enterDeleteDescription("Delete Transaction");
		asmp.clickDeleteConfirmation();
		
	}
}
