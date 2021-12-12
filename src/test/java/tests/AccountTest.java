package tests;

import modals.Account;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AccountTest extends BaseTest {

    @Test
    public void accountShouldBeCreated() {
        loginPage
                .open()
                .login("baby20086-fgbt@force.com", "19891206Ai");


        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isAccountModalOpen, "Попап не открылся.");

        Account account = new Account("TestAccountName", "www.onliner.by", "Investor");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();

        Assert.assertTrue(isDetailsPageOpen, "Страница Details не открылась.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "");
    }


}
