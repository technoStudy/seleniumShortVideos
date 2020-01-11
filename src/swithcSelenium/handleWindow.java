package swithcSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handleWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        /*
        *       if you open new window you need to switch to new one otherwise driver will not see the second window elements
         */

//        get the first window
        String firstWin = driver.getWindowHandle();

//        clicking on click here button
        WebElement buttonClickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));

        buttonClickHere.click();

//        get all the window in the set
       Set<String> windowAllWindows =  driver.getWindowHandles();

//       switch to window
       for(String window :windowAllWindows){

           driver.switchTo().window(window);

       }

//       input email id and type something in that input
        WebElement inputEmailID = driver.findElement(By.xpath("//input[@name='emailid']"));

        inputEmailID.sendKeys("somepne@gmail.com");

//        Clicking on the submit button
        WebElement buttonSubmit = driver.findElement(By.xpath("//input[@type='submit']"));

        buttonSubmit.click();

        System.out.println(driver.getCurrentUrl());
//        verify title as expected
        try {
            Assert.assertEquals("Guru99 Bank Home Page", driver.getTitle());

            System.out.println("Title as expected ");
        }catch(Exception e){

            System.out.println(e.getMessage());
        }

        driver.close();

//        switch to first window    note : firstWin is coming from line 33
        driver.switchTo().window(firstWin);

        System.out.println(driver.getCurrentUrl());

        /*
        *       driver.close()  vs driver.quit
        *
        *           driver.close is closing the current window
        *
        *           driver.quit is closing all the browser
        *
        *
         */



    }


}
