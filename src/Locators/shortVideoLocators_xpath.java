package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class shortVideoLocators_xpath {
        public static void main(String[] args) throws Exception {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://www.phptravels.net/en");

            driver.manage().window().maximize();

            /*
             *    Absolute xpath vs relative xpath
             *
             *       absolute xpath sample -->  /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input
             *
             *       relative xpath sample --> //input[@type='image']
             *
             *       difference between absolute vs relative xpath
             *
             *       absolute xpath
             *               location of the element start from top to element and it may change in the run time
             *
             *               absolute xpath has a single slash
             *
             *       relative xpath
             *               if the element visible while running it will find the element
             *
             *               relative xpath has double slash
             *
             *
             *   relative xpath type
             *
             *       basic xpath - what is xpath
             *         //a[@title='Log in to your customer account']
             *         //span[@class='shop-phone']
             *
             *       text
             *          //a[text()='REGISTER']
             *          //a[text()='Women']
             *
             *       contains
             *          //a[contains(text(),'Sign')]
             *          //div[contains(@id,'contact')]
             *
             *
             *       parent to child
             *
             *
             *
             *       child to parent
             *
             *       following-sibling
             *
             *       preceding-sibling
             */





        }
    }



