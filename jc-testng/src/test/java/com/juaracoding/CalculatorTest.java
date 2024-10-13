package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

        Calculator calculator;

        @BeforeClass
        public void setUp(){
            calculator = new Calculator();
        }

        @Test
        public void add(){
            int actual = calculator.add(10, 5);
            int expected = 15;
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void subTrack(){
            int actual = calculator.subTrack(10, 5);
            int expected = 5;
            Assert.assertEquals(actual, expected);
        }

}
