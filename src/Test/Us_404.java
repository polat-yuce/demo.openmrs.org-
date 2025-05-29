package Test;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_404 extends BaseDriver {

    @Test(groups = {"Regression"})
    public void Test4() {
        POM pom = new POM();

        driver.get("https://openmrs.org/");

        if (driver.getCurrentUrl().equals("https://openmrs.org/tr/")) {
            pom.demo.click();
        } else {
            pom.language.click();
            pom.Turkish.click();
            pom.demo.click();
        }

        js.executeScript("arguments[0].click();", pom.openmrs2);
        wait.until(ExpectedConditions.elementToBeClickable(pom.openmrs2demo));

        js.executeScript("arguments[0].click();", pom.openmrs2demo);

        int random = Tools.randomGenerator(pom.locations.size());
        WebElement randomLocation = driver.findElement(By.xpath("(//ul[@id='sessionLocation']/li)[" + random + "]"));
        randomLocation.click();

        pom.username.sendKeys("Admin");
        pom.password.sendKeys("Admin123");
        pom.loginButton.click();
        pom.RegisteraPatient.click();
        pom.Given.sendKeys("ali");
        pom.Family.sendKeys("fda");
        pom.nextButton.click();

        pom.Male.click();
        pom.nextButton.click();

        pom.Day.sendKeys("1");
        Select Month=new Select(pom.Month);
        Month.selectByVisibleText("March");
        pom.Year.sendKeys("199");
        pom.nextButton.click();

        pom.Address.sendKeys("msdlafkfdas");
        pom.cityVillage.sendKeys("afdsfdas");
        pom.stateProvince.sendKeys("dsfmfaf");
        pom.country.sendKeys("dfaafsf");
        pom.postalCode.sendKeys("13231");
        pom.nextButton.click();

        pom.phoneNumber.sendKeys("4321325125");
        pom.nextButton.click();

        Select relationship_type=new Select(pom.relationship_type);
        relationship_type.selectByIndex(4);
        pom.PersonName.sendKeys("safnsaf");
        pom.nextButton.click();

        pom.submit.click();

        Assert.assertEquals(pom.personName.getText(),"MEMATI");
        System.out.println("Patient ID = " + pom.id.getText());


    }
}
