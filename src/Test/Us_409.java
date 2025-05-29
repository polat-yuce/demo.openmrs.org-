package Test;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class Us_409 extends BaseDriver {

    @Test
    public void Test(){
        POM pom=new POM();

        randomLocationLogin();
        pom.dataManagement.click();
        pom.marge.click();
        pom.patient1.sendKeys("100JNX");
        pom.patient2.sendKeys("100JRT");
        pom.devamEt.click();
        pom.secilecekTaraf.click();
        pom.confirm2.click();

    }
}
// 100HRU
// 100HVL