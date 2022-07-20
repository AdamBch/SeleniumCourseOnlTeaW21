package pl.coderslab.seleniucourse.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/duckduckgosearchpageobjectexample.feature", plugin = {"pretty","html:out"})
    public class DuckDuckGoSearchTest {
    }
// Kamil Kowalski vkgcutygevfffkqrap@kvhrs.com Lalala123