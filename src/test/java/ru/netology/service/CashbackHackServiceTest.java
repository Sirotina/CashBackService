package ru.netology.service;

import static org.testng.Assert.*;



public class CashbackHackServiceTest {



    @org.testng.annotations.Test
    public void RemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void RemainTestIf900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void RemainTestIf0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void RemainTestIf1750() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1750;
        int actual = service.remain(amount);
        int expected = 250;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void RemainTestIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }



}

