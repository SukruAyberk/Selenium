package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amaazon.com");
        /*
            İleride wait konusunu daha geniş olarak ele alacağız
            Bir sayfa açışırken, ilk başta sayfanın içerisinde bulunan
            elementlere göre bir yükleme süresine ihtiyaç vardır
            veya bir web elementinin kullanılabilmesi için zamana ihtiyaç olabilir
            implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elemenlere ulaşım için beklenecek MAXIMUM süreyi
            belirleme olanağı tanır.

            Yani sayfaya bağlanabilmek için max 15 saniye bekle bağlanabiliyorsan devam et
            bağlanamıyorsan bana rapor et
         */
        driver.close();
    }
}
