package org.automation.helpers;

import org.automation.base.BasePage;
import org.automation.pageObjects.customers.Overview;

public class Navigation extends BasePage {

    public void navigatetoLoginPage() {
        //	LoginPage loginPage = new LoginPage();
        //	loginPage.


    }

    public Overview navigateToOverviewPage() {
        //   clickBtn_custom(OverviewTab);
        return new Overview();
    }


}
