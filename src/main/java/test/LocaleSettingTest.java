package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.groupManager.LocaleSetting;
import org.testng.annotations.Test;

public class LocaleSettingTest extends BaseTest {

	@Test(enabled = true)
	public void localeSetting() throws InterruptedException {
		LocaleSetting localePage = new LocaleSetting();

		localePage.clickAdmin();
		localePage.clickLocalesetting();
		localePage.selectCurrencySymbol("Dollar");
		localePage.selectDecimalPoints("3");
		localePage.selectThousandsSeparator("Comma(,)");
		localePage.enterDecimalSymbol("0");
		localePage.clickDateFormat();
		localePage.clickTimeFormat();
		localePage.clickSaveChanges();
		localePage.assertSuccessMessage();

	}
}
