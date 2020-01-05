package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;


    public class handleDropdown {

        public static void main(String[] args) {

        /*
        Select class:

        We are handling the dropdown with select class

        how to handle it

        What are the options in the select class


        Is there any way we can not handle the dropdown with select class?


        Note: If you want to work on the select class in selenium element should have the select tag name


         */

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("http://newtours.demoaut.com/mercurywelcome.php");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("StevenGerrard");

            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");

            driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();

//start working on select class

            WebElement element = driver.findElement(By.xpath("//select[@name='passCount']"));

            Select slc = new Select(element);

            // select by index start counting from 0
            slc.selectByIndex(3);

            element  = driver.findElement(By.xpath("//select[@name='fromPort']"));

            slc = new Select(element);

            slc.selectByValue("New York");

            element = driver.findElement(By.xpath("//select[@name='fromMonth']"));

            slc = new Select(element);

            slc.selectByVisibleText("July");

            element = driver.findElement(By.xpath("  //select[@name='toPort']"));

            slc = new Select(element);

            List<WebElement> e1 = slc.getOptions();

            Random rnd = new Random();

            int randomNum = rnd.nextInt(e1.size());

            slc.selectByIndex(randomNum);

            element = driver.findElement(By.xpath("  //select[@name='toMonth']"));

            slc = new Select(element);

            e1 = slc.getOptions();

            rnd = new Random();

            randomNum = rnd.nextInt(e1.size());

            slc.selectByIndex(randomNum);

            element = driver.findElement(By.xpath("  //select[@name='airline']"));

            slc = new Select(element);

            e1 = slc.getOptions();

            rnd = new Random();

            randomNum = rnd.nextInt(e1.size());

            slc.selectByIndex(randomNum);


        }

    }
// username   StevenGerrard
// password     admin

