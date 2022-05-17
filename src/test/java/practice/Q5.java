package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {
    /*
      // ...Exercise5...
      // Navigate to website  https://testpages.herokuapp.com/styled/index.html
      // Under the  ORIGINAL CONTENTS
      // click on Alerts
      // print the URL
      // navigate back
      // print the URL
      // Click on Basic Ajax
      // print the URL
      // enter value-> 20 and Enter
      // and then verify Submitted Values is displayed open page
      // close driver

       */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='alerttest']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);
        WebElement sv = driver.findElement(By.xpath("//*[text()='Submitted Values']"));
        if (sv.isDisplayed()) {
            System.out.println("Display Test PASSED");
        } else {
            System.out.println("Display Test FAILED");
        }

        driver.close();


    }

}
