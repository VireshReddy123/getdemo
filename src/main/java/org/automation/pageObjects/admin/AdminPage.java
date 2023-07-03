package org.automation.pageObjects.admin;

import org.automation.base.BasePage;
import org.automation.pageObjects.admin.billing.LateFeeSettings;
import org.automation.pageObjects.admin.groupManager.EditGroup;
import org.automation.pageObjects.admin.importSetupTools.Imports;
import org.automation.pageObjects.admin.invoice.invoiceSetupPage;
import org.openqa.selenium.By;
import test.BillRunTest;

public class AdminPage extends BasePage {
    public By MeterNumbersIcon = By.xpath("//p[text()='Meter Numbers']");
    public By AdminIcon = By.xpath("//a[@title='Administration']/i");
    public By btnbrowseFile = By.id("btnbrowseFile");
    public By attDesc = By.id("attDesc");

    public By lateFees = By.xpath("//p[text()='Late Fee Settings']");

    public By invoiceSetupBtn = By.xpath("//p[text()='Invoice Set-up']");
    public By groupEditBtn = By.xpath("//p[text()='Edit Group']");
    public By billRun = By.xpath("//span[text()='Bill Run']");
    public By plans = By.xpath("//span[text()='Plans']");
    public By customers = By.xpath("//p[text()='Customers']");
    public By securityDeposit = By.xpath("//p[text()='Security Deposit']");
    public By prorated = By.xpath("//p[text()='Prorated Tariff']");
    public By prepaidMeters = By.xpath("//p[text()='Prepaid Meters']");
    public By demandReads = By.xpath("//p[text()='Demand Reads']");
    public By meterReadings = By.xpath("//p[text()='Meter Readings']");
    public By payments = By.xpath("//p[text()='Payments']");
    public By genericService = By.xpath("//p[text()='Generic Service']");
    public By recurring = By.xpath("//p[text()='Recurring Charge']");

    public invoiceSetupPage navigateToInvoiceSetup() {
        clickBtn_custom(AdminIcon);
        clickBtn_custom(invoiceSetupBtn);
        return new invoiceSetupPage();

    }

    public EditGroup navigateToEditGroup() {
        clickBtn_custom(AdminIcon);
        clickBtn_custom(groupEditBtn);
        return new EditGroup();

    }

    public BillRunTest navigateToBillRun() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(billRun);
        clickBtn_custom(billRun);
        return new BillRunTest();


    }

    public void navigateToPlans() {
        clickBtn_custom(AdminIcon);
        clickBtn_custom(plans);

    }

    public Imports navigateToMeterNumberImports() {
        clickBtn_custom(AdminIcon);
        clickBtn_custom(MeterNumbersIcon);
        return new Imports();

    }

    public Imports navigateToMeterReadingsImports() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(meterReadings);
        clickBtn_custom(meterReadings);
        return new Imports();

    }

    public Imports navigateToPaymentImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(payments);
        clickBtn_custom(payments);
        return new Imports();

    }

    public Imports navigateToDemandReadsImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(demandReads);
        clickBtn_custom(demandReads);
        return new Imports();

    }

    public LateFeeSettings navigateToLateFees() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(lateFees);
        clickBtn_custom(lateFees);
        return new LateFeeSettings();

    }

    public Imports navigateToCustomerImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(customers);
        clickBtn_custom(customers);
        return new Imports();

    }

    public Imports navigateToMeterRead() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(meterReadings);
        clickBtn_custom(meterReadings);
        return new Imports();

    }

    public Imports navigateToRecurringCharge() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(recurring);
        clickBtn_custom(recurring);
        return new Imports();

    }

    public Imports navigateToGenericImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(genericService);
        clickBtn_custom(genericService);
        return new Imports();

    }

    public Imports navigateToProratedImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(prorated);
        clickBtn_custom(prorated);
        return new Imports();

    }

    public Imports navigateToSecurityDepositImport() {
        clickBtn_custom(AdminIcon);
        scrollIntoView(securityDeposit);
        clickBtn_custom(securityDeposit);
        return new Imports();

    }
    public  EditGroup navigateToGroupEdit(){
        click_custom(AdminIcon);
        click_custom(groupEditBtn);
        return  new EditGroup();
    }
}
