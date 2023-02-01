package ru.netology.stats;

public class StatsService {

    public long getSalesSum(long[] sale) {
        long sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sale[i] + sum;

        }
        return sum;
    }

    public long getMiddleSalesSum(long[] sale) {
        long sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sale[i] + sum;
        }
        return sum / sale.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int mixSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinMiddleSalesSum(long[] sales) {
        long middleSum = getMiddleSalesSum(sales);
        int daysAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getMiddleSalesSum(sales)) {
                daysAmount++;
            }
        }
        return daysAmount;
    }

    public int getMaxMiddleSalesSum(long[] sales) {
        long middleSum = getMiddleSalesSum(sales);
        int daysAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getMiddleSalesSum(sales)) {
                daysAmount++;
            }
        }
        return daysAmount;
    }
}