/*
 * 2025-04-10.
 * Towers of Hanoi  
 * https://www.mathsisfun.com/games/towerofhanoi.html
 * PB| hanoi(n, orig, dest, aux) = mover(n) orig -> dest   | n = 1
 * PR| hanoi(n, orig, dest, aux) =
 *     hanoi(n-1, orig, aux, dest)
 *     mover(n, orig, dest) --> mover el plato mas grande a su destino
 *     hanoi(n-1, aux, dest, orig)
 * | num > 1
 * CC| num ∈ ℕ⁺ (naturales positivos) 
 */

import java.util.Scanner;

public class HanoiTowers {
  public static void hanoi(int n, int orig, int dest, int aux) {
    if (n == 1)
      System.out.println("\nMover disco de la torre " + orig + " a la torre " + dest);
    else {
      hanoi(n - 1, orig, aux, dest);
      System.out.println("\nMover disco de la " + orig + " a la " + dest);
      hanoi(n - 1, aux, dest, orig);
    }
  }

  public static void main(String[] args) {
    int orig = 1, dest = 3, aux = 2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("¿Cuántos discos quieres mover? \n");
    int discos = scanner.nextInt();
    hanoi(discos, orig, dest, aux);
    scanner.close();
  }
}