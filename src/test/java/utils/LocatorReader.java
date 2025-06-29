package utils;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//This file will load and send xpath's and id's y reading it from propertise file
public class LocatorReader {
    private static Properties locators;

    static {
        locators = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config/locators.properties");
            locators.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load locators file", e);
        }
    }

    public static By get(String key) {
        String value = locators.getProperty(key);
        String[] parts = value.split(":", 2);
        return switch (parts[0]) {
            case "id" -> By.id(parts[1]);
            case "name" -> By.name(parts[1]);
            case "css" -> By.cssSelector(parts[1]);
            case "xpath" -> By.xpath(parts[1]);
            default -> throw new IllegalArgumentException("Invalid locator type: " + parts[0]);
        };
    }
}
