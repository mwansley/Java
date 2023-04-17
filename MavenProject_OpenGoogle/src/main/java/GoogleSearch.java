import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        // web-driver object
        WebDriver driver = new ChromeDriver();

        // set timeouts
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

        driver.get("https://google.com");

        // find query window, add text
        WebElement element;
         element = driver.findElement(By.xpath(
               "//*[@id=\"APjFqb\"]"));


        if (element.isDisplayed()) {
            element.sendKeys("pizza in Shoreline");
            element.sendKeys(Keys.ENTER);
            WebElement search;
//            search = driver.findElement(By.cssSelector(
//                    "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.lJ9FBc > center > input.gNO89b"));
//           search.click();

         // verify the new page

          driver.close();
        }
    }
}