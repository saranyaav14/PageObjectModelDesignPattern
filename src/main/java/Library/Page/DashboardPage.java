package Library.Page;

import Webdriver.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Home page class
 *
 * @author saranya
 */
public class DashboardPage {

    private static final String DASHBOARD_TITLE = "//h1[contains(.,'Dashboard')]";
    private static final String CREATE_NEW_BTN = "//a[contains(.,'Custom Export')]/following::a[contains(.,'Create New')]";

    private static final String ASSET_LINK = "//a//span[contains(.,'Assets')]";

    private static final String LIST_ALL_LINK = "//a[contains(.,'List All')]";
    public static WebDriver driver = new ChromeDriver();


    public void waitForPageToLoad() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    public void clickAssetLink() {
        WebElement assetLink = driver.findElement(By.xpath(ASSET_LINK));
        assetLink.click();
    }
    public void clickListAll() {
        WebElement assetLink = driver.findElement(By.xpath(LIST_ALL_LINK));
        assetLink.click();
    }
    public void clickCreateNewBtn() {
        WebElement assetLink = driver.findElement(By.xpath(CREATE_NEW_BTN));
        assetLink.click();
    }



}