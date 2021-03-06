package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public abstract class BasePage {
    public static final String BASE_URL = "https://shvedoff.lightning.force.com";
    public static final By BUTTON_NEW = By.xpath("//a[@href='javascript:void(0);']/div[@title='New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    public static final By SAVE_BUTTON_CONTACTS = By.xpath("//button[@name=\"SaveEdit\"]");

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract boolean isPageOpen();

    protected boolean isExist(By locator) {
        log.warn("Can get an exception NoSuchElementException");
        try {
            return driver.findElement(locator).isDisplayed();

        } catch (NoSuchElementException ex) {
            System.out.println("......" + ex.getMessage());
            return false;
        }
    }

}

