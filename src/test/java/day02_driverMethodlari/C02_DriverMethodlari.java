package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // maximize küçük pencereyi ekrana sığdırıyor ama f11'in yaptığını yapmıyor
        // sadece pencere büyütüyor
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        // başlığı döndürür
        System.out.println("Actual title: " + driver.getTitle());

        // bulunduğumuz url'i döndürür
        System.out.println("Actual URL: " + driver.getCurrentUrl());

        driver.close();
    }
}
