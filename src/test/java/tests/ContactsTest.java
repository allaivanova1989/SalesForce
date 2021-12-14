package tests;

import modals.Account;
import modals.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsTest extends BaseTest{
    @Test
    public void contactShouldBeCreated()  {
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
                "12/9/2021",
                "Description is here");
        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();

        Assert.assertTrue(isContactDetailsPageOpen, "Страница Details не открылась.");
    }
}
