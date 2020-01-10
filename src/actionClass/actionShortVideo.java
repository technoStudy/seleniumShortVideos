package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class actionShortVideo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        /*
        *       Action class
        *
        *       What is action class
        *
        *           Mouse Events:
        *
        *               Hover over
        *
        *               Drag and drop
        *
        *
         */

//        menu home & living object is created
        WebElement menuHomeAndLiving = driver.findElement(By.xpath("//span[contains(text(),'Home & Living')]"));

//        create an action object
        Actions action = new Actions(driver);

//        hover over on top of the menu home and living
        action.moveToElement(menuHomeAndLiving).perform();

        Thread.sleep(1000);

//        getting all the menu elements inside the list
        List<WebElement> allMenuBar = driver.findElements(By.xpath("//li[@data-linkable='true']"));

        System.out.println(allMenuBar.size());

//        hover over to the elements one by one in the menu
        for(int i = 0 ; i< allMenuBar.size() ; i++){

            action.moveToElement(allMenuBar.get(i)).perform();

            Thread.sleep(1000);

        }





    }

}


//   http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html