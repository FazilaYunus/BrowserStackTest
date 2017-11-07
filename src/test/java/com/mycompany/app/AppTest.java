package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class AppTest {

    @Test
    public void myTest() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        //capability.setCapability("browserstack.local", true);

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capability
        );

        driver.get("https://www.google.co.uk/");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
