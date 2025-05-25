package Test;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_403 extends BaseDriver {

    @Test(groups = {"Smoke Test", "Logout"})
    public void Test3() {
        POM pom = new POM();

        Login();
        pom.Logout.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://o2.openmrs.org/openmrs/login.htm");

    }
}
