package com.book_my_show;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseClass {
   public static   WebDriver driver;

   public static WebDriver init_driver() {
      driver = new ChromeDriver();
//      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000l));
      return driver;
   }
}
