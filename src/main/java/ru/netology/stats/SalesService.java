package ru.netology.stats;


public class SalesService {

    public long totalSum(long[] sales) {

        long sum = 0;
        for (long i : sales) {
            sum = sum + i;
        }
        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long sum = totalSum(sales);
        return sum / 12;

    }

    public long lastMonthMaxSales(long[] sales) {
        //long last = 0;
        long maxDay = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] > sales[(int) maxDay]) {
                maxDay = sale;

                maxDay = maxDay + 1;

            }

        }

        return maxDay + 1;
    }


    public long lastMonthMinSale(long[] sales) {
        //long last = 0;
        long minDay = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] < sales[(int) minDay]) {
                minDay = sale;

                minDay = minDay + 1;

            }

        }

        return minDay;
    }


    public long quantityMaxAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        long maxIndex = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > average) {
                maxIndex++;
            }
        }

        return maxIndex;
    }


    public long quantityMinAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        long minIndex = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < average) {
                minIndex++;
            }
        }
        return minIndex;
    }
}







