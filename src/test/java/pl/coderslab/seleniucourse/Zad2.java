package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static pl.coderslab.seleniucourse.Tools.sleep;

public class Zad2 {
    @Test
    public void webPageBrowse(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://coderslab.pl/pl");
        sleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        sleep(2000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }
}
