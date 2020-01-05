package findElementVsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class elementVsElements {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            WebDriver driver;

            driver = new ChromeDriver();

            driver.get("https://test-basqar.mersys.io/");

            /*
             *   Find element vs Find Elements
             *
             *       Find Element:
             *           1) Find element is finding one element
             *           2) If there is no element in the page then find element will throw an error
             *           3) Find element will click on the first element
             *
             *       Find Elements:
             *           1) Find elements is finding multiple elements
             *           2) If there is no element in the page then find elements will NOT throw an error
             *
             *
             */

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            String usernameAndPassword = "admin";

            WebElement username = driver.findElement(By.xpath("//input[@formcontrolname='username']"));

            WebElement password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));

            username.sendKeys(usernameAndPassword);

            password.sendKeys(usernameAndPassword);

            WebElement buttonLogin = driver.findElement(By.xpath("//button[@aria-label='LOGIN']"));

            buttonLogin.click();

            // click on the inventory
            WebElement buttonInventory = driver.findElement(By.xpath("//span[text()='Inventory']"));

            buttonInventory.click();

            // clicking on the setup which is under the inventory
            WebElement buttonSetup = driver.findElement(By.xpath("//span[@class='nav-link-title ng-tns-c27-22 ng-star-inserted']"));

            buttonSetup.click();

            // click on item categories
            WebElement textItemCategory = driver.findElement(By.xpath("//span[text()='Item Categories']"));

            textItemCategory.click();

            int buttonDeleteSize = driver.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).size();

            for(int i =0 ; i<buttonDeleteSize ; i++){

                By textFirstElement = By.xpath("//table//tbody//tr[1]//td[2]");

                String firstText = driver.findElement(textFirstElement).getText();

                // All the delete  buttons are here
                List<WebElement> buttonsAllDelete = driver.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']"));

                buttonsAllDelete.get(0).click();

                WebElement buttonYes= driver.findElement(By.xpath("//span[text()=' Yes ']"));

                buttonYes.click();

                WebDriverWait wait=new WebDriverWait(driver,20);

                //first option for the text in the table  --> //td[@class='mat-cell cdk-column-name mat-column-name ng-star-inserted']
                //second option for the text in the table --> //table//tbody//tr[1]//td[2]

                // locator then text
                wait.until(ExpectedConditions.invisibilityOfElementWithText(textFirstElement,firstText));

                //Thread.sleep(3000);
            }

            buttonDeleteSize = driver.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).size();

            if(buttonDeleteSize==0){
                System.out.println("Success");
            }else{

                System.out.println("Fail");
            }

        }

    }


