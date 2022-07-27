package pl.coderslab.seleniucourse.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class ZZ1LogIn {
    @FindBy(name = "email")
    private WebElement emailInputPanel;
    @FindBy(name = "password")
    private WebElement passwordInputPanel;
    @FindBy(id = "submit-login")
    private WebElement signInButton;

    @FindBy(id = "addresses-link")
    private WebElement addressesButton;

    @FindBy(xpath = "//a[@data-link-action=\"add-address\"]")
    private WebElement createNewAddressButton;

    @FindBy(name = "alias")
    private WebElement aliasInputPanel;

    @FindBy(name = "address1")
    private WebElement addressInputPanel;

    @FindBy(name = "city")
    private WebElement cityInputPanel;

    @FindBy(name = "postcode")
    private WebElement zipInputPanel;

    @FindBy(name = "id_country")
    private WebElement countryInputPanel;

    @FindBy(name = "phone")
    private WebElement phoneInputPanel;

    @FindBy(css = ".btn.btn-primary.float-xs-right")
    private WebElement saveButton;

    //@FindBy(css = ".alert.alert-success")
    //private WebElement addressSuccessMessage;

    //@FindBy(css = ".col-lg-4.col-md-6.col-sm-6")
    //List<WebElement> allAddressBodies;

    @FindBy(id = "content")
    List<WebElement> allContent;

    public ZZ1LogIn(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logInAs(String email, String password) {
        emailInputPanel.sendKeys(email);
        passwordInputPanel.sendKeys(password);
        signInButton.click();

    }

    public void addressesButtonClick() {
        addressesButton.click();

    }

    public void createNewAddressButtonClick() {
        createNewAddressButton.click();

    }

    public void newAddress(String alias, String address, String city, String postcode, String country, String phone) {
        aliasInputPanel.sendKeys(alias);
        addressInputPanel.sendKeys(address);
        cityInputPanel.sendKeys(city);
        zipInputPanel.sendKeys(postcode);
        countryInputPanel.sendKeys(country);
        phoneInputPanel.sendKeys(phone);

    }
    public void createNewAddress(){
        saveButton.click();
    }
    public void newAddressCheck(String alias, String address, String city, String postcode, String country, String phone) {
        for (int i = 0; i < allContent.size(); i++) {
            WebElement currentAddressElement = allContent.get(i);
            if (!currentAddressElement.getText().toLowerCase().contains(alias.toLowerCase())) {
                fail(String.format("Alias %s NOT found in existing addresses", alias));
            }
            if (!currentAddressElement.getText().toLowerCase().contains(address.toLowerCase())) {
                fail(String.format("Address %s NOT found in existing addresses", address));
            }
            if (!currentAddressElement.getText().toLowerCase().contains(city.toLowerCase())) {
                fail(String.format("City %s NOT found in existing addresses", city));
            }
            if (!currentAddressElement.getText().toLowerCase().contains(postcode.toLowerCase())) {
                fail(String.format("Zip code %s NOT found in existing addresses", postcode));
            }
            if (!currentAddressElement.getText().toLowerCase().contains(country.toLowerCase())) {
                fail(String.format("Country %s NOT found in existing addresses", country));
            }
            if (!currentAddressElement.getText().toLowerCase().contains(phone.toLowerCase())) {
                fail(String.format("Phone %s NOT found in existing addresses", phone));
            }
        }

}}