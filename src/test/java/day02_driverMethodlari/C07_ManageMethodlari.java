package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Pencere ölçüleri: " + driver.manage().window().getSize()); // Pencere ölçüleri: (1265, 1380)
        System.out.println("Pencere konumu: " + driver.manage().window().getPosition()); // Pencere konumu: (10, 10)

        Thread.sleep(2000);

        // pencerenin konumunu ve büyüklüğünü değiştir
        driver.manage().window().setPosition(new Point(15, 15));
        driver.manage().window().setSize(new Dimension(900, 600));
        System.out.println("Pencerenin yeni ölçüleri: " + driver.manage().window().getSize()); // Pencerenin yeni ölçüleri: (900, 600)
        System.out.println("Pencerenin yeni konumu: " + driver.manage().window().getPosition()); // Pencerenin yeni konumu: (15, 15)


    }
}
