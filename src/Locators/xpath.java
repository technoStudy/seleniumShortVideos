package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {

        /*
        *    XPath
         *
         *          absolute xpath vs relative xpath (single slash vs double slash)
         *
         *          absolute xpath : finding an absolute location of the element
         *  but if the html code is changed then this xpath will not work.
         *
         *          absolute xpath is using single slash "/"
         *
         *              absolute xpath sample : //*[@id="sidebar"]/aside[1]/ul/li[1]/a
         *
         *           relative xpath : you can start finding from the middle of
         *      the page even though html change this relative xpath will work.
         *
         *          relative xpath is using double slash "//"
         *
         *
         *          relative xpath types:
         *              basic xpath
         *              Contains
         *              Text()
         *              parent Child
         *              child parent
         *              following-sibling::
         *              preceding-sibling::
         *
         */

        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        driver.get( "https://demoqa.com/accordion/" );

        driver.manage().window().maximize();

        /*
         basic xpath

         sample : //div[@role='complementary']
         */

        /*
         Text()
            //a[text()='Sortable']
         */
        driver.findElement( By.xpath("//a[text()='Sortable']") ).click();

        /*
        *   Contains
        *
        * //a[text()='Automation Practice Swi']
        * //a[contains(text(),'Automation Practice Sw')]
        * //h1[contains(@class,'title')]
         */
        driver.findElement( By.xpath( "//a[contains(text(),'Automation Practice Sw')]" ) ).click();

        /*
        *   parent-child : //div[@id='content']//div
         */

        /*
            child-parent : //h1[contains(@class,'entry')]/parent::div

            //h6[text()='Adults  (3)']/parent::div//strong
         */

        /*
            following-sibling::

            //h6[text()='Adults  (3)']/following-sibling::strong this will not work
            //h6[contains(text(),'Adults')]/following-sibling::strong this will work
         */

         /*
           preceding-sibling::

           //a[contains(text(),'Tours')]/parent::li/preceding-sibling::li
          */
    }
}


