package com.cybertek.SeleniumUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) throws IllegalArgumentException {
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        }else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();
        }else{
            throw new IllegalArgumentException("Wrong browser try it again");
        }
    }
}