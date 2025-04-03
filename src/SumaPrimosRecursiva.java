/*
 * 2025-04-02.
 * Sumar los num primos de una secuencia
 * PR|      | n > 0
 * PB|      | n > 0
 * CC| 
 */

import java.util.List;

public class SumaPrimosRecursiva {

    // Método principal que inicia la recursión
    public static int sumaPrimos(List<Integer> lista) {
        return sumaPrimosRecursivo(lista, 0);
    }

    // Método recursivo para recorrer la lista y sumar los primos
    private static int sumaPrimosRecursivo(List<Integer> lista, int index) {
        // Caso base: si el índice es igual al tamaño de la lista, terminamos.
        if (index == lista.size()) {
            return 0;
        }

        int numero = lista.get(index);
        int suma = esPrimo(numero) ? numero : 0;

        // Llamada recursiva con el siguiente índice
        return suma + sumaPrimosRecursivo(lista, index + 1);
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int num) {
        if (num < 2) return false;
        return esPrimo(num, 2);
    }

    // Método recursivo para verificar si un número es primo
    private static boolean esPrimo(int num, int divisor) {
        if (divisor * divisor > num) return true; // Caso base: No se encontraron divisores
        if (num % divisor == 0) return false; // Si es divisible, no es primo
        return esPrimo(num, divisor + 1); // Probar con el siguiente divisor
    }

    // Prueba del método
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 4, 7, 10, 13, 17, 20);
        System.out.println("La lista es: " + numeros);
        System.out.println("Suma de primos: " + sumaPrimos(numeros)); 
    }
}