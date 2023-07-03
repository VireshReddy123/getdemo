package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.miscellaneous.WorkFlowTypes;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Date;

public class WorkFlowTypesTest extends BaseTest {

    public Select select;
    public Date date = new Date();

    @Test(priority = 1 ,enabled = true,description = "To Edit User ")
    public void workFlowTypes() {
        WorkFlowTypes workFlow = new WorkFlowTypes();
        workFlow.clickAdmin();
        workFlow.clickWorkFlowTypes();
        workFlow.clickCreateNewlog();
        String clname = date.toString();
        clname = clname.replace(":", "");
        clname = clname.replace(" ", "");
        workFlow.enterTypename("AA TN" + clname);
        workFlow.enterDisplayName("AA DN" + clname);
        workFlow.clickSaveButton();
        workFlow.clickSaveButton();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        workFlow.enterSearchLog("AA TN" + clname);
    }
}
