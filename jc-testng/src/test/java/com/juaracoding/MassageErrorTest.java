package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class MassageErrorTest {

       MassageError massageError;

       @BeforeClass
        public void setUp(){
           massageError = new MassageError();
       }

       @Test
        public void testTextMassage(){
           boolean actual = massageError.textMassage("Login Gagal");
           Assert.assertTrue(actual);
       }




}
