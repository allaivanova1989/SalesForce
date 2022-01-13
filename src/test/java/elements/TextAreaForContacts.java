package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextAreaForContacts {
    private String textAreaLocator = "//lightning-textarea//label[text()='%s']/ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String Label;

    public TextAreaForContacts(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        log.info("Writing text into textarea with by the specified name when creating contact");
        driver.findElement(By.xpath(String.format(textAreaLocator, this.Label))).sendKeys(text);
    }
}
