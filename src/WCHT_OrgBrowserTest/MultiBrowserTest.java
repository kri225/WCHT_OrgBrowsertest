package WCHT_OrgBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {

    static String baseurl = "https://www.wcht.org.uk/  ";
    static String browser = "chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("InternetExplorer")) {
            System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.close();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();

            }else{
                System.out.println("Wrong browser name given");
            }

            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            driver.quit();


        }
}
