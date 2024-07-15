package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagePckage.SearchPage;
import pagePckage.SearchResultPage;
import utilities.BaseClass;

public class SearchResultPageTest {
    SearchPage s=new SearchPage();
    SearchResultPage sr=new SearchResultPage();
    BaseClass b=new BaseClass();
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        b.openBrowser();
        Thread.sleep(5000);
    }
    @Test
    public void clickOnLink() throws InterruptedException {
        s.typeText("India");
        s.clickButton();
        sr.clickOnLink();
    }
}
