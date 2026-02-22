package org.chandAI.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static Properties properties = new Properties();

    static {
        String env = System.getProperty("env", "qa"); // default QA
        try (FileInputStream fis = new FileInputStream("src/main/resources/" + env + ".properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load " + env + " properties file", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}