package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test(description = "Login to the site")
    public void login() {
        boolean isHomePageOpen = loginPage
                .open()
                .login("baby20086-fgbt@force.com", "19891206Ai")
                .isPageOpen();

        Assert.assertTrue(isHomePageOpen, "Страница HomePage не открылась.");
    }

}
