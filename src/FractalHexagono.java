public class FractalHexagono {
  public static int Hex(int n) {
    if (n == 1) 
      return 6;
    else
      return Hex(n - 1) + ((18 * n) - 12);
  }
  public static void main(String[] args) {
    int num = 6;
    System.out.println("Para el nivel " + num + " el numero de lineas necesarias es: " + Hex(num));
  }
}