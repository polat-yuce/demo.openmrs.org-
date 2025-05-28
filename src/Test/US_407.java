package Test;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class US_407 extends BaseDriver {

    @Test(groups = {"Smoke", "PatientManagement"})
    public void Test() {
        POM pom = new POM();

        randomLocationLogin();
        pom.FindPatientRecord.click();
        pom.search.sendKeys("John Doe");
        pom.kisi.click();
        pom.deletePatient.click();
        pom.reason.sendKeys("Gizlilik");
        pom.confirm.click();

    }
}
