package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarTesti {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.youtube.com/");
        String arananTitle = "youtube";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(arananTitle)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Doğru Title: " + actualTitle);
        }

        String actualURL = driver.getCurrentUrl();
        String arananKelime = "youtube";

        if (actualURL.contains(arananKelime)) {
            System.out.println("URL Test PASSED");
        } else {
            System.out.println("URL test FAILED. Doğru URL: " + actualURL);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();

        String arananKelime2 = "Amazon";
        String actualTitle2 = driver.getTitle();

        String actualURL2 = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";

        if (actualTitle2.contains(arananKelime2)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Actual title: " + actualTitle2);
        }

        if (actualURL2.equals(expectedURL)) {
            System.out.println("URL test PASSED");
        } else {
            System.out.println("URL test FAILED. Actual URL: " + actualURL2);
        }

        driver.close();
    }
}
