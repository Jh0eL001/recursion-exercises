/*
 * 2025-04-01.
 * Sumar los elementos primos de una Secuencia
 * PB| secuencia.size() == 0    sumaPrimos = 0   | n > 0
 * PR| secuencia.size() > 0     sumaPrimos += primo | n > 0
 * CC| 
 */

import java.util.ArrayList;
import java.util.Random;

public class SumaPrimos {
  public static int sumadorPrimos(ArrayList<Integer> secuencia) {
    return sumadorPrimos(secuencia, 0);
  }

  private static int sumadorPrimos(ArrayList<Integer> secuencia, int index) {
    if (secuencia.size() == index) {
      return 0;
    }
    int numeroActual = secuencia.get(index);
    int suma = esPrimo(numeroActual) ? numeroActual : 0;

    return suma + sumadorPrimos(secuencia, index + 1);
  }

  private static boolean esPrimo(int numeroActual) {
    if (numeroActual < 2)
      return false;
    return esPrimo(numeroActual, 2);
  }

  private static boolean esPrimo(int numeroActual, int divisor) {
    if (divisor * divisor > numeroActual) {
      System.out.println("Numero Primo a sumar: " + numeroActual);
      return true;
    }
    if (numeroActual % divisor == 0)
      return false;
    return esPrimo(numeroActual, divisor + 1);
  }

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    Random rand = new Random();
    int size = 0;
    for (int i = 0; i < size; i++) {
      numeros.add(rand.nextInt(100) + 1);
    }
    System.out.println("La lista es: " + numeros);
    System.out.println("Suma de primos: " + sumadorPrimos(numeros));
  }
}