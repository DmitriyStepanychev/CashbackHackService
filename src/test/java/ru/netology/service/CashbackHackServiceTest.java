package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void CashBackUnderFirstLimit() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void CashBackUpperFirstLimit() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void CashBackEqualsFirstLimit() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}