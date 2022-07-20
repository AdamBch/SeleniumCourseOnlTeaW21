package pl.coderslab.seleniucourse.examples;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(features = "src/cucumber/features/zz1pageobjectexample.feature", plugin = {"pretty","html:out"})
    public class ZZ1PageObjectTest {
    }