package pl.coderslab.seleniucourse.examples;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZZ1PageObjectSteps {
    private WebDriver driver;
    private ZZ1LogIn zz1LogIn;

    @Given("^Browser with open page at address (.*)$")
    public void browserNavi(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get(url);
}
    @And("^User logged on using (.*) and (.*)$")
    public void loggingIn(String email, String password) {
        this.zz1LogIn = new ZZ1LogIn(driver);
        zz1LogIn.logInAs(email, password);

    }
    @When("^Page open at address (.*)$")
    public void browserNavi2(String url) {
        this.driver.get(url);
    }
    @And("^Addresses button clicked$")
    public void clickAddressesButton() {
        this.zz1LogIn.addressesButtonClick();
    }
    @And("^Create new address button clicked$")
    public void clickNewAddressesButton() {
        this.zz1LogIn.createNewAddressButtonClick();
    }
    @And("^Fill in new address data (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void enterNewAddress(String alias, String address, String city, String postcode, String country, String phone) {
        zz1LogIn.newAddress(alias, address, city, postcode, country, phone);
    }
    @Then("^New address is created$")
    public void createNewAddress(){
        zz1LogIn.createNewAddress();
    }
    @And("^Verify the new address (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void addressContainPhrase(String alias, String address, String city, String postcode, String country, String phone) {
        zz1LogIn.newAddressCheck(alias, address, city, postcode, country, phone);
            }
}
