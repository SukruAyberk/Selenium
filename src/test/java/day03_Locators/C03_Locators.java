package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {

    /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signInButonu = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signInButonu.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKulliniciAdiElementi = driver.findElement(By.className("navbar-text"));
        // getText() methodu webElementi text olarak bize istediğimiz şekilde döndürür
        // System.out.println(actualKulliniciAdiElementi); // [[ChromeDriver: chrome on WINDOWS (4fed708f8a43cab5316216b9e1cf9f31)] -> class name: navbar-text]
        // System.out.println(actualKulliniciAdiElementi.getText()); // testtechproed@gmail.com
        String expectedUserMail = "testtechproed@gmail.com";
        if (actualKulliniciAdiElementi.getText().equals(expectedUserMail)) {
            System.out.println("Expected Mail Test PASSED");
        } else {
            System.out.println("Expected Mail Test FAILED. Actual Mail: " + actualKulliniciAdiElementi.getText());
        }

        //  f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement singOutElementi = driver.findElement(By.linkText("Sign out"));
        if (adressesElementi.isDisplayed()) {
            System.out.println("Adresses elementi görünürlük testi PASSED");
        } else {
            System.out.println("Adresses elementi görünürlük testi FAILED");
        }

        if (singOutElementi.isDisplayed()) {
            System.out.println("Sign Out elementi görünürlük testi PASSED");
        } else {
            System.out.println("Sign Out elementi görünürlük testi FAILED");
        }


        // 3. Sayfada kac tane link oldugunu bulun.
        // linklerin tag name'i her zaman "a"
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayısı: " + linklerListesi.size());

        // linkleri yazdıralım
        for (WebElement i : linklerListesi) {
            System.out.println(i.getText());
        }

        driver.quit();

    }
}
