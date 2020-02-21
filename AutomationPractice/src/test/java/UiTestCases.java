import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestCases {

    @Test
    public void siteOpening() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
        WebElement searchField = chromeDriver.findElement(By.id("search"));
        WebElement searchButton = chromeDriver.findElement(By.id("search-icon-legacy"));

        searchField.click();
        searchField.sendKeys("durnev");
        searchButton.click();
    }
}
