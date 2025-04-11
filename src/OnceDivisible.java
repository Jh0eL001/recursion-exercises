/*
 * 2025-04-10.
 * Divisible por 11
 * PB| divisible(n) = false | n == 0  
 * PR| divisible(n) = (dif % 11 == 0) ? | n > 10   
 * CC| num ∈ ℕ⁺ (naturales positivos) 
 */

public class OnceDivisible {
  public static boolean divisible(int num) {
    return divisible(num, 1, 0, 0);
  }

  private static boolean divisible(int num, int idx, int sumPar, int sumImpar) {
    if (num == 0) {
      int dif = sumPar - sumImpar;
      return (dif % 11 == 0);
    } else {
      if (idx % 2 != 0)
        sumPar += (num % 10);
      else
        sumImpar += (num % 10);
      return divisible(num / 10, idx + 1, sumPar, sumImpar);

    }
  }

  public static void main(String[] args) {
    int num = 2090;
    System.out.println("El numero: " + num + " es divisible por 11? -> " + divisible(num));
  }
}