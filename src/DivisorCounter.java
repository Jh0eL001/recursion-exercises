/*
 * 2025-04-04.
 * Contador recursivo de divisores de un número natural.
 * 
 * Método público: divCounter(num) → devuelve la cantidad de divisores de num.
 * Método auxiliar recursivo: divCounter(num, div) → verifica si div divide a num y acumula.
 * 
 * PB| divCounter(num, div) = 0              | div > num
 * PR| divCounter(num, div) = 1 + divCounter(num, div + 1) | num % div == 0 ∧ div ≤ num
 * PR| divCounter(num, div) = divCounter(num, div + 1)     | num % div ≠ 0 ∧ div ≤ num
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
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
    int num = 10;
    System.out.println(num + " tiene: " + divCounter(num) + " Divisores.");
    // System.out.println(num + " tiene: " + divCounter2(num) + " Divisores.");
  }
}