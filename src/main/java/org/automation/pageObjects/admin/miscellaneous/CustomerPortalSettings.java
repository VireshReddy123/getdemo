package org.automation.pageObjects.admin.miscellaneous;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class CustomerPortalSettings extends BasePage {

	public By AdminIcon = By.xpath("//*[@id=\"navbar-menu\"]/div/ul/li[5]/a/i");
	public By customerPortal = By.xpath("(//*[@class='quick-button-small'])[24]");
	public By activateArchieved = By.xpath("(//*[@class='switch-label'])[1]");
	public By enableServiceEdit = By.xpath("(//*[@class='switch-label'])[2]");
	public By enableAccountSettingEdit = By.xpath("(//*[@class='switch-label'])[3]");
	public By enableServiceSettingEdit = By.xpath("(//*[@class='switch-label'])[4]");
	public By enableCustomerPortalSignUp = By.xpath("(//*[@class='switch-label'])[5]");
	public By saveSetting = By.id("save_portal_settings");

	public void clickAdmin() {
		clickBtn_custom(AdminIcon);
	}
	
	public void clickSaveSetting() {
		clickBtn_custom(saveSetting);
	}

	public void clickCustomerPortal() {
		scrollIntoView(customerPortal);
		clickBtn_custom(customerPortal);
	}
	
	public void activateArchievedToggle() {
		scrollIntoView(activateArchieved);
		selectCheckBox(activateArchieved);
	}

	
	public void enableServiceEditToggle() {
		selectCheckBox(enableServiceEdit);
	}

	
	public void enableAccountSettingDetailsEditToggle() {
		selectCheckBox(enableAccountSettingEdit);
	}

	
	public void enableServiceSettingEditToggle() {
		selectCheckBox(enableServiceSettingEdit);
	}

	
	public void enableCustomerPortalSignUpToggle() {
		selectCheckBox(enableCustomerPortalSignUp);
	}

}
