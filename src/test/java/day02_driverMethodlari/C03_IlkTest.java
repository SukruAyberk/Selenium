package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {

    public static void main(String[] args) {

        /*
        1- https://www.amazon.com url'ine git
        2- Başlığın Amazon kelimesi içerdiğini Test et
        3- Url'in https://www.amazon.com'a eşit olduğunu test et
        4- sayfayı kapat
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1- https://www.amazon.com url'ine git
        driver.get("https://www.amazon.com");

        // 2- Başlığın Amazon kelimesi içerdiğini Test et
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon"; // büyük küçük harf önemli
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED. Title " + arananKelime + "'yi içermiyor.");
        }

        // 3- Url'in https://www.amazon.com'a eşit olduğunu test et
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com";
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL test PASSED");
        } else {
            System.out.println("URL test FAILED. Actual URL " + actualURL + ", " + expectedURL + "'yi içermiyor.");
        }

        // sayfayı kapat
        driver.close();

    }
}
