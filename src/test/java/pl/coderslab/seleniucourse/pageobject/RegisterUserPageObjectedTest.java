package pl.coderslab.seleniucourse.pageobject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.coderslab.seleniucourse.Tools.*;

public class RegisterUserPageObjectedTest {
    private WebDriver driver;
    private MainHotelTestlabPage mainPage;
    private LoginHotelTestlabPage loginPage;
    private CreateAnAccountHotelTestlabPage createAccountPage;
    private MyAccountHotelTestlabPage myAccountPage;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabPage(driver);
        this.loginPage = new LoginHotelTestlabPage(driver);
        this.createAccountPage = new CreateAnAccountHotelTestlabPage(driver);
        this.myAccountPage = new MyAccountHotelTestlabPage(driver);
    }

    @Test
    public void shouldFillRegisterUserForm() {
        // given
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // when
        mainPage.clickSignIn();
        String email = generateRandomEmail();



        loginPage.attemptAccountCreationForEmail(email);
        UserDetailsDto userDetails = new UserDetailsDto()
                .setFirstName("Tomasz")
                .setLastName("Kotowski")
                .setPassword("haslo123");
//        String actual = createAccountPage.getUserEmail();
//        assertEquals(email, actual);
        createAccountPage.attemptAccountCreationForUserDetails(userDetails);
        // then
        assertTrue(myAccountPage.isAccountCreationSuccessful());



//        assertDisplayedAndEnabled(emailInput);
//        assertDisplayedAndEnabled(createAnAccountButton);

//        assertDisplayedAndEnabled(customerFirstnameInput);
//        assertDisplayedAndEnabled(customerLastnameInput);
//        assertDisplayedAndEnabled(customerEmailInput);
//        assertDisplayedAndEnabled(passwordInput);
//        assertDisplayedAndEnabled(submitButton);
        //driver.quit();
    }
}

