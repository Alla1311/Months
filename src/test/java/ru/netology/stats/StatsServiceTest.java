package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void getSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSalesSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void getMiddleSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMiddle = 15;
        long actualMiddle = service.getMiddleSalesSum(sales);
        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void mixSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.mixSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void getMinMiddleSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMiddle = 5;
        long actualMinMiddle = service.getMinMiddleSalesSum(sales);
        Assertions.assertEquals(expectedMinMiddle, actualMinMiddle);
    }

    @Test
    public void getMaxMiddleSalesSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMiddle = 0;
        long actualMaxMiddle = service.getMaxMiddleSalesSum(sales);
        Assertions.assertEquals(expectedMaxMiddle, actualMaxMiddle);
    }
}