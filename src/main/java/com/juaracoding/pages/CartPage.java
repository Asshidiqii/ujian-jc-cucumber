package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage() {
        this.driver = DriverSingleton.getDriver(Constants.CHROME);
        PageFactory.initElements(driver, this);
    }

    // Elemen
    private By checkoutButton = By.id("checkout");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    // Aksi
    public void checkout() {
        driver.findElement(checkoutButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
