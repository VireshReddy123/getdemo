package org.automation.elements;

import org.automation.logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public final class CheckBox extends Element {

    /**
     * This Constructor is used to create an object to access a <b>CheckBox</b>.
     *
     * @param description description of the check box
     * @param locator     locator of the check box
     */
    public CheckBox(String description, By locator) {
        super(description, locator);
    }

    /**
     * Check the check box.
     */
    public void check() {
        WebElement element = wait.until(elementToBeClickable(locator));
        if (element.isSelected()) {
            Log.info("Checkbox [" + description + "] is already checked");
        } else {
            Log.info("Check [" + description + "] checkbox");
            element.click();
        }
    }

    /**
     * Un-check the check box.
     */
    public void uncheck() {
        WebElement element = wait.until(elementToBeClickable(locator));
        if (element.isSelected()) {
            Log.info("Uncheck [" + description + "] checkbox");
            element.click();
        } else {
            Log.info("Checkbox [" + description + "] is already unchecked");
        }
    }

    /**
     * Is the check box checked.
     *
     * @return true if checked, false if un-checked
     */
    public boolean isChecked() {

        boolean value = wait.until(visibilityOfElementLocated(locator)).isSelected();
        Log.info("Is [" + description + "] checkbox checked : " + value);
        return value;
    }

}
