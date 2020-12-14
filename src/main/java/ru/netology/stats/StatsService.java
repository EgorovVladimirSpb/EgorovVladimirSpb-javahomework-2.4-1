package ru.netology.stats;

public class StatsService {

    public static void main(String[] args) {

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = findSum(purchases);
        System.out.println("Количество продаж: " + sum + " штук");

        int average = findAverage(purchases);
        System.out.println("Средняя сумма продаж в месяц: " + average + " штук");


        int findPurchaseMax = findPurchaseMax(purchases);
        System.out.println("Максимум продаж пришелся на: " + findPurchaseMax + " месяц");

        int findPurchaseMin = findPurchaseMin(purchases);
        System.out.println("Минимум продаж пришелся на: " + findPurchaseMin + " месяц");

        int findLowerAverage = findLowerAverage(purchases);
        System.out.println("Продажи ниже среднего значения были в: " + findLowerAverage + " месяцах");

        int findHigherAverage = findHigherAverage(purchases);
        System.out.println("Продажи выше среднего значения были в: " + findHigherAverage + " месяцах");

    }

    public static int findSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public static int findAverage(int[] purchases) {
        return findSum(purchases) / 12;
    }

    public static int findPurchaseMax(int[] purchases) {
        int purchaseMax = purchases[0];
        int month = 0;
        int monthMax = 0;

        for (int purchase : purchases) {
            month = month + 1;

            if (purchaseMax <= purchase) {
                purchaseMax = purchase;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public static int findPurchaseMin(int[] purchases) {
        int purchaseMin = purchases[0];
        int month = 0;
        int monthMin = 0;

        for (int purchase : purchases) {
            month = month + 1;

            if (purchaseMin >= purchase) {
                purchaseMin = purchase;
                monthMin = month;
            }
        }
        return monthMin;

    }

    public static int findLowerAverage(int[] purchases) {
        int average = findAverage(purchases);
        int month = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month = month + 1;
            }
        }
        return month;
    }

    public static int findHigherAverage(int[] purchases) {
        int average = findAverage(purchases);
        int month = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month = month + 1;
            }
        }
        return month;
    }


}
