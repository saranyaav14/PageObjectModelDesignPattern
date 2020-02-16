package Library.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Home page class
 *
 * @author saranya
 */
public class CreateAssetPage {

    private static final String ASSET_TAG_TEXT_BOX = "//input[@id='asset_tag']";
    private static final String ASSET_NAMAE_TEXT_BOX = "//input[@id='name']";


    private static final String MODEL_DROPDOWN = "//select[contains(.,'Select a Model')]";
    private static final String STATUS_DROPDOWN = "//select[contains(.,'Select Status')]";
    private static final String SAVE_BUTTON = "//button[contains(.,' Save')]";
    public static WebDriver driver = new ChromeDriver();

    public void selectModelFromDropdown() {
        Select dropdownValue = new Select(driver.findElement(By.xpath(MODEL_DROPDOWN)));
        dropdownValue.selectByIndex(1);

    }
    public void selectStatusFromDropdown() {
        Select dropdownValue = new Select(driver.findElement(By.xpath(STATUS_DROPDOWN)));
        dropdownValue.selectByIndex(1);

    }
    public void addAssetValues(String assetTag,String assetName){
        WebElement assetTagValue = driver.findElement(By.xpath(ASSET_TAG_TEXT_BOX));
        WebElement assetNameValue = driver.findElement(By.xpath(ASSET_NAMAE_TEXT_BOX));
        assetTagValue.sendKeys(assetTag);
        assetNameValue.sendKeys(assetName);
    }

    public void clickSaveButton() {
        WebElement saveBtn = driver.findElement(By.xpath(SAVE_BUTTON));
        saveBtn.click();

    }



}