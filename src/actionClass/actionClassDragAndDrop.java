package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClassDragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
        WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));


        WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
        WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
        WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
        WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
        WebElement southKorea = driver.findElement(By.xpath("//div[@id='box105']"));
        WebElement swedan = driver.findElement(By.xpath("//div[@id='box102']"));
        WebElement US = driver.findElement(By.xpath("//div[@id='box103']"));

        Actions action  = new Actions(driver);

        action.dragAndDrop(copenhagen , denmark).perform();
        action.dragAndDrop(seoul , southKorea).perform();
        action.dragAndDrop(rome , italy).perform();
        action.dragAndDrop(madrid , spain).perform();
        action.dragAndDrop(oslo , norway).perform();
        action.dragAndDrop(stockholm , swedan).perform();
        action.dragAndDrop(washington , US).perform();

    }
}
