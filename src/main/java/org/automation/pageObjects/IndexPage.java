package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.pageObjects.customers.Details;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {

    // Search Field
    public By SearchField = By.xpath("//*[@id=\"search_input\"]");
    public By SearchIcon = By.xpath("//*[@id=\"btn_search\"]/span");   ////*[@id="btn_search"]/span
    public By OverviewTab = By.xpath("//*[@class=\"icon-eye-open\"]"); // //*[contains(text(),'Overview')]
   // public By footerVersion = By.xpath("//footer/div[2]");
    public By footerVersion = By.cssSelector(".footerLinks div:nth-child(2)");
    public By searchIcon = By.xpath("//*[@class=\"glyphicon glyphicon-search\"]");
    public By dropDown = By.xpath("//button[@class='btn btn-default dropdown-toggle']");

    public By customer = By.xpath("//a[text()='Customer']");
    public By customerAddress = By.xpath("//a[text()='Customer Address']");
    public By marketService = By.xpath("//a[text()='Market Service ID']");
    public By serviceAddress = By.xpath("//a[text()='Service Address']");
 //   public By meterNumber = By.xpath("//a[text()='Market Number']");
    public By meterNumber = By.xpath("//*[@id='frmSearch']/div/div/ul/li[3]/a");

    public By all = By.xpath("#");
    public By searchInput=By.xpath("//div[@class='input-group search-panel-holder']//input[@id='search_input']");

    public Details searchCustomer(String customerId) {
        clickBtn_custom(SearchIcon);
        clickBtn_custom(SearchField);
        sendKeys_custom(SearchField, customerId);
        clickBtn_custom(SearchIcon);
        return new Details();
    }

    public void searchCustomerFromSearchPanel(String customerId) {

        sendKeys_custom(SearchField, customerId);
        clickBtn_custom(SearchIcon);
    }



        public String getTextVersion() {
            return getText_custom(footerVersion);
        }

        public void searchAllCustomer() {
            click_custom(dropDown,"dropDown");
            click_custom(customer,"customer");

            click_custom(searchIcon,"searchIcon");

        }
        public void searchAll() {
            click_custom(searchIcon,"searchIcon");
        }
        public void searchAll(String searchText) {
            sendKeys_custom(searchInput,searchText);
            click_custom(searchIcon,"searchIcon");
        }

        public SearchResult searchAllMeterNumber() {
            click_custom(dropDown,"dropDown");
            click_custom(meterNumber,"meterNumber");
            click_custom(searchIcon,"searchIcon");
            return new SearchResult();

        }
        public void searchAllServiceAddress() {
            click_custom(dropDown,"dropDown");
            click_custom(serviceAddress,"serviceAddress");
            click_custom(searchIcon,"searchIcon");
        }
        public void searchAllCustomerAddress() {
            click_custom(dropDown,"dropDown");
            click_custom(customerAddress,"customerAddress");
            click_custom(searchIcon,"searchIcon");
        }
        public void searchAllServiceId() {
            click_custom(dropDown,"dropDown");
            click_custom(marketService,"marketService");
            click_custom(searchIcon,"searchIcon");
        }
    }
