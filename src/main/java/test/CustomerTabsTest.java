package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.IndexPage;
import org.automation.pageObjects.LoginPage;
import org.automation.pageObjects.SearchResult;
import org.automation.pageObjects.admin.AdminPage;
import org.automation.pageObjects.admin.groupManager.EditGroup;
import org.automation.pageObjects.customers.Customer;
import org.automation.utilities.PropertiesUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CustomerTabsTest extends BaseTest {
    LoginPage login = new LoginPage();
    IndexPage indexPage=new IndexPage();
    String BASE_URL = PropertiesUtil.getPropertyValue("baseUrl");
    String INDEX = PropertiesUtil.getPropertyValue("indexPage");
    SearchResult searchPage = new SearchResult();

    String serviceID;
    @Test(priority = 3, enabled = false, description = "verify  page reload")
    public void reload_Page() {
        indexPage.refreshPage();
        if (PropertiesUtil.getPropertyValue("group").contains("single")) {
            Assert.assertEquals(indexPage.getPageUrl(), BASE_URL  +INDEX);}
        else {
            Assert.assertEquals(indexPage.getPageUrl(), BASE_URL  +"/");}

    }

    @Test(priority = 4, enabled = false, description = "verify create new customer")
    public void create_new_Customer() throws InterruptedException {
        Customer customer = new Customer();
        customer.createCustomer("Tenant", "Business", "business123@yopmail.com");
    }

    @Test(priority = 5, enabled = true, description = "verify all customer Search box")
    public void search_All() {
        SoftAssert softAssert = new SoftAssert();

        indexPage.searchAll();
        softAssert.assertTrue(searchPage.getHeaderText().contains("Customers Found"));
        indexPage.ScrollDownThePageMax();
        softAssert.assertTrue(searchPage.getHeader2Text().contains("Meters Found"));
        softAssert.assertAll();
    }



    @Test(priority = 5, enabled = true, description = "verify all customer Search box")
    public void search_All_Customer_Address() {

        indexPage.searchAllCustomerAddress();
        Assert.assertTrue(searchPage.getHeaderText().contains("Customers Found"));


    }

    @Test(priority = 5, enabled = true, description = "verify all customer Search box")
    public void search_All_Service_Address() {

        indexPage.searchAllServiceAddress();
        Assert.assertTrue(searchPage.getHeaderText().contains("Meters Found"));

    }

    //TODO
    @Test(priority = 5, enabled = true, description = "verify all customer Search box")
    public void search_All_Meter_Number() throws InterruptedException {
        indexPage.searchAllMeterNumber();
       // Assert.assertTrue(searchPage.getHeaderText().contains("Customers Found"));

    }

    @Test(priority = 5, enabled = true, description = "verify all customer Search box")
    public void search_All_Customers() {

        indexPage.searchAllCustomer();
        Assert.assertTrue(searchPage.getHeaderText().contains("Customers Found"));


    }

    @Test(priority = 6, enabled = true, description = "verify Customer group Name ")
    public void search_Recent_Customers_groupName() {
        AdminPage admin = new AdminPage();
        EditGroup groupEdit = admin.navigateToGroupEdit();
        String groupName = groupEdit.getGroupNameText();
        Customer customer = new Customer();
        SoftAssert softAssert = new SoftAssert();
        indexPage.searchAllCustomer();
        String customerIdRecent = customer.clickRecentCustomerId();
        // softAssert.assertEquals(customerIdRecent, customerId);
        customer.switchToWindow("CustomerPage");
        customer.clickDetailsTab();
        String custGroupName = customer.getGroupName();
        softAssert.assertEquals(custGroupName, groupName);
        softAssert.assertEquals(custGroupName, PropertiesUtil.getPropertyValue("groupName"));
        softAssert.assertFalse(customer.isExceptionOrErrorPresent());
       softAssert.assertAll();

    }
    @Test(priority = 7, enabled = true, description = "verify  Customer Tab")
    public void Click_CustomerTabs() throws InterruptedException {
        String tabs []=PropertiesUtil.getPropertyValue("customerTabs").split(",");
        SoftAssert softAssert= new SoftAssert();

        for(String tab :tabs) {

            Customer customer = new Customer();
            customer.clickCustomerTab(tab);
            Thread.sleep (4000);
            if (!(tab.contains("Settings")||tab.contains("Contact"))) {
                softAssert.assertFalse(customer.isExceptionOrErrorPresent(), "Exception in  " + tab + " Tab.\n");
            } else {
                softAssert.assertFalse(customer.isExceptionOrErrorPresent(3), "Exception found in  " + tab + " Tab.\n");
            }


        }
        softAssert.assertAll();

    }


}
