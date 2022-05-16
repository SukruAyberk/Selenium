package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Doğru Title: " + actualTitle);
        }

        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("facebook")) {
            System.out.println("URL Test PASSED");
        } else {
            System.out.println("URL test FAILED. Doğru URL: " + actualURL);
        }

        driver.navigate().to("https://www.walmart.com/");
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.contains("Walmart.com")) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Doğru Title: " + actualTitle2);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
