package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //launch the Chrome Browser//Set up Chrome browser
        WebDriver driver =new ChromeDriver(); // WebDriver is responsible for opening the browser
        //open the URL into Browser
        driver.get(baseUrl);
        //Print the  Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        System.out.println("Current URL : "+ driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source: "+ driver.getPageSource());
        //Find the Email field Element
        driver.findElement(By.id("Email")).sendKeys("saregamapa@gmail.com");
//        WebElement emailField = driver.findElement(By.id("Email"));
//        emailField.sendKeys("neetgabani@gmail.com");
        //Find the password Field Element and Type the password
        driver.findElement(By.name("Password")).sendKeys("saregamapa123");
        //Close the Browser
       // driver.close();




    }
}

