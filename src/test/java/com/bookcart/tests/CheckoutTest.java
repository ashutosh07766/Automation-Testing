package com.bookcart.tests;

import com.bookcart.base.HomePage;
import com.bookcart.pages.CheckoutPage;
import com.bookcart.pages.ProductPage;
import com.bookcart.pages.SearchPage;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckoutTest extends HomePage {

    @Test
    public void searchProduct() {
        SearchPage search = new SearchPage(driver);
        search.searchForProduct("Harry");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCartAndGoToCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ProductPage product = new ProductPage(driver);

        Thread.sleep(2000);
        product.addToCart();
        
        Thread.sleep(2000);
        product.goToCart();

        Assert.assertTrue(driver.getTitle().contains("shopping-cart"), "Cart Page title check");
    }

    @Test(dependsOnMethods = "addToCartAndGoToCart")
    public void proceedToCheckout() throws InterruptedException {
        CheckoutPage checkout = new CheckoutPage(driver);
        Thread.sleep(2000);
        checkout.clickCheckout();

    }
}
