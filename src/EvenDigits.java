/*
 * 2025-04-02.
 * Metodo para saber si todos los digitos de un numero n son pares.
 * PR| evenDigits(n) =       | n > 0
 * PB| evenDigits(n) = true    | n < 10 
 * CC| 
 */

public class EvenDigits {

  public static boolean evenDigits(int number) {
    // Caso Base si el numero tiene un solo digito, comprobar si es par o no.
    if (number < 10) {
      return number % 2 == 0;
    }
    int digit = number % 10;
    if (digit % 2 != 0)
      return false;
    return evenDigits(number / 10);
  }

  public static void main(String[] args) {
    int number = 221426232;
    if (evenDigits(number)) {
      System.out.println("\nEl numero " + number + " tiene los digitos pares.");
    } else {
      System.out.println("\nEl numero " + number + " no tiene los digitos pares.");
    }

  }
}