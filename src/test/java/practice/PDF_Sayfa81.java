package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PDF_Sayfa81 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
        if (driver.getTitle().contains("Google")) {
            System.out.println("İçeriyor");
        } else {
            System.out.println("İçermiyor");
        }
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nutella" + Keys.ENTER);

    }
}
