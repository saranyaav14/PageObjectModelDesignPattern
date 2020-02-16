package Library.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * List Asset page page class
 *
 * @author saranya
 */
public class AssetListPage {

    private static final String LOGOUT_DROPDOWN = "//span[contains(.,'Nqabayomzi')]";
    private static final String LOGOUT_LINK = "//li/a[contains(.,'Logout')]";
    private static final String CREATE_NEW_BTN = "//a[contains(.,'Custom Export')]/following::a[contains(.,'Create New')]";


    public static WebDriver driver = new ChromeDriver();

    public void clickOnUserName() {
        WebElement userName = driver.findElement(By.xpath(LOGOUT_DROPDOWN));
        userName.click();

    }
    public void clickCreateNewBtn() {
        WebElement assetLink = driver.findElement(By.xpath(CREATE_NEW_BTN));
        assetLink.click();
    }

    public void clickLogout() {
        WebElement userName = driver.findElement(By.xpath(LOGOUT_LINK));
        userName.click();

    }


}