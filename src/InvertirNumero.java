/*
 * 2025-04-03.
 * ExerciseName
 * PR|      | n > 0
 * PB|      | n > 0
 * CC| 
 */

public class InvertirNumero {

  public static int invertirNumero(int numero) {
    int res = 0;
    return invertirNumero(numero, res);
  }

  private static int invertirNumero(int numero, int res) {
    if (numero == 0) {
      return res;
    } else {
      int residuo = numero % 10;
      numero = numero / 10;
      res = (res * 10) + residuo;
      return invertirNumero(numero, res);
    }
  }

  public static void main(String[] args) {
    int numero = 123456;
    System.out.println("El numero original es:  " + numero + "\nEl numero invertido es: " + invertirNumero(numero));
  }

}