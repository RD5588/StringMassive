package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {


    @Test
    public void shouldTotalSum() {
        SalesService service = new SalesService();
        long[] sales = new long[]{8, 15, 13, 22, 17, 20, 19, 1, 7, 14, 14, 18};
        long expected = 168;
        long actual = service.totalSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSalesAmount() {
        SalesService service = new SalesService();
        long[] sales = new long[]{8, 15, 13, 22, 17, 20, 19, 1, 7, 14, 14, 18};
        long expected = 14;
        long actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLastMonthMaxSales() {
        SalesService service = new SalesService();
        long[] sales = new long[]{8, 15, 13, 22, 17, 20, 22, 16, 7, 14, 14, 1};
        long expected = 7;
        long actual = service.lastMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldLastMonthMinSale() {
        SalesService service = new SalesService();
        long[] sales = new long[]{8, 15, 1, 22, 17, 20, 22, 16, 7, 14, 14, 1};
        long expected = 12;
        long actual = service.lastMonthMinSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMaxAverage() {
        SalesService service = new SalesService();
        long[] sales = new long[]{2, 5, 3, 4, 7, 12, 15, 43, 37, 25, 21, 18};
        long expected = 5;
        long actual = service.quantityMaxAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMinAverage() {
        SalesService service = new SalesService();
        long[] sales = new long[]{2, 5, 3, 4, 7, 12, 15, 43, 37, 25, 21, 18};
        long expected = 7;
        long actual = service.quantityMinAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
