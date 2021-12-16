package tests;

import modals.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void contactShouldBeCreated() {
        loginPage
                .open()
                .login("baby20086-fgbt@force.com", "19891206Ai");
        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isContactModalOpen, "Попап не открылся.");

        Contact contact = new Contact("Alla",
                "Ivanova",
                "Ms.",
                "TestAccountName",
                "Title",
                "676898",
                "375298678377",
                "baby20086@rambler.ru",
                "Ivanova",
                "Oginskoho",
                "Hrodno",
                "Grodnenskaya",
                "220017",
                "RB",
                "Letnya",
                "Minsk",
                "Minskaya",
                "230001",
                "RB",
                "689896",
                "652325",
                "5215444",
                "56652",
                "Alex",
                "Banking",
                "Advertisement",
                "12/31/2021",
                "Description is here");
        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();

        Assert.assertTrue(isContactDetailsPageOpen, "Страница Details не открылась.");

        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Name"), contact.getSalutation() + " " + contact.getFirstName() + " " + contact.getLastName(), "Имя отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Title"), contact.getTitle(), "Заголовок отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Phone"), contact.getPhone(), "Номер отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Mobile"), contact.getMobile(), "Мобильный телефон отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Email"), contact.getEmail(), "Email отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Mailing Address"), contact.getMailingStreet() + "\n" + contact.getMailingCity() + ", " + contact.getMailingStateProvince() + " " + contact.getMailingZipPostalCode() + "\n" + contact.getMailingCountry(), "Mailing Address отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Other Address"), contact.getOtherStreet() + "\n" + contact.getOtherCity() + ", " + contact.getOtherStateProvince() + " " + contact.getOtherZipPostalCode() + "\n" + contact.getOtherCountry(), "Other Address отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Fax"), contact.getFax(), "Факс отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Home Phone"), contact.getHomePhone(), "Домашний телефон отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Other Phone"), contact.getOtherPhone(), "Другой телефон отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Department"), contact.getDepartment(), "Депортамент отображается не корректно.");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Lead Source"), contact.getLeadSource(), "Lead sorce отображается не верно");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Asst. Phone"), contact.getAsstPhone(), "Телефон Ассистента отображается не верно");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Assistant"), contact.getAssistant(), "Имя Ассистента отображается не верно");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Birthdate"), contact.getBirthdate(), "Дата рождения отображается не верно");
        Assert.assertEquals(contactDetailsPage.getFieldValueByNameContacts("Description"), contact.getDescription(), "Description отображается не верно");

    }
}
