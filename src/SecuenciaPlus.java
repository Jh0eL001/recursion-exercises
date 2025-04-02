import java.util.ArrayList;
import java.util.List;

public class SecuenciaPlus<T extends Comparable<T>> {
  private final ArrayList<T> elementos;

  // --------- CONSTRUCTORES ------- //
  public SecuenciaPlus() {
    this.elementos = new ArrayList<>();
  }

  public SecuenciaPlus(ArrayList<T> elementos) {
    this.elementos = elementos;
  }

  // the constructor of SecuenciaPlus does not accept a variable number of
  // arguments; we need to modify the constructor to handle varargs:
  @SafeVarargs
  public SecuenciaPlus(T... elementos) {
    this.elementos = new ArrayList<>();
    for (T elemento : elementos) {
      this.elementos.add(elemento);
    }
  }

  // ------- METODO DE ACCESO ------//
  public List<T> getElementos() {
    return elementos;
  }

  public double sumaRecursiva() {
    return sumaRecursiva(0);
  }

  private double sumaRecursiva(int index) {
    if (index >= elementos.size()) {
      return 0.0;
    }
    double sumaParcial = ((Number) elementos.get(index)).doubleValue();
    System.out.printf("Sumando %.2f (índice %d)\n", sumaParcial, index);

    return sumaParcial + sumaRecursiva(index + 1);
  }

  // 07. Minimo Recursivo
  public T minimoRecursivo() {
    return minimoRecursivo(0);
  }

  private T minimoRecursivo(int index) {
    if (index == elementos.size() - 1) {
      System.out.println("Caso Base: " + elementos.get(index));
      return elementos.get(index);
    }

    T actual = elementos.get(index);
    T minRest = minimoRecursivo(index + 1);
    T min = actual.compareTo(minRest) <= 0 ? actual : minRest;

    System.out.printf("Comparando %s vs %s -> mínimo %s%n", actual, minRest, min);
    return min;
  }

  public void ordenar() {
    ArrayList<T> sorted = ordenar(new ArrayList<>(elementos));
    elementos.clear();
    elementos.addAll(sorted);
  }

  private ArrayList<T> ordenar(ArrayList<T> lista) {
    // Caso Base: si la lista tiene cero o un elemento, ya esta ordenada
    if (lista.size() <= 1) {
      return lista;
    }

    // Dividir la lista en dos mitades.
    int mid = lista.size() / 2;
    ArrayList<T> izquierda = new ArrayList<>(lista.subList(0, mid));
    ArrayList<T> derecha = new ArrayList<>(lista.subList(mid, lista.size()));

    // Ordenar recursivamente cada mitad
    ordenar(derecha);
    ordenar(izquierda);

    // Combinamos las mitades ordenadas recursivamente (Merge part)
    lista.clear();
    combinar(izquierda, derecha, lista);
    return lista;
  }

  /**
   * Combinar los elementos ordenados de manera recursiva (Merge Sort)
   * 
   * @param izquierda el lado izquierdo de la coleccion
   * @param derecha   el lado izquierdo de la coleccion
   * @param resultado la nueva lista combinada con izq, der
   */
  private void combinar(ArrayList<T> izquierda, ArrayList<T> derecha, ArrayList<T> resultado) {
    // Caso Base
    if (izquierda.isEmpty()) {
      resultado.addAll(derecha);
      return;
    }
    if (derecha.isEmpty()) {
      resultado.addAll(izquierda);
      return;
    }

    // Si no estan vacias, comparar los primeros elementos de cada lista
    if (izquierda.get(0).compareTo(derecha.get(0)) <= 0) {
      resultado.add(izquierda.remove(0));
    } else {
      resultado.add(derecha.remove(0));
    }

    // Llamada recursiva con los elementos restantes
    combinar(izquierda, derecha, resultado);
  }

  // ---------- BÚSQUEDAS ----------
  // 09. Búsqueda lineal recursiva
  public int recursiveLinearSearch(T target, int index) {
    if (index >= elementos.size()) {
      return -1;
    }
    if (elementos.get(index).equals(target)) {
      return index;
    }
    return recursiveLinearSearch(target, index + 1);
  }

  // ---------- UTILIDADES ----------
  @Override
  public String toString() {
    return elementos.toString();
  }

  public static void main(String[] args) {
    SecuenciaPlus<Integer> nums = new SecuenciaPlus<>(3, 1, 4, 5, 6, 7);
    // suma recursiva
    System.out.println("Secuencia original: " + nums);
    System.out.println("\n=== SUMA RECURSIVA ===");
    System.out.println("Total: " + nums.sumaRecursiva());
    // minimo recursivo
    System.out.println("Secuencia original: " + nums);
    System.out.println("\n=== MÍNIMO RECURSIVO ===");
    System.out.println("Mínimo: " + nums.minimoRecursivo());
    // ordenar con merge sort
    SecuenciaPlus<Integer> desordenado = new SecuenciaPlus<>(3, 2, 5, 0, 1, 8, 7, 6, 9, 4);
    System.out.println("Lista antes de ordenar: " + desordenado);
    desordenado.ordenar();
    System.out.println("Lista ordenada: " + desordenado);

    // Strings
    SecuenciaPlus<String> words = new SecuenciaPlus<>("Hulk", "IronMan", "Hawkeye", "Loki", "Thor", "BlackWidow",
        "QuickSilver", "Magneto", "Wolverine");
    System.out.println("\n=== BÚSQUEDA LINEAL ===");
    System.out.println("Lista de palabras: " + words);
    String target = "Wolverine";
    int pos = words.recursiveLinearSearch(target, 0);
    System.out.printf("'%s' encontrado en posición %d%n", target, pos);
  }
}