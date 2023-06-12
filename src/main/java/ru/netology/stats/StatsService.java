package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int allSale = 0;
        for (int sale : sales) {
            allSale = (int) (allSale + sale);
        }
        return allSale;

    }

    public int average(int[] sales) {
        int allSale = 0; // int allSale = sum(sales);
        for (int sale : sales) {
            allSale = (int) (allSale + sale);
        }
        int averageSale = allSale / 12; // sum(sales) / 12;

        return averageSale;
    }


    public int monthMaxSale(int[] sales) {
        int monthMax = 0;
        int saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }


    public int monthMinSale(int[] sales) {
        int monthMin = 0;
        int saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }


    public int mBelAverage(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale < average(sales)) {
                count++;

            }
        }
        return count;
    }


    public int mAboveAverage(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale > average(sales)) {
                count++;

            }
        }
        return count;
    }
}