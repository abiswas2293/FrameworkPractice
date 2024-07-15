package pagePckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchResultPage extends BaseClass {

    SearchPage s = new SearchPage();
    String validateSearchUrl = "https://www.google.com/search?q=";
    By allLinks = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']");


    public void clickOnLink() throws InterruptedException {

        List<WebElement> linkElements = driver.findElements(allLinks);
        int counter = 1;
        for (WebElement e : linkElements) {
            if (counter > 1)
                Thread.sleep(5000);

            if (driver.getCurrentUrl().contains("https://www.google.com/search?q=india")) {
                System.out.println(e.getText());
                e.click();
                driver.navigate().back();
            } else
                System.out.println("Anindita --> Not on https://www.google.com/search?q=india page");

            counter++;
        }
    }

    public void validateCurrentUrl() {
        String searchText = s.text.toLowerCase();

        Assert.assertTrue(driver.getCurrentUrl().startsWith(validateSearchUrl + searchText));


    }

    public void switchToWindow(int tabID) {
        Set<String> allTabs = driver.getWindowHandles(); // this is giving back all theunique IDs for each tab
        ArrayList<String> allTabIDs = new ArrayList<>(allTabs);
        driver.switchTo().window(allTabIDs.get(tabID));
    }


}
