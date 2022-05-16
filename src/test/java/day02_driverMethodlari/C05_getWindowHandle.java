package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle()); // 1. deneme CDwindow-87EC53B7F197C5FF4882D864FA635E83
        // 2. deneme CDwindow-989671DCD0B33EE3E84CB8ABD9368717

    }
}
