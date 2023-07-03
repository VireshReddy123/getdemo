package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.IndexPage;
import org.automation.pageObjects.LoginPage;
import org.automation.utilities.PropertiesUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 0, enabled = false, description = "To verify login functionality")
    public void ValidLogin() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.enterUsername(PropertiesUtil.getPropertyValue("userName"));
        login.enterPassword(PropertiesUtil.getPropertyValue("password"));
        login.clickLoginBtn();
        Assert.assertEquals(login.getPageUrl(), PropertiesUtil.getPropertyValue("indexPage"));

    }

    @Test(priority = -1,enabled = false, description = "To verify login functionality")
    public void reloadLoginPage() throws InterruptedException {
        IndexPage index = new IndexPage();
        index.refreshPage();
        Assert.assertEquals(index.getTextVersion().trim(), PropertiesUtil.getPropertyValue("buildVersion"));
    }
}
