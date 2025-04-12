/*
 * 2025-04-12.
 * ExerciseName
 * PB|  |   
 * PR|  |   
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */

public class EstrellaRecursiva {
 
  public static int estrella(int n) {
    if (n == 1)
     return 10;
    else
     return estrella(n - 1) + (5 * ((3 * (n - 1)) * (3 * (n - 1))));
  }
  public static void main(String[] args) {
    int num = 4;
    System.out.println("Para el nivel " + num + " el numero de lineas necesarias es: " + estrella(num));
  }
}