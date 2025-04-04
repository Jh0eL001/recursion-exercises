/*
 * 2025-04-04.
 * Transform a number to binary
 * PB| toBinary(num) = 1              | num == 1
 * PB| toBinary(num) = 0              | num == 0
 * PR| toBinary(num) = toBinary(num/2)  | num > 10
 * CC| num ∈ ℕ⁺ (naturales positivos) y el 0
 */

import java.util.Random;

public class ToBinary {
  public static String toBinary(int num) {
    // si el numero es 0 o 1 devolvemos el string del mismo
    if (num == 0)
      return "0";
    if (num == 1)
      return "1";
    // llamada recursiva: dividimos el num/2 y concatenamos el digito binario.
    return toBinary(num / 2) + (num % 2);
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int num = 1999;
    System.out.println("El binario de: " + num + " es: " + toBinary(num));
  }
}