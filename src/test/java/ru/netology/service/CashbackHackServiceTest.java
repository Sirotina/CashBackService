package ru.netology.service;

import static org.testng.Assert.*;



public class CashbackHackServiceTest {



    @org.testng.annotations.Test
    public void RemainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
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


}

