package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

  public class StatsServiceTest {

      @Test
      public void shouldFindMinSalesMonth() {
          StatsService service = new StatsService();

          long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

          int expectedMonth = 9;
          int actualMonth = service.minSales(sales);

          Assertions.assertEquals(expectedMonth, actualMonth);
      }

      @Test
      public void shouldFindMaxSalesMonth() {
          StatsService service = new StatsService();

          long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

          int expectedMonth = 8;
          int actualMonth = service.maxSales(sales);

          Assertions.assertEquals(expectedMonth, actualMonth);
      }

      @Test
      public void shouldFindSumSalesAllMonth() {
          StatsService service = new StatsService();

          long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

          int expectedSum = 180;
          int actualSum = service.sumSales(sales);

          Assertions.assertEquals(expectedSum, actualSum);

      }

     @Test
      public void shouldFindMiddleSumSalesAMonth() {
          StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

         int expectedSum = 15;
         int actualSum = service.middleSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

      }
      @Test
      public void shouldFindLowMiddleSumSales() {
          StatsService service = new StatsService();

          long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

          int expectedQuan = 5;
          int actualQuan = service.lowMiddleSumSales(sales);

          Assertions.assertEquals(expectedQuan, actualQuan);

      }

      @Test
      public void shouldFindHighMiddleSumSales() {
          StatsService service = new StatsService();

          long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

          int expectedQuan = 5;
          int actualQuan = service.HighMiddleSumSales(sales);

          Assertions.assertEquals(expectedQuan, actualQuan);

      }


  }