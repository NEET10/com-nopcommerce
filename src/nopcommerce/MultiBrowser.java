package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static  String browser = "Edge";
    static WebDriver driver;
    static  String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        //Open the URL into Browser
        driver.get(baseUrl);
        //Get the Title of the page
        System.out.println(driver.getTitle());
        //Get the current URL
        System.out.println("Current URL : "+ driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source : "+ driver.getPageSource());
        //Find the Email field Element
        driver.findElement(By.id("Email")).sendKeys("saregamapa@gmail.com");
        //Find the password field Element
        driver.findElement(By.name("Password")).sendKeys("saregamapa123");
        //Close the Browser
        //driver.close();
    }


}
