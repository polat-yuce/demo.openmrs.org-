package Test;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_406 extends BaseDriver {

    @Test(groups = {"PatientManagement"})
    public void Test(){
        POM pom = new POM();

        randomLocationLogin();
        pom.FindPatientRecord.click();
        pom.search.sendKeys("John Doe");
        pom.kisi.click();
        driver.navigate().back();
        pom.search.sendKeys("faskdsa");
        Assert.assertEquals(pom.NoMatchingRecordsFound.getText(),"No matching records found");

    }
}
