package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.automation.base.BaseTest;
import org.automation.utilities.Assertions;
import org.automation.utilities.PropertiesUtil;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static com.relevantcodes.extentreports.LogStatus.FAIL;
import static com.relevantcodes.extentreports.LogStatus.PASS;

public class BuildTest extends BaseTest {

	By copyright = By.xpath("/html/body/div[3]/p/span[1]");

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		String browser = PropertiesUtil.getPropertyValue("browser");

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			break;
		default:
			throw new IllegalStateException("Unexpected value: " + browser);
		}
		getDriver().manage().window().maximize();

	}

	@Test(priority = 1, enabled = true, description = "Verify markettest.utilibill.com URL")
	public void validate_MarketTest() {
		By copyright = By.className("copyright-text");
		String versiontext = "https://markettest.utilibill.com.au/marketbilling/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL1", "buildversion.properties"));

	}

	@Test(priority = 2, enabled = false, description = "Verify utbr8.utilibill.com URL")
	public void validate_Utbr8Test() {

		String versiontext = "https://utbr8.utilibill.com.au/billing/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL2", "buildversion.properties"));

	}

	@Test(priority = 3, enabled = false, description = "Verfiy nuruat.utilibill.com URL")
	public void validateNuruatTest() {

		String versiontext = "https://nuruat.utilibill.com.au/nur/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL3", "buildversion.properties"));

	}

	@Test(priority = 4, enabled = false, description = "Verfiy utbr8uat.utilibill.com URL")
	public void validateUtbr8uatTest() {

		String versiontext = "https://utbr8uat.utilibill.com.au/billing";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL4", "buildversion.properties"));

	}

	@Test(priority = 5, enabled = false, description = "Verfiy test.utilitybilling.com URL")
	public void validatetestTest() {

		String versiontext = "https://test.utilitybilling.com/billing/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL5", "buildversion.properties"));

	}

	@Test(priority = 6, enabled = false, description = "Verfiy go.utilitybilling.com URL")
	public void validateGoTest() {

		String versiontext = "https://go.utilitybilling.com/billing/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL6", "buildversion.properties"));

	}

	@Test(priority = 7, enabled = false, description = "Verfiy test.utilitybilling.com URL")
	public void validateUtilityMarketTest() {
		String versiontext = "https://test.utilitybilling.com/marketbilling/";
		try {
			getDriver().get(versiontext);
			WebdriverWaits.waitForElementVisible(copyright, 5);
			versiontext = getDriver().findElement(copyright).getText();
		} catch (Exception e) {
			extentTest.log(FAIL, "Element not found Version Text " + versiontext);

		}
		Assertions sassert = new Assertions();
		sassert.assertEquals(versiontext, PropertiesUtil.getPropertyValue("URL7", "buildversion.properties"));

	}

	@Test(priority = 8, enabled = false, description = "verify Customer Tabs")
	public void verifyBuild() {

		By copyright = By.xpath("/html/body/div[3]/p/span[1]");
		String[] arr = { "https://markettest.utilibill.com.au/marketbilling/",
				"https://test.electricitybilling.com/billingtest/", "https://prod.electricitybilling.com/billing",
				"https://test.waterworkslms.com/waterworks", "https://prod.waterworkslms.com/waterworks",
				"https://testing.utilibill.com.au/billingtest", "https://tvs.utilibill.com.au/truevaluesolaruat",
				"https://tvs.utilibill.com.au/truevaluesolar", "https://winenergy.utilibill.com.au/winenergyuat",
				"https://winenergy.utilibill.com.au/winenergy", "https://edp.waterworkslms.com/edp",
				"https://utbr8git.utilibill.com.au/billing/", "https://markettestv8.utilibill.com.au/marketbilling/",
				"https://stanwelluat.utilibill.com.au/stanwell/", "https://stanwell5msuat.utilibill.com.au/stanwell/",
				"https://powerclubuat.utilibill.com.au/powerclub/",
				"https://futurexenergyuat.utilibill.com.au/futurexenergy", "https://utbrxuat.utilibill.com.au/utbrx/",
				"https://go2.utilitybilling.com/billing/", "https://test2.utilitybilling.com/billing/",
				"https://electricityinaboxuat.utilibill.com.au/electricityinabox/" };

		SoftAssert softAssert = new SoftAssert();

		for (int i = 0; i < arr.length; i++) {
			String versiontext = "";
			try {
				getDriver().get(arr[i]);
				versiontext = getDriver().findElement(copyright).getText();
				extentTest.log(PASS, "==> Version Text " + versiontext);

			} catch (Exception e) {
				extentTest.log(FAIL, "Exception getting Version Text " + versiontext);

			}
			softAssert.assertNotNull(versiontext);

		}
		softAssert.assertAll();

	}
}
