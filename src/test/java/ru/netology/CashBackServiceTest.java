package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackService {

    @org.junit.Test
    public void RemainTest() {
        CashBackService service = new CashBackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void RemainTestIf900() {
        CashBackService service = new CashBackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected,actual);
    }


}