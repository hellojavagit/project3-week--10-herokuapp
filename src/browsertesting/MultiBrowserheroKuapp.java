package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
//program to open http://the-internet.herokuapp.com/ in chosen browser

public class MultiBrowserheroKuapp {
    static WebDriver driver;
    static String browser;
    static String baseUrl;

    public static void main(String[] args) {

        System.out.println("Enter your Browser");
        Scanner sc = new Scanner(System.in);
        browser = sc.nextLine();
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Please choose one of the following browsers: Chrome,Firefox,Edge ");
        }
        baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("multibrowsertomsmith@gmail.com");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //closing the driver
        driver.close();
    }
}