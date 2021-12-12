package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{
    public static final By BREADFCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']");
    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
       return isExist(BREADFCRUMBS_LABEL);
    }
    public AccountListPage open (){
        driver.get(BASE_URL+"/lightning/o/Account/list");
        return this;
    }
    public AccountModalPage clickNew(){
        driver.findElement(BUTTON_NEW).click();
        return new AccountModalPage(driver);
    }

}

