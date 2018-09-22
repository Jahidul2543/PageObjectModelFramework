package testSignInPageObjects;

import datProviderUtilityWIthXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import productsPageObjects.ProductsPage;
import reporting.TestLogger;
import signInPageObjects.SignInPage;
import testHomePageObjects.HomePage;

import java.util.ArrayList;
import java.util.Iterator;

public class SinInUsingDataProviderPageTest extends SignInPage{
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    ProductsPage objOfProductsPage;


    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objOfProductsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){

        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();

        return testData.iterator();

    }
    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        objOfHomePage.clikSignIn();
        objOfSignInPage.switchToSignInForm();
        TestLogger.log("In Sign In Page");
        objOfSignInPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");

    }
}
