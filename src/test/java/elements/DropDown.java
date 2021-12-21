package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    private String dropDownLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]/div[@class='uiMenu']";
    private String optionLocator = "//div[contains(@class,'visible')]//a[text()='%s']";

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Select option '%s' into dropDown with Label'%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }
}
