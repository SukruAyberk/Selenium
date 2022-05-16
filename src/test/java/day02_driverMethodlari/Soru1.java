package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("Boyutları: " + driver.manage().window().getSize());
        System.out.println("Konumu: " + driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(2560, 1440));
        driver.manage().window().setPosition(new Point(50, 50));
        System.out.println("Yeni boyutları: " + driver.manage().window().getSize());
        System.out.println("Yeni konumu: " + driver.manage().window().getPosition());
        Thread.sleep(2000);

        driver.close();

    }
}
