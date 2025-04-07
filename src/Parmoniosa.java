/*
 * 2025-04-07.
 * ExerciseName
 * PB| divCounter(num, div) = 0              | div > num
 * PR| divCounter(num, div) = 1 + divCounter(num, div + 1) | num % div == 0 ∧ div ≤ num
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */

public class Parmoniosa {
  public static String parmoniosa(int n) {
    if (n == 1)
      return "**\\/**";
    if (n % 2 != 0)
      return "**\\" + parmoniosa(n - 1) + "/**";
    else
      return "++\\" + parmoniosa(n - 1) + "/++";
  }

  public static void main(String[] args) {
    int cant = 3;
    System.out.println(parmoniosa(cant));
  }
}