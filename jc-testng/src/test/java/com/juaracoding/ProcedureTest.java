package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    @BeforeClass // hanya menjalankan 1x di awal //instan objek baru di awal
    public void setUp() {
        System.out.println("Before Class");
    }

    @BeforeMethod // menjalankan sebanyak jumlah method (test), membaca scenario test, lalu melakukan test
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test (priority = 1)// memulai test setelah before method membaca scenario
    public void testOne() {
        System.out.println("Test One");
    }

    @Test (priority = 2) // priority = 2, enable = false (skip test, dari 1 langsung ke 3
    public void testTwo() {
        System.out.println("Test Two");
    }

    @Test (priority = 3)
    public void testThree() {
        System.out.println("Test Three");
    }

    @AfterMethod // menjalankan setelah method (test) dan sebanyak berapa jumlah method (test)
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass // 1x dijalankan dan di akhir
    public void afterClass() {
        System.out.println("After Class");
    }


}