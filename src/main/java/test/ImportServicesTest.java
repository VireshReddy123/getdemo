//<<<<<<< HEAD
//package test;
//
//import org.automation.base.BaseTest;
//import org.automation.pageObjects.admin.AdminPage;
//import org.automation.pageObjects.admin.importSetupTools.Imports;
//import org.automation.pageObjects.customers.Customer;
//import org.automation.pageObjects.customers.RetailElectricityService;
//import org.automation.utilities.CSVHelper;
//import org.automation.utilities.DateGenerator;
//import org.testng.annotations.Test;
//
//import java.util.Random;
//
//public class ImportServicesTest extends BaseTest {
//    AdminPage admin = new AdminPage();
//    DateGenerator dateGenerator = new DateGenerator();
//    Customer customer = new Customer();
//    CSVHelper csvHelper = new CSVHelper();
//    String meterNo = "Ele104132";
//    String serviceId = "Ele104132";
//    String customerId = "230804";
//    String currentDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//
//    @Test(priority = 0, enabled = false)
//    public void Add_Customer_and_Service_for_Imports() throws Exception {
//        customerId = customer.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
//                "38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
//        ;
//        RetailElectricityService retailElectricityService = new RetailElectricityService();
//        retailElectricityService.searchCustomer(customerId);
//        serviceId = retailElectricityService.addRetailElectricityService();
//        //  retailElectricityService.editServiceStatus();
//
//    }
//
//    @Test(priority = 1, enabled = false)
//    public void Import_Meter_Number() throws Exception {
//        String path = System.getProperty("user.dir") + "/src/main/resources/Meter  Number Import Template.csv";
//        String columnStr = "Customer Number,Alternative Customer Number,*Plan Number,*Meter Number,*Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder],*Prorata Date,*Meter Type [HE - Electricity / WT - Water],*Meter Read Type [R-Reads/C-Consumption],Enable Demand Reads? [Yes/No],*Kfactor,Phase Type,Gas Cook,Master Meter,Walk Order,NMI,SubAddress Type,SubAddress Number,Street Number,Street Name,Street type,Suburb,State/County,Post/Zip Code,Special Type [0 - Normal / 1 - Solar],Route,High Reading,Low Reading,Modem Number,IMEI Number,Sim Number,Seal Number,Meter Size";
//        meterNo = "MeterNo" + (new Random()).nextInt(900) + 100;
//        DateGenerator dateGenerator = new DateGenerator();
//        String prodate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//        String rowData = "10000,,1,110001,1,1/1/2015,HE,R,No,1,,,,,1200-1,APT,Apartment 7,24,Hermit Park,APT,Mount Louisa,AUSTRALIA,4814,0,,,,,,,,,,,,,,,";
//
//        rowData = rowData.replace("10000", customerId);
//        rowData = rowData.replace("110001", meterNo);
//        rowData = rowData.replace("1/1/2015", prodate);
//        String[] row = rowData.split(",");
//        String[] column = columnStr.split(",");
//        System.out.println(column.length);
//
//        CSVHelper.createCSVGeneric(path, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToMeterNumberImports();
//        importObj.importFile(path, meterNo);
//
//    }
//
//
//    @Test(priority = 3, enabled = true)
//    public void Import_Meter_Reads() throws Exception {
////        extentTest = extent.startTest(" Meter Reads Import ");
////        extentTest.setDescription(" Verify that User is able to   Import Meter reads");
//        String path = System.getProperty("user.dir") + "/src/main/resources/Meter Read Import Template.csv";
//        DateGenerator dateGenerator = new DateGenerator();
//
//        String readDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//        String col = "*Service ID,*Meter Number,*Date of Read,*Meter Read,*Period,*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate],Notes,Is Read Rollover? [Yes/No],Unit? [GAC-Cubic meter (m3)/GAB-Cubic feet (ft3)/GAA-British thermal unit (btu)/GAD-Kilowatt hour (kWh)/GAE-Mega joules (MJ)/GAF-Therms (th)],Datastream,Special Type";
//
//        String rowData = "10000,110001,09/03/2023,150,1,HE,R,No,1,,,,,1200-1,APT,Apartment 7,24,Hermit Park,APT,Mount Louisa,AUSTRALIA,4814,0,,,,,,,,";
//        rowData = rowData.replace("10000", serviceId);
//        rowData = rowData.replace("10000", meterNo);
//
//        String[] row = rowData.split(",");
//        String[] column = rowData.split(",");
//
//        // csvHelper.ImportMeterReads(path, col, serviceId, meterNo, readDate, "100", "P", "I", "notes", "", "", "E1", "none");
//        CSVHelper.createCSVGeneric(path, column, row);
//        Imports importObj = admin.navigateToMeterReadingsImports();
//
//        importObj.importFile(path, "Meter Reads");
//
//    }
//
//
//    @Test(priority = 5, enabled = true)
//    public void Import_Customers() throws Exception {
//        String columnData = "Alternative Customer Number,Salutation [DR/MISS/MR/MRS/MS/MSTR],*First Name,*Surname,*Billing Address,Billing Address2,Billing Suburb,Billing State,Billing Postal Code,Billing Country,Phone Number,*Mobile Number,Fax Number,Email,Company,Notes/Feedbacks,Legal Entity,ABN,ACN,*Is Home Address Same As Billing Address? [Yes/No],Home Address,Home Address2,Home Suburb,Home State,Home Postal Code,Home Country,Category [B-Business/R-Residential],Billing Email,Account Name,Authentication Type[AC/DL/PA/PN/PI/UB],Authentication  No.,Date of Birth,Referee Name,Referee Contact Number,Referee relationship to tenant,Enable Internet Access? [Yes/No],Password,Secondary Customer Name,Secondary Phone Number,Secondary Mobile Number,Secondary Fax Number,Secondary Email,Is life support? [Yes/No],guarantorFirstName,guarantorLastName,guarantorAddress1,guarantorAddress2,guarantorCity,guarantorState,guarantorZipCode,guarantorMobilePhone,guarantorHomePhone,guarantorEmail,guarantorAuthType,guarantorAuthNo,cycleNo\n";
//
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/Customer Import Template.csv";
//        String rowData = ",Mr,Sands,Hello,3090 Satellite Boulevard,,Duluth,GA,30096,United States,+1 800-001-0001,211 995 500 00 00 01,+1 800-001-0011,peter.andrews@alpha.mail.com,Basics Group of Companies,New customer,,96365484275,,Yes,,,,,,,B,pandrews@wideworld.com,Peter Andrews,AC,10012345,,Matt Andrews,+1 800-001-0100,Brother,No,pass123,Matt Andrews,+1 800-001-0011,211 995 500 00 00 11,,matt.andrews@worldmail.com,No,Mary,Palmer,Parker,Hills,White Pine Bay,Oregon,90414,3232332526,3233453423,rer@gmail.com,AC,78956,0";
//        // rowData= rowData.replace();
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToCustomerImport();
//        importObj.importFile(filePath, "Customer");
//
//
//    }
//
//    @Test(priority = 6, enabled = true)
//    public void Import_Recurring_Charge() throws Exception {
//        String column[] = {"Alternative Customer Number", "Salutation [DR/MISS/MR/MRS/MS/MSTR]", "*First Name", "*Surname", "*Billing Address", "Billing Address2", "Billing Suburb", "Billing State", "Billing Postal Code", "Billing Country", "Phone Number", "*Mobile Number", "Fax Number", "Email", "Company", "Notes/Feedbacks", "Legal Entity", "ABN", "ACN", "*Is Home Address Same As Billing Address? [Yes/No]", "Home Address", "Home Address2", "Home Suburb", "Home State", "Home Postal Code", "Home Country", "Category [B-Business/R-Residential]", "Billing Email", "Account Name", "Authentication Type[AC/DL/PA/PN/PI/UB]", "Authentication  No.", "Date of Birth", "Referee Name", "Referee Contact Number", "Referee relationship to tenant", "Enable Internet Access? [Yes/No]", "Password", "Secondary Customer Name", "Secondary Phone Number", "Secondary Mobile Number", "Secondary Fax Number", "Secondary Email", "Is life support? [Yes/No]", "guarantorFirstName", "guarantorLastName", "guarantorAddress1", "guarantorAddress2", "guarantorCity", "guarantorState", "guarantorZipCode", "guarantorMobilePhone", "guarantorHomePhone", "guarantorEmail", "guarantorAuthType", "guarantorAuthNo", "cycleNo"};
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/ManualRecurringChargeImportTemplate.csv";
//        String rowData = ",Mr,Sands,Hello,3090 Satellite Boulevard,,Duluth,GA,30096,United States,+1 800-001-0001,211 995 500 00 00 01,+1 800-001-0011,peter.andrews@alpha.mail.com,Basics Group of Companies,New customer,,96365484275,,Yes,,,,,,,B,pandrews@wideworld.com,Peter Andrews,AC,10012345,,Matt Andrews,+1 800-001-0100,Brother,No,pass123,Matt Andrews,+1 800-001-0011,211 995 500 00 00 11,,matt.andrews@worldmail.com,No,Mary,Palmer,Parker,Hills,White Pine Bay,Oregon,90414,3232332526,3233453423,rer@gmail.com,AC,78956,0";
//        String[] row = rowData.split(",");
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToRecurringCharge();
//        importObj.importFile(filePath, "Recurring Charge");
//    }
//
//    @Test(priority = 7, enabled = true)
//    public void Import_Generic_Service() throws Exception {
//        String columnData = "Customer No,Product/Charge Description,Prorata Date,End Date,Quantity,Notes,Rollup Description,Unit,Rate,Is Once Off?,Charge Type";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/genericServiceImportTemplate.csv";
//        String rowData = "10005,Car,27/11/2023,,1,This is just a test.,Elec Rollup Description,KW,1.5,No,Electricity Charges\n";
//        rowData = rowData.replace("10005", customerId);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToRecurringCharge();
//        importObj.importFile(filePath, "Generic Service");
//    }
//
//    @Test(priority = 8, enabled = true)
//    public void Import_Payments() throws Exception {
//        String columnData = "Customer No,Alternative Customer No,Transaction Type,Payment Method,Card Type,Amount,Transaction Date,Comments,Auto Allocate,Batch No\n";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/paymentImportTemplate.csv";
//        String rowData = "12601,,P,CH,,150,06/02/2023,cheque payment,TRUE,23t45";
//        rowData = rowData.replace("12601", customerId);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToPaymentImport();
//        importObj.importFile(filePath, "Payments");
//    }
//
//    @Test(priority = 9, enabled = true)
//    public void Import_Demand_Reads() throws Exception {
//        String columnData = "*Meter Number,*Demand Type (1 to 5),*Date of Read,*Time of Read,*Flat Rate Read,*Peak Read,*Shoulder Read,* Off Peak Read";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/Demand Read Import Template.csv";
//        String rowData = "10004455005,1,09/03/2023,2:24 PM,1,0,0,0";
//        rowData = rowData.replace("10004455005", meterNo);
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToDemandReadsImport();
//        importObj.importFile(filePath, "Demand Reads");
//    }
//
//    @Test(priority = 11, enabled = false)
//    public void Import_Prorated_Tariff() throws Exception {
//        String columnData = "Plan No,Code,Date Start,Date End,Rate";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/ProratedTariffImportTemplate.csv";
//        String rowData = "11819,Adams Johhons,09/1/2015,09/1/2015,150.00";
//        //   rowData= rowData.replace("1200",customerId);
//        rowData = rowData.replace("09/1/2015", currentDate);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToProratedImport();
//        importObj.importFile(filePath, "Prorated Tariff");
//    }
//
//    @Test(priority = 4, enabled = true)
//    public void Import_Security_Deposit() throws Exception {
//        String columnData = "Customer No,Alternative Customer No,Transaction Type,Payment Method,Amount,Transaction Date,Comments";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/SecurityDepositsImportTemplate.csv";
//        String rowData = "1200,,SD,DP,300,09/03/2023,your comment";
//        String rowStr = rowData.replace("1200", customerId);
//        String[] row = rowStr.split(",");
//        String[] column = columnData.split(",");
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToSecurityDepositImport();
//        importObj.importFile(filePath, "SecurityDeposit");
//    }
//}
//=======
//package test;
//
//import org.automation.base.BaseTest;
//import org.automation.pageObjects.admin.AdminPage;
//import org.automation.pageObjects.admin.importSetupTools.Imports;
//import org.automation.pageObjects.customers.Customer;
//import org.automation.pageObjects.customers.RetailElectricityService;
//import org.automation.utilities.CSVHelper;
//import org.automation.utilities.DateGenerator;
//import org.automation.utilities.RandomGenerator;
//import org.testng.annotations.Test;
//
//import java.util.Random;
//
//public class ImportServicesTest extends BaseTest {
//    AdminPage admin = new AdminPage();
//    DateGenerator dateGenerator = new DateGenerator();
//    Customer customer = new Customer();
//    CSVHelper csvHelper = new CSVHelper();
//    String meterNo = "Ele104132";
//    String serviceId = "Ele104132";
//    String customerId = "230804";
//    String currentDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//
//    @Test(priority = 0, enabled = false)
//    public void Add_Customer_and_Service_for_Imports() throws Exception {
//        customerId = customer.createCustomer("Business", "SSLabs", "Dino", "Anotonello", "9988907865", "test12@gmail.com", "t12@gmail.com",
//                "38 Decca Road", "35 Decca Road", "Goldsborough", "3156", "Australia", "Electricity Residential plan");
//        ;
//        RetailElectricityService retailElectricityService = new RetailElectricityService();
//        retailElectricityService.searchCustomer(customerId);
//        serviceId = retailElectricityService.addRetailElectricityService();
//        //  retailElectricityService.editServiceStatus();
//
//    }
//
//    @Test(priority = 1, enabled = true)
//    public void Import_Meter_Number() throws Exception {
//        String path = System.getProperty("user.dir") + "/src/main/resources/Meter  Number Import Template.csv";
//        String columnStr = "Customer Number,Alternative Customer Number,*Plan Number,*Meter Number,*Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder],*Prorata Date,*Meter Type [HE - Electricity / WT - Water],*Meter Read Type [R-Reads/C-Consumption],Enable Demand Reads? [Yes/No],*Kfactor,Phase Type,Gas Cook,Master Meter,Walk Order,NMI,SubAddress Type,SubAddress Number,Street Number,Street Name,Street type,Suburb,State/County,Post/Zip Code,Special Type [0 - Normal / 1 - Solar],Route,High Reading,Low Reading,Modem Number,IMEI Number,Sim Number,Seal Number,Meter Size";
//        meterNo = "MeterNo" + (new Random()).nextInt(900) + 100;
//        DateGenerator dateGenerator = new DateGenerator();
//        String prodate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//        String rowData = "10000,,1,110001,1,1/1/2015,HE,R,No,1,,,,,1200-1,APT,Apartment 7,24,Hermit Park,APT,Mount Louisa,AUSTRALIA,4814,0,,,,,,,,,,,,,,,";
//
//        rowData = rowData.replace("10000", customerId);
//        rowData = rowData.replace("110001", meterNo);
//        rowData = rowData.replace("1/1/2015", prodate);
//        String[] row = rowData.split(",");
//        String[] column = columnStr.split(",");
//        System.out.println(column.length);
//
//        CSVHelper.createCSVGeneric(path, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToMeterNumberImports();
//        importObj.importFile(path, meterNo);
//
//    }
//
//
//    @Test(priority = 3, enabled = true)
//    public void Import_Meter_Reads() throws Exception {
////        extentTest = extent.startTest(" Meter Reads Import ");
////        extentTest.setDescription(" Verify that User is able to   Import Meter reads");
//        String path = System.getProperty("user.dir") + "/src/main/resources/Meter Read Import Template.csv";
//        DateGenerator dateGenerator = new DateGenerator();
//
//        String readDate = dateGenerator.DateTimeGenerator("dd/MM/yyyy");
//        String col = "*Service ID,*Meter Number,*Date of Read,*Meter Read,*Period,*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate],Notes,Is Read Rollover? [Yes/No],Unit? [GAC-Cubic meter (m3)/GAB-Cubic feet (ft3)/GAA-British thermal unit (btu)/GAD-Kilowatt hour (kWh)/GAE-Mega joules (MJ)/GAF-Therms (th)],Datastream,Special Type";
//
//        String rowData = "10000,110001,09/03/2023,150,1,HE,R,No,1,,,,,1200-1,APT,Apartment 7,24,Hermit Park,APT,Mount Louisa,AUSTRALIA,4814,0,,,,,,,,";
//        rowData = rowData.replace("10000", serviceId);
//        rowData = rowData.replace("10000", meterNo);
//        rowData = rowData.replace("09/03/2023", currentDate);
//
//        String[] row = rowData.split(",");
//        String[] column = rowData.split(",");
//
//        // csvHelper.ImportMeterReads(path, col, serviceId, meterNo, readDate, "100", "P", "I", "notes", "", "", "E1", "none");
//        CSVHelper.createCSVGeneric(path, column, row);
//        Imports importObj = admin.navigateToMeterReadingsImports();
//
//        importObj.importFile(path, "Meter Reads");
//
//    }
//
//
//    @Test(priority = 5, enabled = true)
//    public void Import_Customers() throws Exception {
//        String columnData = "Alternative Customer Number,Salutation [DR/MISS/MR/MRS/MS/MSTR],*First Name,*Surname,*Billing Address,Billing Address2,Billing Suburb,Billing State,Billing Postal Code,Billing Country,Phone Number,*Mobile Number,Fax Number,Email,Company,Notes/Feedbacks,Legal Entity,ABN,ACN,*Is Home Address Same As Billing Address? [Yes/No],Home Address,Home Address2,Home Suburb,Home State,Home Postal Code,Home Country,Category [B-Business/R-Residential],Billing Email,Account Name,Authentication Type[AC/DL/PA/PN/PI/UB],Authentication  No.,Date of Birth,Referee Name,Referee Contact Number,Referee relationship to tenant,Enable Internet Access? [Yes/No],Password,Secondary Customer Name,Secondary Phone Number,Secondary Mobile Number,Secondary Fax Number,Secondary Email,Is life support? [Yes/No],guarantorFirstName,guarantorLastName,guarantorAddress1,guarantorAddress2,guarantorCity,guarantorState,guarantorZipCode,guarantorMobilePhone,guarantorHomePhone,guarantorEmail,guarantorAuthType,guarantorAuthNo,cycleNo\n";
//
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/Customer Import Template.csv";
//        String rowData = ",Mr,Sands,Surname,3090 Satellite Boulevard,,Duluth,GA,30096,United States,+1 800-001-0001,211 995 500 00 00 01,+1 800-001-0011,peter.andrews@alpha.mail.com,Basics Group of Companies,New customer,,96365484275,,Yes,,,,,,,B,pandrews@wideworld.com,Peter Andrews,AC,10012345,,Matt Andrews,+1 800-001-0100,Brother,No,pass123,Matt Andrews,+1 800-001-0011,211 995 500 00 00 11,,matt.andrews@worldmail.com,No,Mary,Palmer,Parker,Hills,White Pine Bay,Oregon,90414,3232332526,3233453423,rer@gmail.com,AC,78956,0";
//        RandomGenerator random = new RandomGenerator();
//
//        rowData= rowData.replace("Sands","First_"+random.requiredString(5));
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToCustomerImport();
//        importObj.importFile(filePath, "Customer");
//
//
//    }
//
//    @Test(priority = 6, enabled = true)
//    public void Import_Recurring_Charge() throws Exception {
//        String columnData = "Customer Number,Meter Number,Charge Description,Rollup Description,Model,Start Date,End Date,Is Ongoing (Yes/No),Is Prorata (Yes/No),Period Of Charge,No. of Periods,Amount per recurring,Unit Price,Tax Id";
//                String filePath = System.getProperty("user.dir") + "/src/main/resources/ManualRecurringChargeImportTemplate.csv";
//        String rowData = "10053,1000050,Access Fee,Account Charges,,20/03/2023,,Yes,No,,,0.15,,0";
//         rowData = rowData.replace("10053", customerId);
//        rowData = rowData.replace("1000050", meterNo);
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToRecurringCharge();
//        importObj.importFile(filePath, "Recurring Charge");
//    }
//
//    @Test(priority = 7, enabled = true)
//    public void Import_Generic_Service() throws Exception {
//        String columnData = "Customer No,Product/Charge Description,Prorata Date,End Date,Quantity,Notes,Rollup Description,Unit,Rate,Is Once Off?,Charge Type";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/genericServiceImportTemplate.csv";
//        String rowData = "10005,Car,27/11/2023,,1,This is just a test.,Elec Rollup Description,KW,1.5,No,Electricity Charges,,,";
//        rowData = rowData.replace("10005", customerId);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToRecurringCharge();
//        importObj.importFile(filePath, "Generic Service");
//    }
//
//    @Test(priority = 8, enabled = true)
//    public void Import_Payments() throws Exception {
//        String columnData = "Customer No,Alternative Customer No,Transaction Type,Payment Method,Card Type,Amount,Transaction Date,Comments,Auto Allocate,Batch No\n";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/paymentImportTemplate.csv";
//        String rowData = "12601,,P,CH,,150,06/02/2023,cheque payment,TRUE,23t45";
//        rowData = rowData.replace("12601", customerId);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToPaymentImport();
//        importObj.importFile(filePath, "Payments");
//    }
//
//    @Test(priority = 9, enabled = true)
//    public void Import_Demand_Reads() throws Exception {
//        String columnData = "*Meter Number,*Demand Type (1 to 5),*Date of Read,*Time of Read,*Flat Rate Read,*Peak Read,*Shoulder Read,* Off Peak Read";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/Demand Read Import Template.csv";
//        String rowData = "10004455005,1,09/03/2023,2:24 PM,1,0,0,0";
//        rowData = rowData.replace("10004455005", meterNo);
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToDemandReadsImport();
//        importObj.importFile(filePath, "Demand Reads");
//    }
//
//    @Test(priority = 11, enabled = true)
//    public void Import_Prorated_Tariff() throws Exception {
//        String columnData = "Plan No,Code,Date Start,Date End,Rate";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/ProratedTariffImportTemplate.csv";
//        String rowData = "11819,Adams Johhons,09/1/2015,09/1/2015,150.00";
//        //   rowData= rowData.replace("1200",customerId);
//        rowData = rowData.replace("09/1/2015", currentDate);
//
//        String[] row = rowData.split(",");
//        String[] column = columnData.split(",");
//
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToProratedImport();
//        importObj.importFile(filePath, "Prorated Tariff");
//    }
//
//    @Test(priority = 4, enabled = true)
//    public void Import_Security_Deposit() throws Exception {
//        String columnData = "Customer No,Alternative Customer No,Transaction Type,Payment Method,Amount,Transaction Date,Comments";
//        String filePath = System.getProperty("user.dir") + "/src/main/resources/SecurityDepositsImportTemplate.csv";
//        String rowData = "1200,,SD,DP,300,09/03/2023,your comment";
//        String rowStr = rowData.replace("1200", customerId);
//        String[] row = rowStr.split(",");
//        String[] column = columnData.split(",");
//        CSVHelper.createCSVGeneric(filePath, column, row);
//        AdminPage admin = new AdminPage();
//        Imports importObj = admin.navigateToSecurityDepositImport();
//        importObj.importFile(filePath, "SecurityDeposit");
//    }
//}
//>>>>>>> 5a83c86b87884e8006dfa33bd9d893872d96350b
