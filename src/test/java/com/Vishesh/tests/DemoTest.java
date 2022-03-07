package com.Vishesh.tests;

import com.Vishesh.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    // local,remote(selenoid,browserstack) : chrome,firefox
    @Test
    public void testLogin(){
        FrameworkConfig config=ConfigFactory.create(FrameworkConfig.class);
        config.browser();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
}
