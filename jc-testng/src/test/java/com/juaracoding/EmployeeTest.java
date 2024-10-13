package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;

    @BeforeClass
    public void setUp(){
    employee = new Employee();
    }


     @Test
    public void testGetName(){
    employee.setName("Naomi");
    Assert.assertEquals(employee.getName(),"naomi");
     }

    @Test
    public void testGetAddres(){
    employee.setAddres("Jakarta");
    Assert.assertEquals(employee.getAddres(),"Jakarta");
    }

    @Test
    public void testGetIsActive(){
    employee.setActive(true);
    //Assert.assertTrue(employee.active(););


    }
    @Test(expectedExceptions = IllegalAccessException.class)
    public void testGetSalary(){

    }
}
