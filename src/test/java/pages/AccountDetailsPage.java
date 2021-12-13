package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String fieldValue = "//flexipage-tab2//force-record-layout-item//span[text()='%s']/ancestor::force-record-layout-item//slot[@slot=\"outputField\"]//*";

    public String getFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }


}
