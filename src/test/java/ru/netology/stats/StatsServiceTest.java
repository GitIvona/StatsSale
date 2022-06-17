package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actial);
    }

    @Test
    public void shouldAvg() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.avg(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actial);
    }

    @Test
    public void aboveAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.aboveAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actial);
    }

    @Test
    public void belowAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.belowAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actial);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actial = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actial);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actial = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actial);
    }


}
