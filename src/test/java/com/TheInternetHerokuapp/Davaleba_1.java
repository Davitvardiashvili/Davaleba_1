package com.TheInternetHerokuapp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Davaleba_1 {
    @Test
    public void davaleba_1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/DADA.VARDO-PC/Desktop/chromedriver/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        TimeUnit.SECONDS.sleep(2);

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a")).click();
        TimeUnit.SECONDS.sleep(2);

        WebElement email = driver.findElement(By.id("email"));

        email.sendKeys("Dato.vardiashvili2001@gmail.com");

        driver.findElement(By.id("form_submit")).click();
        TimeUnit.SECONDS.sleep(2);

        driver.quit();
    }
}
