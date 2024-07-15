package pagePckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class SearchPage extends BaseClass {
    By search= By.xpath("//textarea[@title='Search']");
    By Button=By.name("btnK");
String text="";
  public void typeText(String text){
      this.text=text;
     driver.findElement(search).sendKeys(text);
  }
  public void clickButton(){
      driver.findElement(Button).click();
  }
}
