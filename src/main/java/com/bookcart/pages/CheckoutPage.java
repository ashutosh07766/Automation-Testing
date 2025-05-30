package com.bookcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickCheckout() {
        By checkout = By.xpath("(//span[@class='mdc-button__label'])[6]");

      
        WebElement checkoutBtn = wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkoutBtn.click();

      
    }

    public boolean isCheckoutPageDisplayed() {
        return driver.getTitle().contains("Checkout");
    }
}
