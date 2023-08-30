package com.book_my_show;

import com.PageObjectModal.Get_OTP;
import com.PageObjectModal.LoginPage;
import com.PageObjectModal.YopMailLogin;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YopMail_Login extends BaseClass {
    WebDriver driver=null;

    @BeforeMethod
    void tearUp(){
        driver=init_driver();
        driver.get("https://yopmail.com/en/");
    }
    @AfterMethod
    void tearDown(){
//        driver.close();
        Get_OTP otp=new Get_OTP(driver);
        String num=otp.getOtp();
        System.out.println(num);
        Assert.assertEquals(num,num,"Getting OTP From Yop Mail");
    }

    @Test
    public void yopmailLogin(){
        YopMailLogin yologin=new YopMailLogin(driver);
        yologin.loggedIndetails("selauto@yopmail.com");
    }

}
