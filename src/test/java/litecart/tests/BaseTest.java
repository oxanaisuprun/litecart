package litecart.tests;

import litecart.pages.AdminDeleteUser;
import litecart.pages.AdminPage;
import litecart.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
public class BaseTest {

    WebDriver driver;


    public void open(){
        AdminDeleteUser adminPage = new AdminDeleteUser(driver);
        adminPage.openDeleteUser();
        MainPage mainPage = new MainPage(driver);
        mainPage.openAddUser();
    }
    public WebDriver setupBrowser(String browser){
        if(browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public void closeBrowser(){
        driver.close();
    }
}


