package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage {
    private static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    private String fieldValue = "//flexipage-tab2//force-record-layout-item//span[text()='%s']/ancestor::force-record-layout-item//slot[@slot=\"outputField\"]//*";

    public String getFieldValueByNameContacts(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }
}
