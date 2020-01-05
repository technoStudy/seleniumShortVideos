package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class tableSelenium {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://en.wikipedia.org/wiki/Dell");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;

            /*
             *   What is table
             *
             *   tr is row
             *
             *   td is column
             *
             */

            int rowCount = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr")).size();

            for(int i = 1 ; i <= rowCount ; i++){

                int columnCount = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+i+"]//td")).size();

                for(int j = 1 ; j <= columnCount ; j++){

                    String text = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+i+"]//td["+j+"]")).getText();

                    System.out.println(text);

                }
            }

            for(int i = 1 ; i <= rowCount ; i++){

                String textSecondRow = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+i+"]//td[2]")).getText();

                String expectedText = "August 2011";

                if(textSecondRow.equals(expectedText)){

                    driver.findElement(By.xpath("//td[text()='"+expectedText+"']/following-sibling::td[2]//a")).click();
                }
            }

        }
    }

