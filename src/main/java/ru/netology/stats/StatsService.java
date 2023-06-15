package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale = allSale + sale;
        }
        return allSale;

    }

    public long average(long[] sales) {
        long allSale = sum(sales);
        long averageSale = sum(sales) / sales.length;

        return averageSale;
    }


    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }


    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }


    public int mBelAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales); // теперь сравнение только с этой переменной,
        // подсчет будет один раз

        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;

            }
        }
        return count;
    }


    public int mAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;

            }
        }
        return count;
    }
}