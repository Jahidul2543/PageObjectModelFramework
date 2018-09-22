package testGetHelPPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import getHelpPageObjects.GetHelpHerePage;
import testHomePageObjects.HomePage;
import productsPageObjects.ProductsPage;
import signInPageObjects.SignInPage;

public class TestGetHelpHerePage extends GetHelpHerePage {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    ProductsPage objOfProductsPage;
    GetHelpHerePage objGetHelpHerePage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objGetHelpHerePage = PageFactory.initElements(driver, GetHelpHerePage.class);
    }

    //T3ALI_TC_01 Verify User able to send message to Anna
    @Test(enabled = false)
    public void messageToAnna() {
        try {
            objOfHomePage.clikSignIn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objOfSignInPage.getHlepHere();
        switchWindow(driver);
        objGetHelpHerePage.sendTextToAnna();
    }
}
