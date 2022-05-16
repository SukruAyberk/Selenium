package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {

    public static void main(String[] args) throws InterruptedException {

        /*
            Eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek
            driver.get() yerine driver.navigate().to() methodunu kullanırız ve sonrasında
            forward(), back() ve refresh() gibi methodlar ile ileri, geri ve yenileme için kullanabiliriz
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate insan gibi davranır get gibi siteye girdik
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazona geri dönmek için
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden face'e gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
