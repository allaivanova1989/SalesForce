package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Input {
    private String inputLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";

    WebDriver driver;
    String Label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        log.info("Write the text in the input field by the specified name when creating an account");
        driver.findElement(By.xpath(String.format(inputLocator, this.Label))).sendKeys(text);

    }

    public void selectParentAccount(String text) {
        log.info("Select Account  from the list of accounts  in the field Parent Account");
        driver.findElement(By.xpath(String.format(inputLocator, this.Label))).click();
        log.warn("If we create the first account we can get an exception NoSuchElementException");
        try {

            if (driver.findElement(By.xpath("//li[@class=\"lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption\"][1]")).isSelected()) {
                driver.findElement(By.xpath("//li[@class=\"lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption\"][1]")).click();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
