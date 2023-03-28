package ru.topce.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldRemain1000IfAmount0() {

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRemain400IfAmount600() {

        int amount = 600;
        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRemain100IfAmount900() {

        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRemain0IfAmount1000() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}