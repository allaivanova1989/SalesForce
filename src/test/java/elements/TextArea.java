package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    private String textAreaLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/../..//textarea";

    WebDriver driver;
    String Label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into textarea with Label'%s'\n", text, this.Label);
        driver.findElement(By.xpath(String.format(textAreaLocator, this.Label))).sendKeys(text);
    }
}
