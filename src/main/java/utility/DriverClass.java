package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
    PropertyFileReader propertyFileReader = new PropertyFileReader();
    public static WebDriver driver = new ChromeDriver();
    public void setup(){
        String BaseUrl = propertyFileReader.properties.getProperty("BaseUrl");
        driver.get(BaseUrl);
        driver.manage().window().maximize();
    }
    public void quit (){
        driver.quit();
    }
}
