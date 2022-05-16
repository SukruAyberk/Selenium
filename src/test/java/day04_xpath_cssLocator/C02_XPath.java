package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {

    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        // WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        // addButonu.click();
        // eğer bu we elementi sadece click gibi bir kez kullanılacaksa aşağıdaki format daha mantıklı
        // button[onclick='addElement()'] cssSelector halide bu ama css biraz sıkıntılı
        // driver.findElement(By.xpath("//button[@onclick='addElement()']")).click(); bunun yerine aşağıdaki de olur
        // driver.findElement(By.xpath("//button[text()='Add Element']")).click(); bunun yerine aşağıdaki de olur
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete Button Test PASSED");
        } else {
            System.out.println("Delete Button Test FAILED");
        }

        //  4- Delete tusuna basin
        deleteButonu.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements = driver.findElement(By.xpath("//h3"));
        if (addRemoveElements.isDisplayed()) {
            System.out.println("Add Remove Elements Test PASSED");
        } else {
            System.out.println("Add Remove Elements Test FAILED");
        }

        Thread.sleep(3000);

    }
}
