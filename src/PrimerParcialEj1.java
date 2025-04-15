/*
 * 2025-04-15.
 * Ejercicio 1 primer parcial 2025
 * PB|  |   
 * PR|  |   
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */

public class PrimerParcialEj1 {
  public static boolean isRight(long num) {
    long auth = num % 100;
    long digitos = num / 100;
    long sum = sumDig(digitos);
    if (sum >= 100)
      sum %= 100;
    return (sum == auth);
  }

  private static long sumDig(long n) {
    if (n < 10)
      return n;
    else
      return (n % 10) + sumDig(n / 10);
  }

  public static void main(String[] args) {
    long num = 738220;
    System.out.println(isRight(num));
  }
}