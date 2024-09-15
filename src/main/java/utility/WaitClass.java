package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitClass {
    public static WebDriver driver;
    public WaitClass (WebDriver driver) {
        this.driver = driver;
    }
    PropertyFileReader propertyFileReader = new PropertyFileReader();
    public void threadSleep () {
        try {
            TimeUnit.SECONDS.sleep(Integer.parseInt(propertyFileReader.properties.getProperty("SLEEP")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public WebElement explicitWaitVisible (WebElement element) {
      new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("EXPLICITWAIT"))))
              .until(ExpectedConditions.visibilityOf(element));
      return element;
    }
    public WebElement explicitWaitClickable (WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("EXPLICITWAIT"))))
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
    public WebElement implicitWait (WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("IMPLICITWAIT"))));
        return element;
    }
}

