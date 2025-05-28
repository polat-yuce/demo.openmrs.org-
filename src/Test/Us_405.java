package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Us_405 extends BaseDriver {

    @Test(groups = {"Smoke"})
    public void Test() {
        POM pom = new POM();
        randomLocationLogin();

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(pom.profil).click(pom.myAccount).build();
        aksiyon.perform();

        System.out.println(pom.changePassword.getText());
        System.out.println(pom.myLanguages.getText());
        Assert.assertEquals(pom.changePassword.getText(), "Change Password");
        Assert.assertEquals(pom.myLanguages.getText(), "My Languages");
        pom.changePassword.click();
        driver.navigate().back();
        pom.myLanguages.click();

    }
}
