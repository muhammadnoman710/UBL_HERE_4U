import io.qameta.allure.*;
import org.testng.annotations.Test;
//import org.junit.Test;
import pages.ComplaintsPage;
import pages.LoginPage;
import utility.DriverClass;
import utility.PropertyFileReader;
import static utility.DriverClass.driver;

public class TestngRunner {
    PropertyFileReader propertyFileReader = new PropertyFileReader();
    DriverClass driverClass = new DriverClass();
    LoginPage loginPage = new LoginPage(driver);
    ComplaintsPage complaintsPage = new ComplaintsPage(driver);

    @Test (priority = 1)
    @Epic("AppLaunch")
    public void startingApplication () {
        driverClass.setup();
    }
    @Test (priority = 2)
    @Epic ("User Management")
    @Feature("Login")
    public void loginIntoApplication () {
        loginPage.enterCredentials(propertyFileReader.properties.getProperty("EMAIL"),
                propertyFileReader.properties.getProperty("PASSWORD"));
        loginPage.clickLoginButton();
    }
    @Test (priority = 3)
    @Epic ("User Management")
    @Feature("Filter")
    public void filterComplaints () {
        complaintsPage.clickFilterButton();
        complaintsPage.enterFilterFields();
        complaintsPage.enterBranchCode(propertyFileReader.properties.getProperty("BRANCHCODE"));
        complaintsPage.clickSearchButton();
    }
}
