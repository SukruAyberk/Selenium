package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        // amazon sitesine gidip kaynak kodlarında "Gateway" yazdığını test et

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // tam pencere yaptık

        driver.get("https://www.amazon.com");
        String sayfaKaynadkKodlari = driver.getPageSource();
        String arananKelime = "Gateway";
        // System.out.println(sayfaKaynadkKodlari);
        if (sayfaKaynadkKodlari.contains(arananKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else {
            System.out.println("Kaynak kodu testi FAILED. Kaynak kodlarında " + arananKelime + " bulunmuyor.");
        }

        driver.close();

    }
}
