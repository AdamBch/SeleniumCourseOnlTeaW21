package pl.coderslab.seleniucourse.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pl.coderslab.seleniucourse.Tools.fillInput;

public class LoginHotelTestlabPage {
    private WebDriver driver;

    private By emailCreateCssLocator = By.cssSelector("#email_create");

    private By createAnAccountButtonCssLocator = By.cssSelector("#SubmitCreate");

    public LoginHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptAccountCreationForEmail(String email) {
        WebElement emailInput = driver.findElement(emailCreateCssLocator);
        fillInput(emailInput, email);
        WebElement createAnAccountButton = driver.findElement(createAnAccountButtonCssLocator);
        createAnAccountButton.click();
    }
}
