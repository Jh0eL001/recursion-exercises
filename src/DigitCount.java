
/* 3. Escribe un proceso recursivo que permita calcular la cantidad de dıgitos que tiene un numero positivo n.
*  Write a recursive process that alows calculate the amount of digits a positive number n has.
*/
import java.util.Random;

public class DigitCount {
  public static int DigitCountExplained(int num) {
    // Definimos la cantidad de dígitos, empezando en 1
    int digits = 1;

    // Caso base: Si el número es menor que 10, devolvemos 1
    if (num < 10) {
      System.out.println("Caso base: num = " + num + ", digits = " + digits);
      return digits;
    } else {
      // Llamada recursiva: Dividimos el número por 10 y seguimos contando
      System.out.println("Llamada recursiva: num = " + num + ", digits = " + digits);
      digits += DigitCountExplained(num / 10); // Llamada recursiva
    }

    // Retornamos el número total de dígitos después de la llamada recursiva
    System.out.println("Regresando de la llamada: num = " + num + ", digits = " + digits);
    return digits;
  }

  /*
   * 2025-04-02.
   * DigitCounter Refactored (shorter)
   * 
   * PR| digitCount(num) = digitCount(num/10) | num > 0
   * PB| digitCount(num) = 1 | num < 10
   * CC| num >= 0
   */
  /**
   * Metodo simplificado para contar digitos de un numero entero positivo.
   * 
   * @param num contar los digitos de este numero.
   * @return cantidad total de digitos.
   */
  public static int digitCount(int num) {
    if (num < 10)
      return 1;
    else
      return 1 + digitCount(num / 10);
  }

  // main method
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(1000);
    int num2 = rand.nextInt(100000);
    int num3 = rand.nextInt(1000000);
    // System.out.println(num + " tiene: " + DigitCountExplained(num) + "
    // digitos.");
    System.out.println("\nEl numero: " + num + " tiene: " + digitCount(num) + " digito(s).");
    System.out.println("\nEl numero: " + num2 + " tiene: " + digitCount(num2) + " digito(s).");
    System.out.println("\nEl numero: " + num3 + " tiene: " + digitCount(num3) + " digito(s).");
  }
}
