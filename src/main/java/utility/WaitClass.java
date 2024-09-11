package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void explicitWaitVisible (By ele) {
      new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("EXPLICITWAIT"))))
              .until(ExpectedConditions.visibilityOfElementLocated(ele));
    }
    public void explicitWaitClickable (By ele) {
        new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("EXPLICITWAIT"))))
                .until(ExpectedConditions.elementToBeClickable(ele));
    }
    public void implicitWait () {
        new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(propertyFileReader.properties.getProperty("IMPLICITWAIT"))));
    }
}

