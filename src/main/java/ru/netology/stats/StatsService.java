package ru.netology.stats;


public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int x = 0; x < sales.length; x++) {
            if (sales[x] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж ,больше
                maxMonth = x; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales)  {  // метод определения общей суммы продаж за все месяцы
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int middleSumSales(long[] sales)  { // метод определения среднестатистической  суммы продаж за один месяц
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int middleSum = sum/12;
        return middleSum;
    }

    public int lowMiddleSumSales(long[] sales)  { // метод определения количества месяцев с продажами ниже стреднестат.
        int quantity =0;
        int middle = middleSumSales (sales);

            for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                quantity = quantity +1;
            }
        }
                return quantity;
    }

    public int HighMiddleSumSales(long[] sales)  {  // метод определения количества месяцев с продажами выше стреднестат.
        int quantity =0;
        int middle = middleSumSales (sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                quantity = quantity +1;
            }
        }
        return quantity;
    }


}






