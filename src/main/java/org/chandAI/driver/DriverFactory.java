package org.chandAI.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class DriverFactory {

    public static WebDriver createDriver(String executionType) {

        try {
            if (executionType.equalsIgnoreCase("grid")) {
                return new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        new ChromeOptions()
                );
            } else {
                return new org.openqa.selenium.chrome.ChromeDriver();
            }
        } catch (Exception e) {
            throw new RuntimeException("Driver initialization failed");
        }
    }
}