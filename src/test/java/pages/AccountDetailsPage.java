package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountDetailsPage extends BasePage {
    private static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    private String fieldValue = "//div//p[text()='%s']/..//p[@class=\"fieldComponent slds-text-body--regular slds-show_inline-block slds-truncate\"]";

    public String getFieldValueByName(String fieldName) {
        log.info("Get the text by the name of the field from the page AccountDetailsPage");
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the page DETAILS has opened");
        return isExist(DETAILS_LINK);
    }

}
