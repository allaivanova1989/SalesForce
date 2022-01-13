package tests;

import lombok.extern.log4j.Log4j2;
import modals.Account;
import modals.AccountFactory;
import org.testng.annotations.Test;
import org.testng.Assert;

@Log4j2
public class AccountTest extends BaseTest {


    @Test(description = "Creating new account")
    public void accountShouldBeCreated() {
        log.info("Creating new account");
        loginPage
                .open()
                .login("darina07122016-rhp4@force.com", "darina1206");


        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isAccountModalOpen, "Попап не открылся.");
        Account account = AccountFactory.get();

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();

        Assert.assertTrue(isDetailsPageOpen, "Страница Details не открылась.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "Номер отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Billing Address"), account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingStateProvince() + " " + account.getBillingZipPostalCode() + "\n" + account.getBillingCountry(), "Адрес отображается не корректно.");

    }

}
