package pl.coderslab.seleniucourse.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainHotelTestlabPage {
    private WebDriver driver;

    private By signInButtonCssLocator = By.cssSelector("a.user_login.navigation-link");

    public MainHotelTestlabPage(WebDriver driver) {

        this.driver = driver;


    }

    public void clickSignIn() {
        WebElement signInButton = driver.findElement(signInButtonCssLocator);
        signInButton.click();
    }
}
