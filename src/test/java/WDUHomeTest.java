import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void checkIfDataTablesButtonStatesLink(){
        WebElement dataTablesButtonStatesLinkElement = wduHome.getDataTablesButtonStatesLink();
        assertNotNull(dataTablesButtonStatesLinkElement);
    }
}
