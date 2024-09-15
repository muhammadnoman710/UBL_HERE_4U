package elementlocators;

import org.openqa.selenium.By;
import utility.DriverClass;

public class ComplaintsFeature extends DriverClass {
    public ComplaintsFeature () {
        this.driver = driver;
    }
    public By filterButton () {
        return By.xpath("//button[@id='_flterModalBtn']");
    }
    public By searchBy() {
        return By.xpath("//select[@id='_searchBy']");
    }
    public By branchCode() {
        return By.xpath("//input[@id='_branchCode']");
    }
    public By category() {
        return By.xpath("//select[@id='_categoryId']");
    }
    public By vendor() {
        return By.xpath("//select[@id='_vendorId']");
    }
    public By status() {
        return By.xpath("//select[@id='_statusId']");
    }
    public By region() {
        return By.xpath("//select[@id='_regionId']");
    }
    public By assignedTo() {
        return By.xpath("//select[@id='_assignedTo']");
    }
    public By searchButton () {
        return By.xpath("//button[@id='_filterBtn']");
    }
}
