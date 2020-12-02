package com.TheInternetHerokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Davaleba_1 {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }
    @After
    public void teardown() {
            driver.quit();
    }

    @Test
    public void test() {
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a")).click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Dato.vardiashvili2001@gmail.com");
        driver.findElement(By.id("form_submit")).click();
    }
}

