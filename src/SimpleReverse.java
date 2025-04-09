/*
 * 2025-04-09.
 * El inverso simple de una cadena
 * cad = c1, c2, c3, ......, Cn-1 , Cn
 * cad = aaabccdddaaebb   -> invSimp(cad) = beadcba
 * PB| invSimp(cad, n) = Cn              | n < 2 
 * PR| invSimp(cad, n) = invSimp(cad, n - 1)    Cn-1 = Cn  | n >= 2 
 * PR| invSimp(cad, n) = Cn + invSimp(cad, n - 1)     Cn-1 != Cn  | n >= 2 
 * CC: n <= |cad|
 */

public class SimpleReverse {
  public static String invSimp(String cad) {
    return invSimp(cad, cad.length() - 1);
  }
  private static String invSimp(String cad, int n) {
    String inv;
    if (n < 1)
      inv = "" + cad.charAt(n);
    else {
      if (cad.charAt(n) == cad.charAt(n-1))
        inv = invSimp(cad, n - 1);
      else
        inv = cad.charAt(n) + invSimp(cad, n - 1);
    }
    return inv;
  }
  public static void main(String[] args) {
    String cad = "aaabccdddaaebb";
    System.out.println("La cadena original es: " + cad);
    System.out.println("La cadena invertida es: " + invSimp(cad));
  }
}