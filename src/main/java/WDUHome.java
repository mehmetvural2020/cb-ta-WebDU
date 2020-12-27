import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WDUHome {
    private WebDriver driver;

    private final By dataTablesButtonStatesLink = By.xpath("//a[@id='ata-table']");

    public WDUHome(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDataTablesButtonStatesLink() {
        return driver.findElement(dataTablesButtonStatesLink);
    }
}
