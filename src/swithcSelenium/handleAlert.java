package swithcSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handleAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        /*
         *      Handle alerts in selenium
         *
         *      What is alert
         *
         *      How to handle alerts
         *
         */

        WebElement inputCustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));

        inputCustomerID.sendKeys("123");

        WebElement buttonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));

        buttonSubmit.click();

        driver.switchTo().alert().accept();

        String textAlert = driver.switchTo().alert().getText();

        Assert.assertEquals("Customer Successfully Delete!" ,textAlert );

        driver.switchTo().alert().accept();

        inputCustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));

        inputCustomerID.sendKeys("123");

         buttonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));

        buttonSubmit.click();

        driver.switchTo().alert().dismiss();

    }
}
