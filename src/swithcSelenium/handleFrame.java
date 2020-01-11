package swithcSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class handleFrame {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        driver.get( "https://www.toolsqa.com/iframe-practice-page/" );

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait( 5 , TimeUnit.SECONDS );

        /*
        *       Frame
        *
        *           what is frame
        *
        *           how to handle it
         */

        WebElement buttonAccept = driver.findElement( By.xpath("//a[text()='ACCEPT']") );

        buttonAccept.click();

        WebElement frame1 = driver.findElement( By.id( "IF1" ) );

        String frameID = "IF1";

        driver.switchTo().frame( frame1 );

        WebElement buttonKatalonStudio = driver.findElement( By.xpath( "//span[text()='Katalon Studio Tutorial']" ) );

        buttonKatalonStudio.click();

        Thread.sleep( 2000 );

        driver.get( "http://the-internet.herokuapp.com/tinymce" );

        driver.switchTo().frame( 0 );

        WebElement paragraph =driver.findElement( By.xpath( "//p" ) );

        paragraph.sendKeys( "something " );

        driver.switchTo().defaultContent();

        System.out.println("h3 text here --> "+driver.findElement( By.xpath( "//h3" ) ).getText());


    }
}
