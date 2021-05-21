package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        //1. OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chrome driver/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();


        //2. NAVIGATE TO THE URL
               driver1.get("https://opensource-demo.orangehrmlive.com/");

        //Maximize the chrome browser
        //driver1.get("https://www.google.com");
        driver1.manage().window().maximize();

        //Enter a valid username
        driver1.findElement(By.id("txtUsername")).sendKeys("Admin");

        //Enter a valid password
        driver1.findElement(By.name("txtPassword")).sendKeys("admin123");

        //Click on Login
        driver1.findElement(By.id("btnLogin")).click();

        //Verify the URL
        String act_url= driver1.getCurrentUrl();
        System.out.println(act_url);
        //Verify Compare
        String desired_url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        if (act_url.equals(desired_url))

        {
         System.out.println("Passed");

        }
        else  {

              System.out.println("Failed");

        }

        //Verify the Title
        String act_title=driver1.getTitle();
        System.out.println(act_title);
        String desired_title="OrangeHRM";

        if (act_title.equals(desired_title))

        {
            System.out.println("Passed");

        }
        else  {

            System.out.println("Failed");

        }
        //Get the page source
        String ps=driver1.getPageSource();
        System.out.println(ps);
        //Close the browser
        driver1.close();



        //[By ID]
        //     driver1.findElement(By.id("search_query_top")).sendKeys("T-shirts");
        //OR
        //    WebElement search=driver1.findElement(By.id("search_query_top"));
        //     search.sendKeys("T-shirts");

        //[By name]
        //    driver1.findElement(By.name("search_query")).sendKeys("Shirts");


    }
}
