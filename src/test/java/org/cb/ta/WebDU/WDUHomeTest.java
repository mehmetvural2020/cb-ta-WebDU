package org.cb.ta.WebDU;

import org.cb.ta.WebDU.WDUHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

public class WDUHomeTest {
    private WebDriver driver;
    private WDUHome wduHome;

    public WDUHomeTest() {
        System.setProperty("webdriver.chrome.driver", "../webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wduHome = new WDUHome(driver);
    }

    @Test
    public void checkIfDataTablesButtonStatesLinkExist() {
        WebElement dataTablesButtonStatesLinkElement = wduHome.getDataTablesButtonStatesLink();
        assertNotNull(dataTablesButtonStatesLinkElement);
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        //        driver.close();
    }
}
