package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test(description = "Login to the site")
    public void login() {
        boolean isHomePageOpen = loginPage
                .open()
                .login("darina07122016-rhp4@force.com", "darina1206")
                .isPageOpen();

        Assert.assertTrue(isHomePageOpen, "Страница HomePage не открылась.");
    }

}
