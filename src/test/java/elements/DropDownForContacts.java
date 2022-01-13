package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
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
        log.info("Selecting an option from the list by name when creating contact");
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }


}
