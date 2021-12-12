package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    String inputLocator ="//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    WebDriver driver;
    String Label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        Label = label;
    }
    public void write (String text){
        System.out.printf("Writing text '%s' into input with Label'%s'\n", text, this.Label);
        driver.findElement(By.xpath(String.format(inputLocator,this.Label))).sendKeys(text);


    }
}
