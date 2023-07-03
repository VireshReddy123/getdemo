package org.automation.pageObjects;

import org.automation.base.BasePage;
import org.openqa.selenium.By;

public class SearchResult extends BasePage
{
    By firstServiceId = By.xpath("(//tr/td[2])[1]");


    public By header = By.xpath("//div/h2");
    public By header2 = By.xpath("(//div/h2)[2]");

    public String getHeaderText(){
        return  getText_custom(header);

    }
    public String getHeader2Text() {
        return getText_custom(header2);
    }
        public String getFirstServiceId() {


        return getText_custom(firstServiceId);
    }


}
