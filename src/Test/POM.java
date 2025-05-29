package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM {

    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[text()='Gösteri']") //driver.findElement(By
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

    @FindBy(xpath = "//li[@class='nav-item logout']/a")
    public WebElement Logout;

    @FindBy(xpath = "//ul[@id='sessionLocation']/li")
    public List<WebElement> locations;

    @FindBy(xpath = "(//div[@id='apps']/a)[4]")
    public WebElement RegisteraPatient;

    @FindBy(css = "[name='givenName']")
    public WebElement Given;

    @FindBy(css = "[name='familyName']")
    public WebElement Family;

    @FindBy(id = "next-button")
    public WebElement nextButton;

    @FindBy(xpath = "//option[text()='Male']")
    public WebElement Male;

    @FindBy(id = "birthdateDay-field")
    public WebElement Day;

    @FindBy(css = "[id='birthdateMonth-field']")
    public WebElement Month;

    @FindBy(id = "birthdateYear-field")
    public WebElement Year;

    @FindBy(id = "address1")
    public WebElement Address;

    @FindBy(id = "cityVillage")
    public WebElement cityVillage;

    @FindBy(id = "stateProvince")
    public WebElement stateProvince;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "postalCode")
    public WebElement postalCode;

    @FindBy(css = "[name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    public WebElement relationship_type;

    @FindBy(xpath = "(//p[@class='left']/input)[15]")
    public WebElement PersonName;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(css = "[class='PersonName-givenName']")
    public WebElement personName;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement id;

    @FindBy(xpath = "(//li[@class='nav-item identifier']/i)[1]")
    public WebElement profil;

    @FindBy(xpath = "//ul[@id='user-account-menu']/li/a")
    public WebElement myAccount;

    @FindBy(xpath = "(//div[@class='task'])[1]")
    public WebElement changePassword;

    @FindBy(xpath = "(//div[@class='task'])[2]")
    public WebElement myLanguages;

    @FindBy(xpath = "(//div[@id='apps']/a)[1]")
    public WebElement FindPatientRecord;

    @FindBy(css = "[id='patient-search']")
    public WebElement search;

    @FindBy(xpath = "//tr[@class='odd']/td")
    public WebElement kisi;

    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement NoMatchingRecordsFound;

    @FindBy(xpath = "(//ul[@class='float-left']/li)[8]")
    public WebElement deletePatient;

    @FindBy(id = "delete-reason")
    public WebElement reason;

    @FindBy(xpath = "(//button[text()='Confirm'])[4]")
    public WebElement confirm;

    @FindBy(css = "[id='patient-search-results-table_info']")
    public WebElement satirSayisi;

    @FindBy(xpath = "(//div[@id='apps']/a)[9]")
    public WebElement dataManagement;

    @FindBy(css = "[id='coreapps-mergePatientsHomepageLink-app']")
    public WebElement marge;

    @FindBy(css = "[id='patient1-text']")
    public WebElement patient1;

    @FindBy(css = "[id='patient2-text']")
    public WebElement patient2;

    @FindBy(id = "confirm-button")
    public WebElement devamEt;

    @FindBy(css = "[id='first-patient']")
    public WebElement secilecekTaraf;

    @FindBy(xpath = "//input[@id='confirm-button']")
    public WebElement confirm2;
}
