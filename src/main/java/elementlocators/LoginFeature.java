package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.DriverClass;

public class LoginFeature extends DriverClass {
    public LoginFeature (WebDriver driver) {
        this.driver = driver ;
    }
    public By email () {
       return By.xpath("//input[@id='_txtEmail']");
    }
    public By password () {
        return By.xpath("//input[@id='_txtPassword']");
    }
}
