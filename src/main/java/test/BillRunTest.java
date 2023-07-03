package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.AddCycle;
import org.automation.pageObjects.CreateCustForChangeCustEmail;
import org.automation.pageObjects.IndexPage;
import org.automation.pageObjects.admin.billing.BillRunPage;
import org.automation.pageObjects.admin.commmunications.EmailTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMSTemplateSetup;
import org.automation.pageObjects.admin.commmunications.SMTPSetup;
import org.automation.pageObjects.admin.paymentGateway.PaymentsPage;
import org.automation.pageObjects.customers.AddMeterReads;
import org.automation.pageObjects.customers.CreateServicePage;
import org.automation.pageObjects.customers.Customer;
import org.testng.annotations.Test;

public class BillRunTest extends BaseTest {
    IndexPage index = new IndexPage();
    String customerId;
    Customer customer = new Customer();
    AddCycle addcycle = new AddCycle();
    AddMeterReads addMeterRead = new AddMeterReads();

    @Test(priority = 1, enabled = true, description = "SMTP Setup")
    public void smtpInformationSetup() throws InterruptedException {
        SMTPSetup smtp = new SMTPSetup();
        smtp.smtpInformation("mail.utilibill.com.au", "25", "testingkk464@gmail.com", "swaan321");
    }

    @Test(priority = 2, enabled = true, description = "Email Setup")
    public void setEmailSetup() throws InterruptedException {
        EmailTemplateSetup et = new EmailTemplateSetup();
        et.emailSetup("Invoice", "testingkk464@gmail.com", "Email Template Subject");
    }

    @Test(priority = 3, enabled = true, description = "SMS Setup") // to fix
    public void setSMSSetup() throws InterruptedException {
        SMSTemplateSetup smsTemplateSetup = new SMSTemplateSetup();
        smsTemplateSetup.smsSetup(1, "SMS Message");
    }

    @Test(priority = 5, enabled = true, description = "Create a Customer")
    public void createACustomer() throws InterruptedException {
        customerId = customer.createCustomer("Business",
                "SSLabs", "Dallas", "Mathew", "9988907865", "test12@gmail.com",
                "t12@gmail.com", "38 Decca Road", "37 Decca Road", "Goldsborough", "3156",
                "Australia", "Electricity Residential plan");
    }

    @Test(priority = 6, enabled = true, description = "Create a service.")
    public void createAService() throws InterruptedException {
        CreateServicePage createServicePage = new CreateServicePage();
        //customerId="230736";
        index.searchCustomerFromSearchPanel(customerId);
        createServicePage.newRetailElectricitySevice(customerId, "Electricity Flat Template Plan", "Peak, Off Peak, Shoulder", "Reads");
    }

    @Test(priority = 7, enabled = true, description = "Add meter for Actual and Initial")
    public void addMEterReadsForInitialAndConsumption() throws InterruptedException {
        addMeterRead.clickOnMeterReadsTab();
        Thread.sleep(5000);
        addMeterRead.selectMeterNumberDD(1);
        addMeterRead.addMeterReading("Actual", "100","150","300");
        addMeterRead.clickOnMeterReadsTab();
        Thread.sleep(5000);
        addMeterRead.selectMeterNumberDD(1);
        addMeterRead.addComsumptionReading("Initial", "300","400","700");

    }

    @Test(priority = 8,enabled = true, description = "Add a cycle.")
    public void addNewBillCycle() throws InterruptedException {
        addcycle.AddANewCycle(customerId, customerId);

    }

    @Test(priority = 9,enabled = true, description = "Run the Bill Run Cycle")
    public void runTheBillRunCycle() throws InterruptedException {
        BillRunPage runTheCycle = new BillRunPage();
        runTheCycle.runTheBillRunCycle(customerId);

    }
    @Test(priority = 10, enabled = true,description = "Add meter for Estimate")
    public void BillRun_Rollback() throws InterruptedException {
        BillRunPage runTheCycle = new BillRunPage();
        runTheCycle.rollback();

    }

    @Test(priority = 11, enabled = true,description = "Add meter for Estimate")
    public void secondBillRun_Rebill() throws InterruptedException {
        BillRunPage runTheCycle = new BillRunPage();
        runTheCycle.runTheBillRunCycle(customerId);
    }
    @Test(priority = 12, enabled = true,description = "Add meter for Estimate")
    public void commitBillRun() throws InterruptedException {
        BillRunPage runTheCycle = new BillRunPage();
        runTheCycle.commit_Statement();
    }
    @Test(priority = 13, enabled = true,description = "Add a Payment from Credit Card")
    public void addPaymentFromCreditCard() throws InterruptedException {
        PaymentsPage addPayment = new PaymentsPage();
        index.searchCustomerFromSearchPanel(customerId);
        addPayment.PaymentsFromCreditCard("Payment", "Credit Card", "test11@gmail.com", "10",
                "Hey!!! this is the comment section under payment tab");
    }

}
