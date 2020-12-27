package org.cb.ta.WebDU;

import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "../webdriver/chromedriver");
        return null;
    }
}
