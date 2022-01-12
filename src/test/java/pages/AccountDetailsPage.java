package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    private static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    private String fieldValue = "//div//p[text()='%s']/..//p[@class=\"fieldComponent slds-text-body--regular slds-show_inline-block slds-truncate\"]";

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
