/*
 * 2025-04-16.
 * 16. Numeros que Explotan.
 * PB|  |   
 * PR|  |   
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */

public class ExplotingNumbers {
  public static void boom(int n, int b) {
    if (n < b) {
      return;
    }
    int n1 = n / b;
    int n2 = n - n1;
    if (n1 <= b)
      System.out.println(n1);
    else
      boom(n1, b);
    if (n2 <= b)
      System.out.println(n2);
    else
      boom(n2, b);
  }

  public static void main(String[] args) {
    int n = 10;
    int b = 3;
    boom(n, b);
  }
}