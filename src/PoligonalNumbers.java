/*
 * 2025-04-09.
 * Numeros Poligonales
 * Deduccion:
 * PB| pol(1) = 1              | n = 1
 * DD| pol(2) =  5 = 1+4 = pol(1) + 4 = pol(1) + 3(2-1) + 1     | n = 2
 * DD| pol(3) = 12 = 5+7 = pol(2) + 7 = pol(2) + 3(3-1) + 1     | n = 2
 * DD| pol(4) = 22 =12+10= pol(3) + 10 =pol(3) + 3(4-1) + 1     | n = 2
 * PR| pol(n) = pol(n - 1) + 3n - 2
 * CC| num ∈ ℕ⁺ (naturales positivos)
 */

public class PoligonalNumbers {
  public static int pol(int n) {
    int num;
    if (n == 1)
      num = 1;
    else
      num = pol(n - 1) + 3 * n - 2;
    return num;
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.println("El numero poligonal de 5 es: " + pol(num));
  }
}