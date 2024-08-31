package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    public ProductPage() {
        this.driver = DriverSingleton.getDriver(Constants.CHROME);
        PageFactory.initElements(driver, this);
    }

    // Elemen
    private By addToCartButton = By.xpath("//button[contains(@class, 'add-to-cart')]");
    private By cartButton = By.className("shopping_cart_link");

    // Aksi
    public void addToCart(int itemIndex) {
        WebElement item = driver.findElement(By.xpath("(//button[contains(@class, 'add-to-cart')])[" + itemIndex + "]"));
        item.click();
    }

    public void goToCart() {
        driver.findElement(cartButton).click();
    }
}
