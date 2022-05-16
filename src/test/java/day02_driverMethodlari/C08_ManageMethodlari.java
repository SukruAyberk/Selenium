package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ManageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximize iken boyutları alalım
        driver.manage().window().maximize();
        System.out.println("maximize konum: " + driver.manage().window().getPosition()); // maximize konum: (-8, -8)
        System.out.println("maximize boyut: " + driver.manage().window().getSize()); // maximize boyut: (2576, 1416)

        // fullscreen iken boyutları alalım
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition()); // fullscreen konum: (0, 0)
        System.out.println("fullscreen boyut: " + driver.manage().window().getSize()); // fullscreen boyut: (2560, 1440)

    }
}
