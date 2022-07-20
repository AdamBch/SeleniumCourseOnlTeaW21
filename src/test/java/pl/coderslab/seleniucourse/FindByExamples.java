package pl.coderslab.seleniucourse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindByExamples {
        @Test
        public void shouldFindElementsById() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://hotel-testlab.coderslab.pl/en/");
            WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
            hotelLocationInput.clear();
            hotelLocationInput.sendKeys("Warsaw");
            WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));
            WebElement footerEmailInput = driver.findElement(By.id("newsletter-input"));
            footerEmailInput.clear();
            footerEmailInput.sendKeys("test@test.com");

            //driver.quit();
        }

        @Test
        public void shouldFindElementsByName() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://hotel-testlab.coderslab.pl/en/");
            WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
            hotelLocationInput.clear();
            hotelLocationInput.sendKeys("Warsaw");
            WebElement searchNowButton = driver.findElement(By.name("search_room_submit"));
            searchNowButton.submit();
            WebElement footerEmailInput = driver.findElement(By.name("email"));
            footerEmailInput.clear();
            footerEmailInput.sendKeys("test@test.com");
            WebElement searchSubscribeButton = driver.findElement(By.name("submitNewsletter"));
            //driver.quit();
        }

// todo finish
            //driver.quit();
        }


