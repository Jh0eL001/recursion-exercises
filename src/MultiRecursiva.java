/*
 * 2025-04-02.
 * Multiplicacion con sumas sucesivas
 * PR| mult(a, b) = a + mult(a, b - 1) | b > 1
 * PB| mult(a, b) = 0     | b = 0
 * PB| mult(a, b) = a     | b = 1
 * CC| 
 */

import java.util.Random;

public class MultiRecursiva {

  public static int mult(int a, int b) {
    if (b == 0) 
      return 1;
    else if ( b == 1)
      return a;
    else 
      return a + mult(a, b - 1);
  }
  public static void main(String[] args) {
    Random rand = new Random();
    int a = rand.nextInt(50);
    int b = rand.nextInt(50);
    System.out.println(a + " X " + b + " = " + mult(a, b) );
  }
}