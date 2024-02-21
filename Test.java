package Akash_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
        public static void main (String[]args) throws InterruptedException {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new EdgeDriver();

            // Open the website
            driver.get("https://www.saucedemo.com/");

            // Find an element by its ID and interact with it
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

            driver.findElement(By.xpath("//button[@id='checkout']")).click();
            driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("AAAA");
            driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("AAAA");
            driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123");
            driver.findElement(By.xpath("//input[@id='continue']")).click();

            driver.findElement(By.xpath("//button[@id='finish']")).click();

            String Message = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")).getText();
            System.out.println(Message);


            // Wait for a few seconds (you might want to use WebDriverWait for more robust waiting)
            Thread.sleep(3000);
            // Close the browser window
        driver.quit();

        }
    }

