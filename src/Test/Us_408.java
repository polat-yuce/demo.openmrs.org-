package Test;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_408 extends BaseDriver {

    @Test(groups = {"Regression", "PatientManagement"})
    public void Test() {
        POM pom = new POM();

        randomLocationLogin();
        pom.FindPatientRecord.click();
        Assert.assertTrue(pom.satirSayisi.getText().contains("1 entries"));
    }
}
