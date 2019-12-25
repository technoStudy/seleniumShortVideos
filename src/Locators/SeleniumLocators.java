package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

    public static void main(String[] args) throws InterruptedException {

            System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );

            WebDriver driver = new ChromeDriver();

            driver.get( "https://ultimateqa.com/blog-old/" );

            driver.manage().window().maximize();


         /*
         *  Locators:
         *      Why we need a locators
         *
         *       Id
         *       Name
         *       Class Name
         *       Tag Name
         *       LinkText - partial link text
         *
         *      next videos:
         *       XPath.
         *       CSS.
         *
         */

        /*
            id is always unique
         */
        driver.findElement( By.id( "searchsubmit" ) ).click();

        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();

        /*
             Name
         */
        driver.findElement( By.name( "jetpack_subscriptions_widget" ) ).click();

        /*
            Class Name
         */
        driver.findElement( By.className( "bump-view" ) ).click();

        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();

        /*
           Tag Name
         */

        driver.findElement( By.id( "searchsubmit" ) ).click();

        int count = driver.findElements( By.tagName( "input" ) ).size();

        System.out.println(count);

        /*
        *   LinkText
         */

        driver.findElement( By.linkText( "How to fix common Selenium errors?" ) ).click();

        System.out.println(driver.getCurrentUrl());

        driver.findElement( By.linkText( "Automation Exercises" ) ).click();
        /*
        *   partial-linktext
         */
           driver.findElement( By.partialLinkText( "Fake Landing" ) ).click();



    }
}
