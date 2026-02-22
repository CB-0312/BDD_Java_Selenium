package org.chandAI.base;

import org.chandAI.driver.DriverFactory;
import org.chandAI.driver.DriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setUp(String executionType) {
        driver = DriverFactory.createDriver(executionType);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
    }

    public void tearDown() {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
}