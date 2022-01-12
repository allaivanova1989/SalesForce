package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputForContacts {
    private String inputLocator = "//label[text()='%s']/ancestor::lightning-input/div/input";
    private String locatorForAccountName = "//label[text()=\"Account Name\"]/ancestor::lightning-grouped-combobox//input";

    WebDriver driver;
    String Label;

    public InputForContacts(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, this.Label))).sendKeys(text);
    }

    public void selectAccountName(String text) {

        driver.findElement(By.xpath(String.format(locatorForAccountName, this.Label))).click();
        driver.findElement(By.xpath("//span[@class=\"slds-listbox__option-text slds-listbox__option-text_entity\"]//span[1]")).click();

    }
}
