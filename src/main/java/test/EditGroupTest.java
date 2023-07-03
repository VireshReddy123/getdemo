package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.groupManager.EditGroup;
import org.testng.annotations.Test;

public class EditGroupTest extends BaseTest {

    @Test(enabled = true)
    public void editGroup() throws InterruptedException {
        EditGroup groupPage = new EditGroup();

        groupPage.clickAdmin();
        groupPage.clickEditGroup();
        groupPage.enterCompanyName("testing002");

        groupPage.entergroupOwner_1("Aida");
        groupPage.entergroupOwner_2("Barkley");
        groupPage.enterFinanceName("Elias");
        groupPage.enterSalesName("Hartley");
        groupPage.enterOperationContact("Charli");
        groupPage.enterCollectionName("Bob");

        groupPage.enterOwnerEmail_1("Aida@gmail.com");
        groupPage.enterOwnerEmail_2("Barkley@gmail.com");
        groupPage.enterFinanceEmail("Elias@gmail.com");
        groupPage.enterSalesEmail("Hartley@gmail.com");
        groupPage.enterContactEmail("Charli@gmail.com");
        groupPage.enterCollectionsEmail("Bob@gmail.com");

        groupPage.enterOwner1Phone1("123456789");
        groupPage.enterOwner2Phone1("987654321");
        groupPage.enterFinancePhone1("65525655789");
        groupPage.enterSalesPhone1("12345545849");
        groupPage.enterContactPhone1("558156789");
        groupPage.enterCollectionsPhone1("5566332211");

        groupPage.enterOwner1Phone2("84888589");
        groupPage.enterOwner2Phone2("455875789");
        groupPage.enterFinancePhone2("898586789");
        groupPage.enterSalesPhone2("898996789");
        groupPage.enterContactPhone2("52887789");
        groupPage.enterCollectionsPhone2("8521479630");

        groupPage.enterOwner1Fax("10006789aa");
        groupPage.enterOwner2Fax("111186789aa");
        groupPage.enterFinanceFax("02286789aa");
        groupPage.enterSalesFax("115789aa");
        groupPage.enterContactFax("55586789aa");
        groupPage.enterCollectionsFax("635241789aa");

        groupPage.enterBankName("PNB");
        groupPage.enterAccountName("Sonia12");
        groupPage.enterAccountNumber("XXXXXXX5858");
        groupPage.enterCreditCardHolder("12514aa");
        groupPage.selectDropDownByVisibleText_custom("Visa");
        groupPage.enterCreditCardNumber("00000");
        groupPage.enterCreditCardExpiry("032019");

        groupPage.enterPostAddress("The Strip - Las Vegas, NV");
        groupPage.enterPostCode("14445");
        groupPage.enterPostState("Las Vegas");
        groupPage.enterPostSub("The Strip");

        groupPage.enterBillingAddress("h.no:25,NV");
        groupPage.enterBillingCode("6635");
        groupPage.enterBillingState("Las Vegassss");
        groupPage.enterBillingSub("The Strip");

        groupPage.selectPrimaryFrontInvoice("vikas");
        groupPage.selectPrimaryBackInvoice("vikas");
        groupPage.selectSecondaryFrontInvoice("vikas");
        groupPage.selectSecondaryBackInvoice("vikas");

        groupPage.enterTiabNotes("making notes for admin tab");
        groupPage.enterFranchiseeNotes("making notes for admin tab");
        groupPage.clickSaveChanges();
        groupPage.clickOkButton();
        Thread.sleep(2000);
        groupPage.assertSuccessMessage();

    }
}
