/*
 * 2025-04-02.
 * Factorial
 * PR| fact(n) = 1 | n = 0
 * PB| fact(n) = fact(n - 1) * n | n > 0
 * CC| n >= 0 enteros positivos. 
 */

import java.util.Random;

public class Factorial {

  public static long fact(int num) {
    // solo enteros positivos.
    if (num == 0)
      return 1;
    else
      return fact(num - 1) * num;

  }

  public static void main(String[] args) {
    Random rand = new Random(); 
    int number = rand.nextInt(20);

    System.out.println("El factorial de " + number + " es: " + fact(number));
  }
}
