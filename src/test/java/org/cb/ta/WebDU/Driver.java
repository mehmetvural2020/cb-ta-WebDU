package org.cb.ta.WebDU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "../webdriver/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        return new ChromeDriver();
    }
}
