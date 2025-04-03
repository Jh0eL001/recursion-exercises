/*
 * 2025-04-02.
 * ExerciseName
 * PB| division(num, divisor) = 0    | num < divisor
 * PR| division(num, divisor) = division(num - divisor, divisor)    | num > divisor
 * CC|  n pertenece a los enteros+  divisor > 0;
 */

import java.util.Random;

public class DivisionConRestas {
  public static int division(int numero, int divisor) {
    if (numero < divisor)
      return 0;
    else
      return 1 + division(numero - divisor, divisor);
  }

  /**
   * The main method demonstrates the use of the `division` method to calculate
   * the division of two integers using subtraction. It uses `System.out.printf`
   * to format and print the output without concatenation.
   *
   * Syntax explanation for `printf`:
   * - `%d`: Placeholder for integers.
   * - `%n`: Inserts a newline character.
   * 
   * Common format specifiers:
   * - `%s`: String.
   * - `%f`: Floating-point number.
   * - `%c`: Character.
   * - `%b`: Boolean.
   * 
   * Example:
   * - `System.out.printf("Value: %d, Text: %s%n", 42, "Hello");`
   * Output: Value: 42, Text: Hello
   */
  public static void main(String[] args) {
    Random rand = new Random();
    int numero = rand.nextInt(100) + 1;
    int divisor = rand.nextInt(10) + 1;
    System.out.printf("La division de %d entre %d es: %d%n", numero, divisor, division(numero, divisor));
  }
}