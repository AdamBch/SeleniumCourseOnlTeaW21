package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoSearchTest2 {
    @Test
    public void shouldSearchWithDDG2(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Warhammer 40k");
        searchInput.submit();
    }
}
