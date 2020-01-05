package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shortVideoLocators {
        /*
         *    ID
         *    Name
         *    Class Name
         *    Tag Name
         *    Link Text & Partial Link Text
         *    CSS Selector
         *    XPath
         *
         */

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://www.phptravels.net/en");

            driver.manage().window().maximize();

        }

    }


