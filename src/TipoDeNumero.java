public class TipoDeNumero {

  public static String classifyNumber(int num) {
    if (num == 0) {
      return "Número inválido";
    }

    int sumDivisors = divSum(num, 1, 0); // Empieza con divisor = 1 y suma inicial 0

    // Clasificación
    if (sumDivisors == num) {
      return "Perfecto";
    } else if (sumDivisors > num) {
      return "Abundante";
    } else {
      return "Defectivo";
    }
  }

  // Método recursivo para sumar los divisores propios (excepto el mismo número)
  private static int divSum(int num, int divisor, int sum) {
    if (divisor == num) {
      return sum; // Cuando llegamos al número, terminamos la recursión.
    }

    if (num % divisor == 0) {
      sum += divisor; // Si es divisor, lo sumamos
    }
    return divSum(num, divisor + 1, sum); // Llamada recursiva al siguiente divisor
  }

  public static void main(String[] args) {
    int num = 28; // Puedes probar con otros números como 6, 12, etc.
    System.out.println("El número " + num + " es: " + classifyNumber(num));
    System.out.println("El número " + 6 + " es: " + classifyNumber(6));
    System.out.println("El número " + 15 + " es: " + classifyNumber(15));
  }
}
