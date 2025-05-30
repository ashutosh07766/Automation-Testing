package com.bookcart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        WebElement add = driver.findElement(By.xpath("(//button[@class=\"mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base\"])[1]"));
        add.click();
    }

    public void goToCart() {
        WebElement cart = driver.findElement(By.xpath("//mat-icon[@class=\"mat-icon notranslate mat-badge mat-badge-warn material-icons mat-ligature-font mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-medium\"]"));
        cart.click();
    }
}
