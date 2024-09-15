package pages;

import elementlocators.LoginFeature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.DriverClass;

public class LoginPage extends DriverClass {
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    LoginFeature loginFeature = new LoginFeature(driver);
    public void enterCredentials(String email, String Password) {
       driver.findElement(loginFeature.email()).sendKeys(email);
       driver.findElement(loginFeature.password()).sendKeys(Password);
    }
    public void clickLoginButton () {
        driver.findElement(loginFeature.loginButton()).click();
    }
}
