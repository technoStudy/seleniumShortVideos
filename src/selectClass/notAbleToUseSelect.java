package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class notAbleToUseSelect {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://www.amazon.com/Graco-Tranzitions-Harness-Booster-Proof/dp/B07C2RNRCJ/ref=sr_1_1_sspa?crid=3U5BI4UCRGIY6&keywords=car+seat&qid=1577722477&sprefix=car+%2Caudible%2C142&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExNzY4NVFGMkFZTVg0JmVuY3J5cHRlZElkPUEwMzI2MDI1MTNXNlRZTE9RWFRLQSZlbmNyeXB0ZWRBZElkPUEwNzY2OTc4M0VWSEVKVlVZT1JTSyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");

            driver.manage().window().maximize();

            WebElement e1 = driver.findElement(By.xpath("//span[text()='Qty:']"));

            Select s1= new Select(e1);

            s1.selectByIndex(6);


        }

    }


