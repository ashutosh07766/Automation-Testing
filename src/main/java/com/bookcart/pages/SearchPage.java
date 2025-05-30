package com.bookcart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchForProduct(String productName) {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//input[contains(@class, 'searchbox')]")));
        search.clear();
        search.sendKeys(productName);

  
        Actions actions = new Actions(driver);
        actions.moveToElement(search)
               .sendKeys(Keys.ARROW_DOWN)
               .sendKeys(Keys.ENTER)
               .build()
               .perform();
    }
}
