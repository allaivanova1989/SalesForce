package tests;

import lombok.extern.log4j.Log4j2;
import modals.Account;
import modals.AccountFactory;
import modals.Contact;
import modals.ContactFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class ContactsTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void contactShouldBeCreated() {
        log.debug("Creating new contact");
        loginPage
                .open()
                .login("darina07122016-rhp4@force.com", "darina1206");
        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isContactModalOpen, "Попап не открылся.");

        Contact contact = ContactFactory.get();
        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();

        Assert.assertTrue(isContactDetailsPageOpen, "Страница Details не открылась.");

        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Title"), contact.getTitle(), "Заголовок отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Email"), contact.getEmail(), "Email отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Phone"), contact.getPhone(), "Номер отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Mobile"), contact.getMobile(), "Мобильный телефон отображается не корректно.");


    }
}
