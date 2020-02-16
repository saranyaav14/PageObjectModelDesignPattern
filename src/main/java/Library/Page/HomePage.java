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
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Home page class
 *
 * @author saranya
 */
public class HomePage {

    private static final String DEMO_LINK = "//a[contains(.,'Demo')]";
    private static final String LAUNCH_DEMO_NOW_BTN = "//a[contains(.,'Launch Demo Now')]";
    private static final String USERNAME_TEXTBOX = "//input[@name ='username']";
    private static final String PASSWORD_TEXTBOX = "//input[@name ='password']";
    private static final String  LOGIN_BUTTON  = "//button[contains(.,'Login')]";


    private static final String OPTION_RADIO_BUTTON_TEMPLATE = "//div[@class='styles__itemContainerV2___3T5rr styles__itemContainerBase___2bhyD']//div[contains(.,'%1$s')]";
    private static final String SELECT_TIME_TEMPLATE = "//label[contains(.,'At what time')]/following::select[@data-test='step_time']";
    private static final String DURATION_TEXT_BOX_TEMPLATE = "//label[contains(.,'For how long?')]/following::input[@data-test='step_duration']";
    private static final String EMAIL_TEXTBOX_TEMPLATE = "//label[contains(.,'Email address')]/following::input[@placeholder='Email address']";
    private static final String DATE_PICKER_TITLE_TEMPLATE = "//div[@class=CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1]/following::*[@class=CalendarMonth_caption CalendarMonth_caption_1]/strong";
    private static final String DATE_TEMPLATE = "//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//tr//td//button[@aria-label[contains(.,'%1$s %2$s')]]";
    public static WebDriver driver = new ChromeDriver();
    private static String timeoutForPageLoad = "60000";

    public void initiateBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get(Constant.url);
    }
    public void waitForPageToLoad() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickDemoLink() {
        WebElement link = driver.findElement(By.xpath(DEMO_LINK));
        link.click();
    }

    public void click(WebElement element) {
        element.click();

    }

    public void clickOnLaunchDemoBtn() {
        click(driver.findElement(By.xpath(LAUNCH_DEMO_NOW_BTN)));
    }

    public void goToLoginPage() {
        String  mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        windows.remove(mainWindow);
        driver.switchTo().window(windows.iterator().next());
    }


}