package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsListPage extends BasePage {
    private static final By BREADFCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADFCRUMBS_LABEL);
    }
    public ContactsListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }
    public ContactModalPage clickNew() {
        driver.findElement(BUTTON_NEW).click();
        return new ContactModalPage(driver);
    }
}

