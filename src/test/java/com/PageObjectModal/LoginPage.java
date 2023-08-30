package com.PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static WebDriver driver = null;

    //Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Getting All locators
//    private static final By CITY_NAME = By.xpath("//img[@alt='BANG']");
    private static final By BTN_SIGNIN = By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']");
    private static final By BTN_EMAIL = By.xpath("(//span[@class='bwc__sc-dh558f-12 dLwbjU'])[2]");
    private static final By TXT_EMAIL = By.id("emailId");
    private static final By BTN_CONTINUE = By.xpath("//button");

    //Methods for every Action
//    private LoginPage  click_city() {
//     driver.findElement(CITY_NAME).click();
//     return new LoginPage(driver);
//    }
    private LoginPage  click_signIn() {
        driver.findElement(BTN_SIGNIN).click();
        return new LoginPage(driver);
    }
    private LoginPage  click_emailBtn() {
        driver.findElement(BTN_EMAIL).click();
        return new LoginPage(driver);
    }
    private LoginPage  enterEmail(String email) {
        driver.findElement(TXT_EMAIL).sendKeys(email);
        return new LoginPage(driver);
    }
    private LoginPage  click_continueBtn() {
        driver.findElement(BTN_CONTINUE).click();
        return new LoginPage(driver);
    }

    //All Method are connected by Method Chaining
    public void loggedIn(String email){
        click_signIn().click_emailBtn().enterEmail(email).click_continueBtn();
    }







}
