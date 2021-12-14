package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaForContacts {
    protected String textAreaLocator = "//lightning-textarea//label[text()='%s']/ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String Label;

    public TextAreaForContacts(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(textAreaLocator, this.Label))).sendKeys(text);
    }
}
