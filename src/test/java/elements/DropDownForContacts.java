package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownForContacts {
    private String dropDownLocator = "//lightning-combobox//label[text()='%s']/ancestor::lightning-combobox//input";
    private String optionLocator = "//lightning-base-combobox-item//span[text()='%s']";

    WebDriver driver;
    String label;

    public DropDownForContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }


}
