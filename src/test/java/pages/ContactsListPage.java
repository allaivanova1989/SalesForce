package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactsListPage extends BasePage {
    private static final By BREADFCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the page ContacttListPage has opened");
        return isExist(BREADFCRUMBS_LABEL);
    }

    public ContactsListPage open() {
        log.info("Open the page ContactListPage");
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }

    public ContactModalPage clickNew() {
        log.info("Click button new on the page ContactListPage");
        driver.findElement(BUTTON_NEW).click();
        return new ContactModalPage(driver);
    }
}

