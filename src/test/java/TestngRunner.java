import org.junit.Test;
import utility.DriverClass;
import utility.PropertyFileReader;

public class TestngRunner extends DriverClass {

    PropertyFileReader propertyFileReader = new PropertyFileReader();
    DriverClass driverClass = new DriverClass();
   @Test
    public void startingApplication () {
        driverClass.setup();
    }
}
