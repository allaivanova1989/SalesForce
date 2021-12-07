package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login () {
        driver.get(BASE_URL);
        driver.findElement(By.id("username")).sendKeys("baby20086-fgbt@force.com");
        driver.findElement(By.id("password")).sendKeys("19891206Ai");
        driver.findElement(By.id("Login")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"slds-truncate\" and text()=\"Home\"]")).isDisplayed());
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
