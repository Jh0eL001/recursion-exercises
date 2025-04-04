/*
 * 2025-04-04.
 * Divisor Counter
 * PB| divCount(num, div) = 1     | num = 1
 * PB| divCount(num, div) = 0     | num = 0
 * PB| divCount(num, div) = 2     | num = div
 * PR| divCount(num, div) = divCount(num, div + 1) + 1 | num % div == 0
 * CC| 
 */

import java.util.Random;

public class DivisorCounter {
  public static int divCounter(int num) {
    return divCounter(num, 1);
  }

  public static int divCounter2(int num) {
    return divCounter2(num, 1);
  }

  private static int divCounter(int num, int divisor) {
    if (divisor > num)
      return 0;
    else {
      if (num % divisor == 0)
        return 1 + divCounter(num, divisor + 1);
      return divCounter(num, divisor + 1);
    }
  }

  // Metodo mas corto y limpio
  private static int divCounter2(int num, int divisor) {
    if (divisor > num)
      return 0;

    return (num % divisor == 0 ? 1 : 0) + divCounter(num, divisor + 1);
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(100) + 1;
    System.out.println(num + " tiene: " + divCounter(num) + " Divisores.");
    System.out.println(num + " tiene: " + divCounter2(num) + " Divisores.");
  }
} 