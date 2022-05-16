package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {

    /*
        1- Amazon.com'a git ve arama kutusunu locate et
        2- Arama kutusunun tag name'inin input olduğunu test et
        3- Arama kutusunun name attiribute'unun değerinin "field-keywords" olduğunu test edin
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        // 1- Amazon.com'a git ve arama kutusunu locate et
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // 2- Arama kutusunun tag name'inin input olduğunu test et
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)) {
            System.out.println("TagName Test PASSED");
        } else {
            System.out.println("TagName Test FAILED. Actual TagName: " + actualTagName);
        }

        // 3- Arama kutusunun name attiribute'unun değerinin "field-keywords" olduğunu test edin
        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");
        if (actualNameDegeri.equals(expectedNameDegeri)) {
            System.out.println("Name Attribute Test PASSED");
        } else {
            System.out.println("Name Attribute Test FAILED. Actual Name Attribut: " + actualNameDegeri);
        }

        // arama kutusunun konumu
        System.out.println("Konum: " + aramaKutusu.getLocation()); // Konum: (295, 11)

        // arama kutusunun yüksekliği
        System.out.println("webelement yüksekliği: " + aramaKutusu.getSize().height); // webelement yüksekliği: 38

        // arama kutusunun boyutları
        System.out.println("webelement boyutları: " + aramaKutusu.getSize()); // webelement boyutları: (1792, 38)

        driver.close();

        /*
            <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
            class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

            webElementinIsmi.getTagName() --> daha önce locate ettiğimiz bir web elemnetin tagname'ini döndürür
            webElementinIsmi.getAttribute(attributeIsmi) --> daha önce locate ettiğimiz bir web elementin istediğimiz
            attribute'ün değerini döndüdür
         */

    }
}
