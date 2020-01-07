package table;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableOfficeHour {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://test-basqar.mersys.io/");

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
        WebElement buttonStudent = driver.findElement(By.xpath("//span[text()='Student']"));

        buttonStudent.click();

        driver.findElement(By.xpath("//span[text()='Students']")).click();

    /*

    *   What is table
    *
    *       thead has all the column means, what is the data .
    *      tbody has all the data
    *
    *       tr is row
    *
    *       td is column

            css selector --> table tbody tr:nth-child(2) td:nth-child(3)

            xpath -> //table//tbody//tr[2]//td[3]
     *

     *
     *
    *  Print the all the full names from the table
    *
    *       Anne Enright class student id, gender status
    *
     */

//    List<WebElement> listFullName =  driver.findElements(By.xpath("//table//tbody//td[2]"));

        String expectedName = "Anne Enright";

        List<WebElement> listFullName = driver.findElements(By.cssSelector("table tbody td:nth-child(2)"));

        List<WebElement> listPersonalID = driver.findElements(By.cssSelector("table tbody td:nth-child(3)"));

        List<WebElement> listStudentID = driver.findElements(By.cssSelector("table tbody td:nth-child(4)"));

        List<WebElement> listClass = driver.findElements(By.cssSelector("table tbody td:nth-child(5)"));

        String expectedPID = "669588545521";

        String expectedSID = "8854751";

        String expectedClass= "Class 8A";

        for(int i = 0 ; i<listFullName.size() ; i++){

            String name = listFullName.get(i).getText();

            if(name.equals(expectedName)){

                String pID = listPersonalID.get(i).getText();

                String sID = listStudentID.get(i).getText();

                String clasNum = listClass.get(i).getText();

                Assert.assertEquals(expectedPID,pID);
                Assert.assertEquals(expectedSID,sID);
                Assert.assertEquals(expectedClass,clasNum);

                System.out.println("done");
            }
        }

        // print all the values from the table

        for(int i = 0 ; i<listFullName.size() ; i++){

                String pID = listPersonalID.get(i).getText();

                String sID = listStudentID.get(i).getText();

                String clasNum = listClass.get(i).getText();

            System.out.println(pID);
            System.out.println(sID);
            System.out.println(clasNum);


        }
//          if you are getting the data from the website directly int i should start from the 1
//        for(int i =1 ; i<10 ; i++){
//
//            String name = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]")).getText();
//
//            System.out.println(name);
//        }

        System.out.println("done");
     }


    }
