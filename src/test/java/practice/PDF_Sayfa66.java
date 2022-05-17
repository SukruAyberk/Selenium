package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PDF_Sayfa66 {
    // 2- https://www.amazon.com/ adresine gidin
    //3- Browseri tam sayfa yapin
    //4-Sayfayi “refresh” yapin
    //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
    //6- Gift Cards sekmesine basin
    //7- Birthday butonuna basin
    //8- Best Seller bolumunden ilk urunu tiklayin
    //9- Gift card details’den 25 $’i secin
    //10-Urun ucretinin 25$ oldugunu test edin
    //10-Sayfayi kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("İçeriyor");
        } else {
            System.out.println("İçermiyor");
        }

        driver.findElement(By.xpath("(//*[text()='Gift Cards'])[1]")).click();
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        WebElement price = driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        System.out.println(price.getText());
        if (price.getText().equals("$25.00")){
            System.out.println("Ürün $25.00");
        } else {
            System.out.println("Ürün " + price.getText());
        }
        driver.close();
    }
}
