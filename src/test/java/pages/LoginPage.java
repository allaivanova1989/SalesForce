package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {
    public static final By USER_NAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the page LoginPage has opened");
        return isExist(LOGGIN_BUTTON);
    }

    public LoginPage open() {
        log.info("Open LoginPage");
        driver.get(BASE_URL);
        return this;
    }

    public HomePage login(String userName, String password) {
        log.debug("Input username, password and click submit");
        driver.findElement(USER_NAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGGIN_BUTTON).click();
        return new HomePage(driver);

    }

}
