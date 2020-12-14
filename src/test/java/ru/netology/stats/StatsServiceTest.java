package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void findPurchaseSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.findSum(purchases);
        int expected = 180;

        assertEquals(expected, sum);
    }

    @Test
    void findAverageValue() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = service.findSum(purchases) / 12;
        int expected = 15;

        assertEquals(expected, average);

    }

    @Test
    void findMaxPurchaseMonth() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findPurchaseMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMinPurchaseMonth() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findPurchaseMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthLowerAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findLowerAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthHigherAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findHigherAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

}
