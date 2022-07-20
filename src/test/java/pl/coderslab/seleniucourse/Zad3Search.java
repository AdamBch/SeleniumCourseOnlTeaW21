package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad3Search {
    @Test
    public void shouldFindElementsByClassName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchSignInButton = driver.findElement(By.cssSelector(".user_login.navigation-link"));
        WebElement footerEmailInput = driver.findElement(By.cssSelector(".inputNew.form-control.grey.newsletter-input"));
        footerEmailInput.clear();
        footerEmailInput.sendKeys("test@test.com");
        //driver.quit();
    }

// todo finish
    //driver.quit();
}
