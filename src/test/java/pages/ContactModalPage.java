package pages;

import elements.*;
import modals.Account;
import modals.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    private static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'slds-modal__header')]/h2");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public ContactDetailsPage create(Contact contact) {
        new InputForContacts(driver, "First Name").write(contact.getFirstName());
        new DropDownForContacts(driver, "Salutation").selectOption(contact.getSalutation());
        new InputForContacts(driver, "Last Name").write(contact.getLastName());
        new InputForContacts(driver, "Suffix").write(contact.getSuffix());
        new InputForContacts(driver, "Account Name").selectAccountName(contact.getAccountName());
        new InputForContacts(driver, "Title").write(contact.getTitle());
        new InputForContacts(driver, "Phone").write(contact.getPhone());
        new InputForContacts(driver, "Mobile").write(contact.getMobile());
        new InputForContacts(driver, "Email").write(contact.getEmail());
        new InputForContacts(driver, "Mailing City").write(contact.getMailingCity());
        new InputForContacts(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new InputForContacts(driver, "Mailing Country").write(contact.getMailingCountry());
        new InputForContacts(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new InputForContacts(driver, "Fax").write(contact.getFax());
        new InputForContacts(driver, "Department").write(contact.getDepartment());
        new TextAreaForContacts(driver, "Mailing Street").write(contact.getMailingStreet());


        return clickSave();
    }

    private ContactDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON_CONTACTS).click();
        return new ContactDetailsPage(driver);

    }
}

