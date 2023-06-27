package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackService {
    @Test
    public void RemainTest() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(actual,expected);
    }


    @org.testng.annotations.Test
    void RemainTestIf900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }


}

}
