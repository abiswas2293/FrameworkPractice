package pagePckage;

import org.openqa.selenium.By;
import utilities.BaseClass;

public class Cookies extends BaseClass {
    By acceptButton= By.xpath("//button[@id='L2AGLb']");
    public void clickOnAcceptbutton(){
        driver.findElement(acceptButton).click();
    }
}
