package waitingInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

    public class waitingSelenium {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://test-basqar.mersys.io/");

            /*
             *   Implicit wait vs explicit wait
             *
             *       These are the most usefull and mostly used type of the waits in the selenium.
             *
             *   IMPLICIT WAIT :
             *       Implicit wait is creating once for driver and it will effective until the execution is done or driver.quit
             *
             *       If the implicit wait is failed it will throw no such element exception
             *
             *
             *   EXPLICIT WAIT :
             *       Explicit wait is creating for one element and it will be effective until that element you need to create other explicit wait for
             *           different element.
             *
             *       If the explicit wait is failed then it will throw Element is not visible exepction(element is not clickable as well)
             *
             */

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);

            String Username = "admin";

            driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys(Username);

            driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys(Username);

            driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

            // click on inventory
            driver.findElement(By.xpath("//span[@class='nav-link-title ng-tns-c27-21 ng-star-inserted']")).click();

            //Clicking on the Setup            Note :  other way to find the setup (//span[text()='Setup'])[4]
            driver.findElement(By.xpath("//a[@class='nav-link ng-tns-c27-22 ng-star-inserted']")).click();

            //Clicking on the item categories
            driver.findElement(By.xpath("//span[text()='Item Categories']")).click();

            // click on the plus icon
            driver.findElement(By.xpath("//*[@class='mat-mini-fab mat-button-base mat-accent']")).click();

            String textItemCategoryName = "Techno Study";

            //creating explicit wait
            WebDriverWait wait = new WebDriverWait(driver , 20);

            // web element of name in the name of new item category
            WebElement newItemCategoryName = driver.findElement(By.xpath("//input[@id='ms-text-field-1']"));

            wait.until(ExpectedConditions.visibilityOf(newItemCategoryName));

            // type the name in the name of new item category
            newItemCategoryName.sendKeys(textItemCategoryName);

            driver.findElement(By.xpath("//mat-chip-list//input")).click();

            //find all the elements  and choose any of them(random class) then click on it




        }
    }


