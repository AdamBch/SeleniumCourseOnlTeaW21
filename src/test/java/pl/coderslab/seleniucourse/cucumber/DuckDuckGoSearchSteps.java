package pl.coderslab.seleniucourse.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class DuckDuckGoSearchSteps {
    private WebDriver driver;

    @Given("Browser with open page at address https:\\/\\/duckduckgo.com")
    public void browserNavigate() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://duckduckgo.com/");
    }

    @When("^Entered (.*) on the search input box$")
    public void fillSearchInputBox(String searchPhrase) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchPhrase);
    }

    @And("Search button \\(magnifying glass\\) clicked")
    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
    }

    @Then("^First (.*) search results contain phrase: \"Henryk Sienkiewicz\"$")
    public void firstResultsContainPhrase(int ile) {
        List<WebElement> results = driver.findElements(By.cssSelector(".nrn-react-div"));
        String expectedPhrase = "Henryk Sienkiewicz";
        for(int i=0; i<ile; i++) {
            WebElement currentResultElement = results.get(i);
            WebElement currentResultHeader = currentResultElement.findElement(By.cssSelector("h2"));
            if(!currentResultHeader.getText().contains(expectedPhrase)) {
                fail(String.format("Phrase %s NOT found in search result: %s",
                        expectedPhrase, currentResultHeader.getText()));
            }
        }
    }

}
