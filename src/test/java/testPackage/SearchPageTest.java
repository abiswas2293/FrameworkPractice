package testPackage;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagePckage.Cookies;
import pagePckage.SearchPage;
import pagePckage.SearchResultPage;
import utilities.BaseClass;


public class SearchPageTest {
    SearchPage s = new SearchPage();
    SearchResultPage sr=new SearchResultPage();
    Cookies c=new Cookies();


    BaseClass b=new BaseClass();
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        b.openBrowser();
        Thread.sleep(5000);
       // c.clickOnAcceptbutton();

    }

    @AfterTest
    public void closeBrowser(){
        //b.closeBrowser();
    }

    @Test
    public void text(){
        s.typeText("India");
        s.clickButton();
        sr.validateCurrentUrl();
    }


}
