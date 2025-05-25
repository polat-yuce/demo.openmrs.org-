package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath="//a[text()='Gösteri']") //driver.findElement(By
    public WebElement demo;

    @FindBy(xpath = "(//span[@class='elementor-button-content-wrapper'])[2] ")
    public WebElement openmrs2;

    @FindBy(xpath = "//span[text()='Girin OpenMRS 2 Demosu']")
    public WebElement openmrs2demo;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='You must choose a location!']")
    public WebElement Youmustchoosealocation;

    @FindBy(id = "Inpatient Ward")
    public WebElement InpatientWard;

    @FindBy(id = "error-message")
    public WebElement errorMassage;

    @FindBy(xpath = "//a[text()='Demo']")
    public WebElement gercekDemo;

    @FindBy(css = "[class='gt_float_switcher-arrow']")
    public WebElement language;

    @FindBy(xpath = "//a[text()=' Turkish']")
    public WebElement Turkish;
}
