package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class LoginTest extends BaseTest {

    @Test(description = "Login to the site")
    public void login() {
        log.debug("Login to the site");
        boolean isHomePageOpen = loginPage
                .open()
                .login("darina07122016-rhp4@force.com", "darina1206")
                .isPageOpen();

        Assert.assertTrue(isHomePageOpen, "Страница HomePage не открылась.");
    }

}
