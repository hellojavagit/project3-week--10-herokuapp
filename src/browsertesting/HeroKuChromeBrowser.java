package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuChromeBrowser{
    public static void main(String[] args) {
        String baseUrl ="http://the-internet.herokuapp.com/login";
        //setting up the chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 2. Launch the URL in browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        // 3.To Print  the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + title);

        //4.Prints the current URL in Console
        System.out.println("Current URL is = " + driver.getCurrentUrl());
        System.out.println();

        //5.Prints the page source
        String ps = driver.getPageSource ();
        System.out.println("Page Source is: "   +ps);

        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");
        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword! ");

        //8.Close the browser
        driver.close();
    }
}
