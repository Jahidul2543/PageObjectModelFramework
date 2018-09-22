package testProductsPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testHomePageObjects.HomePage;
import productsPageObjects.ProductsPage;

public class TestProductPage extends ProductsPage {
    HomePage objOfHomePage;
    ProductsPage objOfProductsPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfProductsPage = PageFactory.initElements(driver, ProductsPage.class);
    }
     //// T3ALI_PP_TC01 Select tols and filter search
    @Test(priority = 1, enabled =false)
    public void testCategories() throws InterruptedException {
        objOfHomePage.categories();
        //ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        objOfProductsPage.toolsSearch();
    }
}
