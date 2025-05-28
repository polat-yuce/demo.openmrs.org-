package Utlity;

import Test.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;


    @BeforeClass
    public void BaslangicIslemleri() {
        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;


    }

    @AfterClass
    public void KapanisIslemleri() {
        Tools.Bekle(3);
        driver.quit();
    }

    public void Login() {

        POM pom = new POM();

        driver.navigate().to("https://openmrs.org/");

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

        pom.InpatientWard.click();
        pom.username.clear();
        pom.password.clear();
        pom.username.sendKeys("Admin");
        pom.password.sendKeys("Admin123");
        pom.loginButton.click();
    }

    public void randomLocationLogin() {
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
    }
}
