package com.selenium.org;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.youtube.com/");
        driver.get("https://ection.tv/");
//        driver.get("https://www.guru99.com/selenium-tutorial.html");
//        driver.findElement(By.xpath("Search Google or type a URL")).sendKeys("you tube");
//        driver.findElement(By.xpath("Search Google or type a URL")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(100,800)", "");
//        Thread.sleep(5000);
//        js.executeScript("window.scrollBy(0,-800)", "");

//        driver.close();
//        driver.quit();
    }
}
