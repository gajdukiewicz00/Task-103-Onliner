package com.onliner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;


public class Addtion  {
    private final static String URL = "https://www.onliner.by/";
    HomePage HOMEPage;
    private WebDriver driver;

    @Before
    public void openTest() {
        HOMEPage = new HomePage(driver);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void closeTest() {
        driver.quit();
    }
}