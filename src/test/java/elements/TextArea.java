package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {
    private String textAreaLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/../..//textarea";

    WebDriver driver;
    String Label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        log.info("Writing text into textarea with by the specified name when creating an account");
        driver.findElement(By.xpath(String.format(textAreaLocator, this.Label))).sendKeys(text);
    }
}
