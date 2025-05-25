package Test;

import org.openqa.selenium.support.PageFactory;

public class POM {

    public _05_PlaceOrder_Elementleri() {
        PageFactory.initElements(BaseDriver.driver, this);
        //Buradaki elementleri Driver ili bağla
    }
}
