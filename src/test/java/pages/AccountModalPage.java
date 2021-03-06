package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import lombok.extern.log4j.Log4j2;
import modals.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountModalPage extends BasePage {
    private static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'inlineTitle')]");


    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the page AccountModalPage has opened");
        return isExist(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) {
        log.info("Creating account");
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new DropDown(driver, "Type").selectOption(account.getType());
        new Input (driver,"Phone").write(account.getPhone());
        new Input(driver,"Employees").write(account.getEmployees());
        new DropDown(driver,"Industry").selectOption(account.getIndustry());
        new Input(driver,"Parent Account").selectParentAccount(account.getParentAccount());
        new TextArea(driver,"Description").write(account.getDescription());
        new TextArea(driver,"Billing Street").write(account.getBillingStreet());
        new TextArea(driver,"Shipping Street").write(account.getShippingStreet());
        new Input(driver,"Billing City").write(account.getBillingCity());
        new Input(driver,"Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver,"Shipping City").write(account.getShippingCity());
        new Input(driver,"Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver,"Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver,"Billing Country").write(account.getBillingCountry());
        new Input(driver,"Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver,"Shipping Country").write(account.getShippingCountry());

        return clickSave();

    }

    private AccountDetailsPage clickSave() {
        log.info("Click button SAVE on the page AccountModalPage");
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}
