import Library.Page.*;
import org.junit.Test;

import java.util.logging.Logger;

public class Snipeitapp {
po
    private String userName = "admin";
    private String password = "password";

    Logger logger;

    @Test
    public void getService() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");

        System.out.println("Go to the URL");
        HomePage homePage = new HomePage();
        homePage.initiateBrowser();
        homePage.waitForPageToLoad();

        System.out.println("Click on DEMO link");
        homePage.clickDemoLink();
        homePage.waitForPageToLoad();

        System.out.println("Click on Launch demo button");
        homePage.clickOnLaunchDemoBtn();

        System.out.println("login to the app");
        LoginPage loginPage = new LoginPage();
        loginPage.login(userName, password);

        System.out.println("Select Asset list from side bar");
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickAssetLink();
        dashboardPage.clickListAll();

        System.out.println("Create a new Asset and save");
        AssetListPage assetListPage = new AssetListPage();
        assetListPage.clickCreateNewBtn();

        System.out.println("Add Values and click save button");
        CreateAssetPage createAssetPage = new CreateAssetPage();
        createAssetPage.addAssetValues("testing_00123", "testing_00827");
        createAssetPage.selectModelFromDropdown();
        createAssetPage.selectStatusFromDropdown();
        createAssetPage.clickSaveButton();

        System.out.println("Logout");
        AssetListPage assetListPage1 = new AssetListPage();
        assetListPage1.clickLogout();

    }

}
