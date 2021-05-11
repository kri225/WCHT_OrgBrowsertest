package WCHT_OrgBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class iexplorer {
    public static void main(String[] args) {

        String baseurl ="https://www.wcht.org.uk/  ";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Watford Community housing");
        boolean verifytitlecontains = title.contains("Accessibility");
        System.out.println(title);
        System.out.println(verifytitle);
        System.out.println(verifytitlecontains);
        driver.close();



    }
}
