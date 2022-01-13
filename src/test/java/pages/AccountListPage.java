package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountListPage extends BasePage {
    private static final By BREADFCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the page AccountListPage has opened");
        return isExist(BREADFCRUMBS_LABEL);
    }

    public AccountListPage open() {
        log.info("Open the page AccountListPage");
        driver.get(BASE_URL + "/lightning/o/Account/list");
        return this;
    }

    public AccountModalPage clickNew() {
        log.info("Click button new on the page AccountListPage");
        driver.findElement(BUTTON_NEW).click();
        return new AccountModalPage(driver);
    }

}

