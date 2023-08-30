package com.book_my_show;

import com.PageObjectModal.LoginPage;
import com.PageObjectModal.YopMailLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookMyShow_Login extends BaseClass {
    WebDriver driver=null;

    @BeforeMethod
    void tearUp(){
        driver=init_driver();
        driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
    }
    @AfterMethod
    void tearDown(){
//        driver.close();
    }

    @Test
    public void verifyLogin(){
        LoginPage loginpage=new LoginPage(driver);
        loginpage.loggedIn("selauto@yopmail.com");
    }


}
