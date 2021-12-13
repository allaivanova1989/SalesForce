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

        Account account = new Account("TestAccountName",
                "www.onliner.by",
                "Investor",
                "375298678377",
                "676898",
                "25",
                "Banking",
                "$6,000",
                "TestAccountName",
                "Description is here.",
                "Clenovaya Street",
                "Clenovaya Street",
                "Grodno",
                "Grodnenskaya",
                "Grodno",
                "Grodnenskaya",
                "231762",
                "Belarus",
                "231762",
                "Belarus");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();

        Assert.assertTrue(isDetailsPageOpen, "Страница Details не открылась.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "Имя отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "Тип отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "Номер отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Fax"), account.getFax(), "Факс отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Employees"), account.getEmployees(), "Количество работников отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), "Сфера деятельности отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Annual Revenue"), account.getAnnualRevenue(), "Годовой доход отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(), "Описание отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Billing Address"), account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingStateProvince() + " " + account.getBillingZipPostalCode() + "\n" + account.getBillingCountry(), "Адрес отображается не корректно.");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Shipping Address"), account.getShippingStreet() + "\n" + account.getShippingCity() + ", " + account.getShippingStateProvince() + " " + account.getShippingZipPostalCode() + "\n" + account.getShippingCountry(), "Почтовый адрес отображается не корректно.");


    }

}
