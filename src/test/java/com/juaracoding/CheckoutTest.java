package com.juaracoding;

import com.juaracoding.pages.ProductPage;
import com.juaracoding.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutTest {

    private ProductPage productPage = new ProductPage();
    private CartPage cartPage = new CartPage();

    @When("Saya menambahkan dua produk ke keranjang")
    public void saya_menambahkan_dua_produk_ke_keranjang() {
        productPage.addToCart(1);
        productPage.addToCart(2);
    }

    @And("Saya pergi ke keranjang")
    public void saya_pergi_ke_keranjang() {
        productPage.goToCart();
    }

    @And("Saya melanjutkan ke checkout")
    public void saya_melanjutkan_ke_checkout() {
        cartPage.checkout();
    }

    @Then("Saya harus melihat halaman checkout")
    public void saya_harus_melihat_halaman_checkout() {
        // Tambahkan assertions berdasarkan verifikasi halaman checkout
    }

    @Then("Saya harus melihat pesan kesalahan untuk checkout {string}")
    public void saya_harus_melihat_pesan_kesalahan_untuk_checkout(String expectedMessage) {
        Assert.assertEquals(cartPage.getErrorMessage(), expectedMessage);
    }
}
