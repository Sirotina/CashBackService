package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackService {
    @org.testng.annotations.Test

    public void RemainTest() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test

    public void RemainTestIf900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }


}


