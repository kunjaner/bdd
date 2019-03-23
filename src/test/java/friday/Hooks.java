package friday;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import friday.drivers.DriverManager;

public class Hooks {
    DriverManager driverManager=new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.navigateTo("http://argos.co.uk");
        driverManager.maximizeBrowser();
        driverManager.applyImplWait();
        driverManager.handleCookies();

    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
