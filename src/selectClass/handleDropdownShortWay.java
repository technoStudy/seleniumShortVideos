package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

    public class handleDropdownShortWay {


        public static void main(String[] args) {

        /*
        this code is same as handleDropdown class but it is shorter

         */


            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("http://newtours.demoaut.com/mercurywelcome.php");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("StevenGerrard");

            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");

            driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();

            WebElement element = driver.findElement(By.xpath("//select[@name='passCount']"));

            clickByRandom(element);

            element  = driver.findElement(By.xpath("//select[@name='fromPort']"));

            clickByRandom(element);

            element = driver.findElement(By.xpath("//select[@name='fromMonth']"));

            clickByRandom(element);

            element = driver.findElement(By.xpath("  //select[@name='toPort']"));

            clickByRandom(element);

            element = driver.findElement(By.xpath("  //select[@name='toMonth']"));

            clickByRandom(element);

            element = driver.findElement(By.xpath("  //select[@name='airline']"));

            clickByRandom(element);

            driver.findElement(By.xpath("//input[@name='findFlights']")).click();
        }

        public static void clickByRandom(WebElement element){

            Select s1 = new Select(element);

            List<WebElement> e1 = s1.getOptions();

            Random rnd = new Random();

            int randomNum = rnd.nextInt(e1.size());

            s1.selectByIndex(randomNum);

        }



    }


