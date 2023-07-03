package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.automation.utilities.PropertiesUtil;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {
    public  By groupLogiin = By.id("submitrequest");
    public  By selectGroup = By.id("newGroup");
    By userNameField = By.xpath("//input[@name='j_username']");
    By PasswordField = By.xpath("//input[@name='predigpass']");
    public By login = By.xpath("//*[@name='submit']");
    public By UsernameField = By.xpath("//input[@name='j_username']");

    public By copyright = By.className("copyright-text");

    public String getBuildVersionText() {
        return getText_custom(copyright);
    }

    public void enterUsername(String userNameText) {
        sendKeys_custom(userNameField, userNameText);
    }

    public void enterPassword(String passNameText) {
        sendKeys_custom(PasswordField, passNameText);
    }

    public void clickLoginBtn() {
        clickBtn_custom(login);
    }

    public void login(String userName, String password) {
        enterUsername(userName);
        enterPassword(password);
        clickLoginBtn();
    }
    public IndexPage validLogin() {
        sendKeys_custom(UsernameField, PropertiesUtil.getPropertyValue("userName"));
        sendKeys_custom(PasswordField, PropertiesUtil.getPropertyValue("password"));
        clickBtn_custom(login);
        return new IndexPage();
    }
    public  IndexPage loginWithGroupName(String groupName) {
        validLogin();
        selectDropDownByVisibleText_custom(selectGroup,groupName);
        click_custom(groupLogiin);
        return new IndexPage();

    }
}
