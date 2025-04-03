/*
 * 2025-04-02.
 * Fibonacci Recursivo
 * PR| fibo(termino) = fibo(termino - 1) + fibo(termino - 2)    | n > 0
 * PB| fibo(termino) = 0     | termino = 0
 * PB| fibo(termino) = 1     | termino = 1
 * CC| termino pertenece a los numeros enteros positivos incluido 0
 */

import java.util.Random;

public class Fibonacci {

  public static int fibo(int termino) {
    if (termino == 0)
      return 0;
    else if (termino == 1)
      return 1;
    return fibo(termino - 1) + fibo(termino - 2);
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int termino = rand.nextInt(40);
    System.out.println("El termino #" + termino + " de la serie de Fibonacci es: " + fibo(termino));
  }
}