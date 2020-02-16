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
public class LoginPage {

    private static final String USERNAME_TEXTBOX = "//input[@name ='username']";
    private static final String PASSWORD_TEXTBOX = "//input[@name ='password']";
    private static final String  LOGIN_BUTTON  = "//button[contains(.,'Login')]";
    public static WebDriver driver = new ChromeDriver();

    public void login(String username, String password) {
        WebElement userNameTextBox = driver.findElement(By.xpath(USERNAME_TEXTBOX));
        WebElement passwordTextBox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
        WebElement loginBtn =driver.findElement(By.xpath(LOGIN_BUTTON));
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginBtn.click();
    }

}