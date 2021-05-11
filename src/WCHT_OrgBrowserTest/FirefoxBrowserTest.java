package WCHT_OrgBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.wcht.org.uk/  ";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Watfor Community Housing");
        boolean verifytitlecontains = title.contains("Accesibility");
        System.out.println(title);
        System.out.println(verifytitle);
        System.out.println(verifytitlecontains);
        driver.close();


    }
}
