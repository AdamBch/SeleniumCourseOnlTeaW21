package pl.coderslab.seleniucourse.examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

import static pl.coderslab.seleniucourse.Tools.sleep;

public class ZZ2PageObjectTest {
    @Test
    public void zadanieZaliczeniowe2() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement emailSignInPanel = driver.findElement(By.name("email"));
        emailSignInPanel.clear();
        emailSignInPanel.sendKeys("vkgcutygevfffkqrap@kvhrs.com");

        WebElement passwordSignInPanel = driver.findElement(By.name("password"));
        passwordSignInPanel.clear();
        passwordSignInPanel.sendKeys("Lalala123");

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();

        WebElement searchPanel = driver.findElement(By.name("s"));
        searchPanel.clear();
        searchPanel.sendKeys("Hummingbird Printed Sweater");

        WebElement searchHourglassButton = driver.findElement(By.cssSelector(".material-icons.search"));
        searchHourglassButton.click();

        WebElement sweaterIcon = driver.findElement(By.cssSelector(".h3.product-title"));
        sweaterIcon.click();

        Select drpSize = new Select(driver.findElement(By.id("group_1")));
        drpSize.selectByVisibleText("M");
        sleep(500);

        WebElement addQuantityButton = driver.findElement(By.cssSelector(".btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up"));
        addQuantityButton.click();
        sleep(200);
        addQuantityButton.click();
        sleep(200);
        addQuantityButton.click();
        sleep(200);
        addQuantityButton.click();

        WebElement addToCartButton = driver.findElement(By.cssSelector(".btn.btn-primary.add-to-cart"));
        addToCartButton.click();

        WebElement checkoutButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        checkoutButton.submit();

        WebElement checkoutButton2 = driver.findElement(By.cssSelector(".btn.btn-primary"));
        checkoutButton2.click();

        WebElement continueAddressButton = driver.findElement(By.cssSelector(".btn.btn-primary.continue.float-xs-right"));
        continueAddressButton.click();

        WebElement shippingMethodButton = driver.findElement(By.cssSelector(".col-sm-11.delivery-option-2"));
        shippingMethodButton.click();

        WebElement continueShippingMethodButton = driver.findElement(By.name("confirmDeliveryOption"));
        continueShippingMethodButton.click();

        WebElement paymentMethod = driver.findElement(By.id("payment-option-1"));
        paymentMethod.click();

        WebElement termsOfServiceBox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        termsOfServiceBox.click();

        WebElement orderButton = driver.findElement(By.cssSelector(".btn.btn-primary.center-block"));
        orderButton.click();

        File tmpScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "ddg-search-" + currentDateTime + ".png"));
        //driver.quit();
    }
}