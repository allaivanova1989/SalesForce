package tests;

import lombok.extern.log4j.Log4j2;
import pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

@Log4j2
public abstract class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;
    ContactsListPage contactListPage;
    ContactModalPage contactModalPage;
    ContactDetailsPage contactDetailsPage;

    @BeforeMethod
    public void setup() {
        log.debug("Setup settings");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactListPage = new ContactsListPage(driver);
        contactModalPage = new ContactModalPage(driver);
        contactDetailsPage = new ContactDetailsPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Browser close");
        driver.quit();
    }


}


