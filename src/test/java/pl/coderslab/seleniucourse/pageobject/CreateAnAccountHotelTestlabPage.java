package pl.coderslab.seleniucourse.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pl.coderslab.seleniucourse.Tools.fillInput;

public class CreateAnAccountHotelTestlabPage {
    private WebDriver driver;
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstnameInput;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastnameInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    private By submitAccountButtonIdLocator = By.id("submitAccount");

    private By emailInputIdLocator = By.id("email");

    public CreateAnAccountHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void attemptAccountCreationForUserDetails(UserDetailsDto userDetails) {
        fillInput(customerFirstnameInput, userDetails.getFirstName());
        fillInput(customerLastnameInput, userDetails.getLastName());
        fillInput(passwordInput, userDetails.getPassword());

        WebElement submitButton = driver.findElement(submitAccountButtonIdLocator);
        submitButton.click();
    }

    public String getUserEmail() {
        WebElement emailInput = driver.findElement(emailInputIdLocator);
        return emailInput.getAttribute("value");
    }
}
