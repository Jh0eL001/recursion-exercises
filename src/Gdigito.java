/*
 * 2025-04-09.
 * SIS: 201309604
 * Digito g(n)
 * PB| digito(num) = num                             | num < 10
 * PR| digito = digito(num % 10 + gDigito(num / 10)) | num >= 10
 * CC| num ∈ ℕ⁺ (naturales positivos)
 */

public class Gdigito {
  public static int gDigito(int num) {
    int digito = 0;
    if (num < 10)
      digito = num;
    else
      digito = gDigito(num % 10 + gDigito(num / 10));
    return digito;
  }

  public static void main(String[] args) {
    int numero = 91623748;
    System.out.println("g(" + numero + ") es: " + gDigito(numero));
  }
}
