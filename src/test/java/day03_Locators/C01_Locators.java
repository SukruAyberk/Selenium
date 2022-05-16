package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    public static void main(String[] args) {

        // İlk 4 satırı her zaman yap!
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a gidip nutella aratalım
        // ilk adım AMAZONA elinle gir ve nutellayı arat
        // sonra serach'e sağ tıkla ve incele de
        // sonra id bul (twotabsearchtextbox) ve kontrol et unique olmalı!
        driver.get("https://www.amazon.com");

        // findElement(By ... locator) --> İstediğimiz web elementini bize döndüdürür
        // bizde o web elementini kullanmak için bir objeye assing ederiz
        // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); bu locator çalışıyor
        /*
            WebElement aramaKutusu = driver.findElement(By.className("nav-search-field"));
            Bu locator çalışmadı gözümüzden kaçan detaylar olabilir
            aldığımız bir locator calışmazsa alternatif locatorlar denemeliyiz
         */

        WebElement aramaKutusu = driver.findElement(By.name("field-keywords")); // çalışıyor

        // Herhangi bir web elementine istediğimiz yazıyı yollamak istersek
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Nutellayı yolladı ama aratmadı yani entera basmadı
        // onun için Keys.ENTER yaparız


    }
}
