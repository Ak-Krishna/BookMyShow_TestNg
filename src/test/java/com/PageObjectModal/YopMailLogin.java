package com.PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YopMailLogin {
    public static WebDriver driver;

    public YopMailLogin(WebDriver driver){
        this.driver=driver;
    }

    public static final By TXT_EMAIL=By.id("login");
    public static final By BTN_CONTINUE=By.xpath("//button/i");

    private YopMailLogin enter_yMail(String yopMail){
        driver.findElement(TXT_EMAIL).sendKeys(yopMail);
        return this;
    }
    private YopMailLogin clickLogin(){
        driver.findElement(BTN_CONTINUE).click();
        return new YopMailLogin(driver);
    }

    public void loggedIndetails(String s) {
        enter_yMail(s).
        clickLogin();
    }
}
