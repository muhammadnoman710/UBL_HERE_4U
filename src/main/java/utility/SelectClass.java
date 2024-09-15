package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SelectClass {
    public WebElement selectByValue (WebElement element, String value) {
            Select select = new Select(element);
            select.selectByValue(value);
        return element;
    }
}
