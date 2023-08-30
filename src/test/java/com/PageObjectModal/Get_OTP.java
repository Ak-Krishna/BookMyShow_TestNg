package com.PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Get_OTP {
    public WebDriver driver=null;
    public Get_OTP(WebDriver driver){
        this.driver=driver;
        driver.navigate().refresh();
    }
    public static final By TXT_OTP=By.xpath("(//table)[7]//tr/td");

    public String getOtp(){
        driver.switchTo().frame("ifmail");
        return driver.findElement(TXT_OTP).getText();
    }
}
