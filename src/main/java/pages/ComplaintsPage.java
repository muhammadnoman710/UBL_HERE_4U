package pages;

import elementlocators.ComplaintsFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.DriverClass;
import utility.SelectClass;
import utility.WaitClass;

public class ComplaintsPage extends DriverClass {
    public ComplaintsPage (WebDriver driver) {
        this.driver = driver;
    }
    ComplaintsFeature complaintsFeature = new ComplaintsFeature();
    SelectClass selectClass = new SelectClass();
    WaitClass waitClass = new WaitClass(driver);
    public void clickFilterButton () {
        driver.findElement(complaintsFeature.filterButton()).click();
    }
    public void enterFilterFields () {

       WebElement searchBy =  driver.findElement(complaintsFeature.searchBy());
       waitClass.explicitWaitClickable(searchBy);
       waitClass.explicitWaitClickable(selectClass.selectByValue(searchBy, "1"));

       WebElement category = (driver.findElement(complaintsFeature.category()));
       waitClass.explicitWaitClickable(category);
       waitClass.explicitWaitClickable(selectClass.selectByValue(category, "3"));

       WebElement vendor =  (driver.findElement(complaintsFeature.vendor()));
       waitClass.explicitWaitClickable(vendor);
       waitClass.explicitWaitClickable(selectClass.selectByValue(vendor,"38"));

       WebElement status =  (driver.findElement(complaintsFeature.status()));
       waitClass.explicitWaitClickable(status);
       waitClass.explicitWaitClickable(selectClass.selectByValue(status,"1"));

       WebElement region =  (driver.findElement(complaintsFeature.region()));
       waitClass.explicitWaitClickable(region);
       waitClass.explicitWaitClickable(selectClass.selectByValue(region, "1"));

       WebElement assignedTo =  (driver.findElement(complaintsFeature.assignedTo()));
       waitClass.explicitWaitClickable(assignedTo);
       waitClass.explicitWaitClickable(selectClass.selectByValue(assignedTo, "2079"));
    }
    public void enterBranchCode (String branchcode) {
        driver.findElement(complaintsFeature.branchCode()).sendKeys(branchcode);
    }
    public void clickSearchButton () {
        driver.findElement(complaintsFeature.searchButton()).click();
    }
}
