package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

        Login login;

        @BeforeClass
        public void setUp(){
            login = new Login();
        }


        //test menggunakan boolean
        //test login postitif
//        @Test
//        public void testLoginValid(){
//        Assert.assertTrue(login.loginUser("admin", "password"));
//        }
//
//        //test login negatif
//
//        @Test
//        public void testLogiInnValid(){
//        Assert.assertFalse(login.loginUser("4dmin", "p4ssword"));
//        }


        //test menggunakan String

    //test login postitif
    @Test
    public void TestLoginValid(){
    String actual = login.loginUser("admin", "password");
    String expected = "Login Berhasil";
    Assert.assertEquals(actual,expected);
    }

    //test login negatif
    @Test
    public void TestLoginInvalid(){
    String actual = login.loginUser("4dmin", "p4ssword");
    String expected = "Login Tidak Berhasil";
    Assert.assertEquals(actual,expected);
    }





}
