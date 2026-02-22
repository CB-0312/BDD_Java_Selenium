package org.chandAI.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.chandAI",
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}