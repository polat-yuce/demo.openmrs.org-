package Test;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_402 extends BaseDriver {

    @Test(dataProvider = "UserData", groups = {"Smoke Test", "Login"})
    public void test2(String userName, String password) {
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

        pom.username.sendKeys(userName);
        pom.password.sendKeys(password);
        pom.loginButton.click();
        Assert.assertEquals(pom.Youmustchoosealocation.getText(), "You must choose a location!");

        pom.InpatientWard.click();
        pom.username.clear();
        pom.password.clear();
        pom.username.sendKeys(userName);
        pom.password.sendKeys(password);
        pom.loginButton.click();
        if (pom.errorMassage.getText().equals("Invalid username/password. Please try again.")){
            Assert.assertEquals(pom.errorMassage.getText(), "Invalid username/password. Please try again.");
        }else
            System.out.println("Giriş yapıldı");

    }

    @DataProvider
    Object[][] UserData() {
        Object[][] userPass = {
                {"Merve", "e2412sdfa"},
                {"Ali", "fdsafsadf2"},
                {"fdsasa", "sfsdfadafasf"},
                {"Mehsadfasdfmet", "fadsfdassafasf"},
                {"Mehmafsdsfet", "saafsdsffasf"},
                {"Mehmafsdsafet", "saafsdsfdfasf"},
                {"Admin", "Admin123"},
        };
        return userPass;
    }


}